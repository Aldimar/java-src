/**
 * 
 */
package utility;

/**
 * @author aldimar.junior
 *
 */
public class Banco
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		ContaCorrente conta = new ContaCorrente();
		
		System.out.printf("Seu saldo �: %.2f\n", conta.checkBalance());
		conta.withdraw(200);
		System.out.printf("Seu saldo apos saque �: %.2f\n", conta.checkBalance());
		conta.deposit(300);
		System.out.printf("Seu saldo apos deposito �: %.2f\n", conta.checkBalance());
		System.out.println(conta.checkName());
		conta.changeName("Aldimar");
		System.out.println(conta.checkName());
	}

}
