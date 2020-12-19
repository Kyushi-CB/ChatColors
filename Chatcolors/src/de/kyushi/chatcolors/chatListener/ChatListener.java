package de.kyushi.chatcolors.chatListener;

import de.kyushi.chatcolors.playerHashMap.Maps;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import java.util.HashMap;


public class ChatListener implements Listener {

    public static HashMap<String, String> playerColor = Maps.getPlayerColor();

    @EventHandler
    public void handleChat(AsyncPlayerChatEvent e) {
        Player player = e.getPlayer();
        String plr = player.getName();
        String msg = e.getMessage().replace("%", "%%");
        String clr = playerColor.get(player.getName());
        msg = ChatColor.translateAlternateColorCodes('&', msg);

        if (playerColor.containsKey(player.getName())) {
            e.setFormat("§6[§f" + plr + "§6] » " + clr + msg);

        } else
            e.setFormat("§6[§f" + plr + "§6] » §f" + msg);
    }
}




