import Testeo-de-Codigo.Agenda;
import javax.swing.JOptionPane;
public class AppAgenda
{
    public static void main(String[]args)
    {
        String mn = "1.- Captura" + "\n2.- Imprimir" + "\n3.- Buscar" + "\n4.- Salir";
        char op;
        do {
            op = JOptionPane.showInputDialog(null, mn).charAt(0);
            switch(op)
            {
                case '1' : agenda.fichero();
                    break;
                case '2' : agenda.ImprimirF();
                    break;
                case '3' : agenda.BuscarF();
                    break;
                case '4' : JOptionPane.showMessageDialog(null, "Salida");
                    break;
                default : JOptionPane.showMessageDialog(null, "Vuelva a intentar");
                    break;
            }
        } while(op != '4');
    }
}
