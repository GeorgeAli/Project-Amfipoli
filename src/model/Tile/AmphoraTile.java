package model.Tile;

public class AmphoraTile extends FindingTile {

    private String color;

    /**
     * Constructor
     * <p>
     * Postcondition: Creates a new AmphoraTile with "type" type, "color" color
     *
     * @param type  type of Tile
     * @param color color of Tile
     */
    public AmphoraTile(String type, String color) {

        super(type);
        this.color = color;
    }
}