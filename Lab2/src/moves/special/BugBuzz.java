package moves.special;

import ru.ifmo.se.pokemon.*;

public class BugBuzz extends SpecialMove {
    public BugBuzz() {
        super(Type.BUG, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().chance(0.1).turns(-1).stat(Stat.SPECIAL_DEFENSE, -1));
    }

    @Override
    protected String describe() {
        return "использует Bug Buzz";
    }
}
