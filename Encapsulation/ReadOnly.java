 class StudentData{
    private int id;
    private String name;
    private  String Dept="IT";
    private String pass;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String Dept) {
        this.Dept = Dept;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }

}

public class ReadOnly{
    public static void main(String[]args){
        StudentData  s1 = new StudentData();
        s1.setId(1);
        s1.setName("Ram");
        s1.setDept("CSE");
        s1.setPass("pass@12345");    
        System.out.println("Name : "+s1.getName()+ " Id: "+s1.getId()+" Dept: "+ s1.getDept());      
    }
}