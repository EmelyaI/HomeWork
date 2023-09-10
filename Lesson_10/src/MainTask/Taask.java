package MainTask;

public class Taask {
    private String str;
    static String one(String str)
    {
        str = str.substring(0,13);
        str = str.replaceAll("[a-z]", "");
        str = str.replaceAll("[A-Z]", "");
        str = str.replaceAll("--","-");
        System.out.println("1: " + str);
        return str;
    }

    static String two(String str)
    {
        String s = str.substring(0,17);
        s = s.replaceAll("[a-z]", "*");
        s = s.replaceAll("[A-Z]", "*");
        str = str.substring(17);
        str = String.join("",s,str);
        System.out.println("2: " + str);
        return str;
    }

    static String three(String str)
    {
        str = str.replaceAll("[0-9]","/");
        str = str.toLowerCase();
        StringBuilder sttr = new StringBuilder(str);
        sttr.delete(0, 5);
        sttr.replace(3,9,"/");
        sttr.delete(7,8);
        str = sttr.toString();
        System.out.println("3: " + str);
        return str;
    }
    static void four(String str)
    {
        str = str.toUpperCase();
        String substring1 = "ABC";
        System.out.println("4: " + str.contains(substring1));
    }
    static void five(String str)
    {
        System.out.println("5: " + str.startsWith("555"));
    }
    static void six(String str)
    {
        System.out.println("6: " + str.endsWith("1a2b"));
    }

    public Taask(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}