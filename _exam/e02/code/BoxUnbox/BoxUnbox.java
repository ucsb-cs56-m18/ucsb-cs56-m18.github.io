import java.util.ArrayList;
public class BoxUnbox {
    public static void main(String [] args) {
	ArrayList<Integer> mylist = new ArrayList<Integer>();
	mylist.add(1);
	mylist.add(new Integer(4));
	Integer a = mylist.get(0) + mylist.get(1);
	int b = mylist.get(0);
	Integer c = a + b;
	Integer d = b;
	Integer e = mylist.get(mylist.get(0));
	System.out.println("a=" + a + " b= " + b + " c=" + c);
	System.out.println("d=" + d + " e= " + e);
    }
}
