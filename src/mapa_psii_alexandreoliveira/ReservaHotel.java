
package mapa_psii_alexandreoliveira;

/**
 *
 * @author alexandre.oliveira
 */
public class ReservaHotel {
    
    public int NumeroReserva;
    public String NomeResponsavel;

    public ReservaHotel(String NomeResponsavel) {
        this.NomeResponsavel = NomeResponsavel;
    }

    public String getNomeResponsavel() {
        return NomeResponsavel;
    }

    public void setNomeResponsavel(String NomeResponsavel) {
        this.NomeResponsavel = NomeResponsavel;
    }
    public int Diarias;
    public int QuantidadePessoas;
    public String SuiteTipo;
    
    public  ReservaHotel(){
    }
    

    public ReservaHotel(int NumeroReserva, int Diarias, int QuantidadePessoas, String SuiteTipo) {
        this.NumeroReserva = NumeroReserva;
        this.Diarias = Diarias;
        this.QuantidadePessoas = QuantidadePessoas;
        this.SuiteTipo = SuiteTipo;
    }

    public int getNumeroReserva() {
        return NumeroReserva;
    }

    public void setNumeroReserva(int NumeroReserva) {
        this.NumeroReserva = NumeroReserva;
    }

    public int getDiarias() {
        return Diarias;
    }

    public void setDiarias(int Diarias) {
        this.Diarias = Diarias;
    }

    public int getQuantidadePessoas() {
        return QuantidadePessoas;
    }

    public void setQuantidadePessoas(int QuantidadePessoas) {
        this.QuantidadePessoas = QuantidadePessoas;
    }

    public String getSuiteTipo() {
        return SuiteTipo;
    }

    public void setSuiteTipo(String SuiteTipo) {
        this.SuiteTipo = SuiteTipo;
    }
    
    
}
