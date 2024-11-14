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
                    }
                    System.out.println("Введите имя создаваемого человека: ");
                    user_command = scanner.nextLine();
                    someman = new Man(user_command);
                    System.out.println("Человек успешно создан");
                    break;
                }
                case "kill_man": {
                    if (someman != null){
                        someman.kill();
                        System.out.println("Человек умер");
                    } else {
                        System.out.println("Человек не создан. Команда была не выполнена!");
                    }
                    break;
                }
                case "talk": {
                    if (someman != null && someman.isAlive() == true) {
                    }
                    break;
                }
                case "talk": {
                    if (someman != null && someman.isAlive() == true){
                        someman.Talk();
                    } else {
                        System.out.println("Человек не создан. Команда не была выполнена");
                    }
                    break;
                }
                case "go": {
                    if (someman != null && someman.isAlive() == true){
                        someman.Go();
                    } else {
                        System.out.println("Человек не создан. Команда не выполнена");
                    }
                    break;
                }
                case "is_alive": {
                    if(someman != null){
                        if(someman.isAlive() == true){
                            System.out.println("Человек жив");
                        } else {
                            System.out.println("Человек мертв");
                        }
                    } else {
                        System.out.println("Челове не создан. Команда не выполнена");
                    }
                    break;
                }
                default: {
                    System.out.println("Ваша команда не опеределена пожалуйста повторите еще раз");
                    System.out.println("Для вывода списка команд введите команду help");
                    System.out.println("Для завершения пграммы введите команду exit");
                    break;
                }
            }
        }
    }
}