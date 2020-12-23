import java.util.ArrayList;
import java.util.List;

public class Inform {

    private static List<Student> students = new ArrayList<Student>();



    public static void addStudent(Student student) {

        students.add(student);

    }


    public void findStudentsByYear(int year) {
        System.out.println("Найденно студентов, родившихся после " + year + " года;");
        for (Student student : students) {
            String[] stringY = student.getDateOfBirth().split("\\.");

            int studentYear = Integer.parseInt(stringY[stringY.length - 1]);
            if (studentYear > year) {
                System.out.println(student);
            }
        }
    }


        public void getStudentsFromFaculty (Faculty faculty){
            System.out.println("Найденно студентов  c " + faculty.translation );
            for (Student student : students) {
                if (student.getFaculty().equals(faculty)) {
                    System.out.println(student);
                }
            }
        }

        public static List<Student> getStudentsList() {
            return students;
        }

    }

