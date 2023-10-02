package vitalkrilov.itmo.prog.lab2.attacks;


import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;
import vitalkrilov.itmo.prog.lab2.CliTextFormatter;
import vitalkrilov.itmo.prog.lab2.ImagesStorage;

public class HealBell extends StatusMove {

    public HealBell() {
        super(Type.NORMAL, 0, 0);
    }

    protected String describe() {
        return "использует атаку " + CliTextFormatter.colorify("Звонкое исцеление", CliTextFormatter.Color.BrightBlack) + ": Зловещий колокольный зов, пугающий несчастье, когда все страдание должно угаснуть.\n" +
                ImagesStorage.getImage(ImagesStorage.Image.Shrek);
    }

    protected void applySelfEffects(Pokemon p) {
        p.setCondition(new Effect().condition(Status.NORMAL));
    }

    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }

    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return Attack.calcCriticalHit(att, def);
    }

}
