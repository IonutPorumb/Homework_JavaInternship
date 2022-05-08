package exercises.day4.exercise2_3;

import java.time.LocalDateTime;

public class Employee implements Person {
    private String firstName;
    private String lastName;
    private LocalDateTime birthday;
    private String address;
    private String position;

    public Employee(String firstName, String lastName, LocalDateTime birthday, String address, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
        this.position = position;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;

    }

    public String getPosition() {
        return position;
    }

    public String fullName() {
        return firstName + " " + lastName;
    }

    public String age() {
        LocalDateTime dateTimeNow = LocalDateTime.now();
        return "The employee " + fullName() + " is " + (dateTimeNow.getYear() - birthday.getYear()) + " years old";
    }
}
