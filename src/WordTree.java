import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WordTree {
    private String inputFileName;

    public WordTree(String inputFileName) {
        this.inputFileName = inputFileName;
    }

    public Tree fillTree() throws IOException {
        Tree tree = new Tree();

        File input = new File(this.inputFileName);
        FileReader fr = new FileReader(input);
        BufferedReader reader = new BufferedReader(fr);

        String line;

        while ((line = reader.readLine()) != null) {
            String[] words = line.split("[ \\-\\?\\.]");
            for (String word : words) {
                if (!word.isEmpty()) {
                    tree.add(word);
                }
            }
        }

        reader.close();

        return tree;

    }
}