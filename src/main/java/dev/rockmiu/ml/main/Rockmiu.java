package dev.rockmiu.ml.main;

import dev.rockmiu.ml.cmds.killeffect;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Rockmiu extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("rhiu12rgaisuftgq2ryug125r");
        this.regcmds();
    }
    @Override
    public void onDisable(){
        getLogger().info("r12312325r");
    }
    public void regcmds() {
        this.getCommand("killeffect").setExecutor(new killeffect(this));
    }
}
