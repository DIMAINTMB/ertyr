public class Main {
    public static void main(String[] args) {
// Цена билета
        int costTicket = 20000;
// каждые 20 рублей равняются одной мили
        int rublesPerMiles = 20;
// расчет количества бонусных милей
        int bonus = (costTicket / rublesPerMiles);
        System.out.println("Бонусные мили: " + bonus);


    }
}