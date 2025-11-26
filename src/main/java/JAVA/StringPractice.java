public class StringPractice {

    public static void main(String[] args) {

        // * Q) Write a java prigram to convert a string into lowet case */
        String ab = new String("NIYAMAT Barote");
        System.out.println(ab.toLowerCase());

        // * Q) Write a java prigram to replace spaces with underscores */
        System.out.println(ab.replace(" ", "_"));

        // * Q) Wrtie a java program to fill in a letter template which looks like
        // below: */
        // letter = "Dear <|Name|>, Thanks a lot"
        // replace <|Nmae|> with a string ( Any Name )
        String name = new String("Dear Niyamat Thanks a lot");
        System.out.println(name);
        System.out.println(name.replace("Niyamat", "Aman"));

        // Q) write a java prigram to detect double and triple space in the string
        String name1 = new String("Hii  my   Name   is Niyamat");
        System.out.println(name1.indexOf("  "));
        System.out.println(name.indexOf("   "));

        //Q) write a java program to fromat the following letter using escape sequence characters
        //letter = "Dear Harry, this java course is nice.Thanks "
        System.out.println("Deat Harry,\nthis Java course is nice.\t\n\tThanks!");

    }
}
