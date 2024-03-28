package com.quiz1.game_1.characters;

import com.quiz1.game_1.Character;
import com.quiz1.game_1.CharacterAbility;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Archer extends Character {
    public Archer(CharacterAbility ability) {
       setAbility(ability);
       setName("Archer");
    }


    @Override
    public void attack() {
        if (hasHp() == false) {
            System.out.println("사용불가");
        } else {
            System.out.println("활..!");
            plusExperience(25);
            minusHp(10);
        }
    }


    @Override
    public void skill() {
        if (hasMp() == false) {
            System.out.println("사용불가");
        } else {
            System.out.println("멀티밋 블라스트!");
            plusExperience(50);
            minusMp(10);
        }
    }


    @Override
    public void levelUp() {
        this.getAbility().plusDex(5);
        System.out.println("[ 아처 ] !!레벨 업이 되어    민첩 + 5");
    }
}
