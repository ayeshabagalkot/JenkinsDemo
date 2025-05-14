import java.util.HashMap;
import java.util.Map;

public class StudentCourses {
Map<String, Map<String, Integer>> courses = new HashMap<>();

public void addCourse(String semester, String courseName, int marks) {
if (!courses.containsKey(semester)) {
courses.put(semester, new HashMap<String, Integer>());
}
courses.get(semester).put(courseName, marks);
}

public void displayCourses() {
for (String semester : courses.keySet()) {
System.out.println("Semester: " + semester);
Map<String, Integer> semesterCourses = courses.get(semester);
for (String course : semesterCourses.keySet()) {
System.out.println(" Course: " + course + ", Marks: " + semesterCourses.get(course));
}
}
}

public static void main(String[] args) {

StudentCourses sc = new StudentCourses();
sc.addCourse("Semester 1", "Math", 90);
sc.addCourse("Semester 1", "English", 85);
sc.addCourse("Semester 2", "Physics", 88);

sc.displayCourses();
}
}