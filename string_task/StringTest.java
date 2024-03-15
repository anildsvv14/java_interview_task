

public class StringTest {
    public static void main(String[] args) {
        
        Employee e1=new Employee(1, "anil kumar sahu");
        Employee e2=new Employee(1, "anil kumar sahu");
        Employee e3=e1;

        System.out.println("Shallow Compare "+(e1==e2));
        System.out.println("Deep Compare "+e1.equals(e2));
        System.err.println(e1==e3);
        System.out.println((e1.equals(e3)));
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
