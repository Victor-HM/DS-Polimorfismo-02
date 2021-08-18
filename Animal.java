
public class Animal {
	private String Cor;
	private double Tamanho;
	private String Nome;
	
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	public double getTamanho() {
		return Tamanho;
	}
	public void setTamanho(double tamanho) {
		Tamanho = tamanho;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public String Correr(){
		return "";
	}
	
	public String Alimentar(){
		return "";
	}
	
	public String Dormir(){
		return "";
	}
	
	public String EmitirSom(){
		return "";
	}
	
	public void Caracteristicas(){
		System.out.println(this.Correr());
		System.out.println(this.Alimentar());
		System.out.println(this.EmitirSom());
	}
}