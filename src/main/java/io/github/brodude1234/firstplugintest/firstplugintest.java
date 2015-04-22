package io.github.brodude1234.firstplugintest;

/**
 * Created by Brodude1234 on 25/03/2015.
 */

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public final class firstplugintest extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("The firstplugintest plugin onEnable has been invoked!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("basic")) {
            getLogger().info("The basic command has successfully run! Hooray!");
            sender.sendMessage("You run dat command! My name's Jeff!");
            return true;
        } else {
            if (cmd.getName().equalsIgnoreCase("ignite")) {
                if (args.length != 1) {
                    return false;
                }
                if (!(sender instanceof Player)) {
                    sender.sendMessage("You can't hurt people if they cant hurt you! Meanie!");
                }

                Player target = Bukkit.getServer().getPlayer(args[0]);

                if (target == null) {
                    sender.sendMessage(args[0] + "is not online. Sucked in!");
                    return true;
                }

                target.setFireTicks(100);
                return true;

            }
        }
        return false;
    }

    @Override
    public void onDisable() {
        getLogger().info("The firstplugintest plugin onDisable has been invoked!");
    }

}
