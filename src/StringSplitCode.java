public class StringSplitCode {
    public static void main(String[] args)
    {
        String str1 = "This is my Java Code File & this is going to be success.";
        String[] arraystring;

        arraystring = str1.split(" ");
        for (String s : arraystring) {
            System.out.println(s);
        }
    }
}