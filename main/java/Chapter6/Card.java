package Chapter6;

import acm.util.RandomGenerator;

public class Card {

    /** Instance variables */
    private RandomGenerator rgen = RandomGenerator.getInstance();

    /**
     * @cardRank The rank of the card
     */
    private String cardRank;

    /**
     * @cardSuite The suite of the card
     */
    private String cardSuite;

    /**
     *  Creates a new Chapter6.Card object. In order to initialize it to random values, use the drawRandomCard method on the card
     */
    public Card(){
        this.cardRank = "";
        this.cardSuite = "";
    }

    /**
     * Creates a new Chapter6.Card object with the specified suite and rank.
     * @param  cardRank The card's rank as a String
     * @param cardSuite The card's suite number as String
     */
    public Card(String cardRank, String cardSuite) {
        this.cardRank = cardRank;
        this.cardSuite = cardSuite;
    }

    /**
     * Generates random values for the card rank and suite
     * @return Chapter6.Card
     */
    public Card drawRandomCard(){
       this.cardRank = generatreCardRank();
       this.cardSuite = generateCardSuite();
       return this;
    }

    /**
     * Creates a string identifying the card
     * @return String the string used to display the card
     */
    public String toString() {
        return this.cardRank + " of " + this.cardSuite;
    }

    /**
     * This method returns the card rank as a string
     * @return String the string with the card rank
     */
    public String getRank() {
        return this.cardRank;
    }

    /**
     * This method returns the card suite as a string
     * @return String Chapter6.Card suite
     */
    public String getSuite() {
        return this.cardSuite;
    }

    /**
     *  This method generates one of the specified card ranks randomly
     * @return String the card rank name
     */
    private String generatreCardRank() {
        int cardRankNumber = rgen.nextInt(1, 13);
        String cardRankName = "";
        switch (cardRankNumber) {
            case 1:
                cardRankName = "Ace";
                break;
            case 2:
                cardRankName = "Two";
                break;
            case 3:
                cardRankName = "Three";
                break;
            case 4:
                cardRankName = "Four";
                break;
            case 5:
                cardRankName = "Five";
                break;
            case 6:
                cardRankName = "Six";
                break;
            case 7:
                cardRankName = "Seven";
                break;
            case 8:
                cardRankName = "Eight";
                break;
            case 9:
                cardRankName = "Nine";
                break;
            case 10:
                cardRankName = "Ten";
                break;
            case 11:
                cardRankName = "Jack";
                break;
            case 12:
                cardRankName = "Queen";
                break;
            case 13:
                cardRankName = "King";
                break;
        }
        return cardRankName;
    }

    /**
     *  This method generates one of the specified card suites randomly
     * @return String the card suite name
     */
    private String generateCardSuite() {
        int cardSuiteNumber = rgen.nextInt(6, 9);
        String cardSuiteName = "";
        switch (cardSuiteNumber) {
            case 6:
                cardSuiteName = "Clubs";
                break;
            case 7:
                cardSuiteName = "Diamonds";
                break;
            case 8:
                cardSuiteName = "Hearts";
                break;
            case 9:
                cardSuiteName = "Spades";
                break;
        }
        return cardSuiteName;
    }

}
