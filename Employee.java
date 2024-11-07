public class Employee {
    /*
    It is defined as the wrapping up of data under a single unit. It is the mechanism that binds
    together the code and the data it manipulates. Another way to think about
    encapsulation is that it is a protective shield that prevents the data from being accessed by the code outside this shield.

    Ex- Class employee has empId and empName which is private date and will be accessed only through getter and setter only
    */
    private int empid;
    private String ename;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
}

