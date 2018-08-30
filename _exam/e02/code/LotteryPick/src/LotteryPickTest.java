import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class LotteryPickTest {

    @Test
    public void test_sortNumbers() {
	LotteryPick lp = new LotteryPick(new int [] {15,2,7,3});
	lp.sortNumbers();
	assertEquals(new LotteryPick(new int [] {2,3,7,15}), lp);
    }
	    
    @Test
    public void test_unique_1() {
	LotteryPick lp = new LotteryPick(new int [] {3,5,3,7});
	assertFalse(lp.unique());
	assertEquals(new LotteryPick(new int [] {3,3,5,7}), lp);	
    }

    @Test
    public void test_unique_2() {
	LotteryPick lp = new LotteryPick(new int [] {3,5,2,7});
	assertTrue(lp.unique());
	assertEquals(new LotteryPick(new int [] {2,3,5,7}), lp);	
    }

    @Test
    public void test_matches_1() {
	LotteryPick lp1 = new LotteryPick(new int [] {4,15,6,21,9,11});
	LotteryPick lp2 = new LotteryPick(new int [] {17,6,3,21,13,14});
	assertEquals(2, lp1.numMatched(lp2));
    }
	    
   @Test
    public void test_matches_2() {
	    LotteryPick lp1 = new LotteryPick(new int [] {3,6,9,12,15,18});
	    LotteryPick lp2 = new LotteryPick(new int [] {2,4,8,10,14,16});
	    assertEquals(0, lp1.numMatched(lp2));
   }

    @Test
    public void test_matches_3() {
	    LotteryPick lp1 = new LotteryPick(new int [] {3,6,9,12,15,18});
	    LotteryPick lp2 = new LotteryPick(lp1); // cheating :-)
	    assertEquals(6, lp1.numMatched(lp2));
    }

}
