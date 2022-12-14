import java.io.*;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Agenda
{
    final String FILE_NAME = "C:\\Users\\angel\\OneDrive\\Escritorio\\Agenda.txt";
    public AgendaT() {}
    public void fichero()
    {
        try
        {
            String nombre, email, telefono;
            FileWriter output = new FileWriter(FILE_NAME, true);
            nombre = JOptionPane.showInputDialog(null, "Ingrese un nombre");
            telefono = JOptionPane.showInputDialog(null, "Ingrese el telefono");
            email = JOptionPane.showInputDialog(null, "Ingrese su email");
            output.write(nombre + ", " + telefono + ", " + email + "\n");
            output.close();
        } catch (IOException ex){
            System.out.println("Se encontro un error");
        }
    }
    public void ImprimirF()
    {
        final String SEPARATOR = ", ";
        BufferedReader br = null; //Buffer para almacenar linea completo
        try
        {
            File archivo = new File(FILE_NAME);
            if(archivo.exists()) {
                br = new BufferedReader(new FileReader(FILE_NAME));
                String line = br.readLine();
                while(line != null)
                {
                    String[] fields = line.split(SEPARATOR);
                    System.out.println(Arrays.toString(fields));
                    line = br.readLine();
                }
                if(br != null)
                {
                    br.close();
                }
            } else {
                System.out.print("Archivo inexistente");
            }
        } catch (Exception e) {
            System.out.println("Se encontro un error");
        }
        public void BuscarF()
        {
            final String SEPARATOR = ", ";
            BufferedReader br = null; //Buffer para almacenar linea completo
            try
            {
                File archivo = new File(FILE_NAME);
                if(archivo.exists()) {
                    br = new BufferedReader(new FileReader(FILE_NAME));
                    String[] fields;
                    String line = br.readLine();
                    boolean encontrar = false;
                    String nombre = JOptionPane.showInputDialog(null, "Nombre a buscar");
                    while(line != null && ! encontrar)
                    {
                        fields = line.split(SEPARATOR);
                        line = br.readLine();
                        if(fields[0].equals(nombre))
                        {
                            encontrar = true;
                            System.out.println(Arrays.toString(fields) + "\nSe encontro");
                        } else {
                            System.out.println("No se encontro\n");
                        }
                    }
                    if(br != null)
                    {
                        br.close();
                    }
                } else {
                    System.out.print("Archivo inexistente");
                }
            } catch (Exception e) {
                System.out.println("No se hallo el archivo o hubo un error");
            }
        }
}