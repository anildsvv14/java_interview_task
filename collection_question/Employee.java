import java.util.Comparator;

class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    public Employee(int id, String name){
        this.id=id;
        this.name=name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }
    public int compareTo(Employee o){
        return o.id-this.id;
    }

    public static Comparator<Employee> NameComparator=new Comparator<Employee>() {
        
        @Override
        public int compare(Employee e1,Employee e2){
            return e1.getName().compareTo(e2.getName());
        }
    };
    
}