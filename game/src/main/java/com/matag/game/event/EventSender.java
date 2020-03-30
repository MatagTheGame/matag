package com.matag.game.event;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.matag.game.player.Player;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Sends events to the browser.
 */
@Component
@AllArgsConstructor
public class EventSender {

  private static final Logger LOGGER = LoggerFactory.getLogger(EventSender.class);

  private final SimpMessagingTemplate webSocketTemplate;
  private final ObjectMapper objectMapper;

  public void sendToUser(String sessionId, String username, Event event) {
    String eventString = serializeToString(event);
    if (username != null) {
      LOGGER.info("Sending event to {} - {}: {}", sessionId, username, eventString);
    } else {
      LOGGER.info("Sending event to {}: {}", sessionId, eventString);
    }
    webSocketTemplate.convertAndSendToUser(sessionId, "/events", eventString);
  }

  public void sendToUser(String sessionId, Event event) {
    sendToUser(sessionId, null, event);
  }

  public void sendToPlayer(Player player, Event event) {
    sendToUser(player.getSessionId(), player.getName(), event);
  }

  public void sendToPlayers(List<Player> players, Event event) {
    players.forEach(player -> sendToPlayer(player, event));
  }

  private String serializeToString(Object event) {
    try {
      return objectMapper.writeValueAsString(event);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }
}
