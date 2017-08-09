
package buscape;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Ricardo
 */
public class SubmarinoTest {
    
    public SubmarinoTest() {
    }

   // @Test
    public void printCoordenadasTest()
    {
        Submarino submarino = new Submarino();
        submarino.printCoordenadas();
        Assert.assertTrue(true);
    }
    
    @Test
    public void executaComandos()
    {
        Submarino submarino = new Submarino();
        Assert.assertTrue("-1 2 0 NORTE".equals(submarino.executaComandos("LMRDDMMUU")));
        
        submarino = new Submarino(); // reser para o estado inicial
        Assert.assertTrue("2 3 -2 SUL".equals(submarino.executaComandos("RMMLMMMDDLL")));
    }
 }