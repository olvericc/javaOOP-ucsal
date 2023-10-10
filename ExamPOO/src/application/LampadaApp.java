package application;
import entities.LampadaAjustavel;
import utils.Printer;

public class LampadaApp {
    public static void main(String[] args) {
        LampadaAjustavel lampada = new LampadaAjustavel();

        Printer.printl("Inicialmente:");
        exibirEstadoELuminosidade(lampada);

        lampada.acionaOnOff();
        Printer.printl("Após ligar a lâmpada:");
        exibirEstadoELuminosidade(lampada);

        lampada.aumentaLuminosidade();
        Printer.printl("Após aumentar a luminosidade:");
        exibirEstadoELuminosidade(lampada);

        lampada.diminuiLuminosidade();
        Printer.printl("Após diminuir a luminosidade:");
        exibirEstadoELuminosidade(lampada);
    }

    public static void exibirEstadoELuminosidade(LampadaAjustavel lampada) {
        Printer.printl("Estado da lâmpada: " + (lampada.getEstado() ? "Ligada" : "Desligada"));
        Printer.printl("Luminosidade da lâmpada: " + lampada.getLuminosidade() + "%");
    }
}
