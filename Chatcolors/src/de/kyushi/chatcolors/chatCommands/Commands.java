package de.kyushi.chatcolors.chatCommands;

import de.kyushi.chatcolors.playerHashMap.Maps;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class Commands implements CommandExecutor {

    /*Get the HashMap class + colorValues*/

    public static HashMap<String, String> playerColor = Maps.getPlayerColor();
    public static String[] colorValue = Maps.getColorValue();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        /*Check if the command sender is a player*/

        if (sender instanceof Player) {
            Player player = (Player) sender;

                if (args.length == 1) {

                    /* Start of args*/

                    if (player.hasPermission("chatcolors.green")) {
                        if (args[0].equalsIgnoreCase("grün")) {
                            if (!playerColor.containsKey(player.getName()+playerColor.containsValue(colorValue[0]))) {
                                playerColor.put(player.getName(), colorValue[0]);
                                player.sendMessage("§aDu schreibst jetzt grün!");
                            } else if (playerColor.containsKey(player.getName()+colorValue[0])) {
                                player.sendMessage("§4Du schreibst bereits grün!");
                            }

                        } else if (args[0].equalsIgnoreCase("reset")) {
                            if (playerColor.containsKey(player.getName())) {
                                playerColor.remove(player.getName());
                                player.sendMessage("§aDeine Chatformatierung wurde resettet!");

                            }

                        } else
                            player.sendMessage("§4Falsche Schreibweise des Kommandos! Bitte gib §2/chatcolor ['color'] §4ein!");
                    } else
                        player.sendMessage("§4Dazu hast du keine Rechte!");
                } else
                    player.sendMessage("§4zu viele/wenig Argumente! Bitte gib §2/chatcolor ['color'] §4ein!");
        } else
            Bukkit.getConsoleSender().sendMessage("§4Das Ändern der Chatfarbe ist nur als Spieler möglich!");

        return false;
    }
}



