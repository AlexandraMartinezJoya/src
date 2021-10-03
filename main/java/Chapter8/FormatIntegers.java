import acm.program.ConsoleProgram;

public class FormatIntegers extends ConsoleProgram {

    public void run(){
        println("This program separates integers by adding commas after every 3 digits.");
        int number = readInt("Enter a number: ");
        int SENTINEL = 0;
        while(number != SENTINEL){
            String formattedInt = formatInteger(number);
            println(formattedInt);
            number = readInt("Enter a number: ");
        }
    }

    private String formatInteger(int number){
        String numberAsString = "" + number;
        int lengthCurrent =  numberAsString.length() -1;
        String alreadyFormatted = "";
        String loopPositions = defineLoopPosition(lengthCurrent);
        for(int i = 0; i <= lengthCurrent; i++){
            if(lengthCurrent <= 2){
                alreadyFormatted = numberAsString;
            } else if (lengthCurrent < 10) {
                     switch (loopPositions){
                         case "1" : String partTwo = "," + numberAsString.substring(1);
                                    String partOne = numberAsString.substring(0, 1);
                                    alreadyFormatted = partOne + partTwo;
                                    break;
                         case "2": partTwo = "," + numberAsString.substring(2);
                                   partOne = numberAsString.substring(0, 2);
                                   alreadyFormatted = partOne + partTwo;
                                   break;
                         case "3":  partTwo = "," + numberAsString.substring(3);
                                    partOne = numberAsString.substring(3);
                                    alreadyFormatted = partOne + partTwo;
                                    break;
                         case "1,4":
                                   String partThree = "," + numberAsString.substring(4);
                                   partTwo = numberAsString.substring(1, 4);
                                   partOne = numberAsString.substring(0, 1) + ",";
                                   alreadyFormatted = partOne + partTwo + partThree;
                                   break;// do string manipulations and concats; break;
                         case "2,5": partThree = "," + numberAsString.substring(5);
                                     partTwo =  numberAsString.substring(2, 5);
                                     partOne =  numberAsString.substring(0, 2) + ",";
                                     alreadyFormatted = partOne + partTwo + partThree;
                                     break;// do string manipulations and concats; break;
                         case "3,6":  partThree = "," + numberAsString.substring(6);
                                      partTwo= numberAsString.substring(3,6);
                                      partOne = numberAsString.substring(0, 3) + ",";
                                      alreadyFormatted = partOne + partTwo + partThree;
                                      break;// do string manipulations and concats; break; // do string manipulations and concats; break;
                         case "1,4,7": String partFour = "," + numberAsString.substring(7);
                                       partThree = numberAsString.substring(4,7) + ",";
                                       partTwo = numberAsString.substring(1,4);
                                       partOne = numberAsString.substring(0,1) + ",";
                                       alreadyFormatted = partFour + partThree + partTwo + partOne;
                                       break; // do string manipulations and concats; break;
                         case "2,5,8": partFour = "," + numberAsString.substring(8);
                                       partThree = numberAsString.substring(5,8) + ",";
                                       partTwo = numberAsString.substring(2, 5);
                                       partOne = numberAsString.substring(0, 2) + ",";
                                       alreadyFormatted = partFour + partThree + partTwo + partOne;
                                       break;
                }
            }
        }
        return alreadyFormatted;
    }
    
    private String defineLoopPosition(int length){
        return switch (length){
            case 3 -> "1";
            case 4 -> "2";
            case 5 -> "3";
            case 6 -> "1,4";
            case 7 -> "2,5";
            case 8 -> "3,6";
            case 9 -> "1,4,7";
            case 10 -> "2,5,8";
            default -> "";
        };
    }
}
