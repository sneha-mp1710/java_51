interface Login {
    boolean login(String username, String password);
}

abstract class Person {
    String name;
    String id;

    Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    abstract String getRole();

    void displayInfo() {
        System.out.println("Role: " + getRole());
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Student extends Person implements Login {
    private String username;
    private String password;

    Student(String name, String id, String username, String password) {
        super(name, id);
        this.username = username;
        this.password = password;
    }

    @Override
    String getRole() {
        return "Student";
    }

    @Override
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}

class Faculty extends Person implements Login {
    private String username;
    private String password;

    Faculty(String name, String id, String username, String password) {
        super(name, id);
        this.username = username;
        this.password = password;
    }

    @Override
    String getRole() {
        return "Faculty";
    }

    @Override
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}

public class CollegePortalSimulation {
    public static void main(String[] args) {
        Person student = new Student("Sneha", "S108", "sneha108", "pass108");
        Person faculty = new Faculty("Abhijit Mophare", "F2001", "mophare", "admin108");

        Login sLogin = (Login) student;
        if (sLogin.login("sneha108", "pass108")) {
            System.out.println("Student Login Successful");
            student.displayInfo();
        } else {
            System.out.println("Student Login Failed");
        }

        System.out.println();

        Login fLogin = (Login) faculty;
        if (fLogin.login("mophare", "admin108")) {
            System.out.println("Faculty Login Successful");
            faculty.displayInfo();
        } else {
            System.out.println("Faculty Login Failed");
        }
    }
}
