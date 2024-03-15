public class Employee {
    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public boolean equals(Object object){
        if(object==null ||getClass()!=object.getClass()){
            return false;
        }
        if(object==this){
            return true;
        }
        Employee e=(Employee)object;
        return(this.getId()==e.getId());  
    }
    public int hashCode(){
        return getId();
    }
}
