package model.Player;

import model.Tile.Tile;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Tile> PlayerTiles;
    private List<Character> PlayerCharacters;
    boolean played;
    boolean finished;
    private String name;
    private int id, action;

    /**
     * Constructor.
     * <p>
     * Postcondition: Creates a new PlayerTiles list, PlayerCharacters List, sets the name, id, played, finished
     * and action of the player.
     */
    public Player(String name, int id) {

        PlayerTiles = new ArrayList<Tile>(0);
        PlayerCharacters = new ArrayList<Character>(4);
        this.name = name;
        this.id = id;
        this.played = false;
        this.finished = false;
        this.action = 0;
    }

    /**
     * Transformer: Changes played to True or False depending on b.
     * <p>
     * Postcondition: played is now set either to True or False.
     *
     * @param b Changes played value to True or False.
     */
    public void changePlayed(boolean b) {

        this.played = b;
    }

    /**
     * Transformer: Changes finished to True or False depending on b.
     * <p>
     * Postcondition: finished is now set either to True or False.
     *
     * @param b Changes finished value to True or False.
     */
    public void changeFinished(boolean b) {

        this.finished = b;
    }

    /**
     * Accessor: Returns the Players name.
     * <p>
     * Postcondition: The name has been returned.
     *
     * @return name The name of the Player.
     */
    public String getName() {

        return name;
    }

    /**
     * Transformer: sets the name of the Player.
     * <p>
     * Postcondition: The Player's name has been set.
     *
     * @param name name of the Player.
     */
    public void setName(String name) {

        this.name = name;
    }

    /**
     * Transformer: This method adds Tiles to the Players stash.
     * <p>
     * Postcondition: The Tile has been added to the stash.
     *
     * @param t Tile to add to Players stash.
     */
    public void AddToStash(Tile t) {

        PlayerTiles.add(t);
    }

    /**
     * Transformer: This method adds Character to the Players stash.
     * <p>
     * Postcondition: The Character has been added to the stash.
     *
     * @param c Character to add to Players stash.
     */
    public void AddCharacter(Character c) {

        PlayerCharacters.add(c);
    }

    /**
     * Transformer: This method removes a Character from the Players stash.
     * <p>
     * Postcondition: The Character has been removed from the stash.
     *
     * @param c Character to remove from Players stash.
     */
    public void RemoveCharacter(Character c) {

        PlayerCharacters.remove(c);
    }

    /**
     * Accessor: Counts the points of "p" Player.
     * <p>
     * Postcondition: Points have been calculated.
     *
     * @return returns the total points of the Player.
     */
    public int CountPoints() {

        int count = 0;
        return count;
    }

    /**
     * Accessor: Returns the Player's action
     * <p>
     * Postcondition: Player's action has been returned
     *
     * @return The Player's action
     */
    public int getAction() {

        return action;
    }

    /**
     * Transformer: Sets the Players action
     * <p>
     * Postcondition: The Players action has been set
     *
     * @param action What the Player chose to do this round
     */
    public void setAction(int action) {

        this.action = action;
    }
}