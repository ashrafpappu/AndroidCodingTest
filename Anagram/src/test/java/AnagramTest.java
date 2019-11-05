import com.example.pappu.anagram.AnagramChecker;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnagramTest {


    static AnagramChecker anagramChecker;

    @BeforeAll
    static void init(){
        anagramChecker = new AnagramChecker();
    }


    @DisplayName("Object Null check")
    @Test
    public void nullCheckOfAnagram(){

        assertThrows(NullPointerException.class, () -> {
            anagramChecker.isStringsAreAnagram(null,"sdf");
        });

        assertThrows(NullPointerException.class, () -> {
            anagramChecker.isStringsAreAnagram(null,null);
        });

        anagramChecker = null;
        assertThrows(NullPointerException.class, () -> {
            anagramChecker.isStringsAreAnagram("sdfs","sdf");
        });
    }

    @DisplayName("String length check")
    @Test
    public void anagramStringLengthTest(){
        assertFalse(anagramChecker.isStringsAreAnagram("eat","eater")," Strings length mismatch");
    }

    @DisplayName("Anagram Test")
    @Test
    public void anagramTest(){
        assertTrue(anagramChecker.isStringsAreAnagram("light","ightl")," Two Strings are  anagram");
        assertFalse(anagramChecker.isStringsAreAnagram("eat","rat")," Two Strings are not anagram");
    }


    @DisplayName("Case sensivity check")
    @Test
    public void anagramCasesensitiveTest(){

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            anagramChecker.isStringsAreAnagram("Eat","eat");
        });

    }


    @DisplayName("Number and special character check")
    @Test
    public void anagramNumberAndSpecialCharacterTest(){

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            anagramChecker.isStringsAreAnagram("ea1","ea1");
        });

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            anagramChecker.isStringsAreAnagram("###","###");
        });

    }
}
