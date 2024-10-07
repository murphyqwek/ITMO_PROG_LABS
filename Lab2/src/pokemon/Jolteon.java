package pokemon;

import ru.ifmo.se.pokemon.Type;
import moves.status.Agility;

public class Jolteon extends Eevee {
    public Jolteon() {
        this("Ноунейм", 1);
    }

    public Jolteon(String name, int level) {
        super(name, level);

        this.setStats(65, 65, 60, 110, 95, 130);
        this.setType(Type.ELECTRIC);

        this.addMove(new Agility());
    }
}
