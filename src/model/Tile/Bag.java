package model.Tile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bag {

    private List<Tile> TotalTiles;

    /**
     * Constructor
     * <p>
     * Postcondition: Creates a new TotalTiles list.
     */
    public Bag() {

        TotalTiles = new ArrayList<Tile>(135);
    }

    /**
     * Transformer: Initializes all the Tiles.
     * <p>
     * Postcondition: The Tiles have been initialized.
     */
    public void initializeTiles() {

    }

    /**
     * Observer: This method adds Tiles to the Bag every time a Tile is created
     * <p>
     * Postcondition: The Tile has been added to the Bag
     *
     * @param t Tile to add in the Bag
     */
    public void AddTile(Tile t) {

        TotalTiles.add(t);
    }

    /**
     * Accessor: Removes the first Tile of the Bag
     * <p>
     * Postcondition: The Tile has been removed from the Bag
     *
     * @return The first Tile of the Bag
     */
    public Tile RemoveFirstTile() {

        return TotalTiles.remove(0);
    }
}
