package com.beauver.dungeonsanddragons;

import co.aikar.commands.PaperCommandManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class DungeonsAndDragons extends JavaPlugin {

    private static DungeonsAndDragons plugin;

    @Override
    public void onEnable() {
        plugin = this;

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        getLogger().info("|---[ Dungeons And Dragons ]---------------------------------|");
        getLogger().info("|                                                            |");
        enableClasses();
        enableCommands();
        enableListeners();
        getLogger().info("|                                                            |");
        getLogger().info("|---------------------------------[ ENABLED SUCCESSFULLY ]---|");

    }

    public void enableClasses(){

    }

    public void enableCommands() {
        PaperCommandManager manager = new PaperCommandManager(this);
        getLogger().info("|   Enabled commands                                         |");

    }

    public void enableListeners(){

        getLogger().info("|   Enabled listeners                                        |");
    }

    @Override
    public void onDisable() {
        getLogger().info("|---[ Dungeons And Dragons ]---------------------------------|");
        getLogger().info("|                                                            |");

        getLogger().info("|                                                            |");
        getLogger().info("|--------------------------------[ DISABLED SUCCESSFULLY ]---|");
    }

    public static DungeonsAndDragons getPlugin(){
        return plugin;
    }
}
