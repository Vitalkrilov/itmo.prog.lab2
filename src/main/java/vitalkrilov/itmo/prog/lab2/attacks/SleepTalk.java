package vitalkrilov.itmo.prog.lab2.attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import vitalkrilov.itmo.prog.lab2.CliTextFormatter;

public class SleepTalk extends StatusMove {

    public SleepTalk() {
        super(Type.NORMAL, 0, 0);
    }

    protected String describe() {
        return "использует атаку " + CliTextFormatter.colorify("Говорящий сном", CliTextFormatter.Color.BrightBlack) + ": Злорадное шептание бессознательного разума, разбуженного кошмарами и страхами";
    }

    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }

    protected void applySelfEffects(Pokemon p) {
        if (p.getCondition() == Status.SLEEP)
            p.prepareMove();
    }

    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return Attack.calcCriticalHit(att, def);
    }

}
