import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.junit.*;
public class MarkdownParseTest {

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

}