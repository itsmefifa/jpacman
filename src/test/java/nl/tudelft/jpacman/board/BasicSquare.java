package nl.tudelft.jpacman.board;

import nl.tudelft.jpacman.sprite.Sprite;

/**
 * Basic implementation of square.
 * This is the main method.
 * @author Jeroen Roosen 
 */
class BasicSquare extends Square {
// This is the main method.
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
