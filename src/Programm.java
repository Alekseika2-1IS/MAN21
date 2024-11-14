import java.util.Scanner;
public class Programm {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        var user_command = "";
        Man someman = null;
        boolean infinity = true;
        while (infinity){
            System.out.println("Введите команду: ");
            user_command = scanner.nextLine();
            switch (user_command){
                case "exit": {
                    infinity = false;
                    break;
                }
                case "help"{
                    System.out.println("Список команд: ");
                    System.out.println("-----------------");
                    System.out.println("Список команд: ");
                    System.out.println("Список команд: ");
                    System.out.println("Список команд: ");
                    System.out.println("Список команд: ");
                    System.out.println("Список команд: ");
                    System.out.println("Список команд: ");
                    System.out.println("Список команд: ");
                    System.out.println("Список команд: ");
                    System.out.println("Список команд: ");
                }
            }
        }
    }
}