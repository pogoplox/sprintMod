package turniplabs.examplemod;

import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.net.command.Command;
import net.minecraft.core.net.command.CommandError;
import net.minecraft.core.net.command.CommandHandler;
import net.minecraft.core.net.command.CommandSender;

public class CommandSetMetadata extends Command {
    public CommandSetMetadata() {
        super("setSpeed", new String[0]);
    }

    @Override
    public boolean execute(CommandHandler commandHandler, CommandSender commandSender, String[] strings) {
        SprintMod.SpeedMultiplier = Float.parseFloat(strings[0]);
        SprintMod.LOGGER.info("Speed: " + strings[0]);

        return false;
    }

    @Override
    public boolean opRequired(String[] strings) {
        return false;
    }

    @Override
    public void sendCommandSyntax(CommandHandler commandHandler, CommandSender commandSender) {

    }
}
