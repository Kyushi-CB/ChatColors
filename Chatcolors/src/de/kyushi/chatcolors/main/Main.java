package de.kyushi.chatcolors.main;


import de.kyushi.chatcolors.chatListener.ChatListener;
import de.kyushi.chatcolors.chatCommands.Commands;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.Objects;

public class Main extends JavaPlugin {


    public void onEnable() {
        Objects.requireNonNull(this.getCommand("chatcolor")).setExecutor(new Commands());
        Bukkit.getPluginManager().registerEvents(new ChatListener(), this);
        Bukkit.getConsoleSender().sendMessage("§6[§aChatColors§6] §bPlugin wurde erfolgreich gestartet!");
    }

    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§6[§aChatColors§6] §4Plugin wird deaktiviert!");
    }
}
