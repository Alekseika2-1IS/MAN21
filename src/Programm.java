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
                case "help": {
                    System.out.println("Список команд: ");
                    System.out.println("-----------------");
                    System.out.println();
                    System.out.println("creat_man: команда создает человека, (экземпляр класса Man)");
                    System.out.println("kill_man: команда убивает человека");
                    System.out.println("talk: команда заставляет человека говорить (если создан экземпляр класса)");
                    System.out.println("go: команда заставляет человека идти (если создан экземпляр класса)");
                    System.out.println("isalive: команда проверяет, жив ли человек (если создан экземпляр класса)");
                    System.out.println();
                    System.out.println("----------------");
                    System.out.println("----------------");
                    break;
                }
                case "create_man": {
                    if (someman != null ){
                        someman.kill();
                        System.out.println("Человек");
                    }
                }
            }
        }
    }
}