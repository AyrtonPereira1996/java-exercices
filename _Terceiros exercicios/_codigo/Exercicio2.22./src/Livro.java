import java.time.LocalDate;

//CLASSE DO EXERCICIO 2.22
public class Livro {
	protected long codigoLivro;
	protected String tituloLivro;
	protected String nomeAutor;
	protected LocalDate anoPublicacao;
	protected String editora;
	protected String paisOrigem;
	protected int numeroPaginas;
	protected String categoriaLivro;
	
	
	public long getCodigoLivro() {
		return codigoLivro;
	}
	public void setCodigoLivro(long codigoLivro) {
		this.codigoLivro = codigoLivro;
	}
	public String getCategoriaLivro() {
		return categoriaLivro;
	}
	public void setCategoriaLivro(String categoriaLivro) {
		this.categoriaLivro = categoriaLivro;
	}
	public String getTituloLivro() {
		return tituloLivro;
	}
	public void setTituloLivro(String tituloLivro) {
		this.tituloLivro = tituloLivro;
	}
	public String getNomeAutor() {
		return nomeAutor;
	}
	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	public LocalDate getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(LocalDate anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getPaisOrigem() {
		return paisOrigem;
	}
	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	
	
}
