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
public class Soldier extends Characters{
    public  Soldier(){
        name = "Soldier2";
        level = 1;
        skills= 4;
        number= (int) (Math.random()*100 + 10);
    } 
    }