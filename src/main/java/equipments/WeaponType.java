package equipments;

public enum WeaponType {

    AXE(6),
    SWORD(5),
    CLUB(2),
    POTATO(1);

    private final int strength;

    WeaponType(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }
}
