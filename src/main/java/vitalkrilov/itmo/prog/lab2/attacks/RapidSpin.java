package vitalkrilov.itmo.prog.lab2.attacks;

import ru.ifmo.se.pokemon.*;
import vitalkrilov.itmo.prog.lab2.CliTextFormatter;

public class RapidSpin extends PhysicalMove {

    public RapidSpin() {
        super(Type.NORMAL, 50, 100);
    }

    protected String describe() {
        return "использует атаку " + CliTextFormatter.colorify("Быстрое вращение", CliTextFormatter.Color.BrightBlack) + ": Смертельное заводное движение, которое разорвет препятствия и отведет врагов в черную бездну";
    }

    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.SPEED, 1);
    }

    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return Attack.calcCriticalHit(att, def);
    }

}
