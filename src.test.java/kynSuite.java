import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import com.me.kyn.music.TestGuitarInstrument;
import com.me.kyn.music.TestNoteGenerator;

@RunWith(Suite.class)
@Suite.SuiteClasses({
TestNoteGenerator.class, 
TestGuitarInstrument.class
})
public class kynSuite {
//
}
