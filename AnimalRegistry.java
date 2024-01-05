import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalRegistry {
   private List<Animal> animals;

    public AnimalRegistry() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println("Животное добавлено в реестр.");
    }

    public void determineClass(Animal animal) {
        if (animal instanceof Pet) {
            System.out.println("Это домашнее животное.");
        } else if (animal instanceof PackAnimal) {
            System.out.println("Это вьючное животное.");
        } else {
            System.out.println("Не удалось определить класс животного.");
        }
    }

    public void showCommands(Animal animal) {
        animal.makeSound();
    }

    public void teachCommands(Animal animal) {
        if (animal instanceof Pet) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Введите новую команду для животного: ");
                String command = scanner.nextLine();
                ((Pet) animal).makeSound();
                System.out.println("Животное выполнит команду: " + command);
            }
        } else {
            System.out.println("Невозможно обучить вьючное животное командам.");
        }
    }

    public void menu() {
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = 0;

            while (choice != 6) {
                System.out.println("\\nМеню:");
                System.out.println("1. Завести новое животное");
                System.out.println("2. Определить класс животного");
                System.out.println("3. Показать список команд животного");
                System.out.println("4. Обучить животное новым командам");
                System.out.println("5. Показать меню");
                System.out.println("6. Выйти");

                System.out.print("Выберите действие: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        addAnimal(createAnimal());
                        break;
                    case 2:
                        determineClass(selectAnimal());
                        break;
                    case 3:
                        showCommands(selectAnimal());
                        break;
                    case 4:
                        teachCommands(selectAnimal());
            break;
                    case 5:
                        break;
                    case 6:
                        System.out.println("Программа завершена.");
                        break;
                    default:
                        System.out.println("Неверный выбор. Повторите попытку.");
                        break;
                }
            }
        }
    }

    private Animal createAnimal() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите имя животного: ");
            String name = scanner.nextLine();

            System.out.println("Выберите тип животного:");
            System.out.println("1. Собака");
            System.out.println("2. Кошка");
            System.out.println("3. Хомяк");
            System.out.println("4. Лошадь");
            System.out.println("5. Верблюд");
            System.out.println("6. Ослик");

            System.out.print("Выберите тип: ");
            int type = scanner.nextInt();

            switch (type) {
                case 1:
                    return new Dog(name);
                case 2:
                    return new Cat(name);
                case 3:
                    return new Hamster(name);
                case 4:
                    return new Horse(name);
                case 5:
                    return new Camel(name);
                case 6:
                    return new Donkey(name);
                default:
                    System.out.println("Неверный выбор. Животное не добавлено.");
                    return null;
            }
        }
    }

    private Animal selectAnimal() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Выберите животное из списка:");
            for (int i = 0; i < animals.size(); i++) {
                System.out.println((i + 1) + ". " + animals.get(i).name);
            }

            System.out.print("Выберите животное: ");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= animals.size()) {
                return animals.get(choice - 1);
            } else {
                System.out.println("Неверный выбор.");
                return null;
            }
        }
    }

    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();
        registry.menu();
    }
}
