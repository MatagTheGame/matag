package com.matag.game.turn.phases;

import static com.matag.game.turn.phases.main1.Main1Phase.M1;
import static com.matag.game.turn.phases.main2.Main2Phase.M2;

public class PhaseUtils {
  public static boolean isMainPhase(String phase) {
    return phase.equals(M1) || phase.equals(M2);
  }
}
