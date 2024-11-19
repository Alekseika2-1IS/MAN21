import java.util.Scanner;
public class Programm {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        var user_command = ""; //переменная которая будет хранить команду пользователя
        Man someman = null;
        //создаю бесконечный цикл
        boolean infinity = true;
        while (infinity){
            System.out.println("Введите команду: "); //вывод окна для написания команды
            user_command = scanner.nextLine(); //получение команды от пользователя
            //тут обработка команды которую ввел пользователь
            switch (user_command){
                //цикл завершается и прогга завершает свою работу
                case "exit": {
                    infinity = false;
                    break;
                }
                //выводится help если пользователь ее ввел в окно для написания команды
                case "help": {
                    System.out.println("Список доступных команд: ");
                    System.out.println("-----------------");
                    System.out.println();
                    System.out.println("create_man: команда создает человека, (экземпляр класса Man)");
                    System.out.println("kill_man: команда убивает человека");
                    System.out.println("talk: команда заставляет человека говорить (если создан экземпляр класса)");
                    System.out.println("go: команда заставляет человека идти (если создан экземпляр класса)");
                    System.out.println("is_alive: команда проверяет, жив ли человек (если создан экземпляр класса)");
                    System.out.println();
                    System.out.println("----------------");
                    System.out.println("----------------");
                    break;
                }
                //проверка создан ли человек
                case "create_man": {
                    if (someman != null ){
                        someman.kill();
                    }
                    //просьба ввести имя для персонажа
                    System.out.println("Введите имя создаваемого человека: ");
                    user_command = scanner.nextLine();
                    someman = new Man(user_command);//создаю объект в памяти и в качестве параметра и передаю имя человека
                    System.out.println("Человек успешно создан!");
                    break;
                }
                //команда которая убивает человека
                case "kill_man": {
                    if (someman != null){ //проверка что человек уже существует
                        someman.kill();
                        System.out.println("Человек был убит админом");
                    } else {
                        System.out.println("Человек не создан. Команда была не выполнена!");
                    }
                    break;
                }
                //команда которая вызывает функцию разговора
                case "talk": {
                    //проверка что человек уже существует
                    if (someman != null && someman.isAlive() == true){
                        someman.Talk();
                    } else {
                        System.out.println("Человек не создан. Команда не была выполнена");
                    }
                    break;
                }
                //команда которая вызывает функцию гульбы по городу
                case "go": {
                    //проверка что человек уже существует
                    if (someman != null && someman.isAlive() == true){
                        someman.Go();
                    } else {
                        System.out.println("Человек не создан. Команда не выполнена");
                    }
                    break;
                }
                //команда которая проверяет жив ли человек
                case "is_alive": {
                    //проверка что человек уже существует
                    if(someman != null){
                        if(someman.isAlive() == true){
                            System.out.println("Человек жив");
                        } else {
                            System.out.println("Человек мертв или убит");
                        }
                    } else {
                        System.out.println("Человек не создан. Команда не выполнена");
                    }
                    break;
                }
                //другие варианты ответа если прошлые команды были введены неправильно
                default: {
                    System.out.println("Ваша команда не понятна, пожалуйста, повторите еще раз");
                    System.out.println("Для вывода списка всех команд введите команду help");
                    System.out.println("Для завершения программы введите команду exit");
                    break;
                }
            }
        }
    }
}