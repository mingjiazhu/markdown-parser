import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;
public class MarkdownParseTest {
    String content;

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() throws IOException {   
        MarkdownParse m = new MarkdownParse();
        List l = List.of("https://something.com", "some-thing.html");
        Path p = Paths.get("test-file.md");
        String st = Files.readString(p);
        assertEquals(l, m.getLinks(st));
    }

    @Test
    public void TestLinksImage()throws IOException{   
        content = Files.readString(Path.of("testImage.md"));
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals("tests if the links are the same", 0, links.size());
    }

    @Test
    public void TestLinksNoParantheses()throws IOException{   
        content = Files.readString(Path.of("testNoParantheses.md"));
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals("tests if the links are the same", 0, links.size());
    }
    @Test
    public void TestLinksNoBrackets()throws IOException{   
        content = Files.readString(Path.of("testNoBracket.md"));
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals("tests if the links are the same", 0, links.size());
    }
    @Test
    public void TestLinksNoLink()throws IOException{   
        content = Files.readString(Path.of("testNoLink.md"));
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals("tests if the links are the same", 0, links.size());
    }

    @Test
    public void testGetLinks2()throws IOException{   
        MarkdownParse m = new MarkdownParse();
        List l = List.of("https://something.com", "some-thing.html");
        Path p = Paths.get("test-file.md");
        String st = Files.readString(p);
        assertEquals(l, m.getLinks(st));
    }



}