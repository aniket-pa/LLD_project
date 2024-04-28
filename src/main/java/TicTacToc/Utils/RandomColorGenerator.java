package TicTacToc.Utils;

import java.awt.*;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomColorGenerator {

    public static String generateRandomColor() {
        Random random = new Random();
        // Generate random RGB values
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        // Create a Color object with the generated RGB values
//        return new Color(red, green, blue);
        return "#"+red+green+blue;
    }

//    public static Set<Color> generateUniqueColors(int count) {
//        Set<Color> uniqueColors = new HashSet<>();
//        while (uniqueColors.size() < count) {
//            Color color = generateRandomColor();
//            uniqueColors.add(color);
//        }
//        return uniqueColors;
//    }
}
