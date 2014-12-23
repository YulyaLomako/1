package characters;

/**
 *
 * @author Юлия
 */
/*
7.	Программа создает сюжетных персонажей, с которыми сражается герой,
    в зависимости от уровня сложности. Три уровня сложности: легкий, средний,
    сложный. Виды персонажей: монстры, зомби, солдаты. В зависимости от уровня
    сложности персонажи имеют разные сопротивляемость, навыки и т.д. В проекте
    присутствует класс, который генерирует, какое число персонажей каждого
    вида будет создано. 
*/
abstract class Characters {

   String name;
   int level;
   int skills;
   int number;
   
    public String getName(){
        return name;
    }
    
     public int getLevel()
    {
    return level;
    }
     
    public int getSkills()
    {
        return skills;
    }
    
    public void information() {
        System.out.println("name " + name);
        System.out.println("level" + level);
        System.out.println("skills" + skills);
    }   
       
    
    class Monster extends Characters{
    public  Monster(){
        name = "Monster1";
        level = 3;
        skills= 2;
        number= (int) (Math.random()*100 + 10);
    } 
    }
    
   
   
     class Zombie extends Characters{
    public  Zombie(){
        name = "Zombie3";
        level = 9;
        skills= 3;
        number= (int) (Math.random()*100 + 10); 
    }
     }
    public class Random {
    public  int getRandomNumber(int a, int b){
        return (int) (Math.random()*(b-a) + a);
    }
     }
    

     }   

   