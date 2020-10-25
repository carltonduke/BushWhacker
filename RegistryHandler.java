package axonos.bushwhacker.util;

import axonos.bushwhacker.BushWhackerMod;
import axonos.bushwhacker.tools.BushWhackerIT;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


@SuppressWarnings("MagicConstant")
public class RegistryHandler {
    // create DeferredRegister object
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BushWhackerMod.MODID);

    public static void init() {
        // attach DeferredRegister to the event bus
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Create and Register SwordItem
    public static final RegistryObject<SwordItem> BUSHWHACKER = ITEMS.register("bushwhacker", () ->
            new SwordItem(
                     BushWhackerIT.BUSH, 0, 0.0F, new Item.Properties().group(ItemGroup.COMBAT)
            )
    );
}
