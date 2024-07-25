import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Meeting {
    private LocalDateTime dateTime;
    private Client client;

    public Meeting(LocalDateTime dateTime, Client client) {
        this.dateTime = dateTime;
        this.client = client;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return dateTime.format(formatter) + " - " + client.toString();
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
