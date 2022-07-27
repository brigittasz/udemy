package x47;
import java.util.List;
import java.util.LinkedList;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;
    public Monster(String name, int hitPoints, int strength){
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }
    public List<String> write(){
        List<String> list = (List) new LinkedList<String>();
        list.add(name);
        return list;
    }
    public void read(List<String> list){
        if(!list.isEmpty()){
            name = list.get(0);
        }
    }
    public String getName(){
        return name;
    }
    public int hitPoints(){
        return hitPoints;
    }
    public int getStrength(){
        return strength;
    }
}
