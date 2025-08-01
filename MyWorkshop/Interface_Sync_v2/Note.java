public class Note implements ISyncable {
    private String title;
    private String content;

    public Note() {
    }

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String getCode() {
        return "N";
    }

    @Override
    public String encode() {
        String str = String.format("%s|%s", title, content);

        System.out.println("Note encoded successfully.");

        return str;
    }

    @Override
    public void decode(String str) {
        String[] parts = str.split("\\|");

        if (parts.length != 2) {
            System.out.println("Incorrect Note format. Decode unsuccessful.");
            return;
        }

        title = parts[0];
        content = parts[1];

        System.out.println("Note decoded successfully.");
    }
}