package io.github.brodude1234.firstplugintest;

/**
 * Created by Brodude1234 on 25/03/2015.
 */

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
            return true;
        }
        return false;
    }

    @Override
    public void onDisable() {
        getLogger().info("The firstplugintest plugin onDisable has been invoked!");
    }

}
