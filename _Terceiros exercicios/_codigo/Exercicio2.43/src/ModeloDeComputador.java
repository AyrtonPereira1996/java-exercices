
//CLASSE DO EXERCICIO 2.43
public class ModeloDeComputador {
	
//	ATRIBUTOS ENCAPSULADO DA CLASSE
	private float precoMotherboard;
	private String tipoProcessador;
	private float precoProcessador;
	private String tipoMemoria;
	private float precoMemoria;
	private String discoRigido;
	private float precoDiscoRigido;
	private String tipoMonitor;
	private float precoMonitor;
	
	
//CONSTRUTOR DA CLASSE
	public ModeloDeComputador(float precoMotherboard,float precoProcessador, float precoMemoria, float discoRigido, float precoMonitor) {
		this.precoDiscoRigido = discoRigido;
		this.precoMemoria = precoMemoria;
		this.precoMonitor = precoMonitor;
		this.precoMotherboard = precoMotherboard;
		this.precoProcessador = precoProcessador;
	}
	
// METODO QUE CALCULA PRECO FINAL DO COMPUTADOR
	public float calcularPrecoFinal() {
		float valorFinal = (this.getPrecoMotherboard() + this.getPrecoProcessador() + this.getPrecoMemoria() + this.getPrecoDiscoRigido() + this.getPrecoMonitor());
		return valorFinal;
	}
	
//METODOS SETTERS E GETTERS DA CLASSE
	public float getPrecoMotherboard() {
		return precoMotherboard;
	}
	public void setPrecoMotherboard(float precoMotherboard) {
		this.precoMotherboard = precoMotherboard;
	}
	public String getTipoProcessador() {
		return tipoProcessador;
	}
	public void setTipoProcessador(String tipoProcessador) {
		this.tipoProcessador = tipoProcessador;
	}
	public float getPrecoProcessador() {
		return precoProcessador;
	}
	public void setPrecoProcessador(float precoProcessador) {
		this.precoProcessador = precoProcessador;
	}
	public String getTipoMemoria() {
		return tipoMemoria;
	}
	public void setTipoMemoria(String tipoMemoria) {
		this.tipoMemoria = tipoMemoria;
	}
	public float getPrecoMemoria() {
		return precoMemoria;
	}
	public void setPrecoMemoria(float precoMemoria) {
		this.precoMemoria = precoMemoria;
	}
	public String getDiscoRigido() {
		return discoRigido;
	}
	public void setDiscoRigido(String discoRigido) {
		this.discoRigido = discoRigido;
	}
	public float getPrecoDiscoRigido() {
		return precoDiscoRigido;
	}
	public void setPrecoDiscoRigido(float precoDiscoRigido) {
		this.precoDiscoRigido = precoDiscoRigido;
	}
	public String getTipoMonitor() {
		return tipoMonitor;
	}
	public void setTipoMonitor(String tipoMonitor) {
		this.tipoMonitor = tipoMonitor;
	}
	public float getPrecoMonitor() {
		return precoMonitor;
	}
	public void setPrecoMonitor(float precoMonitor) {
		this.precoMonitor = precoMonitor;
	}
	
	
	
}
