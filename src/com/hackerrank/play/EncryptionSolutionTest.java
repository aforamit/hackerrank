package com.hackerrank.play;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by amit on 12/9/2015.
 */
public class EncryptionSolutionTest {

    @Test
    public void testEncrypt() throws Exception {
        assertEquals(EncryptionSolution.encrypt(
                "if man was meant to stay on the ground god would have given us roots"),
                "imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau");

        assertEquals(EncryptionSolution.encrypt(
                "if man was meant to s"),
                "inmt fwet maao asns");

        assertEquals(EncryptionSolution.encrypt(
                "chillout"),
                "clu hlt io");
    }
}