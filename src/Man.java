import java.util.Random;
import java.util.Scanner;

public class Man {
    private final Random rnd = new Random();
    public Man (String _name){
        Name = _name;
        isLife = true;
        Age = rnd.nextInt(15, 51);
        Health = rnd.nextInt(10, 101);
    }
    private final String Name;
    private final int Age;
    private final int Health;
    private boolean isLife;
    public void Talk(){
        int random_talk = rnd.nextInt(1, 4);
        String tmp_str = "";
        switch (random_talk){
            case 1: {
                tmp_str = "Привет, меня зовут " + Name + " ,рад познакомится!";
                break;
            }
            case 2: {
                tmp_str = "Мне " + Age;
                break;
            }
            case 3: {
                String Age_if = Integer.toString(Age + 10);
                if (Health > 50)
                    tmp_str = "Да, я здоров";
                else
                    tmp_str = "Со здоровьем у меня хреново до жить бы " + Age_if;
                break;
            }
        }
        System.out.println(tmp_str);
    }
    public void Go () {
        if (isLife) {
            if (Health > 40){
                String outString = Name + " миро гуляет по городу";
                System.out.println(outString);
            } else {
                String outString2 = Name + " болен и не может гулять";
                System.out.println(outString2);
            }
        } else {
             String outString3 = Name + " не может идти, помер";
             System.out.println(outString3);
        }
    }
    public boolean isAlive(){
        return isLife;
    }
    public void kill(){
        isLife = false;
    }
}