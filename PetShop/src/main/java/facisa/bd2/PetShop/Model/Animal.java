package facisa.bd2.PetShop.Model;

public class Animal {
	
	private int Registro;
	private String Tipo;
	private double  Peso;
	private double Altura;
	private String DtUltMed;
	private String Raca;
	private double PrecoCompra = 0;
	private double PrecoVenda;
	private String DtNasc;
	
	public Animal() {};
	
	
	public int getRegistro() {
		return Registro;
	}
	public void setRegistro(int registro) {
		Registro = registro;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public double getPeso() {
		return Peso;
	}
	public void setPeso(double peso) {
		Peso = peso;
	}
	public double getAltura() {
		return Altura;
	}
	public void setAltura(double altura) {
		Altura = altura;
	}
	public String getDtUltMed() {
		return DtUltMed;
	}
	public void setDtUltMed(String dtUltMed) {
		DtUltMed = dtUltMed;
	}
	public String getRaca() {
		return Raca;
	}
	public void setRaca(String raca) {
		Raca = raca;
	}
	public double getPrecoCompra() {
		return PrecoCompra;
	}
	public void setPrecoCompra(double precoCompra) {
		PrecoCompra = precoCompra;
	}
	public double getPrecoVenda() {
		return PrecoVenda;
	}
	public void setPrecoVenda(double precoVenda) {
		PrecoVenda = precoVenda;
	}
	public String getDtNasc() {
		return DtNasc;
	}
	public void setDtNasc(String dtNasc) {
		DtNasc = dtNasc;
	}
	
	@Override
	public String toString() {
		return "Animal [registro=" + Registro + ", tipo=" + Tipo + ", peso=" + Peso + ", altura=" + Altura
				+ ", dataUltimaMedicacao=" + DtUltMed + ", dataNascimento=" + DtNasc + ", raca="
				+ Raca + ", precoCompra=" + PrecoCompra + ", precoVenda=" + PrecoVenda + "]";
	}
	
	

}
