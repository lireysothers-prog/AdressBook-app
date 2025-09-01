
public class AddressBook {
    private Contact[] contacts = new Contact[10];
    private int contactCount = 0;
    private static int nextId = 1;

    public void addOrUpdate(String fullName, String post, String birthdate, String number, String email) {
        boolean found = false;
        for (int i = 0; i < contactCount; i++) {
            if (contacts[i].getFullName().equals(fullName)) {
                contacts[i].setPost(post);
                contacts[i].setBirthdate(birthdate);
                contacts[i].setNumber(number);
                contacts[i].setEmail(email);
                System.out.println("Пользователь " + fullName + " уже присутствует в списке контактов,он будет обновлён");
                found = true;
                break;
            }
        }
        if (!found) {
            contacts[contactCount] = new Contact(nextId++, fullName, post, birthdate, number, email);
            contactCount++;
            System.out.println("Контакт успешно добавлен.");
        }
    }

    public void deleteContact(int idToDelete) {
        boolean deleted = false;
        for (int i = 0; i < contactCount; i++) {
            if (contacts[i].getId() == idToDelete) {
                for (int j = i; j < contactCount - 1; j++) {
                    contacts[j] = contacts[j + 1];
                }
                contacts[--contactCount] = null;
                deleted = true;
                break;
            }
        }
        if (deleted) {
            System.out.println("Контак с ID " + idToDelete + " успешно удалён.");
        } else {
            System.out.println("Ошибка!Контакт с ID " + idToDelete + " не найден.");
        }
    }

    public void listAllContacts() {
        if (contactCount == 0) {
            System.out.println("Список контактов пуст.");
            return;
        }
        for (int i = 0; i < contactCount; i++) {
            if (contacts[i] != null) {
                System.out.println("ID: " + contacts[i].getId() + ", ФИО: " + contacts[i].getFullName() + ", Должность: " + contacts[i].getPost() + ", Дата Рождения: " + contacts[i].getBirthdate() + ", Телефон: " + contacts[i].getNumber() + ", E-mail: " + contacts[i].getEmail());
            }

        }
    }
}






