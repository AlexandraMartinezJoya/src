package Chapter8;

import acm.program.ConsoleProgram;

import java.util.Date;

public class CreateDateString extends ConsoleProgram {

    public void run(){
        println("This metod displays the formatted date now");
        Date day = new Date();
        String formattedToday = day.toString();
        println(formattedToday);
        String year =  getYear(formattedToday);
        String today = getDay(formattedToday);
        String month = getMonth(formattedToday);
        String dayDateFormat = createDateString(today, month, year);
        println(dayDateFormat);
    }

    private String getYear(String fullDate){
        return fullDate.substring(25);
    }

    private String getDay (String fullDate){
        return fullDate.substring(7, 10);
    }

    private String getMonth (String fullDate){
        return fullDate.substring(0, 3);
    }
    private String createDateString(String day, String month , String year){
        String dateString = "";
        dateString += day + "-"+ month + "-" + year;
        return dateString;
        }
}
