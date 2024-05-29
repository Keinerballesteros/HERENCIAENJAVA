

package com.mycompany.football;

import com.mycompany.football.character.Goomba;
import com.mycompany.football.character.Koopa;
import com.mycompany.football.character.Peach;


public class Football {

    public static void main(String[] args) {
       
       Peach peach = new Peach("PRINCESA",140,"congelar");
        
       peach.longJump();
       
       Goomba goomba = new Goomba("rojo",100, "ninguno");
       
       goomba.walk();
       
       Koopa koopa = new Koopa("Koppa", 120, "lanza fuego");
       
       koopa.attack();

       
    }
}
