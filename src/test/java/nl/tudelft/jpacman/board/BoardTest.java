package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
 /**
     * This is the main method.
     */
public class BoardTest {

    private Board board;
 /**
     * This is the main method.
     */
    @BeforeEach
    void setUp() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = new BasicSquare();
        board = new Board(grid);
    }
 /**
     * This is the main method.
     */
    @Test
    void verifyBoardSize() {
        assertThat(board.getWidth()).isEqualTo(1);
        assertThat(board.getHeight()).isEqualTo(1);
    }
 /**
     * This is the main method.
     */
    @Test
    void squareAtReturnsCorrectSquare() {
        assertThat(board.squareAt(0, 0)).isInstanceOf(BasicSquare.class);
    }
 /**
     * This is the main method.
     */
    @Test
    void invariantHolds() {
        assertThat(board.invariant()).isTrue();
    }
 /**
     * This is the main method.
     */
    @Test
    void squareAtReturnsNullSquare() {
        Square s1 = new BasicSquare();
        Square[][] grid = new Square[1][1];
        grid[0][0] = s1;
        Board board = new Board(grid);
        assertThat(board.squareAt(0, 0)).isEqualTo(grid[0][0]);
    }

}
