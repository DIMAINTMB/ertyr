public class Main {
    public static void main(String[] args) {
// цена билета
        int costTicket = 20000;
// каждые 20 рублей равняются одной мили
        int rublesPerMiles = 20;
// расчет количества бонусных милей
        int bonus = (costTicket / rublesPerMiles);
// выводим расчет на экран
        System.out.println("Бонусные мили: " + bonus);
    }
}