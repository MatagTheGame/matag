package com.aa.mtg.cards.sets;

import com.aa.mtg.cards.Card;
import com.aa.mtg.cards.properties.Color;
import com.aa.mtg.cards.properties.Cost;

import java.util.ArrayList;
import java.util.List;

import static com.aa.mtg.cards.ability.Abilities.*;
import static com.aa.mtg.cards.properties.Rarity.COMMON;
import static com.aa.mtg.cards.properties.Rarity.UNCOMMON;
import static com.aa.mtg.cards.properties.Subtype.*;
import static com.aa.mtg.cards.properties.Type.*;
import static java.util.Arrays.asList;
import static java.util.Collections.*;
import static org.hibernate.validator.internal.util.CollectionHelper.asSet;

public class CoreSet2020 implements MtgSet {

    public static final String M20 = "M20";

    public static Card AGONIZING_SYPHON = new Card("Agonizing Syphon", singleton(Color.BLACK), asList(Cost.BLACK, Cost.COLORLESS, Cost.COLORLESS, Cost.COLORLESS), singleton(SORCERY), emptySet(), COMMON, "Agonizing Syphon deals 3 damage to any target and you gain 3 life.", 0, 0, asList(DEAL_3_DAMAGE_TO_TARGET_CREATURE, GAIN_3_LIFE)); // FIXME Antonio: this is bugged, and means that if the target disappears spell cannot be resolved and player doesn't gain the life
    public static Card ANGELIC_GIFT = new Card("Angelic Gift", singleton(Color.WHITE), asList(Cost.WHITE, Cost.COLORLESS), singleton(ENCHANTMENT), singleton(AURA), COMMON, "Enchant creature. When Angelic Gift enters the battlefield, draw a card. Enchanted creature has flying.", 0, 0, asList(ENCHANTED_CREATURE_GETS_FLYING, WHEN_IT_ENTERS_THE_BATTLEFIELD_DRAW_A_CARD));
    public static Card BARONY_VAMPIRE = new Card("Barony Vampire", singleton(Color.BLACK), asList(Cost.BLACK, Cost.COLORLESS, Cost.COLORLESS), singleton(CREATURE), singleton(VAMPIRE), COMMON, "", 3, 2, emptyList());
    public static Card BASTION_ENFORCER = new Card("Bastion Enforcer", singleton(Color.WHITE), asList(Cost.WHITE, Cost.COLORLESS, Cost.COLORLESS), singleton(CREATURE), asSet(DWARF, SOLDIER), COMMON, "", 3, 2, emptyList());
    public static Card CANOPY_SPIDER = new Card("Canopy Spider", singleton(Color.GREEN), asList(Cost.GREEN, Cost.COLORLESS), singleton(CREATURE), singleton(SPIDER), COMMON, "", 1, 3, singletonList(REACH));
    public static Card CHANDRAS_OUTRAGE = new Card("Chandra's Outrage", singleton(Color.RED), asList(Cost.RED, Cost.RED, Cost.COLORLESS, Cost.COLORLESS), singleton(INSTANT), emptySet(), COMMON, "Chandra's Outrage deals 4 damage to target creature and 2 damage to that creature's controller.", 0, 0, singletonList(DEAL_4_DAMAGE_TO_TARGET_CREATURE_2_DAMAGE_TO_CONTROLLER));
    public static Card CLOUDKIN_SEER = new Card("Cloudkin Seer", singleton(Color.BLUE), asList(Cost.BLUE, Cost.COLORLESS, Cost.COLORLESS), singleton(CREATURE), asSet(ELEMENTAL, WIZARD), COMMON, "Flying. When Cloudkin Seer enters the battlefield, draw a card.", 2, 1, singletonList(WHEN_IT_ENTERS_THE_BATTLEFIELD_DRAW_A_CARD));
    public static Card CORAL_MERFOLK = new Card("Coral Merfolk", singleton(Color.BLUE), asList(Cost.BLUE, Cost.COLORLESS), singleton(CREATURE), singleton(MERFOLK), COMMON, "", 2, 1, emptyList());
    public static Card DARK_REMEDY = new Card("Dark Remedy", singleton(Color.BLACK), asList(Cost.BLACK, Cost.COLORLESS), singleton(INSTANT), emptySet(), COMMON, "Target creature gets +1/+3 until end of turn.", 0, 0, singletonList(TARGET_CREATURE_GETS_PLUS_1_3_UNTIL_END_OF_TURN));
    public static Card DAWNING_ANGEL = new Card("Dawning Angel", singleton(Color.WHITE), asList(Cost.WHITE, Cost.COLORLESS, Cost.COLORLESS, Cost.COLORLESS, Cost.COLORLESS), singleton(CREATURE), singleton(ANGEL), COMMON, "Flying. When Dawning Angel enters the battlefield, you gain 4 life.", 3, 2, asList(FLYING, WHEN_IT_ENTERS_THE_BATTLEFIELD_GAIN_4_LIFE));
    public static Card DISENCHANT = new Card("Disenchant", singleton(Color.WHITE), asList(Cost.WHITE, Cost.COLORLESS), singleton(INSTANT), emptySet(), COMMON, "Destroy target artifact or enchantment.", 0, 0, singletonList(DESTROY_TARGET_ARTIFACT_OR_ENCHANTMENT));
    public static Card DISFIGURE = new Card("Disfigure", singleton(Color.BLACK), singletonList(Cost.BLACK), singleton(INSTANT), emptySet(), UNCOMMON, "Target creature gets -2/-2 until end of turn.", 0, 0, singletonList(TARGET_CREATURE_GETS_MINUS_2_2_UNTIL_END_OF_TURN));
    public static Card ENGULFING_ERUPTION = new Card("Engulfing Eruption", singleton(Color.RED), asList(Cost.RED, Cost.RED, Cost.COLORLESS, Cost.COLORLESS), singleton(SORCERY), emptySet(), COMMON, "Engulfing Eruption deals 5 damage to target creature.", 0, 0, singletonList(DEAL_5_DAMAGE_TO_TARGET_CREATURE));
    public static Card EMPYREAN_EAGLE = new Card("Empyrean Eagle", asSet(Color.WHITE, Color.BLUE), asList(Cost.WHITE, Cost.BLUE, Cost.COLORLESS), singleton(CREATURE), asSet(BIRD, SPIRIT), UNCOMMON, "Flying. Other creatures you control with flying get +1/+1.", 2, 3, asList(FLYING, OTHER_CREATURES_YOU_CONTROL_WITH_FLYING_GET_PLUS_1_1));
    public static Card FORTRESS_CRAB = new Card("Fortress Crab", singleton(Color.BLUE), asList(Cost.BLUE, Cost.COLORLESS, Cost.COLORLESS, Cost.COLORLESS), singleton(CREATURE), singleton(CRAB), COMMON, "", 1, 6, emptyList());
    public static Card FROST_LYNX = new Card("Frost Lynx", singleton(Color.BLUE), asList(Cost.BLUE, Cost.COLORLESS, Cost.COLORLESS), singleton(CREATURE), asSet(ELEMENTAL, CAT), COMMON, "When Frost Lynx enters the battlefield, tap target creature an opponent controls. That creature doesn't untap during its controller's next untap step.", 2, 2, singletonList(WHEN_IT_ENTERS_THE_BATTLEFIELD_TAP_TARGET_OPPONENT_CREATURE_DOES_NOT_UNTAP_NEXT_TURN));
    public static Card GRIFFIN_PROTECTOR = new Card("Griffin Protector", singleton(Color.WHITE), asList(Cost.WHITE, Cost.COLORLESS, Cost.COLORLESS, Cost.COLORLESS), singleton(CREATURE), singleton(GRIFFIN), COMMON, "Flying. Whenever another creature enters the battlefield under your control, Griffin Protector gets +1/+1 until end of turn.", 2, 3, asList(FLYING, WHENEVER_A_CREATURE_ENTERS_THE_BATTLEFIELD_UNDER_YOUR_CONTROL_IT_GETS_PLUS_1_1_UNTIL_END_OF_TURN));
    public static Card GRIFFIN_SENTINEL = new Card("Griffin Sentinel", singleton(Color.WHITE), asList(Cost.WHITE, Cost.COLORLESS, Cost.COLORLESS), singleton(CREATURE), singleton(GRIFFIN), COMMON, "Flying. Vigilance.", 1, 3, asList(FLYING, VIGILANCE));
    public static Card HEALER_OF_THE_GLADE = new Card("Healer of the Glade", singleton(Color.GREEN), singletonList(Cost.GREEN), singleton(CREATURE), singleton(ELEMENTAL), COMMON, "When Healer of the Glade enters the battlefield, you gain 3 life.", 1, 2, singletonList(WHEN_IT_ENTERS_THE_BATTLEFIELD_GAIN_3_LIFE));
    public static Card HERALD_OF_THE_SUN = new Card("Herald of the Sun", singleton(Color.WHITE), asList(Cost.WHITE, Cost.WHITE, Cost.COLORLESS, Cost.COLORLESS, Cost.COLORLESS, Cost.COLORLESS), singleton(CREATURE), singleton(ANGEL), UNCOMMON, "Flying. Pay 3 1 WHITE: Put a +1/+1 counter on another target creature with flying.", 4, 4, asList(FLYING, PAY_3_1_WHITE_PUT_A_PLUS_1_COUNTER_ON_TARGET_CREATURE_YOU_CONTROL));
    public static Card IMPERIAL_OUTRIDER = new Card("Imperial Outrider", singleton(Color.WHITE), asList(Cost.GREEN, Cost.COLORLESS, Cost.COLORLESS, Cost.COLORLESS), singleton(CREATURE), asSet(HUMAN, KNIGHT), COMMON, "", 1, 5, emptyList());
    public static Card INFURIATE = new Card("Infuriate", singleton(Color.RED), singletonList(Cost.RED), singleton(INSTANT), emptySet(), COMMON, "Target creature gets +3/+2 until end of turn.", 0, 0, singletonList(TARGET_CREATURE_GETS_PLUS_3_2_UNTIL_END_OF_TURN));
    public static Card INSPIRING_CAPTAIN = new Card("Inspiring Captain", singleton(Color.WHITE), asList(Cost.WHITE, Cost.COLORLESS, Cost.COLORLESS, Cost.COLORLESS), singleton(CREATURE), asSet(HUMAN, KNIGHT), COMMON, "When Inspiring Captain enters the battlefield, creatures you control get +1/+1 until end of turn.", 3, 3, singletonList(WHEN_IT_ENTERS_THE_BATTLEFIELD_CREATURES_YOU_CONTROL_GET_PLUS_1_1_UNTIL_END_OF_TURN));
    public static Card LIGHTNING_STORMKIN = new Card("Lightning Stormkin", asSet(Color.BLUE, Color.RED), asList(Cost.BLUE, Cost.RED), singleton(CREATURE), asSet(ELEMENTAL, WIZARD), UNCOMMON, "Flying. Haste.", 2, 2, asList(FLYING, HASTE));
    public static Card METROPOLIS_SPRITE = new Card("Metropolis Sprite", asSet(Color.BLUE), asList(Cost.BLUE, Cost.COLORLESS), singleton(CREATURE), asSet(FAERIE, ROGUE), COMMON, "Flying. Pay BLUE: Metropolis Sprite gets +1/-1 until end of turn.", 1, 2, asList(FLYING, PAY_BLUE_IT_GETS_PLUS_1_MINUS_1_UNTIL_END_OF_TURN));
    public static Card MOMENT_OF_HEROISM = new Card("Moment of Heroism", asSet(Color.WHITE), asList(Cost.WHITE, Cost.COLORLESS), singleton(INSTANT), emptySet(), COMMON, "Target creature gets +2/+2 and gains lifelink until end of turn.", 0, 0, singletonList(TARGET_CREATURE_GETS_PLUS_2_2_AND_LIFELINK_UNTIL_END_OF_TURN));
    public static Card NATURAL_END = new Card("Natural End", asSet(Color.GREEN), asList(Cost.GREEN, Cost.COLORLESS, Cost.COLORLESS), singleton(INSTANT), emptySet(), COMMON, "Destroy target artifact or enchantment. You gain 3 life.", 0, 0, asList(DESTROY_TARGET_ARTIFACT_OR_ENCHANTMENT, GAIN_3_LIFE));
    public static Card NIMBLE_BIRDSTICKER = new Card("Nimble Birdsticker", asSet(Color.RED), asList(Cost.RED, Cost.COLORLESS, Cost.COLORLESS), singleton(CREATURE), singleton(GOBLIN), COMMON, "Reach.", 2, 3, singletonList(REACH));
    public static Card NOXIOUS_GRASP = new Card("Noxious Grasp", asSet(Color.BLACK), asList(Cost.BLACK, Cost.COLORLESS), singleton(INSTANT), emptySet(), UNCOMMON, "Destroy target creature or planeswalker that's green or white. You gain 1 life.", 0, 0, asList(DESTROY_TARGET_CREATURE_OR_PLANESWALKER_THAT_S_GREEN_OR_WHITE, GAIN_1_LIFE));
    public static Card OVERCOME = new Card("Overcome", asSet(Color.GREEN), asList(Cost.GREEN, Cost.GREEN, Cost.COLORLESS, Cost.COLORLESS, Cost.COLORLESS), singleton(INSTANT), emptySet(), UNCOMMON, "Creatures you control get +2/+2 and gain trample until end of turn.", 0, 0, singletonList(CREATURES_YOU_CONTROL_GET_PLUS_2_2_AND_TRAMPLE_UNTIL_END_OF_TURN));
    public static Card PYROCLASTIC_ELEMENTAL = new Card("Pyroclastic Elemental", asSet(Color.RED), asList(Cost.RED, Cost.RED, Cost.COLORLESS, Cost.COLORLESS, Cost.COLORLESS), singleton(CREATURE), singleton(ELEMENTAL), UNCOMMON, "PAY 1 2 RED: Pyroclastic Elemental deals 1 damage to target player.", 5, 4, singletonList(PAY_1_2_RED_DEAL_1_DAMAGE_TO_TARGET_PLAYER));
    public static Card SAVANNAH_SAGE = new Card("Savannah Sage", asSet(Color.WHITE), asList(Cost.WHITE, Cost.COLORLESS), singleton(CREATURE), asSet(CAT, CLERIC), COMMON, "When Savannah Sage enters the battlefield, you gain 2 life.", 2, 2, singletonList(WHEN_IT_ENTERS_THE_BATTLEFIELD_GAIN_2_LIFE));
    public static Card SEDGE_SCORPION = new Card("Sedge Scorpion", asSet(Color.GREEN), singletonList(Cost.GREEN), singleton(CREATURE), singleton(SCORPION), COMMON, "Deathtouch.", 1, 1, singletonList(DEATHTOUCH));
    public static Card SIEGE_MASTODON = new Card("Siege Mastodon", asSet(Color.WHITE), asList(Cost.WHITE, Cost.COLORLESS, Cost.COLORLESS, Cost.COLORLESS, Cost.COLORLESS), singleton(CREATURE), singleton(ELEPHANT), COMMON, "", 3, 5, emptyList());
    public static Card SILVERBACK_SHAMAN = new Card("Silverback Shaman", asSet(Color.GREEN), asList(Cost.GREEN, Cost.GREEN, Cost.COLORLESS, Cost.COLORLESS, Cost.COLORLESS), singleton(CREATURE), asSet(APE, SHAMAN), COMMON, "Trample. When Silverback Shaman dies, draw a card.", 5, 4, asList(TRAMPLE, WHEN_IT_DIES_DRAW_1_CARD));
    public static Card STEADFAST_SENTRY = new Card("Steadfast Sentry", asSet(Color.WHITE), asList(Cost.WHITE, Cost.COLORLESS, Cost.COLORLESS), singleton(CREATURE), asSet(HUMAN, SOLDIER), COMMON, "Vigilance. When Steadfast Sentry dies, put a +1/+1 counter on target creature you control.", 3, 2, asList(VIGILANCE, WHEN_IT_DIES_PUT_A_PLUS_1_COUNTER_ON_TARGET_CREATURE_YOU_CONTROL));
    public static Card STONE_GOLEM = new Card("Stone Golem", emptySet(), asList(Cost.COLORLESS, Cost.COLORLESS, Cost.COLORLESS, Cost.COLORLESS, Cost.COLORLESS), asSet(ARTIFACT, CREATURE), singleton(GOLEM), COMMON, "", 4, 4, emptyList());
    public static Card VAMPIRE_OF_THE_DIRE_MOON = new Card("Vampire of the Dire Moon", singleton(Color.BLACK), singletonList(Cost.BLACK), singleton(CREATURE), singleton(VAMPIRE), UNCOMMON, "Deathtouch. Lifelink", 1, 1, asList(DEATHTOUCH, LIFELINK));
    public static Card VORSTCLAW = new Card("Vorstclaw", singleton(Color.GREEN), asList(Cost.GREEN, Cost.GREEN, Cost.COLORLESS, Cost.COLORLESS, Cost.COLORLESS, Cost.COLORLESS), singleton(CREATURE), asSet(ELEMENTAL, HORROR), UNCOMMON, "", 7, 7, emptyList());
    public static Card YAROKS_WEAVECRASHER = new Card("Yaroks Wavecrasher", singleton(Color.BLUE), asList(Cost.BLUE, Cost.COLORLESS, Cost.COLORLESS, Cost.COLORLESS), singleton(CREATURE), singleton(ELEMENTAL), UNCOMMON, "When Yarok's Wavecrasher enters the battlefield, return another creature you control to its owner's hand.", 4, 4, singletonList(WHEN_IT_ENTERS_THE_BATTLEFIELD_RETURN_ANOTHER_TARGET_CREATURE_YOU_CONTROL_TO_ITS_OWNER_HAND));
    public static Card YOKED_OX = new Card("Yoked Ox", singleton(Color.WHITE), singletonList(Cost.WHITE), singleton(CREATURE), singleton(OX), COMMON, "", 0, 4, emptyList());

    private static CoreSet2020 instance;

    private List<Card> cards = new ArrayList<>();

    private CoreSet2020() {
        cards.add(CoreSet2019.ACT_OF_TREASON);
        cards.add(CoreSet2019.AGGRESSIVE_MAMMOTH);
        cards.add(AGONIZING_SYPHON);
        cards.add(Ixalan.AIR_ELEMENTAL);
        cards.add(ANGELIC_GIFT);
        cards.add(BARONY_VAMPIRE);
        cards.add(GuildsOfRavnica.BARTIZAN_BATS);
        cards.add(BASTION_ENFORCER);
        cards.add(Dominaria.BEFUDDLE);
        cards.add(RavnicaAllegiance.BLADEBRAND);
        cards.add(CoreSet2019.BOGSTOMPER);
        cards.add(CANOPY_SPIDER);
        cards.add(CoreSet2019.CENTAUR_COURSER);
        cards.add(CHANDRAS_OUTRAGE);
        cards.add(CLOUDKIN_SEER);
        cards.add(RavnicaAllegiance.CONCORDIA_PEGASUS);
        cards.add(CORAL_MERFOLK);
        cards.add(DARK_REMEDY);
        cards.add(DAWNING_ANGEL);
        cards.add(CoreSet2019.DAYBREAK_CHAPLAIN);
        cards.add(DISENCHANT);
        cards.add(DISFIGURE);
        cards.add(EMPYREAN_EAGLE);
        cards.add(ENGULFING_ERUPTION);
        cards.add(GuildsOfRavnica.FEARLESS_HALBERDIER);
        cards.add(Dominaria.FERAL_ABOMINATION);
        cards.add(Dominaria.FIRE_ELEMENTAL);
        cards.add(FORTRESS_CRAB);
        cards.add(FROST_LYNX);
        cards.add(CoreSet2019.GREENWOOD_SENTINEL);
        cards.add(GRIFFIN_SENTINEL);
        cards.add(GRIFFIN_PROTECTOR);
        cards.add(WarOfTheSpark.GOBLIN_ASSAILANT);
        cards.add(RavnicaAllegiance.HAAZDA_OFFICER);
        cards.add(HEALER_OF_THE_GLADE);
        cards.add(HERALD_OF_THE_SUN);
        cards.add(CoreSet2019.HOSTILE_MINOTAUR);
        cards.add(RavnicaAllegiance.IMPASSIONED_ORATOR);
        cards.add(CoreSet2019.IMMORTAL_PHOENIX);
        cards.add(IMPERIAL_OUTRIDER);
        cards.add(INFURIATE);
        cards.add(CoreSet2019.INSPIRED_CHARGE);
        cards.add(INSPIRING_CAPTAIN);
        cards.add(WarOfTheSpark.IRONCLAD_KROVOD);
        cards.add(LIGHTNING_STORMKIN);
        cards.add(Dominaria.MAMMOTH_SPIDER);
        cards.add(CoreSet2019.MARAUDERS_AXE);
        cards.add(CoreSet2019.METEOR_GOLEM);
        cards.add(METROPOLIS_SPRITE);
        cards.add(MOMENT_OF_HEROISM);
        cards.add(CoreSet2019.MURDER);
        cards.add(NATURAL_END);
        cards.add(NIMBLE_BIRDSTICKER);
        cards.add(NOXIOUS_GRASP);
        cards.add(OVERCOME);
        cards.add(CoreSet2019.OAKENFORM);
        cards.add(PYROCLASTIC_ELEMENTAL);
        cards.add(RavnicaAllegiance.PROWLING_CARACAL);
        cards.add(SAVANNAH_SAGE);
        cards.add(SEDGE_SCORPION);
        cards.add(SIEGE_MASTODON);
        cards.add(SILVERBACK_SHAMAN);
        cards.add(CoreSet2019.SKELETON_ARCHER);
        cards.add(CoreSet2019.SHIVAN_DRAGON);
        cards.add(CoreSet2019.SNAPPING_DRAKE);
        cards.add(STEADFAST_SENTRY);
        cards.add(STONE_GOLEM);
        cards.add(VAMPIRE_OF_THE_DIRE_MOON);
        cards.add(VORSTCLAW);
        cards.add(CoreSet2019.WALKING_CORPSE);
        cards.add(YAROKS_WEAVECRASHER);
        cards.add(YOKED_OX);
    }

    @Override
    public String getName() {
        return "Core Set 2020";
    }

    @Override
    public String getCode() {
        return M20;
    }

    @Override
    public List<Card> getCards() {
        return cards;
    }

    public static CoreSet2020 m20() {
        if (instance == null) {
            instance = new CoreSet2020();
        }
        return instance;
    }
}
