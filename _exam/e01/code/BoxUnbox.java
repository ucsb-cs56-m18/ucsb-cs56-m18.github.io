import java.util.ArrayList;
public class BoxUnbox {
    public static void main(String [] args) {
	ArrayList<Integer> mylist = new ArrayList<Integer>();
	mylist.add(new Integer(2));
	mylist.add(1);
	mylist.set(0,3);
	int a = mylist.get(0) + mylist.get(1);
	mylist.add(7);
	Integer b = mylist.get(2);
	Integer c = b;
	Integer d = a + c;
	System.out.println("a=" + a + " b= " + b + " c=" + c + " d=" + d);
    }
}
