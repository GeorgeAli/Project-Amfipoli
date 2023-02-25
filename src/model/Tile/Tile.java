package model.Tile;

public abstract class Tile extends Bag {

    private String type;

    /**
     * Constructor
     * <p>
     * Postcondition: Creates a Tile with "type" type
     *
     * @param type type of Tile
     */
    public Tile(String type) {

        setType(type);
    }

    /**
     * Accessor: Returns the type of the Tile
     * <p>
     * Postcondition: Tile's value has been returned
     *
     * @return String type
     */
    public String getType() {

        return type;
    }

    /**
     * Transformer: Sets the Tiles type
     * <p>
     * Postcondition: Tiles type has been set
     *
     * @param type type of Tile
     */
    public void setType(String type) {

        this.type = type;
    }
}