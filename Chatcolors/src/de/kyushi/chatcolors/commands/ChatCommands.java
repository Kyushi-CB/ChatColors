package de.kyushi.chatcolors.commands;

import com.mysql.fabric.xmlrpc.base.Array;
import de.kyushi.chatcolors.arrayLists.ArrayLists;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Arrays;

public class ChatCommands implements CommandExecutor {

    public static ArrayList<String> playerList = ArrayLists.getPlayerList();
    public static String[] playerColors = ArrayLists.getPlayerColors();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (player.hasPermission("chatcolors.green")) {
                if (args.length == 1) {

                    if (args[0].equalsIgnoreCase("grün")) {
                        if (!playerList.contains(player.getDisplayName() + playerColors[9])) {
                            playerList.add(player.getDisplayName() + playerColors[9]);
                            player.sendMessage("§aDu schreibst jetzt grün!");
                        } else if (playerList.contains(player.getDisplayName() + playerColors[9])) {
                            player.sendMessage("§4Du schreibst bereits grün!");
                        }

                        } else if (args[0].equalsIgnoreCase("reset")) {
                        if (playerList.contains(player.getDisplayName() + (playerColors[9]))) {
                            playerList.remove(player.getDisplayName() + (playerColors[9]));
                            player.sendMessage("§aDeine Chatformatierung wurde resettet!");

                        } else
                            player.sendMessage("debug1");
                    } else
                        player.sendMessage("§4Falsche Schreibweise des Kommandos! Bitte gib §2/chatcolor ['color'] §4ein!");
                } else
                    player.sendMessage("§4zu viele/wenig Argumente! Bitte gib §2/chatcolor ['color'] §4ein!");
            } else
                player.sendMessage("§4Dazu hast du keine Rechte!");
        } else
            Bukkit.getConsoleSender().sendMessage("§4Das Ändern der Chatfarbe ist nur als Spieler möglich!");

        return false;
    }
}



