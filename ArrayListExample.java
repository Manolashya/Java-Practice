import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Lashya");
        students.add("Mahanai");
        students.add("Mounika");
        students.add("Mahathi");
        System.out.println("Students: "+students);
        System.out.println(("First student: "+students.get(0)));
        students.set(1,"Ravi");
        System.out.println("After update: "+students);
        students.remove("Mahathi");
        System.out.println("After removal: "+students);
        for(String student:students) {
            System.out.println(student);
        }
    }
}
