import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private String department;

    public Student(String name, String department) {
        this.name  = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }
}

class Course {
    private String courseName;
    private int creditHours;

    public Course(String courseName, int creditHours) {
        this.courseName = courseName;
        this.creditHours = creditHours;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCreditHours() {
        return creditHours;
    }
}

public class CourseTableGenerator {
    public static List<Course> generateCourseTable(Student student) {
        List<Course> courseTable = new ArrayList<>();

        // Check the department of the student and populate the course table accordingly
        String department = student.getDepartment();
        if ("Computer Science".equals(department)) {
            courseTable.add(new Course("Introduction to Programming", 4));
            courseTable.add(new Course("Data Structures", 3));
            // Add more courses for the Computer Science department
        } else if ("Mathematics".equals(department)) {
            courseTable.add(new Course("Calculus I", 4));
            courseTable.add(new Course("Linear Algebra", 3));
            // Add more courses for the Mathematics department
        }
        // Add more conditions for other departments

        return courseTable;
    }

    public static void main(String[] args) {
        // Example usage
        Student computerScienceStudent = new Student("John Doe", "Computer Science");
        List<Course> computerScienceCourseTable = generateCourseTable(computerScienceStudent);
        displayCourseTable(computerScienceCourseTable);

        Student mathStudent = new Student("Jane Smith", "Mathematics");
        List<Course> mathCourseTable = generateCourseTable(mathStudent);
        displayCourseTable(mathCourseTable);
    }

    private static void displayCourseTable(List<Course> courseTable) {
        System.out.println("Course Table:");
        System.out.println("------------------------------------------------");
        System.out.printf("%-30s %-15s%n", "Course Name", "Credit Hours");
        System.out.println("------------------------------------------------");
        for (Course course : courseTable) {
            System.out.printf("%-30s %-15d%n", course.getCourseName(), course.getCreditHours());
        }
        System.out.println("------------------------------------------------");
        System.out.println();
    }
}






// import java.util.ArrayList;
// import java.util.List;

// public class CourseTableGenerator {

//     public static List<Course> generateCourseTable() {
//         List<Course> courseList = new ArrayList<>();

//         // Add sample courses
//         courseList.add(new Course("Mathematics", 4));
//         courseList.add(new Course("Computer Science", 3));
//         courseList.add(new Course("History", 3));
//         courseList.add(new Course("Physics", 4));

//         return courseList;
//     }

//     public static void main(String[] args) {
//         List<Course> courseTable = generateCourseTable();

//         // Display the course table
//         System.out.println("Course Name\tCredit Hour");
//         System.out.println("------------------------------");
//         for (Course course : courseTable) {
//             System.out.println(course.getCourseName() + "\t\t\t" + course.getCreditHour());
//         }
//     }

//     // Course class representing a course with a name and credit hour
//     static class Course {
//         private String courseName;
//         private int creditHour;

//         public Course(String courseName, int creditHour) {
//             this.courseName = courseName;
//             this.creditHour = creditHour;
//         }

//         public String getCourseName() {
//             return courseName;
//         }

//         public int getCreditHour() {
//             return creditHour;
//         }
//     }
// }

