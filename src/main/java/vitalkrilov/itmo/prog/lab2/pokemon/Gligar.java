package vitalkrilov.itmo.prog.lab2.pokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import vitalkrilov.itmo.prog.lab2.attacks.HydroPump;
import vitalkrilov.itmo.prog.lab2.attacks.Rage;
import vitalkrilov.itmo.prog.lab2.attacks.ThunderShock;

public class Gligar extends Pokemon {

    public Gligar() {
        this("Безымянный", 1);
    }

    public Gligar(String name, int level) {
        super(name, level);
        this.setType(Type.GROUND, Type.FLYING);
        this.setStats(65, 75, 105, 35, 65, 85);
        this.setMove(new ThunderShock(), new HydroPump(), new Rage(), new HydroPump());
    }

}
