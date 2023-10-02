package vitalkrilov.itmo.prog.lab2.pokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import vitalkrilov.itmo.prog.lab2.attacks.ShadowPunch;
import vitalkrilov.itmo.prog.lab2.attacks.SleepTalk;
import vitalkrilov.itmo.prog.lab2.attacks.ThunderWave;
import vitalkrilov.itmo.prog.lab2.attacks.Thunderbolt;

public class Combusken extends Pokemon {

    public Combusken() {
        this("Безымянный", 1);
    }

    public Combusken(String name, int level) {
        super(name, level);
        this.setType(Type.FIRE, Type.FIGHTING);
        this.setStats(60, 85, 60, 85, 60, 55);
        this.setMove(new ShadowPunch(), new ThunderWave(), new SleepTalk(), new Thunderbolt());
    }

}
