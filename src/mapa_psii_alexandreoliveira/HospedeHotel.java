
package mapa_psii_alexandreoliveira;

/**
 *
 * @author alexandre.oliveira
 */
public class HospedeHotel {
    public String Nome;
    public String Endereco;
    public String Idade;
    
    public HospedeHotel(){
    }

    public HospedeHotel(String Nome, String Endereco, String Idade) {
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.Idade = Idade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getIdade() {
        return Idade;
    }

    public void setIdade(String Idade) {
        this.Idade = Idade;
    }
    
    
}
