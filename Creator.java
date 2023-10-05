import java.util.Random;

public class Creator {
    public static void main(String[] args) {
        String name = args[0];

        Random rng = new Random();
        int charClassInt = rng.nextInt(3);

        String charClassString = "You are a ";

//        Random strength = new Random();
        int stength = (rng.nextInt(11)) + 2;
//        Random health = new Random();
        int health = (rng.nextInt(11)) + 2;
//        Random magic = new Random();
        int magic = (rng.nextInt(11)) + 2;

        if (charClassInt == 0){
            charClassString += "mighty Warrior";
            stength *= 3;
        } else if (charClassInt == 1){
            charClassString += "powerfull Wizard";
            magic *= 3;
        } else if (charClassInt == 2){
            charClassString += "tastefull Potato";
            health *= 3;
        }


        System.out.println("Hello " + name);
        System.out.println("You rolled a " + charClassInt);
        System.out.println(charClassString);
        System.out.println("Strength: " + stength);
        System.out.println("Magic: " + magic);
        System.out.println("Health: " + health);
    }
}
