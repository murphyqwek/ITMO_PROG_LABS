package pokemon;

import moves.status.SandAttack;
import moves.status.Swagger;
import moves.status.TailWhip;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Eevee extends Pokemon {
    public Eevee() {
        this("Ноунейм", 1);
    }

    public Eevee(String name, int level) {
        super(name, level);
        this.setType(Type.NORMAL);
        this.setStats(55, 55, 50, 45, 65, 55);

        this.setMove(new TailWhip(), new SandAttack(), new Swagger());
    }
}
