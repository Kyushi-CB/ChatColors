package de.kyushi.chatcolors.main;

import de.kyushi.chatcolors.commands.Command;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class Main extends JavaPlugin {


    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§6[§aTest Plugin§6] §bPlugin wurde erfolgreich gestartet!");
        Objects.requireNonNull(this.getCommand("chatcolor")).setExecutor(new Command());

    }

    public void onDisable() {
        System.out.println("§6[§aChat Colors§6] §4Plugin wird deaktiviert!");
    }
}
