package equipments;

public enum CreatureType {

    OGRE(5),
    DRAGON(10);

    private final int defenceLevel;

    CreatureType(int defenceLevel) {
        this.defenceLevel = defenceLevel;
    }

    public int getDefenceLevel() {
        return defenceLevel;
    }
}
