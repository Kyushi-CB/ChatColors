package de.kyushi.chatcolors.playerHashMap;





import java.util.HashMap;


public class Maps {

    private static final HashMap<String, String> playerColor = new HashMap<>();
    public static HashMap<String, String> getPlayerColor() {
        return playerColor;
    }

    private static final String[] colorValue = new String[] {

            /* Color codes */
            "§0" /* black */,
            "§1" /* dark_blue */,
            "§2" /* dark_green */,
            "§3" /* dark_aqua */,
            "§4" /* dark_red */,
            "§5" /* dark_purple */,
            "§6" /* gold */,
            "§7" /* gray */,
            "§8" /* dark_gray */,
            "§9" /* blue */,
            "§a" /* green */,
            "§b" /* aqua */,
            "§c" /* red */,
            "§d" /* light_purple */,
            "§e" /* yellow */,
            "§f" /* white */,

            /* Formatting codes*/

            "§k" /* Obfuscated */,
            "§l" /* Bold */,
            "§m" /* Strikethrough */,
            "§n" /* Underline */,
            "§o" /* Italic */,
            "§r" /* Reset */
    };
    public static String[] getColorValue() {
        return colorValue;
    }








}

