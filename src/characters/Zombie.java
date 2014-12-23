/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters;

/**
 *
 * @author Юлия
 */
public class Zombie extends Characters{
    public  Zombie(){
        name = "Zombie3";
        level = 9;
        skills= 3;
        number= (int) (Math.random()*100 + 10); 
    }

    
     }
