
package buscape;

public enum Direcao {
    
    NORTE(0), LESTE(1), SUL(2), OESTE(3);
    
    private final int valor;
    
    Direcao(int valor)
    {
        this.valor = valor;
    }
    
    public int getValor()
    {
        return valor;
    }
    
    
    
}
