/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Coursework;

import org.junit.Test;
import static org.junit.Assert.*;

public class Dec2HexTest {
    @Test public void validateInput() {
        assertEquals("2", Dec2Hex.Convert(new String[]{"2"}));
        assertEquals("F", Dec2Hex.Convert(new String[]{"15"}));
    }
}