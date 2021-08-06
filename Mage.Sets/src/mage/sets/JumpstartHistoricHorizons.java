package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author TheElk801
 */
public final class JumpstartHistoricHorizons extends ExpansionSet {

    private static final JumpstartHistoricHorizons instance = new JumpstartHistoricHorizons();

    public static JumpstartHistoricHorizons getInstance() {
        return instance;
    }

    private JumpstartHistoricHorizons() {
        super("Jumpstart: Historic Horizons", "J21", ExpansionSet.buildDate(2021, 8, 12), SetType.MAGIC_ARENA);
        this.hasBoosters = false;
        this.hasBasicLands = false;

        cards.add(new SetCardInfo("Bounty of the Deep", 7, Rarity.UNCOMMON, mage.cards.b.BountyOfTheDeep.class));
        cards.add(new SetCardInfo("Faceless Agent", 31, Rarity.COMMON, mage.cards.f.FacelessAgent.class));
        cards.add(new SetCardInfo("Manor Guardian", 16, Rarity.UNCOMMON, mage.cards.m.ManorGuardian.class));
        cards.add(new SetCardInfo("Skyshroud Lookout", 29, Rarity.UNCOMMON, mage.cards.s.SkyshroudLookout.class));
        cards.add(new SetCardInfo("Wingsteed Trainer", 6, Rarity.UNCOMMON, mage.cards.w.WingsteedTrainer.class));
    }
}
