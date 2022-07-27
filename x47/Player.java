package x47;
import java.util.List;
import java.util.ArrayList;

public class Player implements ISaveable{
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;
    public Player(String name, String weapon, int hitPoints, int strength){
        this.name = name;
        this.weapon = weapon;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }
    public List<String> write(){
        List<String> list = (List) new ArrayList<String>();
        list.add(name);
        list.add(weapon);
        return list;
    }
    public void read(List<String> list){
        if(!list.isEmpty()){
            name = list.get(0);
        }
    }
    public String toString(){
        return "Player{name='"+name+"', hitPoints="+hitPoints+", strength="+strength+", weapon='"+weapon+"'}";
    }
    public String getName(){
        return name;
    }
    public String getWeapon(){
        return weapon;
    }
    public int getHitPoints(){
        return hitPoints;
    }
    public int getStrength(){
        return strength;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setWeapon(String weapon){
        this.weapon = weapon;
    }
    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }
    public void setStrength(int strength){
        this.strength = strength;
    }
}

