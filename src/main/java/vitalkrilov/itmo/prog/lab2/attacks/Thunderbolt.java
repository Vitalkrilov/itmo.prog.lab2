package vitalkrilov.itmo.prog.lab2.attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Status;
import vitalkrilov.itmo.prog.lab2.CliTextFormatter;

public class Thunderbolt extends SpecialMove {

    public Thunderbolt() {
        super(Type.ELECTRIC, 90, 100);
    }

    protected String describe() {
        return "использует атаку " + CliTextFormatter.colorify("Молниеносный удар", CliTextFormatter.Color.BrightYellow) + ": Электрическое поражение, искры страха, пронизывающие все вокруг, оставляя разрушение и тление";
    }

    protected void applyOppEffects(Pokemon p) {
        p.setCondition(new Effect().chance(0.1).condition(Status.PARALYZE));
    }

    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return Attack.calcCriticalHit(att, def);
    }

}
