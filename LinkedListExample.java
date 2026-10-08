import java.util.LinkedList;
public class LinkedListExample {
    public static void main(String[] args) {
    LinkedList<String> students = new LinkedList<>();
    students.add("Lashya");
    students.add("Mahanai");
    students.add("Mounika");
    students.add("Mano");
    System.out.println(students);
    students.addFirst("Sreeja");
    students.addLast("Karthi");
    System.out.println(students);
    System.out.println("First: "+students.getFirst());
    System.out.println("Last: "+students.getLast());
    students.removeFirst();
    students.removeLast();
    System.out.println(students);
    
    }
}