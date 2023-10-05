import java.util.Random;

public class Creator {
    public static void main(String[] args) {
        String name = args[0];

        Random CharClass = new Random();
        int CharClassInt = CharClass.nextInt(3);

        String CharClassString = "You are a ";

        Random strength = new Random();
        int strengthValue = (strength.nextInt(11)) + 2;
        Random health = new Random();
        int healthValue = (health.nextInt(11)) + 2;
        Random magic = new Random();
        int magicValue = (magic.nextInt(11)) + 2;

        if (CharClassInt == 0){
            CharClassString += "mighty Warrior";
            strengthValue *= 3;
        } else if (CharClassInt == 1){
            CharClassString += "powerfull Wizard";
            magicValue *= 3;
        } else if (CharClassInt == 2){
            CharClassString += "tastefull Potato";
            healthValue *= 3;
        }


        System.out.println("Hello " + name);
        System.out.println("You rolled a " + CharClassInt);
        System.out.println(CharClassString);
        System.out.println("Strength: " + strengthValue);
        System.out.println("Magic: " + magicValue);
        System.out.println("Health: " + healthValue);
    }
}
