package characters.spellCasters;

import characters.AnyCharacter;
import equipments.ArmourType;
import equipments.CreatureType;
import equipments.SpellType;
import equipments.WeaponType;

import java.util.ArrayList;

public abstract class SpellCaster extends AnyCharacter {

    private SpellType currentSpell;
    private ArrayList<SpellType> spells;

    private CreatureType currentCreature;
    private ArrayList<CreatureType> creatures;


    public SpellCaster(String name, int healthPoints, int damage, ArmourType armour) {
        super(name, healthPoints, damage, armour);
        this.spells = new ArrayList<>();
        this.creatures = new ArrayList<>();
    }

    public ArrayList<SpellType> getSpells() {
        return spells;
    }

    public void addSpell(SpellType spell) {
        this.spells.add(spell);
    };

    public SpellType getCurrentSpell() {
        return currentSpell;
    }

    public void setCurrentSpell(SpellType currentSpell) {
        this.currentSpell = currentSpell;
    }

    public ArrayList<CreatureType> getCreatures() {
        return creatures;
    }

    public void addCreature(CreatureType creature) {
        this.creatures.add(creature);
    };

    public CreatureType getCurrentCreature() {
        return currentCreature;
    }

    public void setCurrentCreature(CreatureType currentCreature) {
        this.currentCreature = currentCreature;
    }


}
