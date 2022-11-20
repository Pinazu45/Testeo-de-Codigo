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
}