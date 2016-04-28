package Playable;

/**
 * Created by Arale on 2/5/2016.
 */
public enum Beings {
    AI("A.I", 10, 5, 10, 10, 0, 5),
    AW("Aw", 0, 0, 0, 10, 10, 0),
    HUMAN("Human", 2, 2, 2, 2, 2, 5),
    METAHUMAN("Meta-Human", 3, 3, 3, 2, 0, 0),
    REPTILIAN("Reptilian", 2, 2, 5, 2, 0, 0),
    SCILICCIAN("Siliccian", 0, 5, 2, 2, 2, 5),
    PLANTAE("Plantae", 3, 0, 5, 2, 5, 0);

    private String name;
    private int strengthBonus;
    private int dexterityBonus;
    private int constitutionBonus;
    private int intelligenceBonus;
    private int wisdomBonus;
    private int charismaBonus;

    Beings(String name, int strengthBonus, int dexterityBonus, int constitutionBonus,
           int intelligenceBonus, int wisdomBonus, int charismaBonus){
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
