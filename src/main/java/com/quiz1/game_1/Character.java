package com.quiz1.game_1;

abstract public class Character {

    private CharacterAbility ability;

    private int level = 1;
    private int experience = 0;
    private int hp = 100;
    private int mp = 100;

    public boolean hasHp() {
        return this.hp > 0;
    }

    public boolean hasMp() {
        return this.mp > 0;
    }

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }

    public void plusExperience(int add) {
        this.experience += add;
        if (this.experience >= 100) {
            this.level++;
            this.levelUp();
            this.experience = 0;
        }
    }

    abstract public void levelUp() ;

    public int getHp() {
        return hp;

    }

    public void minusHp(int minus) {
        this.hp -= minus;
    }

    public int getMp() {
        return mp;
    }
    public void minusMp(int minus) {
        this.mp -= minus;
    }



    public void setAbility(CharacterAbility ability) {
        this.ability = ability;
    }

    public CharacterAbility getAbility() {
        return ability;
    }
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println("케릭터가 한걸음 걷습니다.");
    }

    public void stop() {
        System.out.println("케릭터가 멈춥니다.");
    }

    abstract public void attack();

    abstract public void skill();

}


