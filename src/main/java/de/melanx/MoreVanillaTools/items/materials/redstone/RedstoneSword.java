package de.melanx.MoreVanillaTools.items.materials.redstone;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.SwordBase;

public class RedstoneSword extends SwordBase {

    private static final int DAMAGE = 3;
    private static final float SPEED = -2.4F;

    public RedstoneSword() {
        super("redstone_sword", ItemTiers.REDSTONE_TIER, DAMAGE, SPEED);
    }
}