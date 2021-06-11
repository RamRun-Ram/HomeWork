package home;


public class HelloOtus {
    public static void main(String[] args) {
        String INPUT_TEXT = "Hello World! Hello All! Hi World!";
        Multiset<String> multiset = TreeMultiset.create(Arrays.asList(INPUT_TEXT.split(" ")));
        System.out.println(multiset.elementSet());
    }
}

