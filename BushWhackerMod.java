package axonos.bushwhacker;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.item.SwordItem;

@Mod ("bushwhacker")
public class BushWhackerMod {

    public static final String MODID = "bushwhacker";
    public static final String NAME = "The BushWhacker";
    public static final String VERSION = "1.0";

    Item.Properties properties = new Item.Properties();
    BushWhackerIT item_tier = new BushWhackerIT();

    public int p_2 = 0;
    public float p_3 = 1;


    public BushWhackerMod() {

        SwordItem c_sword = null;

        MinecraftForge.EVENT_BUS.register(this);

        RegistryHandler.init();
    }



}
