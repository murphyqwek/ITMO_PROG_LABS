package pokemon;

import moves.special.BugBuzz;
import ru.ifmo.se.pokemon.Type;

public class Vibrava extends Trapinch{
    public Vibrava() {
        super("Ноунейм", 1);
    }

    public Vibrava(String name, int level) {
        super(name, level);

        this.setStats(50, 70, 50, 50, 50, 70);

        this.addType(Type.DRAGON);
        this.addMove(new BugBuzz());
    }
}
