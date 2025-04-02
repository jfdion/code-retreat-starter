package ca.csfoy.coderetreat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class CellTest {

    @Test
    public aNewCellIsDead() {
        Cell cell = new Cell();

        assertFalse(cell.isDead());
    }
}
