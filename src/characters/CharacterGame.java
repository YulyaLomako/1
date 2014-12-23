
package characters;


public class CharacterGame {
    public Characters orderCharacters (String type){
        Characters c;        
        c = createCharacters(type);        
        c.information();                 
        return c;
    }
    protected Characters createCharacters (String type){
        if (type.equals("Zombie1")) { 
            return new Zombie();
        } else if (type.equals("Soldier2")) {
           return new Soldier();
           }
        else if (type.equals("Monster3")) {
           return new Monster();
        }
        else return null;
}
    
    
}
