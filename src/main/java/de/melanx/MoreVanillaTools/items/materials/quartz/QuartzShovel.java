package de.melanx.MoreVanillaTools.items.materials.quartz;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.ShovelBase;

public class QuartzShovel extends ShovelBase {

    private static final float DAMAGE = 1.5F;
    private static final float SPEED = -3.2F;

    public QuartzShovel() {
        super("quartz_shovel", ItemTiers.QUARTZ, DAMAGE, SPEED);
    }
}
