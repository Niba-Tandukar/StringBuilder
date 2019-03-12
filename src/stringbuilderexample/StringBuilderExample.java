package stringbuilderexample;

public class StringBuilderExample {

    public static void main(String[] args) {
        
        String forward="hello world!!!" ;
        StringBuilder sbl = new StringBuilder();
        sbl.append(forward);
        StringBuilder reversesb = sbl.reverse();
        String reverse = reversesb.toString();
        
        System.out.println(forward);
        System.out.println(reverse);
    
    }
    
}