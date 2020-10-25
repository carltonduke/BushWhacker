package axonos.bushwhacker;

import axonos.bushwhacker.util.RegistryHandler;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.common.MinecraftForge;

@Mod ("bushwhacker")
public class BushWhackerMod {

    public static final String MODID = "bushwhacker";

    public BushWhackerMod() {
        //What does this do? I dunno
        MinecraftForge.EVENT_BUS.register(this);

        //Call method from RegistryHandler to register the sword
        RegistryHandler.init();
    }

}