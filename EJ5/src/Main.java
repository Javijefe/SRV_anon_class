public class Main {

    abstract class HolaMon {
        private String frase;

        public abstract void setFrase();

        public void saludar(){
            setFrase();
            System.out.println(frase);
        }
    }

    public void ferSalutacio() {

        class HolaMonAngles extends HolaMon {
            @Override
            public void setFrase() {
                setFrase();
                System.out.println("Hello world");
            }
        }
        class Frances extends HolaMon {
            @Override
            public void setFrase() {
                setFrase();
                System.out.println("Salut tout le monde");
            }
        }




    }

    public static void main(String... args) {
        Main myApp = new Main();
        myApp.ferSalutacio();
    }
}