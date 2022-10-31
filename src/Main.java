public class Main {
    public static void main(String[] args) {
        Human maxim = new Human(1988, "Максим", "Минск", "бренд-менеджер");
        maxim.welcome();
        Human anna = new Human(1993, "Аня", "Москва", "методист образовательных программ");
        anna.welcome();
        Human katya = new Human(1992, "Катя", "Калининград", "продакт-менеджер");
        katya.welcome();
        Human artem = new Human(1995, "Артём", "Москва", "директор по развитию бизнеса");
        artem.welcome();
        Human ghost = new Human(-1, null, "", "");
        ghost.welcome();
    }
}