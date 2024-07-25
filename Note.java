public class Note {
    private String content;
    private Meeting meeting;

    public Note(String content, Meeting meeting) {
        this.content = content;
        this.meeting = meeting;
    }

    @Override
    public String toString() {
        return content + " (Meeting: " + meeting.toString() + ")";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Meeting getMeeting() {
        return meeting;
    }

    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
    }
}
