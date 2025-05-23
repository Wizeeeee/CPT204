package Lab1;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("张", "伟", "zhangwei@example.com", 3);
        Student student2 = new Student("李", "芳", "lifang@example.com", 5);

        // 打印学生信息
        System.out.println(student1.toString());
        System.out.println(student2.toString());

        // 比较两个学生的组号
        int comparison = student1.less(student2);
        if (comparison < 0) {
            System.out.println(student1.getFirstName() + " 小组比 " + student2.getFirstName() + " 小组号小。");
        } else if (comparison > 0) {
            System.out.println(student1.getFirstName() + " 小组比 " + student2.getFirstName() + " 小组号大。");
        } else {
            System.out.println(student1.getFirstName() + " 和 " + student2.getFirstName() + " 小组号相同。");
        }
    }
}
