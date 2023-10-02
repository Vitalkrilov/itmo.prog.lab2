package vitalkrilov.itmo.prog.lab2.attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import vitalkrilov.itmo.prog.lab2.CliTextFormatter;
import vitalkrilov.itmo.prog.lab2.ImagesStorage;

public class Rage extends PhysicalMove {

    public Rage() {
        super(Type.NORMAL, 20, 100);
    }

    protected String describe() {
        return "использует атаку " + CliTextFormatter.colorify("Ярость", CliTextFormatter.Color.BrightBlack) + ": Поджигает темные глубины ярости, чтобы разрушить все вокруг и увести противников в безумие. { \u001B[3mну короче там это мы не можем так написать но мы могли бы если это не было бы проприетаркой короче берем и добавляем новый отдельный статус покемону ну и типа потом когда покемон атакует рейджом он там получает этот самый статус и потом хоба каждая атака по покемону будет апать ему атаку но когда сам покемон проатакует то статус снимется и все буста не будет короче вот так вот\u001B[0m }\n" +
                ImagesStorage.getImage(ImagesStorage.Image.Explanations);
    }

    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return Attack.calcCriticalHit(att, def);
    }
    
}
