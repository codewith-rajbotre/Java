class Transport{
    void TravelMode(){
        System.out.println("Travelling...");
    }
}
class Bus extends Transport{
     void travelMode(){
        System.out.println("Travelling By Bus...");
    }
}
class Train extends  Transport{
     void travelMode(){
        System.out.println("Travelling By Train...");
    }
}


public class Inherit{
    public static void main(String[] args){
         Train objTrain = new Train();
         Bus objBus = new Bus();
         objTrain.travelMode();
         objBus.travelMode(); 


    }
}