package banco;
import java.sql.SQLException;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        int op;
        Scanner leitor = new Scanner(System.in);
        do{
            System.out.println( "--Menu--" );
            System.out.println( "1 - Criar Cliente" );
            System.out.println( "2 - Criar Conta Corrente" );
            System.out.println( "3 - Criar Conta Poupança" );
            System.out.println( "4 - Sacar" );
            System.out.println( "5 - Depositar" );
            System.out.println( "6 - Ver Saldo" );
            System.out.println( "7 - Sair" );
            System.out.print( "Op: " );
            op = leitor.nextInt();
            switch (op) {
                case 1:
                    
                    break;
    
                case 2:
                
                    break;
                
                case 3:
                    
                    break;
    
                case 4:
                
                    break;
                
                case 5:
                    
                    break;
    
                case 6:
                    
                    break;
    
                case 7:
                    System.out.println( "Saindo" );
                    System.exit(0);
                    break;
            
                default:
                    System.out.println( "Opção inválida." );
                    break;
            }
        }while(op != 7);
    }
}
