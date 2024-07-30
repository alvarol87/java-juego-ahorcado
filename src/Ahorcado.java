import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        //clase scanner permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra secreta: ");
        String palabraSecreta = scanner.nextLine().toLowerCase();
        int intentosMaximos = 5;
        int intentos =0;
        boolean palabraAdivinada = false;

        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int i =0; i < letrasAdivinadas.length; i++){
            letrasAdivinadas[i] = '_';
        }

        while(!palabraAdivinada && intentos<intentosMaximos){
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas));

            System.out.println("Introduce una letra, por favor");

            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false ;

            for (int i = 0; i< palabraSecreta.length(); i++){

                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if(!letraCorrecta){
                intentos++;
                System.out.println("¡Incorrecto!, te quedan "+ (intentosMaximos - intentos)+ " intentos. ");
            }

            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("Felicidades, has adivinado la palabra secreta: "+palabraSecreta);
            }
        }

        scanner.close();
    }
}
