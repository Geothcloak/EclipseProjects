import org.junit.Before;
import org.junit.Test;

public class FlaskModsTest {
	FlaskMods flaskMods;
	
	@Before
	public void init(){
		flaskMods = new FlaskMods();
	}
	@Test
	public void canChanceAllMods(){
		flaskMods.ChanceAllMods();
	}
}
