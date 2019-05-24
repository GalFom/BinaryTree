import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        WordTree wordTree = new WordTree("C:\\Users\\Галина\\IdeaProjects\\BinaryTree\\src\\input.txt");
        Tree tree = wordTree.fillTree();

        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        if (tree.has(str)) {
            System.out.println(str + " содержится в файле");
        }
        else {
            System.out.println(str + " не содержится в файле");
        }
    }
}
