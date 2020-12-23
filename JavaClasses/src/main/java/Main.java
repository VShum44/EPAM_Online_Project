

public class Main {

    static Inform inform = new Inform();

    public static void main(String[] args) {

        Student student = new Student(001,
                "Петров",
                "Петр",
                "Петрович",
                "17.09.2000",
                "г.Одесса, ул. Проезд Коммунистов",
                89608887598L,
                Faculty.HIGH_PROGRAMMING_FACULTY,
                4,
                'A');
        Student student2 = new Student(002,
                "Васин",
                "Вася",
                "Василич",
                "17.10.2001",
                "г.Киев, ул. Проезд Либералов",
                89608767598L,
                Faculty.HIGH_PROGRAMMING_FACULTY,
                4,
                'A');
        Student student3 = new Student(001,
                "Петров",
                "Антон",
                "Сергеевич",
                "12.05.2002",
                "г.Львов, ул. Оранжевая Улица",
                8987887598L,
                Faculty.MEDIUM_PROGRAMMING_FACULTY,
                2,
                'A');
        Student student4 = new Student(002,
                "Шварц",
                "Арнольд",
                "Американович",
                "17.10.2002",
                "г.Сан-фрафнциско, ул. Сталоне Стрит",
                89608767598L,
                Faculty.HIGH_PROGRAMMING_FACULTY,
                2,
                'A');


//        inform.getStudentsFromFaculty(Faculty.MEDIUM_PROGRAMMING_FACULTY);
//        inform.findStudentsByYear(2001);
        System.out.println(inform.getStudentsList());
//        inform.addStudents(student,student2,student3,student4);
    }
}
