public class Decipherer {

    public static String decriptor(String message) {


        int key = message.length() / 2;
        String sousChaine = message.substring(5, 5 + key);
        String replaceSousChaine = new StringBuilder(sousChaine.replaceAll("[@#?]+", " ")).reverse().toString();
        return replaceSousChaine;

    }

    public static void main(String[] args) {
        String message1 = "0@sn9sirppa@#?ia'jgtvryko1";
        System.out.println(decriptor(message1));

        String message2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
        System.out.println(decriptor(message2));

        String message3 = "aopi?sedohtém@#?sedhtmg+p9l!";
        System.out.println(decriptor(message3));
    }
}