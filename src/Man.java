import java.util.Random;
import java.util.Scanner;

public class Man {
    private final Random rnd = new Random();
    //конструктор класса(данная функция вызывается при создании нового экземпляра класс
    public Man (String _name){
        Name = _name; //получаю имя человека из входного параметра конструктора класс
        isLife = true;
        Age = rnd.nextInt(15, 51);//генератор возраста от 15 до 50
        Health = rnd.nextInt(10, 101);//генератор здоровья от 10% до 100%
    }
    //закрытые члены которые нельзя изменить извне класса
    private final String Name; //строка содержащая имя
    private final int Age; //строка содержащая беззнаковое целое число возраста
    private final int Health; //строка содержащая беззнаковое целое число здоровья
    private boolean isLife; //строка содержащая булевоек означающее жив ли человек
    //заготовка функции говорить
    public void Talk(){
        //генераторная переменная разных фраз
        int random_talk = rnd.nextInt(1, 4);
        //строка в кторую буду хранить строку
        String tmp_str = "";
        switch (random_talk){
            case 1: {
                tmp_str = "Привет, меня зовут " + Name + " ,рад(а) познакомится!"; //если 1 называет имя
                break;
            }
            case 2: {
                tmp_str = "Мне " + Age + " лет"; //если 2 называем свой возраст
                break;
            }
            case 3: {
                String Age_if = Integer.toString(Age + 10); //если 3 то говорим о здоровье
                if (Health > 50)
                    tmp_str = "Да, я здоров";
                else
                    tmp_str = "Со здоровьем у меня хреново, хоть бы дожить до " + Age_if;
                break;
            }
        }
        System.out.println(tmp_str);
    }
    public void Go() {
        //если жив человек
        if (isLife) {
            if (Health > 40){ //если показатель здоровья больше 40 считается что человек здоров
                String outString = Name + " миро гуляет по городу";
                System.out.println(outString);
            } else {
                String outString2 = Name + " болен(а) и не может гулять по городу";
                System.out.println(outString2);
            }
        } else {
             String outString3 = Name + " не может идти, помер";
             System.out.println(outString3);
        }
    }
    //функция возвращающая показатель жив ли человек
    public boolean isAlive(){
        return isLife;//возвращаем значние к которому мы не можем обратится напрямую из вне класса так как он имеет статус private
    }
    public void kill(){
        //устанавливаем значение isLife()(жив) в false
        isLife = false;
    }
}