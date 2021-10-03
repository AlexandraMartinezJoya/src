import acm.program.ConsoleProgram;

import java.util.StringTokenizer;

public class MyAcronym extends ConsoleProgram {

    public void run() {
        println("This is a rewrite of the Computer Science MASTERCLASS text book example acronym which was happily gave out FOR FREE (BECAUSE ITS THAT GOOD!)");
        String line = readLine("Please enter a line: ");
        println("THE acronym for YOUR line is " + myAcronym(line));
    }

    private String myAcronym(String line){
       String acronym = "";
        StringTokenizer tokenizer = new StringTokenizer(line, DELIMITERS, true);
        while(tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            char firstCharInToken = token.charAt(0);
            if(token.length() == 1 && isADelimiter(firstCharInToken)){
                token = tokenizer.nextToken();
                firstCharInToken = token.charAt(0);
                acronym += firstCharInToken;
            } else {
                acronym += firstCharInToken;
            }

        }
        return acronym;
    }

    private boolean isADelimiter(char token){
        boolean flag = false;
        switch(token){
            case ' ', '!', '@', '#', '$', '%', '^', '&', '*','(', ')', '_', '-', '+' ,'=', '{', '[', ']','}', ',', ':', ';','|', '<', '.', '>', '?', '/' :
                flag = true;
        }
        return flag;
    }

    /* Defines the characters that delimit a token */
    private static final String DELIMITERS = "!@#$%^&*()_-+={[]}:;'|<,.>?/ ";
}
