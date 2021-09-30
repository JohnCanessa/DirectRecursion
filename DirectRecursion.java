import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */
public class DirectRecursion {


    /**
     * Factorial
     * Direct recursion.
     */
    static int factorial(int n) {

        // **** sanity check(s) ****
        if (n < 0) return -1;

        // **** base case ****
        if (n <= 1) return 1;

        // **** recursive call ****
        return n * factorial(n - 1);
    }


    /**
     * Test scaffold
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        
        // **** open buffered reader ****
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // **** read `n` ****
        int n = Integer.parseInt(br.readLine().trim());

        // **** close buffered reader ****
        br.close();

        // ???? ????
        System.out.println("main <<< n: " + n);

        // **** call function of interest and display result ****
        System.out.println("main <<< factorial: " + factorial(n));
    }
}