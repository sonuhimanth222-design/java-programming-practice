package Module4;

public class StringComarision {
        public static void main(String[] args) {

            String s = "SS";
            s.concat(" gowda");

            StringBuilder sb = new StringBuilder("SS");
            sb.append(" gowda");

            StringBuffer sf = new StringBuffer("SS");
            sf.append("  gowda");

            System.out.println("String: " + s);
            System.out.println("StringBuilder: " + sb);
            System.out.println("StringBuffer: " + sf);
        }
    }

