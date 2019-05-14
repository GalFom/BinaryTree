public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.add("qwe");
        tree.add("asd");
        tree.add("123");

        if(tree.has("123")) {
            System.out.println("Has 123");
        } else {
            System.out.println("Has not 123");
        }

    }
}
