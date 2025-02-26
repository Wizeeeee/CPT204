import java.time.LocalDate;  

// 基类 Person  
class Person {  
    protected String name;  
    private String address;  
    private String phoneNumber;  
    private String email;  

    public Person(String name) {  
        this.name = name;  
    }  

    // toString 方法  
    @Override  
    public String toString() {  
        return "Person: " + name;  
    }  
}  

// 子类 Student  
class Student extends Person {  
    public static final String FRESHMAN = "Freshman";  
    public static final String SOPHOMORE = "Sophomore";  
    public static final String JUNIOR = "Junior";  
    public static final String SENIOR = "Senior";  

    private String classStatus;  

    public Student(String name, String classStatus) {  
        super(name);  
        this.classStatus = classStatus;  
    }  

    @Override  
    public String toString() {  
        return "Student: " + name + ", Status: " + classStatus;  
    }  
}  

// 子类 Employee  
class Employee extends Person {  
    private String office;  
    private double salary;  
    private LocalDate dateHired;  

    public Employee(String name, String office, double salary, LocalDate dateHired) {  
        super(name);  
        this.office = office;  
        this.salary = salary;  
        this.dateHired = dateHired;  
    }  

    @Override  
    public String toString() {  
        return "Employee: " + name + ", Office: " + office + ", Salary: " + salary + ", Hired on: " + dateHired;  
    }  
}  

// 子类 Faculty  
class Faculty extends Employee {  
    private String officeHours;  
    private String rank;  

    public Faculty(String name, String office, double salary, LocalDate dateHired, String officeHours, String rank) {  
        super(name, office, salary, dateHired);  
        this.officeHours = officeHours;  
        this.rank = rank;  
    }  

    @Override  
    public String toString() {  
        return "Faculty: " + name + ", Office Hours: " + officeHours + ", Rank: " + rank;  
    }  
}  

// 子类 Staff  
class Staff extends Employee {  
    private String title;  

    public Staff(String name, String office, double salary, LocalDate dateHired, String title) {  
        super(name, office, salary, dateHired);  
        this.title = title;  
    }  

    @Override  
    public String toString() {  
        return "Staff: " + name + ", Title: " + title;  
    }  
}  

// 测试程序  
public class Test {  
    public static void main(String[] args) {  
        Person[] persons = new Person[5];  
        persons[0] = new Person("Alice");  
        persons[1] = new Student("Bob", Student.FRESHMAN);  
        persons[2] = new Employee("Charlie", "Room 101", 50000, LocalDate.of(2020, 1, 10));  
        persons[3] = new Faculty("David", "Room 202", 70000, LocalDate.of(2019, 5, 20), "Mon-Fri 9-11", "Professor");  
        persons[4] = new Staff("Eve", "Room 303", 40000, LocalDate.of(2021, 3, 15), "Administrative Assistant");  

        for (Person person : persons) {  
            System.out.println(person);  
        }  
    }  
}