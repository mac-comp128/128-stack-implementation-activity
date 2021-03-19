import stackImplementation.linkedStack.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class LinkedStackTest {

    @Test
    public void testToString(){
        LinkedStack<Character> testStack = new LinkedStack<Character>();

        testStack.push('!');
        testStack.push('t');
        testStack.push('l');
        testStack.push('u');
        testStack.push('s');
        testStack.push('e');
        testStack.push('R');

        assertEquals("[R, e, s, u, l, t, !]", testStack.toString());
        assertFalse(testStack.isEmpty());
        assertEquals("[R, e, s, u, l, t, !]", testStack.toString()); // calling toString should not modify the contents of the stack
    }
}
