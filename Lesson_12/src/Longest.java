public class Longest {
    private char[] cont;
    private String longestWord1;

    public Longest(char[] cont) {
        this.cont = cont;
    }

    public void longestWord(char[] cont) {
        String g = "";
        String s = new String(cont);
        String ss = s.replaceAll("\\p{IsPunctuation}", "");
        String[] z = ss.split(" ");
        for (String string : z) {

            if (string.length() > g.length()) {
                g = g.replaceAll(g, string);
            }
        }
        setLongestWord1(g);
    }

    public char[] getCont() {
        return cont;
    }

    public void setCont(char[] cont) {
        this.cont = cont;
    }

    public String getLongestWord1() {
        return longestWord1;
    }

    public void setLongestWord1(String longestWord1) {
        this.longestWord1 = longestWord1;
    }
}
