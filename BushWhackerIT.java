package axonos.bushwhacker;

import net.minecraft.item.Items;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public class BushWhackerIT implements IItemTier {
    public int max_uses = 2301;
    public int efficiency = 0;
    public int atk_dmg = 10;
    public int harvest_lvl = 0;
    public int enchant = 0;

    Ingredient rep_mat;

    public int getMaxUses() {
        return max_uses;
    }

    public float getEfficiency() {
        return efficiency;
    }

    public float getAttackDamage() {
        return atk_dmg;
    }

    public int getHarvestLevel() {
        return harvest_lvl;
    }

    public int getEnchantability() {
        return enchant;
    }

    public Ingredient getRepairMaterial() {
        return rep_mat;
    };
    }

