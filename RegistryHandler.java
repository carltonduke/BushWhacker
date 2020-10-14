package axonos.bushwhacker;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
        // create DeferredRegister object
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BushWhackerMod.MODID);

        public static void init() {
            // attach DeferredRegister to the event bus
            ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        }

        //Create and Register SwordItem
        public static final RegistryObject<Item> BUSHWHACKER = ITEMS.register("bushwhacker", () ->
                new SwordItem(
                        new BushWhackerIT(), 0, 1, new Item.Properties().group(ItemGroup.COMBAT)
                )
        );
}
