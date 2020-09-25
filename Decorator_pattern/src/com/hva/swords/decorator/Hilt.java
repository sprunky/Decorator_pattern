package com.hva.swords.decorator;

import com.hva.swords.Sword;

public class Hilt extends SwordDecorator {

    public Hilt(Sword sword){
       super(sword);
    }

    @Override
    public String decorate() {
        return super.decorate()+decorateWithHilt();
    }
    private String decorateWithHilt(){
        return "with leather wrapped hilt ";
    }
}
