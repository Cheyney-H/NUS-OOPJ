import java.util.Scanner;

public class FileUploader {

    private static final String INVALID_CHARS = "[*?<>|:\"\\\\/]";
    public static void uploadFile(String filename) throws NullPointerException, IllegalArgumentException{
        if (filename == null || filename.isEmpty()){
            throw new NullPointerException("File name cannot be empty!");
        }

        if (filename.matches(".*" + INVALID_CHARS + ".*")){
            throw new IllegalArgumentException("File name contains invalid characters!");
        }

        System.out.println("File uploaded successfully!");
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name to upload: ");
        String fileName = scanner.nextLine();

        try{
            uploadFile(fileName);
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally{
            System.out.println("Closing file stream...");
            scanner.close();
        }
    }
}