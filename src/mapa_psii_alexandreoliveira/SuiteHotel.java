
package mapa_psii_alexandreoliveira;

/**
 *
 * @author alexandre.oliveira
 */
public class SuiteHotel {
    public int Numero;
    public int Capacidade;
    public String Tipo;
    public double Valor;

    public SuiteHotel(){
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public int getCapacidade() {
        return Capacidade;
    }

    public void setCapacidade(int Capacidade) {
        this.Capacidade = Capacidade;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }
            
            
    public SuiteHotel(int Numero, int Capacidade, String Tipo, double Valor) {
        this.Numero = Numero;
        this.Capacidade = Capacidade;
        this.Tipo = Tipo;
        this.Valor = Valor;
    }
    
    
    
}
