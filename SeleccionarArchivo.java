import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class SeleccionarArchivo {

    public String seleccionar() throws IOException {
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        jfc.setCurrentDirectory(new File("Pruebas"));

        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos a Compilar", "txt");
        jfc.setFileFilter(filtro);

        if (jfc.showOpenDialog(null) != JFileChooser.CANCEL_OPTION) {
            File archivo = jfc.getSelectedFile();
            return archivoAString(archivo);
        }

        return null;
    }

    public String archivoAString(File archivo) throws IOException{
        String codigo ="";
        BufferedReader reader = new BufferedReader(new FileReader (archivo));
        StringBuilder sb = new StringBuilder();
        String linea;
        String brinco = System.getProperty("line.separator");

        try {
            while((linea = reader.readLine()) != null) {
                sb.append(linea);
                sb.append(brinco);
            }

            codigo = sb.toString();

        } finally{
            reader.close();
        }
        return codigo;
    }
}