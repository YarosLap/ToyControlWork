public class Main {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        Toy toy1 = new Toy(1, "Чебурашка", 5, 15);
        Toy toy2 = new Toy(2, "Крокодил Гена", 6, 10);
        Toy toy3 = new Toy(3, "Маша", 10, 30);
        Toy toy4 = new Toy(3, "Медведь", 8, 25);
        Toy toy5 = new Toy(3, "Конструктор", 13, 30);
        Toy toy6 = new Toy(3, "Головоломка", 14, 25);
        Toy toy7 = new Toy(3, "Машинка", 9, 25);
        Toy toy8 = new Toy(3, "Трактор", 8, 25);
        Toy toy9 = new Toy(3, "Железная дорога", 3, 20);
        Toy toy10 = new Toy(3, "Пазл", 7, 25);

        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);
        store.addToy(toy4);
        store.addToy(toy5);
        store.addToy(toy6);
        store.addToy(toy7);
        store.addToy(toy8);
        store.addToy(toy9);
        store.addToy(toy10);

        store.changeToyFrequency(1, 20);

        store.organizeRaffle();

        Toy prizeToy = store.getPrizeToy();
        if (prizeToy != null) {
            System.out.println("Поздравляем! Вы выиграли: " + prizeToy.getName());
        }
    }
}
