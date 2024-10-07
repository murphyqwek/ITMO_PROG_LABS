package pokemon;

import moves.physical.AerialAce;
import moves.special.EnergyBall;
import moves.special.MagicalLeaf;
import moves.status.SwordsDance;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Celebi extends Pokemon {
    public Celebi() {
        this("Ноунейм", 1);
    }

    public Celebi(String name, int level) {
        super(name, level);
        this.setType(Type.PSYCHIC, Type.GRASS);
        this.setStats(100, 100, 100, 100, 100, 100);

        this.setMove(new EnergyBall(), new AerialAce(), new SwordsDance(), new MagicalLeaf());
    }
}
