import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

// Создаём класс магазина игрушек и его поля (список игрушек, их цены и путь к файлу с призами)
public class ToyStore {
    private ArrayList<Toy> toys;
    private ArrayList<Toy> prizeToys;
    private String prizeFilePath;

    // Создаём переменные для образованных выше полей
    public ToyStore() {
        toys = new ArrayList<Toy>();
        prizeToys = new ArrayList<Toy>();
        prizeFilePath = "prize_toys.txt";
    }

    // Создаём метод добавления игрушки
    public void addToy(Toy toy) {
        toys.add(toy);
    }

    // Создаём метод частоты выпадания игрушки
    public void changeToyFrequency(int toyId, double newFrequency) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setFrequency(newFrequency);
            }
        }
    }

    // Организуем лотерею и рандомное выпадение игрушки
    public void organizeRaffle() {
        prizeToys.clear();

        for (Toy toy : toys) {
            double random = Math.random() * 100;
            if (random < toy.getFrequency()) {
                prizeToys.add(toy);
            }
        }
    }

    // Создаём метод призовой игрушки и записываем ее в текстовый файл
    public Toy getPrizeToy() {
        if (!prizeToys.isEmpty()) {
            Toy prizeToy = prizeToys.remove(0);
            prizeToy.setQuantity(prizeToy.getQuantity() - 1);

            try {
                FileWriter writer = new FileWriter(prizeFilePath, true);
                writer.write(prizeToy.getName() + "\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Запись не удалась");
            }

            return prizeToy;
        } else {
            System.out.println("Кина не будет ) Игрушки кончились");
            return null;
        }
    }
}
