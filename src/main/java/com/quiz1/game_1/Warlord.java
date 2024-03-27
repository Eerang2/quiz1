package com.quiz1.game_1;

public class Warlord extends CharacterAbility {


    int str;
    int dex;
    int knowledge;

    public Warlord(int str, int dex, int knowledge) {
        this.str = str;
        this.dex = dex;
        this.knowledge = knowledge;
    }

//    @Override
//    public void setStr(int str) {
//        this.str = str;
//    }
//
//    @Override
//    public void setDex(int dex) {
//        this.dex = dex;
//    }
//
//    @Override
//    public void setKnowledge(int knowledge) {
//        this.knowledge = knowledge;
//    }
//        public Warlord() {
//        this.str = 50;
//        this.dex = 10;
//        this.knowledge = 10;
//    }

    public void attack() {
        if (getHp() <= 0) {
            System.out.println("사용불가");
        } else {
            System.out.println("둔기..!");
            super.setExperience(getExperience() + 25);
            super.setHp(getHp() - 10);
        }
    }

    public void skill() {
        if (getMp() <= 0) {
            System.out.println("사용불가");
        } else {
            System.out.println("리프 어택!");
            super.setExperience(getExperience()+50);
            super.setMp(getMp() - 10);
        }
    }

    public void levelUp() {
        if (getExperience() >= 100) {
            System.out.println("레벨 업!");
            System.out.println("str: +5");
            super.setStr(getStr() + 5);
        }
    }

    public void warlordAbility(Warlord warlord) {
        System.out.println("힘: " + warlord.getStr());
        System.out.println("민첩: " + warlord.getDex());
        System.out.println("지력: " + warlord.getKnowledge());
        System.out.println("경험치: " + warlord.getExperience());
        System.out.println("레벨: " + warlord.getLevel());
        System.out.println("피: " + warlord.getHp());
        System.out.println("마력: " + warlord.getMp());
    }
}
