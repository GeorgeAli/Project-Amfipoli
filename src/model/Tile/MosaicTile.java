package model.Tile;

public class MosaicTile extends FindingTile {

    private String color;

    /**
     * Constructor
     * <p>
     * Postcondition: Creates a new MosaicTile with "type" type, "color" color
     *
     * @param type  type of Tile
     * @param color color of Tile
     */
    public MosaicTile(String type, String color) {

        super(type);
        this.color = color;
    }
}
