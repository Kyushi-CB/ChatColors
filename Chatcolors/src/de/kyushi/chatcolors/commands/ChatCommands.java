package de.kyushi.chatcolors.commands;

import de.kyushi.chatcolors.arrayLists.ArrayLists;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import java.util.ArrayList;

public class ChatCommands implements CommandExecutor {

    public static ArrayList<String> activePlayers = ArrayLists.getActivePlayers();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("chatcolors.green")) {
                if (args.length == 1) {
                    if (args[0].equalsIgnoreCase("grün")) {
                        if (!activePlayers.contains(player.getName())) {
                            activePlayers.add(player.getName());
                            player.sendMessage("debug:5");

                        } else
                            activePlayers.remove(player.getName());
                        player.sendMessage("debug:4");
                    } else
                        player.sendMessage("debug:3");
                } else
                    player.sendMessage("debug:2");
            } else
                player.sendMessage("debug:1");
        }
        return false;
    }
}




