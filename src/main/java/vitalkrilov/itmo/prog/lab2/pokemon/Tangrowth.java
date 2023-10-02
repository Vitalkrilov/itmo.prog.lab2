package vitalkrilov.itmo.prog.lab2.pokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import vitalkrilov.itmo.prog.lab2.attacks.Endeavor;
import vitalkrilov.itmo.prog.lab2.attacks.HealBell;
import vitalkrilov.itmo.prog.lab2.attacks.RapidSpin;

public class Tangrowth extends Pokemon {

    public Tangrowth() {
        this("Безымянный", 1);
    }

    public Tangrowth(String name, int level) {
        super(name, level);
        this.setType(Type.GRASS);
        this.setStats(100, 100, 125, 110, 50, 50);
        this.setMove(new Endeavor(), new RapidSpin(), new HealBell());
    }

}
