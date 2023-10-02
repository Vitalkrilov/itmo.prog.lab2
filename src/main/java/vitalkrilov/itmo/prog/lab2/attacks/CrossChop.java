package vitalkrilov.itmo.prog.lab2.attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import vitalkrilov.itmo.prog.lab2.CliTextFormatter;

public class CrossChop extends PhysicalMove {

    public CrossChop() {
        super(Type.NORMAL, 100, 80);
    }

    protected String describe() {
        return "использует атаку " + CliTextFormatter.colorify("Крыжовой удар", CliTextFormatter.Color.BrightBlack) + ": Сокрушительный ход, ведущий противников в разрушительный океан боли и хаоса";
    }

    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return Attack.calcCriticalHit(att, def, 3);
    }

}
