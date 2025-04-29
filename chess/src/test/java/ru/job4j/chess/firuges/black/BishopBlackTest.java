package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import static org.assertj.core.api.Assertions.assertThat;

class BishopBlackTest {

    @Test
    void positionTest() {
        BishopBlack bishopBlack1 = new BishopBlack(Cell.C1);
        Cell result = bishopBlack1.position();
        Cell expected = Cell.C1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void copyTest() {
        BishopBlack bishopBlack1 = new BishopBlack(Cell.C1);
        Figure result = bishopBlack1.copy(Cell.E3);
        Cell expectred = Cell.E3;
        assertThat(result.position()).isEqualTo(expectred);
    }

    @Test
    void wayTest() {
        BishopBlack bishopBlack1 = new BishopBlack(Cell.C1);
        Cell[] result = bishopBlack1.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(result).isEqualTo(expected);

    }


}