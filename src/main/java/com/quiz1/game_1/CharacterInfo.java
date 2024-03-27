package com.quiz1.game_1;

public class CharacterInfo {


    public static void main(String[] args) {
        Character character = new Character();

        Warlord warlord = new Warlord(50,10,10);
//        warlord.setStr(50);
//        warlord.setDex(10);
//        warlord.setKnowledge(10);

        Sorceress sorceress = new Sorceress(10,10,50);
        sorceress.setStr(10);
        sorceress.setDex(10);
        sorceress.setKnowledge(50);

        Archer archer = new Archer(10, 50, 10);
        archer.setStr(10);
        archer.setDex(50);
        archer.setKnowledge(10);

        character.walk();
        character.stop();
        System.out.println();
        warlord.warlordAbility(warlord);
        System.out.println();
        warlord.skill();
        System.out.println();
        warlord.warlordAbility(warlord);
        System.out.println();
        warlord.skill();
        warlord.levelUp();
        System.out.println();
        warlord.warlordAbility(warlord);

    }


//    public void warlordAbility(Warlord warlord) {
//        System.out.println("힘: " + warlord.getStr());
//        System.out.println("민첩: " + warlord.getDex());
//        System.out.println("지력: " + warlord.getKnowledge());
//        System.out.println("경험치: " + warlord.getExperience());
//        System.out.println("레벨: " + warlord.getLevel());
//        System.out.println("피: " + warlord.getHp());
//        System.out.println("마력: " + warlord.getMp());
//    }
    public void sorceressAbility(Sorceress sorceress) {
        System.out.println("힘: " + sorceress.str);
        System.out.println("민첩: " + sorceress.dex);
        System.out.println("지력: " + sorceress.knowledge);
        System.out.println("경험치: " + sorceress.getExperience());
        System.out.println("레벨: " + sorceress.getLevel());
        System.out.println("피: " + sorceress.getMp());
        System.out.println("마력: " + sorceress.getMp());

    }
    public void archerAbility() {
        Archer archer = new Archer(10,50,10);
        System.out.println("힘: " + archer.str);
        System.out.println("민첩: " + archer.dex);
        System.out.println("지력: " + archer.knowledge);
        System.out.println("경험치: " + archer.getExperience());
        System.out.println("레벨: " + archer.getLevel());
        System.out.println("피: " + archer.getMp());
        System.out.println("마력: " + archer.getMp());

    }

}
