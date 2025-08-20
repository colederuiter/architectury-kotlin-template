package ca.searooter.neoforge

import ca.searooter.ExampleMod
import net.neoforged.bus.api.IEventBus
import net.neoforged.fml.common.Mod

@Mod(ExampleMod.MOD_ID)
class ExampleModNeoForge(modBus: IEventBus) {
    init {
        // Call your common init (where your logger logs)
        ExampleMod.init()
    }
}
