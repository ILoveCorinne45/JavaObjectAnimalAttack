public class Animal {
    private String type;
    private int strength;
    private int health;

    public Animal(){
        this.type = "";
        this.health = 0;
        this.strength = 1;
    }
    public Animal(String type, int strength, int health){
        this.type = type;
        setStrength(strength);
        //this.strength = strength;
        //.health = health;
    }

    public void setStrength(int strength){
        if(strength <= 0){
            this.strength = 1;
        }else{
            this.strength = strength;
        }
    }
    public int getStrength(){
        return strength;
    }
    public void setType(String Type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health < 0){
        }else{
            this.health = health;
        }
    }
    public boolean isDead(){
        return health <= 0;
    }

    @Override
    public String toString(){
        return "Type: " + type + "; Strength " + strength + "; Health " + health;
    }
}
