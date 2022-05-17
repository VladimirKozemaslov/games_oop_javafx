package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

public class BishopBlackTest extends TestCase {

    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        assertEquals(bishopBlack.position(), Cell.C8);
    }

    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        assertEquals(bishopBlack.copy(Cell.D7).position(), Cell.D7);
    }

    public void testWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] bishopWay = bishopBlack.way(Cell.G5);
        Cell[] testWay = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertEquals(bishopWay.length, testWay.length);
        for (int i = 0; i < bishopWay.length; i++) {
            assertEquals(bishopWay[i], testWay[i]);
        }
    }

    public void testIsDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell dest = Cell.A3;
        assertTrue(bishopBlack.isDiagonal(bishopBlack.position(), dest));
    }
}