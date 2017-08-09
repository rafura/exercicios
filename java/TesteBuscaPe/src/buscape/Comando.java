
package buscape;

/**
 *
 * @author Ricardo
 */
public enum Comando {
    // L -> Girar para Esquerda
    L((Operacao)(Direcao d, Eixo x, Eixo y, Eixo z) -> {
        int valor = d.ordinal();
        valor = ((--valor) == -1) ? 3 : valor;
        return getDirecao(valor);
    }),
    
    // R -> Girar para Direita
    R((Operacao)(Direcao d, Eixo x, Eixo y, Eixo z) -> {
        int valor = d.ordinal();
        valor = (++valor) % 4;
        return getDirecao(valor);
    }),

    // Mover
    M((Operacao) (Direcao d, Eixo x, Eixo y, Eixo z) -> {
        switch(d)
        {
            case NORTE:
                y.avanca();
                break;
                
            case SUL:
                y.retrocede();
                break;
                
            case LESTE:
                x.avanca();
                break;
                
            case OESTE:
                x.retrocede();
        }
        
        return d;
    }),
    
    // subir submarino
    U((Operacao) (Direcao d, Eixo x, Eixo y, Eixo z) -> {
        z.avanca();
        return d;
    }),
    
    // descer submarino
    D((Operacao) (Direcao d, Eixo x, Eixo y, Eixo z) -> {
        z.retrocede();
        return d;
    }); 
    
    private final Operacao operacao;
    
    Comando(Operacao operacao)
    {
        this.operacao = operacao;
    }
    
    private static Direcao getDirecao(final int ordinal)
    {
        for(Direcao direcao: Direcao.values())
            if(direcao.ordinal() == ordinal)
                return direcao;
        
        return Direcao.NORTE;
    }
    
    public Direcao executar(Direcao direcao, Eixo x, Eixo y, Eixo z)
    {
        return operacao.executar(direcao, x, y, z);
    }
}