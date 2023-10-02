package vitalkrilov.itmo.prog.lab2.attacks;

import ru.ifmo.se.pokemon.*;
import vitalkrilov.itmo.prog.lab2.CliTextFormatter;

public class Endeavor extends PhysicalMove {

    public Endeavor() {
        super(Type.NORMAL, 0, 100);
    }

    protected String describe() {
        return "использует атаку " + CliTextFormatter.colorify("Намерение", CliTextFormatter.Color.BrightBlack) + ": Отчаянная попытка выжить, где безусловная жажда мести роняет на колени самых сильных";
    }

    protected Pokemon hookedAttacker;

    protected double calcTypeEffect(Pokemon att, Pokemon def) {
        hookedAttacker = att; // this method is always called before applyOppDamage so we can rely on this info (there is no multithreading / etc.)
        return super.calcTypeEffect(att, def);
    }

    protected void applyOppDamage(Pokemon def, double damage) {
        double hpDiff = def.getHP() - hookedAttacker.getHP();
        if (hpDiff > 0)
            def.setMod(Stat.HP, (int)Math.round(hpDiff));
    }

    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return Attack.calcCriticalHit(att, def);
    }

}
