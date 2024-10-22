public class Main {
    public static void main(String[] args) {

        //Act 2
        int energia = 80;
        String estado = (energia > 50)? "personaje fuerte" : "personaje debil" ;

        System.out.println(estado);

        //Act 4
        for (int i = 0; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("Número: " + i);
        }

        //Act 6
        String personaje = null;

        if (personaje != null) {
            System.out.println("El personaje es " + null);
        } else {
            System.out.println("No hay personaje.");
        }
    }
}