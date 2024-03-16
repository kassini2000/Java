import list.GbArrayList;
import list.GbLinkedList;
import list.GbList;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        System.out.println("Hello world!");
        @SuppressWarnings("rawtypes")
        GbArrayList list = new GbArrayList();
        list.add(1);
        list.add(22);
        list.add(23);
        list.removeByIndex(2);
        System.out.println(list);
    }
    
}