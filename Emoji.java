
public class Emoji {
    public static void main(String args[]){
//        String welcomeMsg = "Hey Java Developers! ☕️";
//
//        if(welcomeMsg.codePoints().anyMatch(Character::isEmoji)) {
//            System.out.println("Message contains an emoji!");
//            System.out.println(welcomeMsg);
//        }
        String text = "Hello 🌍! 😊";
        text.codePoints().forEach(cp -> {
            System.out.println("Code Point: " + cp + " (Character: " + Character.toString(cp) + ")");
        });

        // Displaying an emoji directly
    }
}

