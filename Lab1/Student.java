package Lab1;

public class Student {
    private String firstName;  // 名字
    private String lastName;   // 姓氏
    private String email;      // 电子邮箱
    private int groupNumber;   // 小组编号

    // 构造函数
    public Student(String firstName, String lastName, String email, int groupNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.groupNumber = groupNumber;
    }

    // getter 方法
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    // toString() 方法，返回学生的字符串描述
    @Override
    public String toString() {
        return "学生: " + firstName + " " + lastName + 
               ", 邮箱: " + email + 
               ", 小组: " + groupNumber;
    }

    /**
     * 比较两个学生的组号
     * @param other 另一个学生对象
     * @return 如果当前学生组号小于其他学生，返回负数；相等返回0；大于返回正数
     */
    public int less(Student other) {
        return this.groupNumber - other.groupNumber;
    }
}