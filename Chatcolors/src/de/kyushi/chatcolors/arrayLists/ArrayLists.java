package de.kyushi.chatcolors.arrayLists;


import java.util.ArrayList;

public class ArrayLists {

    private static ArrayList<String> playerList = new ArrayList<>();

    public static ArrayList<String> getPlayerList() {
        return playerList;
    }

    private static String[] playerColors = new String[]{"§1", "§2", "§3", "§4", "§5", "§6", "§7", "§8", "§9", "§a", "§b", "§c", "§d", "§e", "§l", "§n", "§o"};

    public static String[] getPlayerColors() {
        return playerColors;
    }




}

