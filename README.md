# BushWhacker
Adds a custom sword to minecraft, called the "Bush Whacker". Custom model and texture created in BlockBench. Next step is implementing the sword's mechanics, firstly to break grass blocks in an area around the player, hence the name. Once I think of other cool mechanics, I'll add those too.

# BushWhackerMod.java
Main driver class of the mod. Calls the RegistryInit method to register the mod's new item.

# BushWhackerIT.java
A new Minecraft object of type SwordItem must be instantiated with an object of type IItemTier. IItemTier is an abstract Minecraft class that I implement in BushWhackerIT. 
I used an enum so I could make seperate defined instances if I decide to add more swords/tools.

# RegistryHandler.java
Does the brunt of the work in this mod. Creates a DeferredRegister for items, attatches it to the event bus, then creates the actual SwordItem while registering it. 
Efficient, huh?
DeferredRegister is the preferred method for registering modded items/blocks, but don't ask me why. Causes the least issues with registration and with other mods.

# BushModelLoader.java
Will be used to load the sword's model from a .OBJ file. Not finished, and not something I know how to do yet. The documentation is next to nonexistent
considering the mod is built in Forge 1.16.3, the very newest version of Minecraft & of the Forge API.

