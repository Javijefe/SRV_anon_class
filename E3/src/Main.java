abstract class Executable {
    abstract void executar();



}

class Executor {
    void executarXVegades(int x, Executable executable){
        for (int i = 0; i < x; i++) {
            executable.executar();
        }
    }
}

public class Main {
    public static void main(String[] args) {



        Executor executor = new Executor(){};

        //si ponemos interface hay que poner public el el void de abajo y quitar los
        // {} de la class Executableen el metodo executar(){} y poner ;
        executor.executarXVegades(10, new Executable(){
            @Override
            public void executar() {
                System.out.println("Hello Executor");
            }
        });
    }
}