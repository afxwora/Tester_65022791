import static org.junit.Assert.*;

import org.junit.Test;

public class testguidance {
	
	guidance obj = new guidance();
	

	
	
	
	
	
	@Test
	public void TC01() {
		
		assertEquals(2,obj.countLetterA("Angular"));
	}
	
	
	@Test
	public void TC02() {
		
		assertEquals(0,obj.countLetterA("MongoDB"));
	}
	
	@Test
	public void TC03() {
		
		assertEquals(false,obj.checkTwoLetter("M"));
	}
	@Test
	public void TC4() {
		
		assertEquals(true,obj.checkTwoLetter("Ma"));
	}
	
	
	

}
