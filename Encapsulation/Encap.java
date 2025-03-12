class Student{
       private int id;
       private String name;
       private String dept;
       public void setId(int id){
        this.id =id;
       }
       public void setName(String name){
        this.name =name;
       }
       public void setDept(String dept){
        this.dept =dept;
       }
       public int getId(){
        return id;
       }
        public String getName(){
        return name;
       }
        public String getDept(){
        return dept;
       }
}

public class Encap{
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(1);
        s.setName("Jara");
        s.setDept("Computer");
        System.out.println("ID: "+s.getId()+" Name: "+s.getName()+" Dept: "+ s.getDept());
    }
}