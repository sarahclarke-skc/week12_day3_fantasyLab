package characters.spellCasters;

import equipments.ArmourType;
import equipments.CreatureType;
import equipments.SpellType;

public class Warlock extends SpellCaster {

    public Warlock(String name, int healthPoints, int damage, ArmourType armour) {
        super(name, healthPoints, damage, armour);

        super.addSpell(SpellType.FIREBALL);
        super.addSpell(SpellType.CURSE);
        super.setCurrentSpell(this.getSpells().get(0));

        super.addCreature(CreatureType.OGRE);
        super.addCreature(CreatureType.DRAGON);
        super.setCurrentCreature(this.getCreatures().get(0));

    }
}
