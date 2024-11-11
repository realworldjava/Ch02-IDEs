package com.wiley.realworldjava.refactoring;

public class ColorStep0 {

    public static Color parseColor(String rbgString) {
        int rgbInt = Integer.parseInt(rbgString);
        Color color = new Color(rgbInt);
        return color;
    }
}
