class Persona {}
class Alumno  extends Persona  {}

interface KK {}
public class Main {

    static void imprimirJerarquiaDeClasses(Class<?> c) {
        System.out.print(c.getName() + (c.getSuperclass() != null ? "  >  " : "\n"));
        if (c.getSuperclass() == null) return;
        imprimirJerarquiaDeClasses(c.getSuperclass());
    }

    public static void main(String[] args) {

        Alumno pastorBelga = new Alumno(){};

        imprimirJerarquiaDeClasses(pastorBelga.getClass());

        KK kk = new KK(){};
        imprimirJerarquiaDeClasses(kk.getClass());
    }
}