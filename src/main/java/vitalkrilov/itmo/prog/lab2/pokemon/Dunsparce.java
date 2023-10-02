package vitalkrilov.itmo.prog.lab2.pokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import vitalkrilov.itmo.prog.lab2.attacks.ThunderShock;
import vitalkrilov.itmo.prog.lab2.attacks.HydroPump;
import vitalkrilov.itmo.prog.lab2.attacks.Rage;

public class Dunsparce extends Pokemon {

    public Dunsparce() {
        this("Безымянный", 1);
    }

    public Dunsparce(String name, int level) {
        super(name, level);
        this.setType(Type.NORMAL);
        this.setStats(100, 70, 70, 65, 65, 45);
        this.setMove(new ThunderShock(), new HydroPump(), new Rage());
    }

}
