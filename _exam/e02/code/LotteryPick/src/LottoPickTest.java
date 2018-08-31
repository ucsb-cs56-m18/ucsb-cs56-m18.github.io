import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class LottoPickTest {

    @Test
    public void test_sortNumbers() {
	LottoPick lp = new LottoPick(new int [] {15,2,7,3});
	lp.sortNumbers();
	assertEquals(new LottoPick(new int [] {2,3,7,15}), lp);
    }
	    
    @Test
    public void test_unique_1() {
	LottoPick lp = new LottoPick(new int [] {3,5,3,7});
	assertFalse(lp.unique());
	assertEquals(new LottoPick(new int [] {3,3,5,7}), lp);
    }

    @Test
    public void test_unique_2() {
	LottoPick lp = new LottoPick(new int [] {3,5,2,7});
	assertEquals(new LottoPick(new int [] {3,5,2,7}), lp);	
	assertTrue(lp.unique());
	assertEquals(new LottoPick(new int [] {2,3,5,7}), lp);
    }

    @Test
    public void test_matches_1() {
	LottoPick lp1 = new LottoPick(new int [] {4,15,6,21,9,11});
	LottoPick lp2 = new LottoPick(new int [] {17,6,3,21,13,14});
	assertEquals(2, LottoPick.numMatched(lp1,lp2));
    }
	    
   @Test
    public void test_matches_2() {
	    LottoPick lp1 = new LottoPick(new int [] {3,6,9,12,15,18});
	    LottoPick lp2 = new LottoPick(new int [] {2,4,8,10,14,16});
	    assertEquals(0, LottoPick.numMatched(lp1,lp2));
   }

    @Test
    public void test_matches_3() {
	    LottoPick lp1 = new LottoPick(new int [] {3,6,9,12,15,18});
	    LottoPick lp2 = new LottoPick(lp1); // cheating :-)
	    assertEquals(6, LottoPick.numMatched(lp1,lp2));
    }

}
