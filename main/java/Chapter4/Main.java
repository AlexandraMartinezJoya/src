package Chapter4;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        browseToUtopiaLoginPage();
        browseToALocalFile();
        reWriteUtopia();
    }

    public static void browseToUtopiaLoginPage() throws URISyntaxException, IOException {
        URI  utopiaUri = new URI("https://utopia-game.com/shared");
        Desktop.getDesktop().browse(utopiaUri);
    }

    public static void browseToALocalFile() throws IOException {
        File htmlFile = new File("C:\\Users\\za0ne\\IdeaProjects\\NewUtopia\\src\\html\\homepage.html");
        Desktop.getDesktop().browse(htmlFile.toURI());
    }

    public static void reWriteUtopia(){
        //TODO(David): please fix it .

    }
}
