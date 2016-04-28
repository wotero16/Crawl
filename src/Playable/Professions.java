package Playable;

/**
 * Created by Arale on 2/5/2016.
 */
public enum Professions {
    SOLDIER("Soldier",3,2,3,0,0,0),MEDIC("Medic",0,0,0,3,3,2), ENGINEER("Engineer",0,0,1,5,1,1),PILOT("Pilot", 2,2,0,3,0,0),
    SCAVANGER("Scavanger",2,2,1,0,1,0),TRAVELER("Traveler",0,2,2,0,0,3),THIEF("Thief",0,0,0,5,0,0),ASSASSIN("Assassin",5,1,1,0,0,0),
    MERCENARY("Mercenary",3,2,0,2,0,0);

    private String name;
    private int strengthBonus;
    private int dexterityBonus;
    private int constitutionBonus;
    private int intelligenceBonus;
    private int wisdomBonus;
    private int charismaBonus;

    Professions(String name, int strengthBonus, int dexterityBonus, int constitutionBonus,
                int intelligenceBonus, int wisdomBonus, int charismaBonus){
        this.name = name;
        this.name = name;
        this.strengthBonus = strengthBonus;
        this.dexterityBonus = dexterityBonus;
        this.constitutionBonus = constitutionBonus;
        this.intelligenceBonus = intelligenceBonus;
        this.wisdomBonus = wisdomBonus;
        this.charismaBonus = charismaBonus;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrengthBonus() {
        return strengthBonus;
    }

    public void setStrengthBonus(int strengthBonus) {
        this.strengthBonus = strengthBonus;
    }

    public int getDexterityBonus() {
        return dexterityBonus;
    }

    public void setDexterityBonus(int dexterityBonus) {
        this.dexterityBonus = dexterityBonus;
    }

    public int getConstitutionBonus() {
        return constitutionBonus;
    }

    public void setConstitutionBonus(int constitutionBonus) {
        this.constitutionBonus = constitutionBonus;
    }

    public int getIntelligenceBonus() {
        return intelligenceBonus;
    }

    public void setIntelligenceBonus(int intelligenceBonus) {
        this.intelligenceBonus = intelligenceBonus;
    }

    public int getWisdomBonus() {
        return wisdomBonus;
    }

    public void setWisdomBonus(int wisdomBonus) {
        this.wisdomBonus = wisdomBonus;
    }

    public int getCharismaBonus() {
        return charismaBonus;
    }

    public void setCharismaBonus(int charismaBonus) {
        this.charismaBonus = charismaBonus;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
