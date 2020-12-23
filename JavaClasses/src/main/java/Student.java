/*
 Создать классы, спецификации которых приведены ниже.
 Определить конструкторы и методы setТип(), getТип(), toString().
 Определить дополнительно методы в классе, создающем массив объектов.
 Задать критерий выбора данных и вывести эти данные на консоль.
 В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
   Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.

   Создать массив объектов. Вывести:

    a) список студентов заданного факультета;
    b) списки студентов для каждого факультета и курса;
    c) список студентов, родившихся после заданного года;
    d) список учебной группы.
 */

public class Student {

    private Inform inform = new Inform();
   private int id;
   private String surname;
   private String name;
   private String patronymic;// отчество
   private String dateOfBirth;
   private String address;
   private long phoneNumber;
   private Faculty faculty;
   private int course;
   private char group;
   private Student [] students;

    public Student(int id, String surname, String name, String patronymic,
                   String dateOfBirth, String address, long phoneNumber,
                   Faculty faculty, int course, char group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        Inform.addStudent(this);

    }
    public Student(int id, String surname, String name,
                   String patronymic, String dateOfBirth,
                   Faculty faculty, int course, char group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        inform.addStudent(this);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(char group) {
        this.group = group;
    }

    public  Inform getInform() {
        return inform;
    }


    @Override
    public String toString() {
        return "Студент: " +
                 surname + " " + name + " " + patronymic +". " +
                "id: " + id +
                ", Дата рождения: " + dateOfBirth +
                ", Факультет: " + faculty.translation +
                ", Курс: " + course +
                ", Группа: " + group;
    }
}
