public class Main {
    public static void main(String[] args) {
        Human maxim = new Human("Максим");
        maxim.yearOfBirth = 1988;
        maxim.town = "Минск";
        maxim.jobTitle = "бренд-менеджер";
        maxim.welcome();
        Human anna = new Human("Аня");
        anna.yearOfBirth = 1993;
        anna.town = "Москва";
        anna.jobTitle = "методист образовательных программ";
        anna.welcome();
        Human katya = new Human("Катя");
        katya.yearOfBirth = 1992;
        katya.town = "Калининград";
        katya.jobTitle = "продакт-менеджер";
        katya.welcome();
        Human artem = new Human("Артём");
        artem.yearOfBirth = 1995;
        artem.town = "Москва";
        artem.jobTitle = "директор по развитию бизнеса";
        artem.welcome();

    }
}