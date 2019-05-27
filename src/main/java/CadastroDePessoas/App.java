package CadastroDePessoas;

public class App {
	
	public static void main(String[] args) {
		
		Juridica empresaSA = new Juridica(new Nome("Empresa S/A"), new Cnpj("65.666.999/0001-69"), new CapitalSocial(500000));		
		Fisica Anna = new Fisica(new Nome("Anna Bussola"), new Cpf("07285689878"), new Rg("78893947292"));
		Fisica Thiago = new Fisica(new Nome("Thiago Bussola"), new Cpf("07284090563"), new Rg("845522233644"));
		Fisica Matheus = new Fisica(new Nome("Matheus Bussola"), new Cpf("235.685.369-86"), new Rg("54888966655"));
		
		empresaSA.adicionarSocio(Thiago, new PercentualDeParticipacao(30));		

		empresaSA.adicionarSocio(Matheus, new PercentualDeParticipacao(25));
		
		empresaSA.removerSocio(Thiago);
		
		empresaSA.adicionarSocio(Anna, new PercentualDeParticipacao(60));
	}
}
