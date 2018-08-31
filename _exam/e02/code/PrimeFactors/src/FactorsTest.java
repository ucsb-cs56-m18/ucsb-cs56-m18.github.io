import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FactorsTest {

    @Test
    public void test_rlf() {
	Factors f = new Factors(new int [] {2,15});
	f.replaceLastFactor(3);
	assertEquals(new Factors(new int [] {2,3}), f);
    }
	    
    @Test
    public void test_af() {
	Factors f = new Factors(new int [] {2,3});
	f.addFactor(5);
	assertEquals(new Factors(new int [] {2,3,5}), f);
    }

    
    @Test
    public void test1() {
	Factors f = new Factors(new int [] {60});
	Factors expected = new Factors(new int [] {2,30});
	f.addNextFactor();
	assertEquals(expected, f);
    }

    @Test
    public void test2() {
	Factors f = new Factors(new int [] {2,30});
	Factors expected = new Factors(new int [] {2,2,15});
	f.addNextFactor();
	assertEquals(expected, f);
    }

    @Test
    public void test3() {
	Factors f = new Factors(new int [] {2,2,15});
	Factors expected = new Factors(new int [] {2,2,3,5});
	f.addNextFactor();
	assertEquals(expected, f);
    }

    @Test
    public void test4() {
	Factors f = new Factors(new int [] {2,2,3,5});
	Factors expected = new Factors(new int [] {2,2,3,5});
	f.addNextFactor();
	assertEquals(expected, f);
    }

    @Test
    public void test5() {
	Factors f = Factors.primeFactors(60);
	Factors expected = new Factors(new int [] {2,2,3,5});
	assertEquals(expected, f);
    }	    
}
