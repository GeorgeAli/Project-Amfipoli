package model.Board;

import model.Tile.Tile;

import java.util.List;

public class Turn {

    private int turn;

    /**
     * Constructor
     * <p>
     * Postcondition: turn has been set
     *
     * @param id Player's id
     */
    public Turn(int id) {

        this.turn = id;
    }

    /**
     * Transformer: Removes 4 Tiles from the Bag and places then on the Board (any Type of Tile).
     * <p>
     * Postcondition: Tiles have been removed and placed correctly
     */
    public void Remove4AndPlace(Board b) {


    }

    /**
     * Transformer: Removes up to 2 Tiles from the board of the same Type and places them on the Player's Tile stash
     * <p>
     * Postcondition: Tiles have been removed successfully
     */
    public void Take2FromBoard(List<Tile> PlayerTiles) {


    }

    /**
     * Transformer: Uses a character card from the Player's Character stash
     * <p>
     * Postcondition: Character has been used and removed successfully
     *
     * @param PlayerCharacters List of Player's Characters
     * @param character        The character the Player used
     */
    public void UseCharacter(List<Character> PlayerCharacters, Character character) {


    }

    /**
     * Accessor: Returns the id of the Player that is playing
     * <p>
     * Postcondition: Id has been returned
     *
     * @return Player id
     */
    public int getTurn() {

        return this.turn;
    }
}