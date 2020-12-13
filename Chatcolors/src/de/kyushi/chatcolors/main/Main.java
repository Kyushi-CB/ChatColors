package de.kyushi.chatcolors.main;


import de.kyushi.chatcolors.chatListener.ChatListener;
import de.kyushi.chatcolors.commands.ChatCommands;
import org.bukkit.Bukkit;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.Objects;

public class Main extends JavaPlugin {


    public void onEnable() {
        Objects.requireNonNull(this.getCommand("chatcolor")).setExecutor(new ChatCommands());
        System.out.println("§6[§aChatColors§6] §bPlugin wurde erfolgreich gestartet!");
        Bukkit.getPluginManager().registerEvents(new ChatListener(), this);
    }

    public void onDisable() {
        System.out.println("§6[§aChatColors§6] §4Plugin wird deaktiviert!");
    }
}
