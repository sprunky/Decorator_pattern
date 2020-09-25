package com.hva.swords.decorator;

import com.hva.swords.Sword;

public class Engraved extends SwordDecorator{


    public Engraved(Sword sword) {
        super(sword);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithEngraved();
    }

    private String decorateWithEngraved(){
        return "With engraved rune of legendary nature";
    }

}
