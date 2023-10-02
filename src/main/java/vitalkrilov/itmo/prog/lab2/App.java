package vitalkrilov.itmo.prog.lab2;

import ru.ifmo.se.pokemon.Battle;

import vitalkrilov.itmo.prog.lab2.pokemon.*;

import java.util.Random;

/**
 * Entry point of App.
 *
 */
public class App {

    public static void main(String[] args) {
        Random r = new Random();
        Battle b = new Battle();
        Combusken p1 = new Combusken("\n" + ImagesStorage.getImage(ImagesStorage.Image.Combusken) + "\n" + NameBuilder.generateName(), 45 + r.nextInt(10));
        Tangrowth p2 = new Tangrowth("\n" + ImagesStorage.getImage(ImagesStorage.Image.Tangrowth) + "\n" + NameBuilder.generateName(), 45 + r.nextInt(10));
        Blissey p3 = new Blissey("\n" + ImagesStorage.getImage(ImagesStorage.Image.Blissey) + "\n" + NameBuilder.generateName(), 45 + r.nextInt(10));
        Forretress p4 = new Forretress("\n" + ImagesStorage.getImage(ImagesStorage.Image.Forretress) + "\n" + NameBuilder.generateName(), 45 + r.nextInt(10));
        Dunsparce p5 = new Dunsparce("\n" + ImagesStorage.getImage(ImagesStorage.Image.Dunsparce) + "\n" + NameBuilder.generateName(), 45 + r.nextInt(10));
        Gligar p6 = new Gligar("\n" + ImagesStorage.getImage(ImagesStorage.Image.Gligar) + "\n" + NameBuilder.generateName(), 45 + r.nextInt(10));
        b.addAlly(p1);
        b.addFoe(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addAlly(p5);
        b.addFoe(p6);
        b.go();
    }

}
