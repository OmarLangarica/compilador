import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
        SeleccionarArchivo selector = new SeleccionarArchivo();

        try {
            String codigo = selector.seleccionar();

            if (codigo != null) {
                System.out.println(codigo);
                new Parser(codigo);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }

}