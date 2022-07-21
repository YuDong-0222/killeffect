package dev.rockmiu.ml.cmds;

import dev.rockmiu.ml.main.Rockmiu;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class killeffect implements CommandExecutor {
    public killeffect(Rockmiu rockmiu) {
    }

    public boolean onCommand(CommandSender sender, Command cmd, String args, String[] args2){
        sender.sendMessage(ChatColor.AQUA + "Killeffect" + ChatColor.GREEN + " \n   Power by OceanTW :D\n   Commands:\n" +
                ChatColor.DARK_GREEN + "    /killeffect - §F主要指令");
        sender.sendMessage(ChatColor.DARK_GREEN + "    /killeffect cc ");
        return true;
    }
}
