package equipments;

public enum ArmourType {

    LEATHER(10),
    HORNED_HELMET(15),
    CHAIN_MAIL(20),
    EVIL_CAPE(10),
    GOOD_CAPE(10),
    TRASHCAN_LID(5);

    private final int defenceLevel;

    ArmourType(int defenceLevel) {
        this.defenceLevel = defenceLevel;
    }

    public int getDefenceLevel() {
        return defenceLevel;
    }
}
