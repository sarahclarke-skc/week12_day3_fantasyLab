package equipments;

public enum SpellType {

    FIREBALL(25),
    LIGHTNING_STRIKE(20),
    FREEZE(20),
    CURSE(10);

    private final int power;

    SpellType(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
