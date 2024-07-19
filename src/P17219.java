import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * P17219
 *
 * K made random pw and couldn't remember them.
 * decided to save the site address and pw in a notepad,
 * but he couldn't use the find func and had to search them manually.
 * as num of sites grew, finding pw became too time-consuming.
 * => create a program to quickly find pw for him !
 */

public class P17219 {
    public static void main(String[] args) throws IOException {
        // BR for input and BW for output
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // read 1st line -> get num of stored site adr ( N ) & num of Qs ( M )
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // Hashmamp to save adr and pw
        HashMap<String, String> pwMap = new HashMap<>();

        // read N lines of site adr and pw, and save them in HASHMAP<>
        for (int i = 0 ; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String adr = st.nextToken();
            String pw = st.nextToken();
            pwMap.put(adr, pw);
        }

        // read M lines of adrs for which we need to find pw
        for (int i = 0; i < M; i++) {
            String qAdrs = br.readLine();

            // retrieve pw for the givne adrs from HM
            String pw = pwMap.get(qAdrs);

            // write pw to the output
            bw.write(pw + "\n");
        }

        // ===================== flush & close bw =======================
        bw.flush();
        bw.close();

        // ===================== close br ===========================
        br.close();
    }
}

/**
 * Key is :
 *  - input
 *  1st line contains 2 Integers,
 *      1. N ( num of saved site adr )
 *      2. M ( num of site adr to find pw for )
 *  next N lines -> each have [ a site address ] and [ a pw separated by a  space ]
 *      - site ars -> lowercase/uppercase letter, dashes (-), and periods(.), and each is unq
 *      - pw -> only uppercase letters and up to 20 char long
 *  following M lines -> with site adrs for which u need to find the pw
 *      => grnt to be among prev saved addresses
 *
 * CNCLSN : print pw for req site addresse, one/line, in the same order as the Qs.
 */