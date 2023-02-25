package controller;

import model.Board.Board;
import model.Board.Turn;
import model.Player.Player;
import model.Tile.Bag;
import model.Tile.Tile;
import view.GraphicUI;

import javax.swing.text.View;
import java.util.ArrayList;

/**
 * Constructor.
 * <p>
 * Postcondition: Creates a new Controller with 4 players, new Board, new Turn and new Tiles
 */
public class Controller {

    private Player P1, P2, P3, P4;
    private ArrayList<Player> players;
    private Bag bag;
    private Turn turn;
    private Board board;
    private GraphicUI view;
    private boolean hasRemoved4;
    private boolean hasTaken2;
    private boolean hasPlayedCharacter;
    private boolean hasFinished;
    private int PlayerCount = 0;

    public Controller() {

        view = new GraphicUI();
        board = new Board();
        turn = new Turn(1);
        bag = new Bag();
        players = new ArrayList<Player>();
        P1 = new Player("George", 1);
        P2 = new Player("Panagiotis", 2);
        P3 = new Player("Marios", 3);
        P4 = new Player("Nikos", 4);
        players.add(P1);
        players.add(P2);
        players.add(P3);
        players.add(P4);
        bag.initializeTiles();
        board.initializePlayersCharacters(P1, "kitrino");
        board.initializePlayersCharacters(P2, "kokkino");
        board.initializePlayersCharacters(P3, "mple");
        board.initializePlayersCharacters(P4, "mauro");
        hasRemoved4 = false;
        hasTaken2 = false;
        hasPlayedCharacter = false;
        hasFinished = false;
        PlayerCount = players.size();
    }

    /**
     * Transformer: Starts the game. Every Player plays until the door is sealed.
     *
     * Postcondition: Every Player played and now the door is seal, meaning that the game is now over and the
     *      winner is announced
     */
    public void Start() {

    }

    /**
     * Observer: Returns True if the door is sealed, False otherwise
     *
     * Postcondition: True or False have been returns
     *
     * @return True if the door is sealed, False otherwise
     */
    public boolean isSealed() {

        return false;
    }

    /**
     * Transformer: Changes the round
     *
     * Postcondition: Round has been successfully changed
     *
     * @param id id of Player playing this turn. Cannot exceed 4 (max Players)
     */
    public void nextTurn(int id) {

    }


}
