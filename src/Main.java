public class Main {


    public static void main(String[] args) {

        System.out.println("Задание 1");


        Human human = new Human(" Максим ", 36, " Минск ", 2022, " бренд-менеджер");
        Human human1 = new Human(" Аня", 29, " Москва", 2022, " методистом образовательных программ");
        Human human2 = new Human(" Катя", 28, " Калининград", 2022, " продакт-менеджер ");
        Human human3 = new Human(" Артем", 27, " Москва", 2022, " директором по развитию бизнеса ");
        human.printAllHuman();
        human1.printAllHuman();
        human2.printAllHuman();
        human3.printAllHuman();


    }
}