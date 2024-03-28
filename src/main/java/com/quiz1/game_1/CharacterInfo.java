package com.quiz1.game_1;

import com.quiz1.game_1.characters.Archer;
import com.quiz1.game_1.characters.Sorceress;
import com.quiz1.game_1.characters.Warlord;

public class CharacterInfo {

    public static void main(String[] args) {

        // 워로드 생성
        CharacterAbility warlordAbility = new CharacterAbility(50, 10, 10);
        Warlord warlord = new Warlord(warlordAbility);

        // 소서러스 생성
        CharacterAbility sorceressAbility = new CharacterAbility(10, 10, 50);
        Sorceress sorceress = new Sorceress(sorceressAbility);

        // 아처 생성
        CharacterAbility archerAbility = new CharacterAbility(10, 50, 10);
        Archer archer = new Archer(archerAbility);

        printCharacter(sorceress);
        sorceress.skill();
        printCharacter(sorceress);
        sorceress.skill();
        printCharacter(sorceress);
        printCharacter(warlord);
        warlord.skill();
        warlord.skill();
        printCharacter(archer);
        archer.skill();
        archer.skill();
        printCharacter(warlord);
        printCharacter(archer);
        warlord.attack();
        warlord.attack();
        warlord.attack();
        warlord.attack();
        warlord.attack();
        warlord.attack();
        warlord.attack();
        warlord.attack();
        warlord.attack();
        warlord.attack();
        warlord.attack();
        warlord.attack();
        warlord.attack();
        warlord.attack();
        warlord.attack();
        printCharacter(warlord);




        //printCharacter(archer);
    }

    public static void printCharacter(Character character) {
        System.out.println("====["+character.getName()+"]=====");

        System.out.println("힘: " + character.getAbility().getStr());
        System.out.println("민첩: " + character.getAbility().getDex());
        System.out.println("지력: " + character.getAbility().getKnowledge());
        System.out.println("경험치: " + character.getExperience());
        System.out.println("레벨: " + character.getLevel());
        System.out.println("피: " + character.getHp());
        System.out.println("마력: " + character.getMp());
        System.out.println("=======================");
    }
}
