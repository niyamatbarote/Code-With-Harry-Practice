// String in java is a mutable sequence of characters privided by java.language
// package, designed for efficient string manipulation .
// Unlike the immutable string class , which creates new object for every
// modification , String builder allows in place modifications,
// making it more memory efficient & faster .
// String builder comes with many inbuilt Functions Which will help to perform
// modification.
//

public class StringBuild {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(" Tony");
        sb.append('e');
        sb.append('l');
        sb.append('l');
        sb.append('o');
        sb.insert(3, 'S');
        sb.setCharAt(0, 'b');
        sb.setCharAt(1, 'y');
        sb.delete(3, 6);

        System.out.println(sb);
    }
}

// Substring : reverse the string