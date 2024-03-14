

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {
        /*int arr[]={1,55,5,4,6,99,8,77,54};
        Arrays.sort(arr);
        for(int a:arr){
            System.out.println(a);
        }*/
        Employee[] emps=new Employee[5];
        emps[0]=new Employee(15,   "anil sahu");
        emps[1]=new Employee(1,   "anil kumar sahu");
        emps[2]=new Employee(25,   "aashvi sahu");
        emps[3]=new Employee(10,   "devesh");
        emps[4]=new Employee(35,   "shikha");
        System.out.println(emps);

        //Arrays.sort(emps); using comparable compareTo method like natural sorting
        Arrays.sort(emps);
        System.out.println("compare using id"+Arrays.toString(emps));
        Arrays.sort(emps,Employee.NameComparator);
        System.out.println("Compare using name"+Arrays.toString(emps));
    }
}
