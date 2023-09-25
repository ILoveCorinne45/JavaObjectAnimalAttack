import java.util.Random;

public class AnimalArena {
    public static Random rand = new Random();
    public static final int MAXHEALTH = 20;
    public static final int MAXSTRENGTH = 10;
    public static final int MILLIDELAY = 500;


    public static void main(String[] args) {
      Animal BiliApe = creatAnimalWithDefultConstructor("BiliApe");
      Animal Sloth = creatAnimalWithDefultConstructor("Sloth");
        System.out.println(BiliApe);
        System.out.println(Sloth);
        System.out.println("It's " +BiliApe.getType() + " vs. " + Sloth.getType() + "!");
        System.out.println("FIGHT!");
        fight(BiliApe, Sloth);

    }
    public static Animal creatAnimalWithDefultConstructor(String type){
        Animal a = new Animal(); // THIS IS USING THE DEFAULT CONSTRUCTOR!
        int startingHealth = (rand.nextInt(MAXHEALTH/2) + 1 ) + 10;
        int startingStrength = rand.nextInt(MAXSTRENGTH) + 1;
        a.setType(type); // using setters
        a.setStrength(startingHealth);
        a.setHealth(startingHealth);
        return a;
    }
    public static void fight(Animal a1, Animal a2){
        while(!a1.isDead() && !a2.isDead()){
            animalAttack(a1,a2);
            if (a2.isDead()) {
                System.out.println(a2.getType() + " is dead. " +a1.getType() + " won!");
            }else{
                animalAttack(a2,a1);
                if (a1.isDead()) {
                    System.out.println(a1.getType() + " is dead. " +a2.getType() + " won!");
                }
            }
        }
    }
        public static void animalAttack(Animal attacker, Animal defender){
        int attack = rand.nextInt(attacker.getStrength());
            System.out.println(attacker.getType() + "attacks " + defender.getType() +
                    " delivering " + attack + " damange! ");
            pause(MILLIDELAY);
            defender.setHealth(defender.getHealth() - attack);
            System.out.println(defender.getType() + " has "+defender.getHealth() + "remaining");
            pause(MILLIDELAY);
        }

    public static Animal creatAnimalWithParameterizedConstructor(String type){
        int startingHealth = (rand.nextInt(MAXHEALTH/2) + 1 ) + 10;
        int startingStrength = rand.nextInt(MAXSTRENGTH) + 1;
        return new Animal(type, startingStrength, startingHealth); // THIS USES PARAMETERIZED CONSTRUCTOR
    }
    public static void pause(int millisecond){
        try {
            Thread.sleep(millisecond);
        } catch (InerruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
//Animal BiliApe = new Animal("BilieApe", 859, 740);
//BiliApe.setType("BiliApe");
// BiliApe.setHealth(740);
//BiliApe.setStrength(859);
//System.out.println(BiliApe);


//Animal Liam = new Animal("Liam", -5, -99);
//Liam.setType("Liam");
//Liam.setStrength(-4);
//Liam.setHealth(12);
//System.out.println(Liam);
