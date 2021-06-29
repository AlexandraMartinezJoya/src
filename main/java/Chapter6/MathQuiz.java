package Chapter6;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class MathQuiz extends ConsoleProgram {

    /**
     * Private constants
     */
    private final int QUESTION_LIMIT = 4;

    /**
     * instance variables
     */
    RandomGenerator rgen = RandomGenerator.getInstance();

    public void run(){
        println("Welcome to Math Quiz!");
        int answerCount = 0;
        while(answerCount <= QUESTION_LIMIT) {
            int differentAnswerCount = 0;
            int firstNumber = rgen.nextInt(1, 20);
            int secondNumber = rgen.nextInt(1, 20);
            boolean isPlus = rgen.nextBoolean();

            String question = generateMathQuizQuestion(firstNumber, secondNumber, isPlus);
            if(isValidQuestion(firstNumber, secondNumber, isPlus)){
                int answer = getMathQuizAnswer(question);
                boolean isCorrectAnswer = checkAnswer(firstNumber, secondNumber, isPlus, answer);
                if(isCorrectAnswer){
                    println(getRandomEncouragmentMessage());
                    answerCount++;
                }
                while(!isCorrectAnswer) {
                    differentAnswerCount++;
                    question = "That is incorrect! Try a different answer";
                    answer = getMathQuizAnswer(question);
                    isCorrectAnswer = checkAnswer(firstNumber, secondNumber, isPlus, answer);
                    if(isCorrectAnswer) {
                        println(getRandomEncouragmentMessage());
                        answerCount++;
                    }
                    if(differentAnswerCount == 2) {
                        int correctAnswer = getCorrectAnswer(firstNumber, secondNumber, isPlus);
                        println("No, the answer is " + correctAnswer);
                        answerCount++;
                       break;
                    }
                }
            }
        }
        println("Thank you for participating! Math quizz is now over");
    }

    private String generateMathQuizQuestion(int firstNumber, int secondNumber, boolean isPlus){
        String question = "What is " + firstNumber + plusOrMinus(isPlus) + secondNumber +" ?";
        return question;
    }

    private String plusOrMinus(boolean isPlus) {
        String sign = "";
        if(isPlus) {
            sign = " + ";
        } else{
            sign = " - ";
        }
        return sign;
    }

    private boolean isValidQuestion(int firstNumber, int secondNumber, boolean isPlus) {
        boolean flag = true;
        if(isPlus){
            int answer = firstNumber + secondNumber;
            if (answer > 20) {
                flag = false;
            }
        } else {
            int answer = firstNumber - secondNumber;
            if (answer < 0) {
                flag = false;
            }
        }
        if (firstNumber > 20 || secondNumber > 20 ) {
            flag = false;
        }
        return flag;
    }

    private int getMathQuizAnswer(String question){
        int answer = readInt(question);
        return  answer;
    }

    private boolean checkAnswer(int firstNumber, int secondNumber, boolean isPlus, int userAnswer){
        int answer = 0;
        boolean isCorrect = true;
        if(isPlus) {
            answer = firstNumber + secondNumber;
            if (userAnswer != answer){
                isCorrect = false;
            }
        } else {
                answer = firstNumber - secondNumber;
                if( userAnswer != answer) {
                    isCorrect = false;
                }
        }
        return isCorrect;
    }

    private int getCorrectAnswer(int firstNumber, int secondNumber, boolean isPlus){
        int answer= 0;
        if(isPlus){
            answer = firstNumber + secondNumber;
        }
        answer = firstNumber - secondNumber;
        return  answer;
    }

    private String getRandomEncouragmentMessage() {
        String message = "";
        int messageNumber = rgen.nextInt(1, 5);
        switch (messageNumber){
            case 1: message = "Great ! You got it!"; break;
            case 2: message = "Amazing! Keep going"; break;
            case 3: message = "Fantastic, you got it right!"; break;
            case 4: message = "Impressive work. You are correct again"; break;
            case 5: message = "Outstanding. You are really good at math quizz"; break;
            default: message = "That is correct";
        }
        return  message;
    }
}
