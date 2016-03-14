package os.windows.loadwindow;

import java.net.URL;
import java.util.ResourceBundle;

import de.jensd.fx.glyphs.GlyphsDude;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;

public class LoadWindowController implements Initializable{

	@FXML Button signInButton;
	@FXML Button loadSettingsButton;
	@FXML Button serverSettingsButton;
	
	@FXML AnchorPane leftPane;
	@FXML AnchorPane rightPane;
	@FXML SplitPane splitPane;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		GlyphsDude.setIcon(signInButton, FontAwesomeIcon.SIGN_IN);
		GlyphsDude.setIcon(loadSettingsButton, FontAwesomeIcon.COG);
		GlyphsDude.setIcon(serverSettingsButton, FontAwesomeIcon.SERVER);
		
		leftPane.maxWidthProperty().bind(splitPane.widthProperty().multiply(0.5));
		rightPane.maxWidthProperty().bind(splitPane.widthProperty().multiply(0.5));
	}
	
}
