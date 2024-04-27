package ch.ksrminecraft.joinleaveplugin;

import ch.ksrminecraft.joinleaveplugin.listeners.ConnectionListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class JoinLeavePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new ConnectionListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
