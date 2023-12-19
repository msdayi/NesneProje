import java.util.Scanner;

class TicketReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Ticket Reservation System");

        // Register a new user
        System.out.print("Enter your username: ");
        String username = scanner.next();
        System.out.print("Enter your password: ");
        String password = scanner.next();

        Customer customer = new Customer(username, password);
        customer.register();

        // Login
        System.out.print("Enter your username to login: ");
        String loginUsername = scanner.next();
        System.out.print("Enter your password to login: ");
        String loginPassword = scanner.next();

        if (loginUsername.equals(customer.username) && loginPassword.equals(customer.password)) {
            customer.login();
        } else {
            System.out.println("Invalid username or password. Exiting...");
            System.exit(0);
        }

        // Ticket operations
        System.out.println("1. Purchase Ticket");
        System.out.println("2. Transfer Ticket");
        System.out.println("3. Cancel Ticket");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();


        switch (choice) {
            case 1:
                // Purchase Ticket
                Ticket ticket = new Ticket("Kale Arkası", 100.0);
                customer.purchaseTicket(ticket);
                break;
            case 2:
                // Transfer Ticket
                if (!customer.tickets.isEmpty()) {
                    Ticket cancelTicket = customer.tickets.get(0);
                    customer.cancelTicket(cancelTicket);
                } else {
                    System.out.println("Ticket Transferred");
                }

            case 3:
                // Cancel Ticket
                if (!customer.tickets.isEmpty()) {
                    Ticket cancelTicket = customer.tickets.get(0);
                    customer.cancelTicket(cancelTicket);
                } else {
                    System.out.println("No tickets to cancel.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
