package de.kyushi.chatcolors.chatListener;

import de.kyushi.chatcolors.arrayLists.ArrayLists;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.ArrayList;

public class ChatListener implements Listener {
    public static ArrayList<String> playerList = ArrayLists.getPlayerList();
    public static String[] playerColors = ArrayLists.getPlayerColors();

    @EventHandler
    public void handleMutedChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        String message = event.getMessage().replace("%", "%%");
        message = ChatColor.translateAlternateColorCodes('&', message);
        if (playerList.contains(player.getName()+playerColors[9])) {
            event.setFormat("§6[§f" + player.getName() + "§6] » " + playerColors[9] + message);

        } else
            event.setFormat("§6[§f" + player.getName() + "§6] » §f" + message);
    }
}


