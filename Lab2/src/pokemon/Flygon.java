package pokemon;

import moves.physical.SteelWing;

public class Flygon extends Vibrava {
    public Flygon() {
        this("Ноунейм", 1);
    }

    public Flygon(String name, int level) {
        super(name, level);

        this.setStats(80, 100, 80, 80, 80, 100);
        this.addMove(new SteelWing());
    }
}
