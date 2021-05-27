package exercicioData;
import java.util.Calendar;

public class TesteData {
    public static void main (String[] args){
        Calendar dataVencimentoBoleto = Calendar.getInstance();
        int diasParaVencimento = 9;

        dataVencimentoBoleto.add(Calendar.DATE, diasParaVencimento);
        System.out.printf("%tD\n", dataVencimentoBoleto.getTime());

        if (dataVencimentoBoleto.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            diasParaVencimento++;
            dataVencimentoBoleto.add(Calendar.DATE, diasParaVencimento);
        } else if (dataVencimentoBoleto.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            diasParaVencimento+=2;
            dataVencimentoBoleto.add(Calendar.DATE, diasParaVencimento);
        }

        System.out.print("O ultimo dia para pagamento é: ");
        System.out.printf("%tD", dataVencimentoBoleto.getTime());
        System.out.println("\nVocê tem " + diasParaVencimento + " dias para pagar até lá.");

    }
}
