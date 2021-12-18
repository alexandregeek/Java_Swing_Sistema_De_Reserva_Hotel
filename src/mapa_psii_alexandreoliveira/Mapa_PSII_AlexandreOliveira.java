
package mapa_psii_alexandreoliveira;

/**
 *
 * @author alexandre.oliveira
 */
public class Mapa_PSII_AlexandreOliveira {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TelaInicial telaInicial = new TelaInicial ();
       telaInicial.setVisible(true);
       // Suites Standard
       SuiteHotel s1 = new SuiteHotel();
       s1.setNumero(10);
       s1.setCapacidade(1);
       s1.setTipo("Standard");
       s1.setValor(130.00);

       SuiteHotel s2 = new SuiteHotel();
       s2.setNumero(20);
       s2.setCapacidade(2);
       s2.setTipo("Standard");
       s2.setValor(130.00);
       
       SuiteHotel s3 = new SuiteHotel();
       s3.setNumero(30);
       s3.setCapacidade(3);
       s3.setTipo("Standard");
       s3.setValor(130.00);
       
       SuiteHotel s4 = new SuiteHotel();
       s4.setNumero(40);
       s4.setCapacidade(4);
       s4.setTipo("Standard");
       s4.setValor(130.00);

        // Suites Luxo
       SuiteHotel s5 = new SuiteHotel();
       s5.setNumero(50);
       s5.setCapacidade(1);
       s5.setTipo("Luxo");
       s5.setValor(180.00);

       SuiteHotel s6 = new SuiteHotel();
       s6.setNumero(60);
       s6.setCapacidade(2);
       s6.setTipo("Luxo");
       s6.setValor(180.00);
       
       SuiteHotel s7 = new SuiteHotel();
       s7.setNumero(70);
       s7.setCapacidade(2);
       s7.setTipo("Luxo");
       s7.setValor(180.00);
       
       SuiteHotel s8 = new SuiteHotel();
       s8.setNumero(80);
       s8.setCapacidade(3);
       s8.setTipo("Luxo");
       s8.setValor(180.00);
       
    }
    
}
