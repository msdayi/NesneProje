import java.util.ArrayList;
import java.util.List;

class Customer implements User {
    String username;
    String password;
    List<Ticket> tickets;

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
        this.tickets = new ArrayList<>();
    }

    @Override
    public void register() {
        // Implement registration logic
        System.out.println("Registration complete for user: " + username);
    }

    @Override
    public void login() {
        // Implement login logic
        System.out.println("Login successful for user: " + username);
    }

    public void purchaseTicket(Ticket ticket) {
        // Implement ticket purchase logic
        tickets.add(ticket);
        System.out.println("Ticket purchased for block: " + ticket.block);
    }

    public void cancelTicket(Ticket ticket) {
        // Implement ticket cancellation logic
        tickets.remove(ticket);
        System.out.println("Ticket canceled for block: " + ticket.block);
    }
}

