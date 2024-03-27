package com.quiz1.game_1;


public class CharacterAbility {

    private int str;
    private int dex;
    private int knowledge;
    private int level = 1;
    private int experience = 0;
    private int hp = 100;
    private int mp = 100;


//    public CharacterAbility(int level, int experience, int hp, int mp) {
//        this.level = level;
//        this.experience = experience;
//        this.hp = hp;
//        this.mp = mp;
//    }



    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
//        System.out.println("경험치: " + experience);
        if (this.experience > 100) {
            this.level++;
            this.experience = 0;
        }
    }

    public int getHp() {
        return hp;

    }

    public void setHp(int hp) {
        System.out.println(hp);
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
//        System.out.println("마력 " + this.mp);
    }

}
