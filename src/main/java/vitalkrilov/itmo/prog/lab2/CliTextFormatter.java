package vitalkrilov.itmo.prog.lab2;

// Very minimal realisation (but enough for this lab.)
public class CliTextFormatter {

    public enum Color {
        Black,
        Red,
        Green,
        Yellow,
        Blue,
        Magenta,
        Cyan,
        White,
        BrightBlack,
        BrightRed,
        BrightGreen,
        BrightYellow,
        BrightBlue,
        BrightMagenta,
        BrightCyan,
        BrightWhite
    }

    public static String colorify(String s, Color c) {
        return "\u001B[" + switch (c) {
            case Black -> "30";
            case Red -> "31";
            case Green -> "32";
            case Yellow -> "33";
            case Blue -> "34";
            case Magenta -> "35";
            case Cyan -> "36";
            case White -> "37";
            case BrightBlack -> "90";
            case BrightRed -> "91";
            case BrightGreen -> "92";
            case BrightYellow -> "93";
            case BrightBlue -> "94";
            case BrightMagenta -> "95";
            case BrightCyan -> "96";
            case BrightWhite -> "97";
        } + "m" + s + "\u001B[0m";
    }
}
