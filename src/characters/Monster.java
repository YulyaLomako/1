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
public class Monster extends Characters{
    Monster(){
        name = "Monster1";
        level = 3;
        skills= 2;
        number= (int) (Math.random()*100 + 10);
    } 

    
    }
