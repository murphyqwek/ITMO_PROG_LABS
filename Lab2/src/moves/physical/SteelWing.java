package moves.physical;

import ru.ifmo.se.pokemon.*;

public class SteelWing extends PhysicalMove {
    public SteelWing() {
        super(Type.STEEL, 70, 90);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().chance(0.1).turns(-1).stat(Stat.DEFENSE, 1));
    }

    @Override
    protected String describe() {
        return "использует Steel Wing";
    }
}
