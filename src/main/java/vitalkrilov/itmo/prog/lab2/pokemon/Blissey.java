package vitalkrilov.itmo.prog.lab2.pokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import vitalkrilov.itmo.prog.lab2.attacks.CrossChop;
import vitalkrilov.itmo.prog.lab2.attacks.Endeavor;
import vitalkrilov.itmo.prog.lab2.attacks.HealBell;
import vitalkrilov.itmo.prog.lab2.attacks.RapidSpin;

public class Blissey extends Pokemon {

    public Blissey() {
        this("Безымянный", 1);
    }

    public Blissey(String name, int level) {
        super(name, level);
        this.setType(Type.NORMAL);
        this.setStats(255, 10, 10, 75, 135, 55);
        this.setMove(new Endeavor(), new RapidSpin(), new HealBell(), new CrossChop());
    }

}
