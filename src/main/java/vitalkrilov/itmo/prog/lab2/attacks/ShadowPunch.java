package vitalkrilov.itmo.prog.lab2.attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import vitalkrilov.itmo.prog.lab2.CliTextFormatter;

public class ShadowPunch extends PhysicalMove {

    public ShadowPunch() {
        super(Type.GHOST, 60, 0);
    }

    protected String describe() {
        return "использует атаку " + CliTextFormatter.colorify("Теневой удар", CliTextFormatter.Color.Magenta) + ": Черная холодная рука смерти, проникающая сквозь все, разрушая души противников";
    }

    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }

    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return Attack.calcCriticalHit(att, def);
    }

}
