package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class BoardTest {

    private Board board;

    @BeforeEach
    void setUp() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = new BasicSquare();
        board = new Board(grid);
    }

    @Test
    void verifyBoardSize() {
        assertThat(board.getWidth()).isEqualTo(1);
        assertThat(board.getHeight()).isEqualTo(1);
    }
    @Test
    void squareAtReturnsNullSquare() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = null;
        board = new Board(grid);
        assertThat(board.squareAt(0, 0)).isNull();
    }
}
