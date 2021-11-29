import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name, String dayPeriod) {
        // YOUR CODE HERE
        return String.format("Good %s, %s, welcome to the manor.", dayPeriod, name);
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        return String.format("It is currently %s", new Date());
    }
    
    public String respondBeforeAlexis(String phrase) {
        // YOUR CODE HERE
        if(phrase.indexOf("Alexis") > -1) {
            return "She's useless. How can I help you?";
        }

        if (phrase.indexOf("Alfred") > -1) {
            return "How may I help you?";
        }

        return "Right. And with that I shall retire." ;
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

