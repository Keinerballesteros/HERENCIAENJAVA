
package com.mycompany.football.character;


public class Goomba extends Character{
    private String color;
    private boolean wings;

    public Goomba(String name, int height, String power) {
        super(name, height, power);
    }
    
    @Override
    public void walk(){
        System.out.println("Caminando despacio, no tengo piernitas");
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    public void setWings(boolean wings) {
        this.wings = wings;
    }
    
    
    
    
}
