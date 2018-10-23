package utility;

public class AlugaFacil
{

	public static void main(String[] args)
	{

		Carro carro = new Carro();
		carro.idCarro = 001;
		carro.ano = 2018;
		carro.fabricante = "Fiat";
		carro.modelo = "Siena";
		
		Cliente cliente = new Cliente();
		cliente.idCliente = 182;
		cliente.nome = "Aldimar";
		cliente.cpf = "187.233.867-77";
		cliente.cnh = "B";
		
		Locacao loca��o = new Locacao();
		loca��o.idLocacao = 123;
		loca��o.idCarro = carro.idCarro;
		loca��o.idCliente = cliente.idCliente;
		loca��o.valorLocado = 750;
		loca��o.dataInicio = "04/10/2018";
		loca��o.dataFim = "20/10/2018";
		
		System.out.printf("O cliente %s alugou um carro da marca %s modelo %s de ano %d, de %s at� %s no valor de R$%.2f.\n"
						+ "--------------------------------\n"
						+ "Informa��es para consulta:\n"
						+ "CPF: %s\n"
						+ "CNH: %s\n"
						+ "ID CLIENTE: %d\n"
						+ "ID LOCA��O: %d\n"
						+ "ID CARRO: %d\n"
						+ "--------------------------------\n", 
						cliente.nome, carro.fabricante, 
						carro.modelo, carro.ano, 
						loca��o.dataInicio, loca��o.dataFim, 
						loca��o.valorLocado, cliente.cpf, 
						cliente.cnh, loca��o.idCliente, 
						loca��o.idLocacao, loca��o.idCarro);
		
	}

}
