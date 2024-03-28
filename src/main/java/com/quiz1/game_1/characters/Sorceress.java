package com.quiz1.game_1.characters;

import com.quiz1.game_1.Character;
import com.quiz1.game_1.CharacterAbility;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sorceress extends Character {

    public Sorceress(CharacterAbility ability) {
        setAbility(ability);
        setName("Sorceress");
    }

    @Override
    public void levelUp() {
        this.getAbility().plusKnowledge(5);
        System.out.println("[ 소서러스 ] !!레벨업이 되어     지력 +5");
    }

    @Override
    public void attack() {
        if (hasHp() == false) {
            System.out.println("HP가 부족하여 공격을 할 수 없습니다.");
        } else {
            System.out.println("지팡이..!");
            plusExperience(25);
            minusHp(10);
        }
    }

    @Override
    public void skill() {
        if (this.hasMp() == false) {
            System.out.println("MP가 부족하여 스킬을 사용할 수 없습니다.");
        } else {
            System.out.println("아이스 에로우!");
            this.plusExperience(50);
            this.minusHp(10);
        }
    }
}
