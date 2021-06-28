import acm.program.ConsoleProgram;

/**
 * This program asks a question and expects a yes or no answer from the user.
 * It must use a predicate method called askYesOrNoQuestion()
 * @EricRoberts
 *
 * Solved by @AlexandraMartinez
 */
public class YesNoExample extends ConsoleProgram {

    public void run() {
        String question = "Would you like instructions? ";
        if(askYesOrNoQuestion(question)){
            println("Instructions list on the way");
        }
    }

    private boolean askYesOrNoQuestion(String question){
        String answer = readLine(question);
        boolean isYesOrNo = isYesOrNo(answer);
        if (isYesOrNo) {
            return true;
        }
        while( ! isYesOrNo) {
            if(isNoAnswer(answer)) {
                return false;
            }
            print("Please answer yes or no \n");
            answer = readLine(question);
            if(isYesAnswer(answer)){
                return true;
            }
        }
        return isYesOrNo;
    }

    private boolean isYesOrNo(String answer) {
        boolean flag = false;
        if (answer.equals("yes")) {
            flag = true;
            return flag;
        } else if (answer.equals("no")){
            return flag;
        }
        return flag;
    }

    private boolean isNoAnswer(String answer) {
        return answer.equals("no");
    }

    private boolean isYesAnswer(String answer) {
        return answer.equals("yes");
    }

}
