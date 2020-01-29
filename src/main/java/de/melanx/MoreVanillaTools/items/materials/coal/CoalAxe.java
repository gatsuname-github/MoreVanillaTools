package de.melanx.MoreVanillaTools.items.materials.coal;

import de.melanx.MoreVanillaTools.items.ItemTiers;
import de.melanx.MoreVanillaTools.items.base.AxeBase;

public class CoalAxe extends AxeBase {

    private static final int ATTACK_DAMAGE = 6;
    private static final float ATTACK_SPEED = -3.4F;

    public CoalAxe() {
        super("coal_axe", ItemTiers.COAL, ATTACK_DAMAGE, ATTACK_SPEED);
    }
}
