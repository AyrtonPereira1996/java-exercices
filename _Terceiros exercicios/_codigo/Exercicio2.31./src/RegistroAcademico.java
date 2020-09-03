import java.time.LocalDate;

//CLASSE DO EXERCICIO 3.31
public class RegistroAcademico extends RegistoAcademicoSimples {
	private long codigoRegistro;
	private LocalDate dataRegistro;
	
// FUNCAO QUE PERMITE CRIAR REGISTO
	public void criarRegisto() {
		System.out.println("Criando o registro...");
	}
// FUNCAO QUE PERMITE EXCLUIR REGISTO
	public void exclusaoRegisto() {
		System.out.println("Excluindo registo");
	}
	
	
}
