public class Movies {

    public static void main(String[] args) {


        String[] title = {"Le réveil de la force", "Blade Runner", "paranoia"};
        String[][] titleActors = {
                {"John Boyega", "Daisy Ridley", "Oscar Isaac"},
                {"daryl Hannah", "Rutger Hauer", "Harison Ford"},
                {"Liam Hemsworth", "Gary Oldman", "Harison Ford"}
        };

        for (int i = 0; i < title.length; i++) {
            System.out.println("Dans le film" + " " + title[i] + " les acteurs sont");
            for (int j = 0; j < titleActors[i].length; j++) {
                    System.out.println(titleActors[i][j]);
                }
            }
        }
    }
