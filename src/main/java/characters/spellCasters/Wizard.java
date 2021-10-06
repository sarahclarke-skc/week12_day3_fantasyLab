package characters.spellCasters;

import equipments.ArmourType;
import equipments.CreatureType;
import equipments.SpellType;

public class Wizard extends SpellCaster {

    public Wizard(String name, int healthPoints, int damage, ArmourType armour) {
        super(name, healthPoints, damage, armour);

        super.addSpell(SpellType.LIGHTNING_STRIKE);
        super.addSpell(SpellType.FREEZE);
        super.setCurrentSpell(this.getSpells().get(0));

        super.addCreature(CreatureType.OGRE);
        super.addCreature(CreatureType.DRAGON);
        super.setCurrentCreature(this.getCreatures().get(0));

    }
}
