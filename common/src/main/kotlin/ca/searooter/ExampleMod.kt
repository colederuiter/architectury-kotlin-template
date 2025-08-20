package ca.searooter
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

object ExampleMod {
    const val MOD_ID: String = "examplemod";

    public val LOGGER: Logger = LoggerFactory.getLogger(MOD_ID);

    fun init() {
        // Write common init code here.
        LOGGER.info("Example mod Initialized");
    }
}
