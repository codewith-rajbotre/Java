import java.util.Collections;
import java.util.LinkedList;
public class ReverseAlinkedList{
    public static void main(String[] args) {
        System.out.println("Linked list Reverse Example");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println("Reversed List :"+ list);

    }
}