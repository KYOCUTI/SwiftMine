package com.kyocuti.swiftmine;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class SwiftMine extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("SwiftMine: Plugin has been successfully enabled");
    }

    @Override
    public void onDisable() {
        getLogger().info("SwiftMine: Plugin has been successfully disabled");
    }
}
