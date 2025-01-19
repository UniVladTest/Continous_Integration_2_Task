import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    int[] Primes = {2,7,19,41,67,73,97};
    for(int i = 0; i < Primes.length; i++){
      assertEquals("The Prime number " + Primes[i] + " should be true", true, PrimeCheck.isPrime(Primes[i]));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    int[] nonPrimes = {4,14,15,21,32,42,51,58,88};
    for(int i = 0; i < nonPrimes.length; i++){
      assertEquals("The number " + nonPrimes[i] + " should be false", false, PrimeCheck.isPrime(nonPrimes[i]));
    }
  }
}
