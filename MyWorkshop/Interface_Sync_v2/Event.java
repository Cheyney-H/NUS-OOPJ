public class Event implements ISyncable {
    private String name;
    private String location;
    private int day, month, year;
    private int hour, minute;

    public Event() {
    }

    public Event(String desc, String location, int day, int month, int year, int hour, int minute) {
        this.name = desc;
        this.location = location;
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public String getCode() {
        return "E";
    }

    @Override
    public String encode() {
        String str = String.format("%s|%s|%d|%d|%d|%d|%d",
            name, location, day, month, year, hour, minute);

        System.out.println("Event encoded successfully.");

        return str;
    }

    @Override
    public void decode(String str) {
        String[] parts = str.split("\\|");

        if (parts.length != 7) {
            System.out.println("Incorrect Event format. Decode unsuccessful.");
            return;
        }

        name = parts[0];
        location = parts[1];
        day = Integer.valueOf(parts[2]); 
        month = Integer.valueOf(parts[3]);
        year = Integer.valueOf(parts[4]);
        hour = Integer.valueOf(parts[5]);
        minute = Integer.valueOf(parts[6]);

        System.out.println("Event decoded successfully.");
    }
}