import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class arrlist {
 public static void main(String[] args) {
    List<Integer> l = new ArrayList<>();
    l.add(10);
    l.add(20);
    l.add(30);
    System.out.println(l);
    System.out.println(l.size());
    System.out.println(l.get(2));
    l.add(40);
    l.add(50);
    l.clear();
    System.out.println(l);
    String str = "Shri";
    System.out.println(str);
    str = "shrijeet";
    System.out.println(str);
 }   
}
