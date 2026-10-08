public class Example {
    private String name;
    public String getname() {
        return name;
    }
    public void Setname(String name) {
        this.name=name;
    }
    void display() {
        System.out.println("Name: "+name);
    }
    public static void main(String[] args) {
        Example ex=new Example();
        ex.getname();
        ex.Setname("Lashya");
        ex.display();
    }
    
}
