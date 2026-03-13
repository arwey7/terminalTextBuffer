package fr.epita.terminalTextBuffer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TerminalTextBufferTest {
    // constructor
    @Test
    void createBufferBasic() {
        assertDoesNotThrow(() -> { var buffer = new TerminalTextBuffer(1, 1, 1);});
        // var buffer = new TerminalTextBuffer(1, 1, 1);
        // TODO: check defaults values after implementing getters and setters
    }

    @Test
    void createBufferIllegal() {
        assertThrows(IllegalArgumentException.class, () -> { var buffer = new TerminalTextBuffer(-1, 1, 1);});
        assertThrows(IllegalArgumentException.class, () -> { var buffer = new TerminalTextBuffer(1, -1, 1);});
        assertThrows(IllegalArgumentException.class, () -> { var buffer = new TerminalTextBuffer(-1, -1, 1);});
    }
}