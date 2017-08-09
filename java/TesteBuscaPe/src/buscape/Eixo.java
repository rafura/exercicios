
package buscape;

public class Eixo {

    private Integer valor = 0;
    private final boolean permiteValorPositivo;
    
    public Eixo(boolean permiteValorPositivo)
    {
        this.permiteValorPositivo = permiteValorPositivo;
    }
    
    public Integer avanca()
    {
        if(!permiteValorPositivo)
            return valor = (++valor > 0) ? 0 : valor;
        else
            return ++valor;
    }
            
    public Integer retrocede()
    {
        return --valor;
    }
    
    public Integer getPosicao()
    {
        return valor;
    }
}
