/**
 * @author Phil Bergeman
 * This JUnit tester checks the format method of the Telephone class
 * The first test checks if they're true.
 * The second test checks if they're false.
 * The third test is a mixture of true and false.
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class formatTest {

	@Test
	void testTrue() {
		assertTrue(Telephone.format("5551234567").equals("(555)123-4567"));
		assertTrue(Telephone.format("1234567890").equals("(123)456-7890"));
		assertTrue(Telephone.format("4444444444").equals("(444)444-4444"));
		assertTrue(Telephone.format("3237472828").equals("(323)747-2828"));
	}
	
	@Test
	void testFalse() {
		assertFalse(Telephone.format("5551234567").equals("5551234567"));
		assertFalse(Telephone.format("4444444444").equals("4444444444"));
		assertFalse(Telephone.format("1234567890").equals("1234567890"));
		assertFalse(Telephone.format("5703263761").equals("5703263761"));
	}

	@Test
	void testGeneral() {
		assertTrue(Telephone.format("9003214848").equals("(900)321-4848"));
		assertTrue(Telephone.format("2223691010").equals("(222)369-1010"));
		assertFalse(Telephone.format("7775223487").equals("7775223487"));
		assertFalse(Telephone.format("8555559000").equals("8555559000"));
	}
	
}
