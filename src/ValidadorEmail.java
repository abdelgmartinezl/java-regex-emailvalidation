import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class ValidadorEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el email a validar: ");
        String email = scanner.nextLine().trim();

        if (esEmailValido(email)) {
            System.out.println("El correo es valido.");
        } else {
            System.out.println("El correo invalido.");
        }

        scanner.close();
    }

    public static boolean esEmailValido(String email) {
        String regexEmail = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern p = Pattern.compile(regexEmail);
        Matcher m = p.matcher(email);

        return m.matches();
    }
}
