package nl.tudelft.jpacman.board;

import nl.tudelft.jpacman.sprite.Sprite;

/**
 * Basic implementation of square.
 *
 * @author Jeroen Roosen 
 */
class BasicSquare extends Square {

    /**
     * Creates a new basic square.
     */
    BasicSquare() {
        super();
    }
 /**
     * This is the main method.
     */
    @Override
    public boolean isAccessibleTo(Unit unit) {
        return true;
    }

    @Override
    @SuppressWarnings("return.type.incompatible")
    public Sprite getSprite() {
        return null;
    }
}
