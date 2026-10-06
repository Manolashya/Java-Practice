public class TestStringBuffer {

    public static void main(String[] args) {

        StringBuffer s = new StringBuffer("HELLO");

        int p = s.length();
        int q = s.capacity();

        System.out.println("Length of string HELLO = " + p);
        System.out.println("Capacity of string HELLO = " + q);

        s.append("Infoviaan");
        System.out.println(s);

        s.append(1);
        System.out.println(s);

        s.insert(5, "for");
        System.out.println(s);

        s.insert(0, 5);
        System.out.println(s);

        s.insert(3, true);
        System.out.println(s);

        s.insert(5, 41.35d);
        System.out.println(s);

        s.insert(8, 41.35f);
        System.out.println(s);

        char data_arr[] = {'v', 'i', 'y', 'o', 'm'};

        System.out.println(s);

        s.insert(2, data_arr);
        System.out.println(s);

        s.replace(5, 8, "SyS");
        System.out.println(s);

        s.delete(0, 5);
        System.out.println(s);

        s.deleteCharAt(7);
        System.out.println(s);

        s.reverse();
        System.out.println(s);
    }
}
