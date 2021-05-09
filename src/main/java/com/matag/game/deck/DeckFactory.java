package com.matag.game.deck;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.matag.adminentities.DeckInfo;
import com.matag.game.cardinstance.CardInstance;
import com.matag.game.cardinstance.CardInstanceFactory;
import com.matag.game.status.GameStatus;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class DeckFactory {
  private final CardInstanceFactory cardInstanceFactory;

  public List<CardInstance> create(String playerName, GameStatus gameStatus, DeckInfo deckInfo) {
    return deckInfo.getCards().stream()
      .map(card -> cardInstanceFactory.create(gameStatus, gameStatus.nextCardId(), card, playerName))
      .collect(Collectors.toList());
  }
}
