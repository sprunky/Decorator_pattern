package com.hva.swords.decorator;

import com.hva.swords.Sword;

public class SharpBlade extends SwordDecorator{


    public SharpBlade(Sword sword) {
        super(sword);
    }

    @Override
    public String decorate() {
        return super.decorate()+decorateWithSharpBlade();
    }
    private String decorateWithSharpBlade(){
        return "with sharpened blade ";
    }

}
