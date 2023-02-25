package model.Board;

import model.Player.Player;
import model.Tile.*;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<MosaicTile> Mosaic_space;
    private List<StatueTile> Statue_space;
    private List<AmphoraTile> Amphora_space;
    private List<SkeletonTile> Skeleton_space;
    private List<LandslideTile> Entrance_space;

    /**
     * Constructor.
     *
     * Postcondition: Initializes the Mosaic_space list, Statue_space List, Amphora_space List, Skeleton_space List,
     *          Entrance_space List and creates and new Board object.
     */
    public Board() {

        Mosaic_space = new ArrayList<MosaicTile>(27);
        Statue_space = new ArrayList<StatueTile>(24);
        Amphora_space = new ArrayList<AmphoraTile>(30);
        Skeleton_space = new ArrayList<SkeletonTile>(30);
        Entrance_space = new ArrayList<LandslideTile>(24);
    }

    /**
     * Observer: This method adds Mosaics to the Board
     * <p>
     * Postcondition: The Mosaic has been added to the Board
     *
     * @param mosaic Mosaic to add in the board
     */
    public void addMosaicTile(MosaicTile mosaic) {

        Mosaic_space.add(mosaic);
    }

    /**
     * Observer: This method adds statues to the Board
     * <p>
     * Postcondition: The statue has been added to the Board
     *
     * @param statue Statue to add in the board
     */
    public void addStatueTile(StatueTile statue) {

        Statue_space.add(statue);
    }

    /**
     * Observer: This method adds amphora to the Board
     * <p>
     * Postcondition: The amphora has been added to the Board
     *
     * @param amphora Amphora to add in the board
     */
    public void addAmphoraTile(AmphoraTile amphora) {

        Amphora_space.add(amphora);
    }

    /**
     * Observer: This method adds skeletons to the Board
     * <p>
     * Postcondition: The skeleton has been added to the Board
     *
     * @param skeleton Skeleton to add in the board
     */
    public void addSkeletonTile(SkeletonTile skeleton) {

        Skeleton_space.add(skeleton);
    }

    /**
     * Observer: This method adds landslides to the Board
     * <p>
     * Postcondition: The landslide has been added to the Board
     *
     * @param landslide Landslide to add in the Board
     */
    public void addLandslideTile(LandslideTile landslide) {

        Entrance_space.add(landslide);
    }

    /**
     * Transformer: Removes 4 Tiles from the Bag and adds them to their respective positions (can't be landslide Tiles)
     * <p>
     * Postcondition: 4 Tiles removed and placed correctly
     */
    public void PlaceTiles() {

    }

    /**
     * Transformer: Initializes the Player's Character stash
     * <p>
     * Postcondition: The Player's Character stash has been initialized
     *
     * @param p Player we wish to add Character
     */
    public void initializePlayersCharacters(Player p, String color) {

    }

    /**
     * Observer: Returns True if all 16 landslide Tiles are placed. Otherwise returns False
     * <p>
     * Postcondition: True or False has been returned
     *
     * @return False if not, True otherwise
     */
    public boolean isChamberClosed() {

        return false;
    }

    /**
     * Accessor: Counts all the points of the Player p
     * <p>
     * Postcondition: Points have been returned
     *
     * @param p The Player we wish to count the points
     * @return the total points
     */
    public int PointCount(Player p) {

        int count = 0;
        return count;
    }
}
