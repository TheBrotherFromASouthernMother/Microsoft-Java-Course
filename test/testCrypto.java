package test;

import DEV276x.Crypto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testCrypto {

    Crypto crypto = new Crypto();
    @Test
    public void testSomething() {
        assertEquals("IAMHERETOCONQUER", crypto.normalize("I am here to conquer"), "It should return the original string in all caps with all punctuation and symbols removed");

    }
}
