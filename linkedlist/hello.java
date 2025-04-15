import java.util.LinkedList;

public class hello {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.add("hello");
        System.out.println("this is waht lost print " + list); 
        list.add("world");
        list.add("java");
        list.add("python"); 
        list.remove("java");
        System.out.println("this is waht lost print " + list);
        boolean  found = list.contains("java");
        System.out.println("this is waht lost print " + found);

        System.out.println("iterate operation---------");
        for (String value: list){
            System.out.println("this is it " + value);
        }
        System.out.println("this is what is got after updating the opratiob----------");
        list.set(0,"messi");
        System.out.println("after updating the list " + list);
        
    }
    
    
}
