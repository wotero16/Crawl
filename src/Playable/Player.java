package Playable;

/**
 * Created by Arale on 2/5/2016.
 */
public class Player {

    private String name;
    private Beings being = Beings.HUMAN;
    private Professions profession = Professions.PILOT;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    public Player(){

        this.name = name;
        this.being = being;
        this.profession = profession;
        this.strength = strength + being.getStrengthBonus() + profession.getStrengthBonus();
        this.dexterity = dexterity + being.getDexterityBonus() + profession.getDexterityBonus();
        this.constitution = constitution + being.getConstitutionBonus() + profession.getConstitutionBonus();
        this.intelligence = intelligence + being.getIntelligenceBonus() + profession.getIntelligenceBonus();
        this.wisdom = wisdom + being.getWisdomBonus() + profession.getWisdomBonus();
        this.charisma = charisma + being.getCharismaBonus() + profession.getCharismaBonus();

    }

    public Player(String name, Beings being, Professions profession, int strength, int dexterity, int constitution,
                  int intelligence, int wisdom, int charisma){

        this.name = name;
        this.being = being;
        this.profession = profession;
        this.strength = strength + being.getStrengthBonus() + profession.getStrengthBonus();
        this.dexterity = dexterity + being.getDexterityBonus() + profession.getDexterityBonus();
        this.constitution = constitution + being.getConstitutionBonus() + profession.getConstitutionBonus();
        this.intelligence = intelligence + being.getIntelligenceBonus() + profession.getIntelligenceBonus();
        this.wisdom = wisdom + being.getWisdomBonus() + profession.getWisdomBonus();
        this.charisma = charisma + being.getCharismaBonus() + profession.getCharismaBonus();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Beings getBeing() {
        return being;
    }

    public void setBeing(Beings being) {
        this.being = being;
    }

    public Professions getProfession() {
        return profession;
    }

    public void setProfession(Professions profession) {
        this.profession = profession;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    @Override
    public String toString() {
        return this.getName() +" "+ this.getBeing() +" "+ this.getProfession();
    }


}
