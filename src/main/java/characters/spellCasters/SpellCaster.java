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

    public boolean checkSpellInList(SpellType spell) {
        return spells.contains(spell);
    }

    public boolean checkCreatureInList(CreatureType creature) {
        return creatures.contains(creature);
    }

    public void changeSpell(SpellType spell) {
        if (this.checkSpellInList(spell)) {
            this.setCurrentSpell(spell);
        }
    }

    public void changeCreature(CreatureType creature) {
        if (this.checkCreatureInList(creature)) {
            this.setCurrentCreature(creature);
        }
    }
}
