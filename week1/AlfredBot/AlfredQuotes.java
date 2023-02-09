import java.util.Date;
import java.text.SimpleDateFormat;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        
        return "Hello " + name + " Lovely to see you";
    }

//NINJA BONUS - overloading
    public String guestGreeting(String name, String dayPeriod ){
        return String.format("Good %s, %s. Lovely to see you", dayPeriod, name) ;
    }

    //sensei bonus of no parameter but depending on the hour of the day it will return the appropriate greeting for the time of day
    public String guestGreeting() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("H");
        String strDate= formatter.format(date);
        // return "this is the hour " + strDate;
        if (Integer.parseInt(strDate) < 12) {
            return "Good morning " + strDate;
        }
        if (Integer.parseInt(strDate) < 16) {
            return "Good afternoon " + strDate;
        }
        else {
            return "Good evening " + strDate;
        }
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") > -1){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        if (conversation.indexOf("Alfred") > -1) {
            return "At your service. As you wish, naturally.";
        }
        else {
            return "Right. And with that I shall retire.";
        }            
    }
    

    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

