public class CustomerTest {
    public static void main(String[] args) {
        // Створення об'єкта
        Customer customer = new Customer();

        // Вивід інформації
        customer.displayCustomerInfo();

        System.out.println("\n--- Updating customer info ---");

        // Зміна атрибутів
        customer.setID(5);
        customer.setStatus(false);
        customer.setTotal(2450.75);

        // Повторний вивід
        customer.displayCustomerInfo();
    }
}
