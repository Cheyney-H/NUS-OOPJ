import java.time.LocalDate;

public class Person_v3{
    String name;
    int yob;
    char gender;
    String job;

    public Person_v3(String name, int yob, char gender, String job){
        this.name = name;
        this.yob = yob;
        this.gender = gender;
        this.job = job;
    }

    public int getAge(){
        return LocalDate.now().getYear() - yob;
    }

    public void intro(){
        int age = getAge();
        if (Character.toUpperCase(gender) == 'F'){
                System.out.println(name + ", " + job);
        }else{
            if(age >=0 && age < 200){
                System.out.println(name + ", " + age + ", " + job);
            }else{
                System.out.println(name + ", " + job);
            }
        }
    }

    public static void main(String[] args){
        Person_v3 person1 = new Person_v3("John", 1972, 'm', "Teacher");
        Person_v3 person2 = new Person_v3("Mary", 1990, 'f', "Programmer");
        Person_v3 person3 = new Person_v3("Harry", 1992, 'm', "Doctor");
        Person_v3 person4 = new Person_v3("Jane", 1990, 'f', "Scientist");

        person1.intro();
        person2.intro();
        person3.intro();
        person4.intro();
    }
}
