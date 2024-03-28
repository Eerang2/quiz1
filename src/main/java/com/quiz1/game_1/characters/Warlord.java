package com.quiz1.game_1.characters;

import com.quiz1.game_1.Character;
import com.quiz1.game_1.CharacterAbility;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Warlord extends Character {

    public Warlord(CharacterAbility ability) {

        setAbility(ability);
        setName("Warlord");
    }


    @Override
    public void attack() {
        if (hasHp() == false) {
            System.out.println("사용불가");
        } else {
            System.out.println("둔기..!");
            plusExperience( 25);
            minusHp(10);
        }
    }

    @Override
    public void skill() {
        if (hasMp() == false) {
            System.out.println("사용불가");
        } else {
            System.out.println("리프 어택!");
            plusExperience(50);
            minusMp(10);
        }
    }

    @Override
    public void levelUp() {
        this.getAbility().plusStr(5);
        System.out.println("[ 워로드 ] !!레벨 업이 되어       str + 5");
    }
}
