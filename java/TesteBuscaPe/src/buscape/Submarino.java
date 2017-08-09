
package buscape;

public class Submarino {
    
    private final Eixo x = new Eixo(true);
    private final Eixo y = new Eixo(true);
    private final Eixo z = new Eixo(false);
    private Direcao direcao = Direcao.NORTE;
    
    public void executaComandos(Comando...comandos)
    {
       for(Comando comando: comandos)
           direcao = comando.executar(direcao, x, y, z);
    
       printCoordenadas();
    }
    
    public String executaComandos(String comandos)
    {
       
        for(char c: comandos.toCharArray())
           try
           {
               direcao = Comando.valueOf(String.valueOf(c)).executar(direcao, x, y, z);
           }
           catch(IllegalArgumentException e)
           {
               // ignora o comando invalido e continua o processamento
           }
        
       printCoordenadas();
       
       return String.format("%d %d %d %s", x.getPosicao(), y.getPosicao(), z.getPosicao(), direcao);
    }
    
    public void printCoordenadas()
    {
        System.out.print(x.getPosicao());
        System.out.print(" ");
        System.out.print(y.getPosicao());
        System.out.print(" ");
        System.out.print(z.getPosicao());
        System.out.print(" ");
        System.out.print(direcao);
        System.out.println("");
    }
}
