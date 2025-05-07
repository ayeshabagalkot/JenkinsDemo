import java.util.Calendar;
import java.util.GregorianCalendar;
class Date {
int day;
int month;
int year;
public Date(String dateStr) {
String[] parts = dateStr.split("-");

if (parts.length == 3) {
this.day = Integer.parseInt(parts[0]);
this.month = Integer.parseInt(parts[1]);
this.year = Integer.parseInt(parts[2]);
} else {
System.out.println("Invalid date format, expected DD-MM-YYYY");
this.day = 1;
this.month = 1;
this.year = 2000;
}
}
public int calculateAge() {
Calendar today = Calendar.getInstance();
int age = today.get(Calendar.YEAR) - year;
if (today.get(Calendar.MONTH) + 1 < month ||
(today.get(Calendar.MONTH) + 1 == month && today.get(Calendar.DAY_OF_MONTH) < day)) {
age--;
}
return age;
}
}
public class Student1 {
String name;
Date dob;
public Student1(String name, String dobStr) {
this.name = name;
this.dob = new Date(dobStr);
}
public void displayStudentInfo() {
System.out.println("Student Name: " + name);
System.out.println("Student Age: " + dob.calculateAge());
}
public static void main(String[] args) {
Student1 student1 = new Student1("Alice", "15-08-2000");

student1.displayStudentInfo();
}
}