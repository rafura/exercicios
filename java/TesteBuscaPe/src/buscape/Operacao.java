package buscape;

/**
 *
 * @author Ricardo
 */
@FunctionalInterface
public interface Operacao {
    
    public Direcao executar(Direcao t, Eixo x, Eixo y, Eixo z);
    
}
