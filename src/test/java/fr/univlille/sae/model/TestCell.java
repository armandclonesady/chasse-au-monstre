package fr.univlille.sae.model;

import fr.univlille.iutinfo.cam.player.perception.ICellEvent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class TestCell {

    Cell c1;
    Cell c2;
    Cell c3;

    @BeforeEach
    void init() {
        c1 = new Cell(ICellEvent.CellInfo.EXIT);
        c2 = new Cell('X');
        c3 = new Cell(ICellEvent.CellInfo.EXIT, 5);
    }

    @Test
    void testEquals() {
        assertNotEquals(c1, c3);
        assertEquals(c1, c2);
    }

    @Test
    void testRender(){
        assertEquals(" ", Cell.render(ICellEvent.CellInfo.EMPTY, 5));
        assertEquals("5", Cell.render(ICellEvent.CellInfo.MONSTER, 5));
        assertEquals("X", Cell.render(ICellEvent.CellInfo.EXIT, 5));
        assertEquals("W", Cell.render(ICellEvent.CellInfo.WALL, 5));
        assertEquals("H", Cell.render(ICellEvent.CellInfo.HUNTER, 5));
    }

}
