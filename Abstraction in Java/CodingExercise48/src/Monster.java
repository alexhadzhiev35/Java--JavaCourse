import java.util.LinkedList;

public class Monster implements ISaveable {

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }
    @Override
    public LinkedList<String> write() {
        return ISaveable.super.write();
    }
    @Override
    public void read(LinkedList<String> list) {
        if (list.size() == 0){
            System.out.println("Add items in list");
        }
    }

    @Override
    public String toString() {
        return String.format("Player{name=%s hitPoints=%d strength=%d}", name, hitPoints, strength);
    }
}