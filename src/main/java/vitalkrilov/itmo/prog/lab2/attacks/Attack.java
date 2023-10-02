package vitalkrilov.itmo.prog.lab2.attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import vitalkrilov.itmo.prog.lab2.ImagesStorage;

import java.util.Random;

public class Attack {
    public static double calcCriticalHit(Pokemon att, Pokemon def) {
        return calcCriticalHit(att, def, 1);
    }

    public static double calcCriticalHit(Pokemon att, Pokemon def, int critChangeTimesIncreased) {
        if (att.getStat(Stat.SPEED) / 512.0 * critChangeTimesIncreased > Math.random()) {
            System.out.println("Это оказалось критической атакой!");

            int[] neededSpacesForAnimation = { 1, 6, 4, 2, 3, 7, 0 };
            String[] neededPicturesForAnimation = {
                    ImagesStorage.getImage(ImagesStorage.Image.Outstanding),
                    ImagesStorage.getImage(ImagesStorage.Image.OutstandingGlitched),
                    ImagesStorage.getImage(ImagesStorage.Image.OutstandingColored),
                    ImagesStorage.getImage(ImagesStorage.Image.OutstandingGlitched),
                    ImagesStorage.getImage(ImagesStorage.Image.OutstandingColored),
                    ImagesStorage.getImage(ImagesStorage.Image.OutstandingGlitched),
                    ImagesStorage.getImage(ImagesStorage.Image.Outstanding) };
            Random r = new Random();
            for (int j = 0; j < neededSpacesForAnimation.length; ++j) {
                String[] str = neededPicturesForAnimation[j].split("\n");
                if (j != 0) {
                    System.out.print("\u001B[" + String.valueOf(str.length - 1) + "A");
                    System.out.print("\u001B[" + String.valueOf(str[0].length()*2) + "D");
                    System.out.print("\u001B[J");
                }
                for (int i = 0; i < str.length; ++i) {
                    for (int spaces = 0; spaces < neededSpacesForAnimation[j]; ++spaces)
                        System.out.print(' ');
                    if (j % 2 != 0 && i % 2 != 0) System.out.print(' '); // extra space for every 2nd line
                    System.out.print(str[i]);
                    if (i + 1 < str.length) System.out.println();
                }
                try {
                    Thread.sleep(50 + r.nextInt(75));
                } catch (InterruptedException ignored) {
                }
            }
            System.out.println();

            return 2.0;
        } else {
            return 1.0;
        }
    }
}
