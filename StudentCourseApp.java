public class StudentCourseApp {

    
    static class Course {
        String name;
        int marks;

        Course(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }
    }

    
    static class Student {
        String name;
        String program;
        int semester;
        Course[] courses; 

        Student(String name, String program, int semester, Course[] courses) {
            this.name = name;
            this.program = program;
            this.semester = semester;
            this.courses = courses;
        }
    }

    public static void main(String[] args) {
      
        Course[] courses1 = {
            new Course("Data Structures", 75),
            new Course("Operating Systems", 62),
            new Course("Database Systems", 38)
        };

        Course[] courses2 = {
            new Course("Circuit Analysis", 35),
            new Course("Signals & Systems", 58),
            new Course("Electromagnetics", 42)
        };

      
        Student s1 = new Student("Alice Johnson", "Computer Science", 3, courses1);
        Student s2 = new Student("Bob Smith", "Electrical Engineering", 2, courses2);

       
        Student[] students = {s1, s2};

       
        System.out.println("Student Details and Registered Courses:");
        for (Student s : students) {
            System.out.println("Name: " + s.name);
            System.out.println("Program: " + s.program);
            System.out.println("Semester: " + s.semester);
            System.out.println("Courses Registered:");
            for (Course c : s.courses) {
                System.out.println("  " + c.name + " (Marks: " + c.marks + ")");
            }
            System.out.println();
        }

       
        System.out.println("Students scoring less than 40 in courses:");
        for (Student s : students) {
            boolean foundLowMarks = false;
            for (Course c : s.courses) {
                if (c.marks < 40) {
                    if (!foundLowMarks) {
                        System.out.println("Student: " + s.name);
                        foundLowMarks = true;
                    }
                    System.out.println("  Course: " + c.name + ", Marks: " + c.marks);
                }
            }
            if (foundLowMarks) {
                System.out.println();
            }
        }
    }
}