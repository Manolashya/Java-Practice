abstract class A {
    public abstract void sum(int x, int y);
}
class B extends A {
    public void sum(int x,int y) {
        System.out.println(x+y);
    }
    public static void main(String ar[]) {
        B obj = new B();
        obj.sum(2,5);
    }
}