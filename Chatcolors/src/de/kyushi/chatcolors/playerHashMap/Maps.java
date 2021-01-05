package de.kyushi.chatcolors.playerHashMap;

import java.util.HashMap;

public class Maps {

    private static final HashMap<String, String> colorMap = new HashMap<>();
    public static HashMap<String, String> getColorMap() {
        return colorMap;
    }

    private static final HashMap<String, String> formattingMap = new HashMap<>();
    public static HashMap<String, String> getFormattingMap() {
        return formattingMap;
    }

    private static final String[] colorValue = new String[]{

            /* Color codes */
            "§0", /* black */
            "§1", /* dark_blue */
            "§2", /* dark_green */
            "§3", /* dark_aqua */
            "§4", /* dark_red */
            "§5", /* dark_purple */
            "§6", /* gold */
            "§7", /* gray */
            "§8", /* dark_gray */
            "§9", /* blue */
            "§a", /* green */
            "§b", /* aqua */
            "§c", /* red */
            "§d", /* light_purple */
            "§e", /* yellow */
            "§f"  /* white */


    };

    private static final String[] formattingValue = new String[] {

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
    public static String[] getFormattingValue() {
        return colorValue;
    }








}

