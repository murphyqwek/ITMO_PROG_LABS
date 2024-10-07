package pokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import moves.physical.Bulldoze;
import moves.physical.RockTomb;

public class Trapinch extends Pokemon {
    public Trapinch() {
        this("Ноунейм", 1);
    }

    public Trapinch(String name, int level) {
        super(name, level);

        this.setType(Type.GROUND);
        this.setStats(45, 100, 45, 45, 45, 10);
        this.setMove(new RockTomb(), new Bulldoze());
    }
}
