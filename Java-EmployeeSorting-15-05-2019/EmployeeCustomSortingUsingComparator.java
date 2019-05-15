import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Scanner;


public class EmployeeCustomSortingUsingComparator{


    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        EmployeeCustomSortingUsingComparator customSort = new EmployeeCustomSortingUsingComparator();
        Scanner sc = new Scanner(System.in);

        String input;

        do{
            System.out.println("Add New Employee Details ");
            customSort.addNewEmployeeDetails(list);
            System.out.println("Do you want to add more Employee ? (Press Y/N)");
            input = sc.nextLine();


        }while(!input.equalsIgnoreCase("N"));

        do{
         System.out.println("Employee Sort by: \n 1.First Name \n2.Last Name \n3.ID \n4.Age \n5.Address");
         int uInput = sc.nextInt();

         switch(uInput){

            case 1: Collections.sort(list,new SortEmployeeByFirstName());
            break;
            case 2: Collections.sort(list,new SortEmployeeByLastName());
            break;
            case 3: Collections.sort(list,new SortEmployeeByID());
            break;
            case 4: Collections.sort(list,new SortEmployeeByAge());
            break;
            case 5: Collections.sort(list,new SortEmployeeByAddress());
            break;

        }

        System.out.println("Applied sorting style "+list);
        System.out.println("Do you want to check again ? (Press Y/N)");
        input = sc.nextLine();
    }while(!input.equalsIgnoreCase("N"));
}


public void addNewEmployeeDetails(ArrayList list){

    Scanner scn = new Scanner(System.in);
    System.out.println(" Enter Employee  ID");
    Integer empID = scn.nextInt();
    scn.nextLine();
    System.out.println("Employee Name ");
    String ename = scn.nextLine();
    System.out.println(" Enter Employee  Age");
    Integer empAge = scn.nextInt();
    scn.nextLine();
    System.out.println(" Enter Employee  Address");
    String eAddress = scn.nextLine();

    list.add(new EmployeeDetails(empID,ename, empAge, eAddress));

}
}   

class EmployeeDetails{

    private Integer empID;
    private String empName;
    private String empFirstName;
    private String empLastName;
    private Integer empAge;
    private String empAddress;

    EmployeeDetails(Integer empID,String empName, Integer empAge, String empAddress){

        this.empID = empID;
        this.empName = empName;
        this.empAge= empAge;
        this.empAddress = empAddress;

        String []arr = empName.split(" ");

        if(arr.length > 1){

            this.empFirstName = arr[0];
            this.empLastName = arr[1];
        }else{

            this.empFirstName = empName;
            this.empLastName = "";
        }
    }


    public String toString(){

        return " Employee ID "+this.empID +", Name "+this.empFirstName +" "+this.empLastName +",  Age "+this.empAge +" ,  Address "+this.empAddress;

    }

        //getters
    public Integer getEmpID(){

        return this.empID;

    }
    public String getEmpFirstName(){

        return this.empFirstName;

    }
    public String getEmpLastName(){

        return this.empLastName;

    }
    public Integer getEmpAge(){

        return this.empAge;

    }
    public String getEmpAddress(){

        return this.empAddress;

    }

    public String getEmpName(){

        return this.empName;

    }

}


class SortEmployeeByID implements Comparator{

    @Override
    public int compare(Object firstObject,Object secondObject){


        return ((EmployeeDetails)firstObject).getEmpID().compareTo( ((EmployeeDetails)secondObject).getEmpID());

    }

}


class SortEmployeeByFirstName implements Comparator{


    @Override
    public int compare(Object firstObject,Object secondObject){


        return ((EmployeeDetails)firstObject).getEmpFirstName().compareTo( ((EmployeeDetails)secondObject).getEmpFirstName());

    }

}

class SortEmployeeByLastName implements Comparator{

    @Override
    public int compare(Object firstObject,Object secondObject){


        return ((EmployeeDetails)firstObject).getEmpLastName().compareTo( ((EmployeeDetails)secondObject).getEmpLastName());


    }
}

class SortEmployeeByAge implements Comparator{

    @Override
    public int compare(Object firstObject,Object secondObject){


        return ((EmployeeDetails)firstObject).getEmpAge().compareTo( ((EmployeeDetails)secondObject).getEmpAge());


    }
}

class SortEmployeeByAddress implements Comparator{

    @Override
    public int compare(Object firstObject,Object secondObject){


        return ((EmployeeDetails)firstObject).getEmpAddress().compareTo( ((EmployeeDetails)secondObject).getEmpAddress());


    }
}