package com.quiz1.game_1;

public class Archer extends CharacterAbility {

    int str;
    int dex;
    int knowledge;
    public Archer(int str, int dex, int knowledge) {
        this.str = str;
        this.dex = dex;
        this.knowledge = knowledge;
    }

    public void attack() {
        if (getHp() <= 0) {
            System.out.println("사용불가");
        } else {
            System.out.println("활..!");
            super.setExperience(getExperience() + 25);
            super.setHp(getHp() - 10);
        }
    }

    public void skill() {
        if (getMp() <= 0) {
            System.out.println("사용불가");
        } else {
            System.out.println("멀티밋 블라스트!");
            super.setExperience(getExperience() + 50);
            super.setMp(getMp() - 10);
        }
    }

    public void levelUp() {
        System.out.println("레벨 업!");
        System.out.println("str: +5");
        super.setStr(getStr() + 5);
    }
}
