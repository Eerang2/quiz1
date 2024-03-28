package com.quiz1.game_1;


//@Getter
public class CharacterAbility {

    private int str;
    private int dex;

    private int knowledge;

    public CharacterAbility(int str, int dex, int knowledge) {
        this.str = str;
        this.dex = dex;
        this.knowledge = knowledge;
    }


    public int getStr() {
        return str;
    }

    public void plusStr(int add) {
        this.str += add;
    }

    public int getDex() {
        return dex;
    }

    public void plusDex(int add) {
        this.dex += add;
    }

    public int getKnowledge() {
        return knowledge;
    }

    public void plusKnowledge(int add) {
        this.knowledge += add;
    }
}
