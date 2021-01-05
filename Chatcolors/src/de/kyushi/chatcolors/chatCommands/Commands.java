package de.kyushi.chatcolors.chatCommands;

import de.kyushi.chatcolors.playerHashMap.Maps;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class Commands implements CommandExecutor {

    /*Get the HashMap class + color/formatting Strings*/

    public static HashMap<String, String> colorMap = Maps.getColorMap();
    public static HashMap<String, String> formattingMap = Maps.getFormattingMap();
    public static String[] colorValue = Maps.getColorValue();
    public static String[] formattingValue = Maps.getFormattingValue();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        /*Check if the command sender is a player*/

        if (sender instanceof Player) {
            Player player = (Player) sender;

            /* Start of args*/

            if (args.length == 1) {
                if (args[0].equalsIgnoreCase("help")) {
                    if (player.hasPermission("chatcolors.help")) {
                        player.sendMessage("§6Helpmenu coming soon! ;)");
                    } else
                        player.sendMessage("§4Dazu hast du keine Rechte!");

                } else if (args[0].equalsIgnoreCase("reset")) {
                    if (player.hasPermission("chatcolors.reset")) {
                        if (colorMap.containsKey(player.getName())) {
                            colorMap.remove(player.getName());
                            player.sendMessage("§aDeine Chatformatierung wurde zurückgesetzt!");
                        } else
                            player.sendMessage("Es gibt nichts zurückzusetzen.");
                    } else
                        player.sendMessage("§4Dazu hast du keine Rechte!");

                } else if (args[0].equalsIgnoreCase("black")) {
                    if (player.hasPermission("chatcolors.black")) {
                        if (colorMap.get(player.getName()) != colorValue[0]) {
                            colorMap.put(player.getName(), colorValue[0]);
                            player.sendMessage("§aDu schreibst jetzt schwarz!");
                        } else if (colorMap.containsKey(player.getName()) && (colorMap.get(player.getName()) == colorValue[0])) {
                            player.sendMessage("§4Du schreibst bereits schwarz!");
                        }
                    } else
                        player.sendMessage("§4Dazu hast du keine Rechte!");

                } else if (args[0].equalsIgnoreCase("dark_blue")) {
                    if (player.hasPermission("chatcolors.dark_blue")) {
                        if (colorMap.get(player.getName()) != colorValue[1]) {
                            colorMap.put(player.getName(), colorValue[1]);
                            player.sendMessage("§aDu schreibst jetzt dunkelblau!");
                        } else if (colorMap.containsKey(player.getName()) && (colorMap.get(player.getName()) == colorValue[1])) {
                            player.sendMessage("§4Du schreibst bereits dunkelblau!");
                        }
                    } else
                        player.sendMessage("§4Dazu hast du keine Rechte!");

                } else if (args[0].equalsIgnoreCase("dark_green")) {
                    if (player.hasPermission("chatcolors.dark_green")) {
                        if (colorMap.get(player.getName()) != colorValue[2]) {
                            colorMap.put(player.getName(), colorValue[2]);
                            player.sendMessage("§aDu schreibst jetzt dunkelgrün!");
                        } else if (colorMap.containsKey(player.getName()) && (colorMap.get(player.getName()) == colorValue[2])) {
                            player.sendMessage("§4Du schreibst bereits dunkelgrün!");
                        }
                    } else
                        player.sendMessage("§4Dazu hast du keine Rechte!");

                } else if (args[0].equalsIgnoreCase("dark_aqua")) {
                    if (player.hasPermission("chatcolors.dark_aqua")) {
                        if (colorMap.get(player.getName()) != colorValue[3]) {
                            colorMap.put(player.getName(), colorValue[3]);
                            player.sendMessage("§aDu schreibst jetzt 'dunkelaqua'!(ist das überhaupt ein Wort?xD)");
                        } else if (colorMap.containsKey(player.getName()) && (colorMap.get(player.getName()) == colorValue[3])) {
                            player.sendMessage("§4Du schreibst bereits dunkelaqua!");
                        }
                    } else
                        player.sendMessage("§4Dazu hast du keine Rechte!");

                } else if (args[0].equalsIgnoreCase("dark_red")) {
                    if (player.hasPermission("chatcolors.dark_red")) {
                        if (colorMap.get(player.getName()) != colorValue[4]) {
                            colorMap.put(player.getName(), colorValue[4]);
                            player.sendMessage("§aDu schreibst jetzt dunkelrot!");
                        } else if (colorMap.containsKey(player.getName()) && (colorMap.get(player.getName()) == colorValue[4])) {
                            player.sendMessage("§4Du schreibst bereits dunkelrot!");
                        }
                    } else
                        player.sendMessage("§4Dazu hast du keine Rechte!");

                } else if (args[0].equalsIgnoreCase("dark_purple")) {
                    if (player.hasPermission("chatcolors.dark_purple")) {
                        if (colorMap.get(player.getName()) != colorValue[5]) {
                            colorMap.put(player.getName(), colorValue[5]);
                            player.sendMessage("§aDu schreibst jetzt dunkellila!");
                        } else if (colorMap.containsKey(player.getName()) && (colorMap.get(player.getName()) == colorValue[5])) {
                            player.sendMessage("§4Du schreibst bereits dunkellila!");
                        }
                    } else
                        player.sendMessage("§4Dazu hast du keine Rechte!");

                } else if (args[0].equalsIgnoreCase("gold")) {
                    if (player.hasPermission("chatcolors.gold")) {
                        if (colorMap.get(player.getName()) != colorValue[6]) {
                            colorMap.put(player.getName(), colorValue[6]);
                            player.sendMessage("§aDu schreibst jetzt gold!");
                        } else if (colorMap.containsKey(player.getName()) && (colorMap.get(player.getName()) == colorValue[6])) {
                            player.sendMessage("§4Du schreibst bereits gold!");
                        }
                    } else
                        player.sendMessage("§4Dazu hast du keine Rechte!");

                } else if (args[0].equalsIgnoreCase("gray")) {
                    if (player.hasPermission("chatcolors.gray")) {
                        if (colorMap.get(player.getName()) != colorValue[7]) {
                            colorMap.put(player.getName(), colorValue[7]);
                            player.sendMessage("§aDu schreibst jetzt grau!");
                        } else if (colorMap.containsKey(player.getName()) && (colorMap.get(player.getName()) == colorValue[7])) {
                            player.sendMessage("§4Du schreibst bereits grau!");
                        }
                    } else
                        player.sendMessage("§4Dazu hast du keine Rechte!");

                } else if (args[0].equalsIgnoreCase("dark_gray")) {
                    if (player.hasPermission("chatcolors.dark_gray")) {
                        if (colorMap.get(player.getName()) != colorValue[8]) {
                            colorMap.put(player.getName(), colorValue[8]);
                            player.sendMessage("§aDu schreibst jetzt dunkelgrau!");
                        } else if (colorMap.containsKey(player.getName()) && (colorMap.get(player.getName()) == colorValue[8])) {
                            player.sendMessage("§4Du schreibst bereits dunkelgrau!");
                        }
                    } else
                        player.sendMessage("§4Dazu hast du keine Rechte!");

                } else if (args[0].equalsIgnoreCase("blue")) {
                    if (player.hasPermission("chatcolors.blue")) {
                        if (colorMap.get(player.getName()) != colorValue[9]) {
                            colorMap.put(player.getName(), colorValue[9]);
                            player.sendMessage("§aDu schreibst jetzt blau!");
                        } else if (colorMap.containsKey(player.getName()) && (colorMap.get(player.getName()) == colorValue[9])) {
                            player.sendMessage("§4Du schreibst bereits blau!");
                        }
                    } else
                        player.sendMessage("§4Dazu hast du keine Rechte!");

                } else if (args[0].equalsIgnoreCase("green")) {
                    if (player.hasPermission("chatcolors.green")) {
                        if (colorMap.get(player.getName()) != colorValue[10]) {
                            colorMap.put(player.getName(), colorValue[10]);
                            player.sendMessage("§aDu schreibst jetzt grün!");
                        } else if (colorMap.containsKey(player.getName()) && (colorMap.get(player.getName()) == colorValue[10])) {
                            player.sendMessage("§4Du schreibst bereits grün!");
                        }
                    } else
                        player.sendMessage("§4Dazu hast du keine Rechte!");

                } else if (args[0].equalsIgnoreCase("aqua")) {
                    if (player.hasPermission("chatcolors.aqua")) {
                        if (colorMap.get(player.getName()) != colorValue[11]) {
                            colorMap.put(player.getName(), colorValue[11]);
                            player.sendMessage("§aDu schreibst jetzt aqua!");
                        } else if (colorMap.containsKey(player.getName()) && (colorMap.get(player.getName()) == colorValue[11])) {
                            player.sendMessage("§4Du schreibst bereits aqua!");
                        }
                    } else
                        player.sendMessage("§4Dazu hast du keine Rechte!");

                } else if (args[0].equalsIgnoreCase("red")) {
                    if (player.hasPermission("chatcolors.red")) {
                        if (colorMap.get(player.getName()) != colorValue[12]) {
                            colorMap.put(player.getName(), colorValue[12]);
                            player.sendMessage("§aDu schreibst jetzt rot!");
                        } else if (colorMap.containsKey(player.getName()) && (colorMap.get(player.getName()) == colorValue[12])) {
                            player.sendMessage("§4Du schreibst bereits rot!");
                        }
                    } else
                        player.sendMessage("§4Dazu hast du keine Rechte!");

                } else if (args[0].equalsIgnoreCase("light_purple")) {
                    if (player.hasPermission("chatcolors.purple")) {
                        if (colorMap.get(player.getName()) != colorValue[13]) {
                            colorMap.put(player.getName(), colorValue[13]);
                            player.sendMessage("§aDu schreibst jetzt lila!");
                        } else if (colorMap.containsKey(player.getName()) && (colorMap.get(player.getName()) == colorValue[13])) {
                            player.sendMessage("§4Du schreibst bereits lila!");
                        }
                    } else
                        player.sendMessage("§4Dazu hast du keine Rechte!");

                } else if (args[0].equalsIgnoreCase("yellow")) {
                    if (player.hasPermission("chatcolors.yellow")) {
                        if (colorMap.get(player.getName()) != colorValue[14]) {
                            colorMap.put(player.getName(), colorValue[14]);
                            player.sendMessage("§aDu schreibst jetzt gelb!");
                        } else if (colorMap.containsKey(player.getName()) && (colorMap.get(player.getName()) == colorValue[14])) {
                            player.sendMessage("§4Du schreibst bereits gelb!");
                        }
                    } else
                        player.sendMessage("§4Dazu hast du keine Rechte!");

                } else if (args[0].equalsIgnoreCase("white")) {
                    if (player.hasPermission("chatcolors.white")) {
                        if (colorMap.get(player.getName()) != colorValue[15]) {
                            colorMap.put(player.getName(), colorValue[15]);
                            player.sendMessage("§aDu schreibst jetzt weiß!");
                        } else if (colorMap.containsKey(player.getName()) && (colorMap.get(player.getName()) == colorValue[15])) {
                            player.sendMessage("§4Du schreibst bereits weiß!");
                        }
                    } else
                        player.sendMessage("§4Dazu hast du keine Rechte!");
                } else
                    player.sendMessage("§4zu viele/wenig Argumente! Bitte gib §2/chatcolor ['color'] §4ein!");
            } else
                player.sendMessage("§4Falsche Schreibweise des Kommandos! Bitte gib §2/chatcolor ['color'] §4ein!");
        } else
            Bukkit.getConsoleSender().sendMessage("§4Das Ändern der Chatfarbe ist nur als Spieler möglich!");

        return false;
    }
}



