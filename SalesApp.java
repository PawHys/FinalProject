import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SalesApp {
    private List<Client> clients = new ArrayList<>();
    private List<Meeting> meetings = new ArrayList<>();
    private List<Note> notes = new ArrayList<>();

    public void addClient(Client client) {
        clients.add(client);
    }

    public void addMeeting(Meeting meeting) {
        meetings.add(meeting);
    }

    public void addNote(Note note) {
        notes.add(note);
    }

    public void displayData() {
        System.out.println("Clients:");
        for (Client client : clients) {
            System.out.println(client);
        }

        System.out.println("\nMeetings:");
        for (Meeting meeting : meetings) {
            System.out.println(meeting);
        }

        System.out.println("\nNotes:");
        for (Note note : notes) {
            System.out.println(note);
        }
    }

    public static void main(String[] args) {
        SalesApp app = new SalesApp();
        Scanner scanner = new Scanner(System.in);
        String continueInput;

        do {
            // Dodawanie klientów
            System.out.println("Enter client details:");
            System.out.print("First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();
            System.out.print("Phone Number: ");
            String phoneNumber = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Company Address: ");
            String companyAddress = scanner.nextLine();

            Client client = new Client(firstName, lastName, phoneNumber, email, companyAddress);
            app.addClient(client);

            // Dodawanie spotkań
            System.out.println("\nEnter meeting details:");
            System.out.print("Date and Time (yyyy-MM-dd HH:mm): ");
            String dateTimeStr = scanner.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, formatter);

            Meeting meeting = new Meeting(dateTime, client);
            app.addMeeting(meeting);

            // Dodawanie notatek
            System.out.println("\nEnter note details:");
            System.out.print("Content: ");
            String content = scanner.nextLine();

            Note note = new Note(content, meeting);
            app.addNote(note);

            // Zapytanie o kontynuację
            System.out.print("\nDo you want to add another client? (yes/no): ");
            continueInput = scanner.nextLine();
        } while (continueInput.equalsIgnoreCase("yes"));

        // Wyświetlanie danych
        app.displayData();
    }
}
