package vitalkrilov.itmo.prog.lab2.attacks;

import ru.ifmo.se.pokemon.*;
import vitalkrilov.itmo.prog.lab2.CliTextFormatter;

public class HydroPump extends SpecialMove {

    public HydroPump() {
        super(Type.WATER, 110, 80);
    }

    protected String describe() {
        return "использует атаку " + CliTextFormatter.colorify("Гидрофорс", CliTextFormatter.Color.BrightBlue) + ": Стихийная атака, размывающая жизнь и оставляющая противников в водовороте безысходности";
    }

    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return Attack.calcCriticalHit(att, def);
    }
    
}
