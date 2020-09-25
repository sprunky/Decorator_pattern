package com.hva.swords.decorator;

import com.hva.swords.Sword;
import com.hva.swords.SwordImpl;

public abstract class SwordDecorator implements Sword {
   Sword sword;
   SwordDecorator(Sword sword){
       this.sword = sword;
   }
    @Override
    public String decorate() {
        return sword.decorate();
    }
}
