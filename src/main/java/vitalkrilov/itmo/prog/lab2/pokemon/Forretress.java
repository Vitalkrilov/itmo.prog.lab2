package vitalkrilov.itmo.prog.lab2.pokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import vitalkrilov.itmo.prog.lab2.attacks.ThunderShock;
import vitalkrilov.itmo.prog.lab2.attacks.HydroPump;

public class Forretress extends Pokemon {

    public Forretress() {
        this("Безымянный", 1);
    }

    public Forretress(String name, int level) {
        super(name, level);
        this.setType(Type.BUG, Type.STEEL);
        this.setStats(75, 90, 140, 60, 60, 40);
        this.setMove(new ThunderShock(), new HydroPump());
    }

}
