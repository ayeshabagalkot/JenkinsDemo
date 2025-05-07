import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {
private String name;
private LocalDate dob;

public Person(String name, String dobStr) {
DateTimeFormatter formatter;
if (dobStr.matches("\\d{2}-\\d{2}-\\d{4}")) {

formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
} else {
formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
}
this.name = name;
this.dob = LocalDate.parse(dobStr, formatter);
}

public void displayName() {
System.out.println("Name: " + name);
}

public void displayAge() {
int age = Period.between(dob, LocalDate.now()).getYears();
System.out.println("Age: " + age);
}
}