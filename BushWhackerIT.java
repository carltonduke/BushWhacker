package axonos.bushwhacker.tools;

import axonos.bushwhacker.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum BushWhackerIT implements IItemTier {

    BUSH(2301, 1, 10, 0, 0, () -> {
        return Ingredient.fromItems(RegistryHandler.BUSHWHACKER.get());
    });

    private final int max_uses;
    private final float efficiency;
    private final int atk_dmg;
    private final int harvest_lvl;
    private final int enchant;
    private final Supplier<Ingredient> rep_mat;

    BushWhackerIT(int max_uses, float efficiency, int atk_dmg, int harvest_lvl, int enchant, Supplier<Ingredient> rep_mat) {
        this.max_uses = max_uses;
        this.efficiency = efficiency;
        this.atk_dmg = atk_dmg;
        this.harvest_lvl = harvest_lvl;
        this.enchant = enchant;
        this.rep_mat = rep_mat;
    }

    @Override
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
        return rep_mat.get();
    }
    }

