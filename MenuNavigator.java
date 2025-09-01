import java.util.Scanner;

public class MenuNavigator {

    public void start() {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;


        while (isRunning) {
            System.out.println("--- МЕНЮ ---");
            System.out.println("1. Добавить новый контакт.");
            System.out.println("2. Удалить существующий контакт.");
            System.out.println("3. Вывести список контактов.");
            System.out.println("4. Выйти.");
            System.out.println("Введите нужную опцию и нажмите Enter [1..4]");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Добавление нового контакта");
                    System.out.print("Введите ФИО: ");
                    String fullName = scanner.nextLine();
                    System.out.print("Введите должность: ");
                    String post = scanner.nextLine();
                    System.out.print("Введите дату рождения (ДД.ММ.ГГГГ): ");
                    String birthdate = scanner.nextLine();
                    System.out.print("Введите номер телефона: ");
                    String number = scanner.nextLine();
                    System.out.print("Введите адрес электронной почты: ");
                    String email = scanner.nextLine();

                    addressBook.addOrUpdate(fullName, post, birthdate, number, email);
                    break;

                case "2":
                    System.out.println("Удаление существующего контакта");
                    System.out.println("Введите ID контакта: ");
                    int idToDelete = scanner.nextInt();
                    scanner.nextLine();
                    addressBook.deleteContact(idToDelete);
                    break;

                case "3":
                    System.out.println("Список всех контактов: ");
                    addressBook.listAllContacts();
                    break;

                case "4":
                    isRunning = false;
                    System.out.println("Работа программы завершена, ждём вас снова!");
                    break;

                default:
                    System.out.println("Выбрана неверная опция! Попробуйте заново.");
                    break;

            }
        }
    }
}




