public class Main {
    public static void main(String[] args) {
        Human maxim = new Human(1988, "Максим", "Минск");
        Human anna = new Human(1993, "Аня", "Москва");
        Human katya = new Human(1992, "Катя", "Калининград");
        Human artem = new Human(1995, "Артём", "Москва");
        maxim.welcome();
        anna.welcome();
        katya.welcome();
        artem.welcome();

    }
}