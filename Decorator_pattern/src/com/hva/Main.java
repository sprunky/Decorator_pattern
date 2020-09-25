package com.hva;

import com.hva.swords.Sword;
import com.hva.swords.SwordImpl;
import com.hva.swords.decorator.Engraved;
import com.hva.swords.decorator.Hilt;
import com.hva.swords.decorator.SharpBlade;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to create a new sword? y/n");
        Sword sword = new SwordImpl();

        if (scanner.next().toUpperCase().equals("Y")){
            System.out.println("would you like to add a leather wrapped hilt? y/n");
            if (scanner.next().toUpperCase().equals("Y")){
                sword = new Hilt(sword);
            }
            System.out.println("would you like to sharpen the blade? y/n");
            if (scanner.next().toUpperCase().equals("Y")){
                sword = new SharpBlade(sword);
            }
            System.out.println("Would you like to engrave the sword? y/n");
            if (scanner.next().toUpperCase().equals("Y")){
                    sword = new Engraved(sword);
                }
            }
            System.out.println("Your blade has beem assembled");

            System.out.println(sword.decorate());


            }






        }




