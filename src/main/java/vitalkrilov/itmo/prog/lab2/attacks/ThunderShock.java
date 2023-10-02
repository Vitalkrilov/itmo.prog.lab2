package vitalkrilov.itmo.prog.lab2.attacks;

import ru.ifmo.se.pokemon.*;
import vitalkrilov.itmo.prog.lab2.CliTextFormatter;

public class ThunderShock extends SpecialMove {

    public ThunderShock() {
        super(Type.ELECTRIC, 40, 100);
    }

    protected String describe() {
        return "использует атаку " + CliTextFormatter.colorify("Молниеносная искра", CliTextFormatter.Color.BrightYellow) + ": Зловещее дрожание воздуха, окутывающее врагов, прерывающее их жизненные потоки";
    }

    protected void applyOppEffects(Pokemon p) {
        p.setCondition(new Effect().chance(0.1).condition(Status.PARALYZE));
    }

    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return Attack.calcCriticalHit(att, def);
    }

}
