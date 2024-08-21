
package TestWord;

import com.mycompany.prjunittestingprog1b.Guessing;
import com.mycompany.prjunittestingprog1b.Words;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class TestWord 
{
    
    public TestWord() 
    {
    }
    
    private Guessing guessing;
    
    @BeforeEach
    public void setUP()
    {
        guessing = new Guessing();
    }
    
    @Test
    public void CorrectArrayData()
    {
        //Words correctData = new Words();
        
        String[] expectedWords = {"cat", "dog", "bird", "mouse"};
        assertArrayEquals(expectedWords, guessing.getWords(),
                "The word array does not contain the expected data.");
        
//         String[] Expected = {"cat", "dog", "bird", "mouse"};
//         String[] Actual = correctData.getWords();
//        
//        assertEquals(Expected,Actual);

    }
    
    @Test
    public void CorrectGuessMethod()
    {
        assertTrue(guessing.TestWord("cat"),
        "The guess method should return true for a word that is in the array.");
    }
    
    @Test
    public void IncorrectQuessMethod()
    {
        assertFalse(guessing.TestWord("elephant"),
                "The guess method should return false for a word that is not in the array.");
    }
}
