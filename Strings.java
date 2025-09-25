//* IN JAVA STRINGS ARE "CASE SENSITIVE" */

public class Strings {

    public static void main(String[] args) {

        String name = "Niyamat";

        System.out.println(name);
        // length
        System.out.println(name.length());
        // Index Number
        System.out.println(name.charAt(0));
        // Lower Case
        System.out.println(name.toLowerCase());
        // Upper Case
        System.out.println(name.toUpperCase());

        String a = "         Aman         ";
        System.out.println(a);
        // Trimming
        System.out.println(a.trim());
        // Substring = beginInedex is "INCLUDED" & end Index is " EXCLUDED "
        // NOTE: index starts from 0
        System.out.println(name.substring(4));
        System.out.println(name.substring(0));
        System.out.println(name.substring(1, 6));
        System.out.println(name.substring(0, 07));

        // Replace
        System.out.println(name.replace('n', 'k')); // note* CASE SENSITIVE**
        System.out.println(name.replace('N', 'K'));
        System.out.println(name.replace("Niy", "Apk"));
        System.out.println(name.replace("N", "Omya"));

        // Starts with & Ends With
        System.out.println(name.startsWith("Niy"));
        System.out.println(name.startsWith("niy"));// *Note */
        System.out.println(name.endsWith("mat"));
        

        // Index Of :
        // * if o/p is (-1) then "there's no match" */
        System.out.println(name.indexOf("a"));// Note: there are 2 As;
        System.out.println(name.indexOf("a", 4));
        System.out.println(name.indexOf("mat"));

        // LastIndexOf:- it traverses from Right to Left
        System.out.println(name.lastIndexOf("t"));
        System.out.println(name.lastIndexOf("a", 5));
        System.out.println(name.lastIndexOf("a", 4));

        // Equals:
        System.out.println(name.equals("Niyamat"));
        System.out.println(name.equals("NiyMat"));
        System.out.println(name.equalsIgnoreCase("niyamat"));

    }
}
