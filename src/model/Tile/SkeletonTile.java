package model.Tile;

public class SkeletonTile extends FindingTile {

    private int part; //     0 = Upper --- 1 = Lower
    private int category; // 0 = Parent -- 1 = Child

    /**
     * Constructor
     * <p>
     * Postcondition: Creates a new SkeletonTile with "type" type, "part" Upper or Lower body, "category"
     * Parent or Child
     *
     * @param type     type of Tile
     * @param category Parent or Child
     * @param part     adult or child part of Skeleton
     */
    public SkeletonTile(String type, int category, int part) {

        super(type);
        this.category = category;
        this.part = part;
    }
}
