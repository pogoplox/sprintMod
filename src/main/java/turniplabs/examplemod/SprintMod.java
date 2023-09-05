package turniplabs.examplemod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.CommandHelper;


public class SprintMod implements ModInitializer {
    public static final String MOD_ID = "examplemod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static float SpeedMultiplier = 2.0f;
    

    @Override
    public void onInitialize() {
        LOGGER.info("ExampleMod initialized.");
         ///List<Command> commands = new ArrayList<Command>();



        CommandHelper.createCommand(new CommandSetMetadata());

    }
}
