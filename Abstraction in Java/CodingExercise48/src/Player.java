import java.util.LinkedList;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength){
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    @Override
    public LinkedList<String> write() {
        return ISaveable.super.write();
    }
    @Override
    public void read(LinkedList<String> list){
        if (list.size() == 0){
            System.out.println("Add items in list");
        }
    }

    @Override
    public String toString() {
        return String.format("Player{name=%s hitPoints=%d strength=%d weapon=%s}", name, hitPoints, strength, weapon);
    }
}