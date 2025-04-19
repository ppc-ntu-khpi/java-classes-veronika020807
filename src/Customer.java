public class Customer {
    // Приватні атрибути
    private int ID;
    private boolean isNew;
    private double total;

    // Конструктор за замовчуванням
    public Customer() {
        this.ID = 1;
        this.isNew = true;
        this.total = 1000.0;
    }

    // Метод для виводу інформації про клієнта
    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + ID);
        System.out.println("Is new customer: " + isNew);
        System.out.println("Total purchases are: " + total);
    }

    // Геттери
    public int getID() {
        return ID;
    }

    public boolean getIsNew() {
        return isNew;
    }

    public double getTotal() {
        return total;
    }

    // Сеттери з перевіркою значень
    public void setID(int ID) {
        if (ID > 0) {
            this.ID = ID;
        } else {
            System.out.println("Invalid ID. It must be positive.");
        }
    }

    public void setStatus(boolean isNew) {
        this.isNew = isNew;
    }

    public void setTotal(double total) {
        if (total >= 0) {
            this.total = total;
        } else {
            System.out.println("Invalid total. It must not be negative.");
        }
    }
}
