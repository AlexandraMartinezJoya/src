package Chapter8;

import acm.program.ConsoleProgram;

public class Obenglobish extends ConsoleProgram {

        public void run(){
            while(true){
                String word = readLine("Enter a word: ");
                if(word.equals("")) break;
                println(word + " -> " + obenglobish(word));
            }
        }

        private String obenglobish(String word){
            String obenglobish = "";
            for(int currentCharPosition = 0; currentCharPosition < word.length(); currentCharPosition++){
                char currentCharacter = word.charAt(currentCharPosition);
                if(isEnglishVowel(currentCharacter)){
                    if(currentCharPosition + 2 < word.length() ){
                        char nextCharacter = word.charAt(currentCharPosition + 1);
                        if(isEnglishVowel(nextCharacter)){
                            word = word.substring(currentCharPosition + 2);
                            //noinspection StringConcatenationInLoop
                            obenglobish += currentCharacter + "ob" + nextCharacter;
                            currentCharPosition = -1;
                        } else {
                            word = word.substring(currentCharPosition + 1);
                            //noinspection StringConcatenationInLoop
                            obenglobish +=  "ob" + currentCharacter;
                            currentCharPosition = -1;
                        }
                    } else if(currentCharPosition == word.length() -1 && currentCharacter == 'e'){
                        //noinspection StringConcatenationInLoop
                        obenglobish += currentCharacter;
                    }

                } else {
                    //noinspection StringConcatenationInLoop
                    obenglobish += currentCharacter;
                }
            }

            return obenglobish;
        }

    /* Returns true if the character is a vowel */
    private boolean isEnglishVowel(char ch){
        return switch (Character.toLowerCase(ch)) {
            case 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
    }
    }
