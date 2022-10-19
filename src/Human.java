public class Human {

    int numberOfYears;   // кол лет
    String name;
    String cityOfResident;
    int currentYear;
    String post;


    void printAllHuman() {
        currentYear = 2022;
        System.out.println(" Привет! Меня зовут" + name + ". Я из города" + cityOfResident + ". Я родился в " + (currentYear - numberOfYears) + " году.  Я работаю на должности " + post + ". Будем знакомы!");

    }

    public Human(String name, int numberOfYears, String cityOfResident, int currentYear, String post) {

        if (numberOfYears > 0) {
            this.numberOfYears = numberOfYears;
        } else {
            this.numberOfYears = 0;
        }
        if (name == null) {
            this.name = " Информация не указана";
        } else {
            this.name = name;
        }

        if (cityOfResident == null) {
            this.cityOfResident = " Информация не указана";
        } else {
            this.cityOfResident = cityOfResident;
        }

        this.currentYear = currentYear;

        if (post == null) {
            this.post = " Информация не указана";
        } else {
            this.post = post;
        }


    }
}

