package vitalkrilov.itmo.prog.lab2.attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import vitalkrilov.itmo.prog.lab2.CliTextFormatter;
import vitalkrilov.itmo.prog.lab2.ImagesStorage;

public class ThunderWave extends StatusMove {

    public ThunderWave() {
        super(Type.ELECTRIC, 0, 90);
    }

    protected String describe() {
        return "использует атаку " + CliTextFormatter.colorify("Молниеносная волна", CliTextFormatter.Color.BrightYellow) + ": Суровый маг\n" +
                ImagesStorage.getImage(ImagesStorage.Image.Gandalf);
    }

    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return Attack.calcCriticalHit(att, def);
    }

}
