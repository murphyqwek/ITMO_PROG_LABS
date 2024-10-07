import pokemon.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1A = new Celebi("Дерево", 1);
        Pokemon p2A = new Eevee("Квадробер", 1);
        Pokemon p3A = new Flygon("Пикми", 1);
        b.addAlly(p1A);
        b.addAlly(p2A);
        b.addAlly(p3A);

        Pokemon p1F = new Trapinch("Сергей Симонов", 1);
        Pokemon p2F = new Vibrava("Кирпич", 1);
        Pokemon p3F = new Flygon("Maxwell", 1);
        b.addFoe(p1F);
        b.addFoe(p2F);
        b.addFoe(p3F);


        b.go();
    }
}
