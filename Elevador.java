package aula06;

public class Elevador {
	
	private int codigo;
	private int pessoasTransportadas;
	private int limitePessoas;
	private String status;

	public Elevador(int codigo) {
		this.codigo = codigo;
		this.limitePessoas = 8;
		this.pessoasTransportadas = 0;
		this.status = "Em operação";
	}
	
	public void registraEntrada(int qtdePessoas) {
		this.pessoasTransportadas += qtdePessoas;
		if (this.pessoasTransportadas > this.limitePessoas) {
			this.status = "Bloqueado";
		}
	}

	public void registraSaida(int qtdePessoas) {
		this.pessoasTransportadas -= qtdePessoas;
		if (this.pessoasTransportadas <= this.limitePessoas) {
			this.status = "Em operação";
		}						
	}

	public void registraManutencao() {
		this.pessoasTransportadas = 0;
		this.status = "Em manutenção";
	}

	public void registraOperacao() {
		this.status = "Em operação";
	}

	public  boolean alteraLimite(int limitePessoas) {
		if (this.status.equals("Em manutenção")) {
		   this.limitePessoas = limitePessoas;
		   return true;
		}
		return false;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public int getPessoasTransportadas() {
		return pessoasTransportadas;
	}

	public int getLimitePessoas() {
		return limitePessoas;
	}

	public String getStatus() {
		return status;
	}
	

}


