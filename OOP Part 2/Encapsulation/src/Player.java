public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int demage) {
        health -= demage;
        if (health < 0) {
            System.out.println("Player knocked out of game");
        }
    }

    public int healthRemaing() {
        return health;
    }

    public void restoreHealth(int extraHealth){
        health=health+extraHealth;
        if(health>100){
            System.out.print("Player restored to 100%");
            health=100;
        }
    }
}