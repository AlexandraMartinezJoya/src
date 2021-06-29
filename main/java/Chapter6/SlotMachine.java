package Chapter6;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

/**
 * Pay table:
 *  BAR         BAR         BAR                     pays       $250
 *  BELL       BELL        BELL/BAR            pays         $20
 *  PLUM      PLUM       PLUM/BAR            pays        $14
 *  ORANGE  ORANGE   ORANGE              pays        $10
 *  CHERRY  CHERRY    CHERRY               pays         $7
 *  CHERRY  CHERRY    *                         pays         $5
 *  CHERRY  *              *                         pays         $2
 */

public class SlotMachine extends ConsoleProgram {

    /**
     * Private constants
     */
    private final String BAR = "BAR";

    private final String BELL = "BELL";

    private final String PLUM = "PLUM";

    private final String ORANGE = "ORANGE";

    private final String LEMON = "LEMON";

    private final String CHERRY = "CHERRY";



    /**
     * Instance variables
     */
    RandomGenerator rgen = RandomGenerator.getInstance();

    private int INITIAL_MONEY = 50;

    public void run(){
        String answer = readLine("Would you like instructions?");
        if(answer.equals("no")) {
            playSlots();
        } else {
            printInstructions();
            playSlots();
        }
    }

    private void printInstructions(){
        println("A round costs $1");
        println("/**\n" +
                " * Pay table:\n" +
                " *  BAR         BAR         BAR                     pays       $250\n" +
                " *  BELL       BELL        BELL/BAR            pays         $20\n" +
                " *  PLUM      PLUM       PLUM/BAR            pays        $14\n" +
                " *  ORANGE  ORANGE   ORANGE              pays        $10\n" +
                " *  CHERRY  CHERRY    CHERRY               pays         $7\n" +
                " *  CHERRY  CHERRY    *                         pays         $5\n" +
                " *  CHERRY  *              *                         pays         $2\n" +
                " */");
    }

    private void playSlots(){
        int money = INITIAL_MONEY;
        String answer = readLine("You have " + money + ". Would you like to play?" );
        while(answer.equals("yes")){
            money = getBalanceAfterOneRoundOfSlots(money);
            answer = readLine("You have " + money + ". Would you like to play?" );
        }
    }

    private int getBalanceAfterOneRoundOfSlots(int moneyCount){
        moneyCount = moneyCount - 1;
        int spinEarnings = getSpinEarnings(moneyCount);
        moneyCount = moneyCount + spinEarnings;
        return moneyCount;
    }

    private int getSpinEarnings(int moneyCount){
        int firstColumn = rgen.nextInt(1, 6);
        int secondColumn = rgen.nextInt(1, 6);
        int thirdColumn = rgen.nextInt(1, 6);

        int winnings = getWinnings(firstColumn, secondColumn, thirdColumn);
        printRoundResults(firstColumn, secondColumn, thirdColumn);
        println(" ---  $" + winnings);

        return winnings;
    }

    private void printRoundResults(int firstColumn, int secondColumn, int thirdColumn) {
        String roundResults = "";
        String firstColumnValue = getSymbol(firstColumn);
        String secondColumnValue = getSymbol(secondColumn);
        String thirdColumnValue = getSymbol(thirdColumn);
        roundResults = firstColumnValue + "      " + secondColumnValue + "      " + thirdColumnValue + "      ";
        print(roundResults);
    }

    private String getSymbol(int number) {
        return  switch (number) {
            case 1 -> BAR;
            case 2 -> BELL;
            case 3 -> PLUM;
            case 4 -> ORANGE;
            case 5 -> CHERRY;
            default -> LEMON;
        };
    }

    private int getWinnings(int firstColumn, int secondColumn, int thirdColumn){
        int winnings = 0;
        int columnTotal = firstColumn + secondColumn + thirdColumn;
        if ( firstColumn != 5 || secondColumn != 5 || thirdColumn != 5) {
            if(firstColumn == 1 && secondColumn == 1 && thirdColumn == 1) {
                winnings = 250;
            } else if (firstColumn ==2  && secondColumn == 2 && (thirdColumn ==2 || thirdColumn == 1)){
                winnings  = 20;
            } else if (firstColumn == 3 && secondColumn == 3 && (thirdColumn == 3 || thirdColumn == 1)) {
                winnings = 14;
            } else if (firstColumn == 4 && secondColumn == 4 && thirdColumn == 4) {
                winnings = 10;
            }
        }
        if (firstColumn == 5 || secondColumn == 5 || thirdColumn == 5) {
            if (firstColumn == 5 && secondColumn == 5 && thirdColumn == 5) {
                winnings =  7;
            } else if ((firstColumn == 5 && secondColumn == 5) || (firstColumn == 5 && thirdColumn == 5) || (secondColumn == 5 && thirdColumn == 5)){
                winnings = 5;
            } else {
                winnings = winnings + 2;
            }
        }
        return winnings;
    }
}
