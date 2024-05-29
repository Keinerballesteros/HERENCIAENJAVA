
package com.mycompany.football.character;


public class Koopa extends Character{
    private String shellType;

    public Koopa(String name, int height, String power) {
        super(name, height, power);
    }
    
    @Override
    public void attack(){
        super.attack();
        System.out.println("Lanza martillos");    
            }
}
