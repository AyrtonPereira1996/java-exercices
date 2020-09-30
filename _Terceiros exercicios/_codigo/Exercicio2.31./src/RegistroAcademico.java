import java.time.LocalDate;

//CLASSE DO EXERCICIO 2.31
public class RegistroAcademico extends RegistoAcademicoSimples {
	private long codigoRegistro;
	private LocalDate dataRegistro;
	private int codigoDoCurso;
	private final float mensalidade = 4500f;
	private boolean isManha = true;
	
//	RETORNO DE TIPO BOLSA
	public int retornoTipoDescontoBolsa(String tipoBolsa) {
		int valorDescontoBolsa = 0;
		switch (tipoBolsa) {
		case "Tipo 1":
			valorDescontoBolsa = 30;
			break;
			
		case "Tipo 2":
			valorDescontoBolsa = 70;
			break;
			
		case "Tipo 3":
			valorDescontoBolsa = 100;
			break;

		default:
			valorDescontoBolsa = 0;
			break;
		}
		return valorDescontoBolsa;
	}
	
//	RETORNO TURNO
	public float retornoTurno() {
		float mensalidadeFinal;
		if (isManha) {
			mensalidadeFinal = (20 * mensalidade) / 100;
		} else {
			mensalidadeFinal = mensalidade;
		}
		return mensalidadeFinal;
	}
	

//	CONSTRUTOR DA CLASSE
	public RegistroAcademico(long codigoRegistro, int codigoDoCurso) {
		this.codigoRegistro = codigoRegistro;
		this.dataRegistro = dataRegistro;
		this.codigoDoCurso = codigoDoCurso;
	}
	
//	FUNCAO RETORNAR CODIGO CURSO
	public String retornaCodigoCurso() {
		String curso = "";
		switch (this.codigoDoCurso) {
		case 01:
			curso = "Informatica";
			break;

		case 02:
			curso = "Recursos Humanos";
			break;

		case 03:
			curso = "Administração";
			break;

		case 04:
			curso = "Contabilidade";
			break;
		}
		
		return curso;
	}

//	FUNCAO EMPRIMIR VALORES DA CLASSE
	public void imprimirValores() {
		System.out.println("Código registro: " + this.codigoRegistro + "\nCódigo registro:" + this.retornaCodigoCurso() + "\nData do registro: " + dataRegistro.now());

	}

// FUNCAO QUE PERMITE CRIAR REGISTO
	public void criarRegisto() {
		System.out.println("Criando o registro...");
	}

// FUNCAO QUE PERMITE EXCLUIR REGISTO
	public void exclusaoRegisto() {
		System.out.println("Excluindo registo");
	}
	



}
