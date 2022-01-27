// javac -cp ".;lib\junit-4.12.jar;lib\hamcrest-core-1.3.jar" MarkdownParseTest.java  
// jjava -cp ".;lib/junit-4.12.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest  

import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void parseTest() throws IOException {
        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://something.com");
        expected.add("some-page.html");
        assertEquals(expected, links);
    }

    @Test
    public void parseTest2() throws IOException {
        Path fileName = Path.of("test-file2.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, links);
    }

    @Test
    public void parseTest3() throws IOException {
        Path fileName = Path.of("test-file3.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, links);
    }

    @Test
    public void parseTest4() throws IOException {
        Path fileName = Path.of("test-file4.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://something.com");
        assertEquals(expected, links);
    }
}