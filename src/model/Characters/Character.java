package model.Characters;

import javax.print.DocFlavor;

public abstract class Character {

    private boolean used;
    private int belongs_to;
    private String name;
    private String color;

    /**
     * Constructor
     * <p>
     * Postcondition: Creates a new card with "name" name
     *
     * @param id Player's id
     */
    public Character(int id, String name, String color) {

        setCardHolder(belongs_to);
        setName(name);
        setColor(color);
        changeUsed(false);
    }

    /**
     * Transformer: Sets the cards holder
     * <p>
     * Postcondition: Cards holder has been set
     *
     * @param id Player's id
     */
    public void setCardHolder(int id) {

        this.belongs_to = id;
    }

    /**
     * Transformer: Sets the cards color
     * <p>
     * Postcondition: Cards color has been set
     *
     * @param color color of card
     */
    public void setColor(String color) {

        this.color = color;
    }

    /**
     * Transformer: Sets the cards name
     * <p>
     * Postcondition: The name has been set
     *
     * @param name name of card
     */
    public void setName(String name) {

        this.name = name;
    }

    /**
     * Transformer: Changes the value of used to "b"
     * <p>
     * Postcondition: The variable used has been changed
     *
     * @param b true / false
     */
    public void changeUsed(boolean b) {

        this.used = b;
    }
}
