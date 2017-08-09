
package buscape;

import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class Main {
    
    public static void main(String[] args) {
        
        Submarino submarino = new Submarino();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com os comandos para mover o submarino: Digite 0 (zero) para sair");
        
        while(scanner.hasNext()){
                
            String comando = scanner.next();
                
                if("0".equals(comando))
                    break;
                
            submarino.executaComandos(comando);
        }
        
        scanner.close(); //Encerra o programa
    }
}
