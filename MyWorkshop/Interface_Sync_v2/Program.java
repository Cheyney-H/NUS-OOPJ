public class Program {
  public static void main(String[] args) {
    SyncEngine syncEng = new SyncEngine();

    System.out.println("** Adding to SyncEngine...");

    // add contact
    syncEng.add(new Contact("Jeremy", "90111222", "jeremy@door.com"));

    // add task
    syncEng.add(new Task("Do Homework", 1, 8, 2024));
    Task task = new Task("Call Girlfriend", 1, 8, 2024);
    task.setDone(true);
    syncEng.add(task);

    // add note
    syncEng.add(new Note("Shopping list", "buy bread, fruits, drinks"));

    // add event
    syncEng.add(new Event("Attend class", "ISS", 1, 8, 2024, 13, 30));

    // sync test
    System.out.println("\n** SyncEngine test...");
    syncEng.testSync();
  }
}
