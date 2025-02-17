package SchoolManagementSystem;


public class Main {
    public static void main(String[] args) {

        School school = new School();

        // Create new Student objects with name and age
        Student student1 = new Student("Rohail Khan", 21);
        Student student2 = new Student("Wajahat Ali Khan", 23);
        Student student3 = new Student("Usman Khan", 20);
        Student student4 = new Student("Kumail Lashari", 23);

        // Add the students to the school
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);

        // Create new Teacher objects with name and subject
        Teacher teacher1 = new Teacher("Sir Ali", "Programming Fundamentals");
        Teacher teacher2 = new Teacher("Sir Muneeb", "Object Oriented Programming");
        Teacher teacher3 = new Teacher("Sir Saleem", "Data Structures And Algorithms");

        // Add the teachers to the school
        school.addTeacher(teacher1);
        school.addTeacher(teacher2);
        school.addTeacher(teacher3);

        // Create new SchoolClass objects with class name and teacher
        SchoolClass pf = new SchoolClass("PROGRAMMING FUNDAMENTALS", teacher1);
        // Add students to the PF class
        pf.addStudent(student1);
        pf.addStudent(student2);
        pf.addStudent(student3);
        pf.addStudent(student4);

        SchoolClass oop = new SchoolClass("OOP", teacher2);
        // Add students to the OOP class
        oop.addStudent(student1);
        oop.addStudent(student2);
        oop.addStudent(student3);

        SchoolClass dsa = new SchoolClass("DSA", teacher3);
        // Add students to the DSA class
        dsa.addStudent(student1);
        dsa.addStudent(student2);
        dsa.addStudent(student3);
        dsa.addStudent(student4);

        // Add the classes to the school
        school.addClass(pf);
        school.addClass(oop);
        school.addClass(dsa);

        // Print school information
        System.out.println("School information:");
        System.out.println("Number of students: " + school.getStudents().size());
        System.out.println("Number of teachers: " + school.getTeachers().size());
        System.out.println("Number of classes: " + school.getClasses().size());
        System.out.println();

        // Print PF class information
        System.out.println("PF class information:");
        System.out.println("Class name: " + pf.getClassName());
        System.out.println("Teacher: " + pf.getTeacher().getName());
        System.out.println("Number of students: " + pf.getStudents().size());
        System.out.println();

        // Print OOP class information
        System.out.println("OOP class information:");
        System.out.println("Class name: " + oop.getClassName());
        System.out.println("Teacher: " + oop.getTeacher().getName());
        System.out.println("Number of students: " + oop.getStudents().size());
        System.out.println();

        // Print DSA class information
        System.out.println("DSA class information:");
        System.out.println("Class name: " + dsa.getClassName());
        System.out.println("Teacher: " + dsa.getTeacher().getName());
        System.out.println("Number of students: " + dsa.getStudents().size());
        System.out.println();

        // Remove a student, a teacher, and a class from the school
        school.removeStudent(student1);
        school.removeTeacher(teacher2);
        school.removeClass(pf);

        // Print updated school information after removal
        System.out.println("School information after removing one student, teacher and class:");
        System.out.println("Number of students: " + school.getStudents().size());
        System.out.println("Number of teachers: " + school.getTeachers().size());
        System.out.println("Number of classes: " + school.getClasses().size());
    }
}
