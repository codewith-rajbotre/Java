@FunctionalInterface
interface Demo{
    void Hello();//The functional interface consits of only one method
   
}

class FunctionalInterfaces implements  Demo{
    public void Hello(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        System.out.println("Functional Interface.");

    }
    
}