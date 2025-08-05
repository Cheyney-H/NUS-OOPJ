import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CourseFullException extends Exception{
    public CourseFullException(String message){
        super(message);
    }
}

class AlreadyEnrolledException extends Exception{
    public AlreadyEnrolledException(String message){
        super(message);
    }
}

class Course{
    private String courseName;
    private int capacity;
    private List<String> enrolledStudents;

    public Course(String courseName, int capacity){
        this.courseName = courseName;
        this.capacity = capacity;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enroll(String studentName) throws CourseFullException, AlreadyEnrolledException{
        if (enrolledStudents.contains(studentName)){
            throw new AlreadyEnrolledException(studentName + " is already enrolled in the course.");
        }
        if (enrolledStudents.size() >= capacity){
            throw new CourseFullException("Course is full! Cannot enroll more students.");
        }
        enrolledStudents.add(studentName);
        System.out.println(studentName + " enrolled successfully!");
    }

    public String getCourseName(){
        return courseName;
    }

    public int getCapacity(){
        return capacity;
    }

    public List<String> getEnrolledStudents(){
        return enrolledStudents;
    }
}

public class EnrollSystem{
    public static void main(String[] args){
        Course course = new Course("Java Programming", 2);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Course Enrollment System - Enter 'exit' to quit");
        System.out.println("Course: " + course.getCourseName() + " (Capacity: " + course.getCapacity() + ")");

        while (true){
            System.out.print("\nEnter student name to enroll: ");
            String studentName = scanner.nextLine();

            if ("exit".equalsIgnoreCase(studentName)){
                System.out.println("Exiting enrollment system...");
                break;
            }

            try{
                course.enroll(studentName);
            } catch (CourseFullException e){
                System.out.println(e.getMessage());
            } catch (AlreadyEnrolledException e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\nFinal enrollment list:");
        List<String> enrolledStudents = course.getEnrolledStudents();
        if (enrolledStudents.isEmpty()){
            System.out.println("No students enrolled.");
        } else{
            for (int i = 0; i < enrolledStudents.size(); i++){
                System.out.println((i + 1) + ". " + enrolledStudents.get(i));
            }
        }
        scanner.close();
    }
}