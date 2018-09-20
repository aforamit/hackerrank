import org.testng.annotations.Test;

import java.util.Scanner;

/**
 * Created by amit on 12/16/2015.
 */
public class CavityMapSolutionTest {

    @Test
    public void testSearchCavity() throws Exception {
        Scanner s = new Scanner("4\n" +
                "1112\n" +
                "1912\n" +
                "1892\n" +
                "1234\n");
        CavityMapSolution.markCavityMap(CavityMapSolution.parseInput(s));

    }
}