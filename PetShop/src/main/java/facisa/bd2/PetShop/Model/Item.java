package facisa.bd2.PetShop.Model;

public class Item {
	
	private int Codigo;
	private String Descricao;
	private String Tipo;
	private double PrecoFornecedor;
	private double PrecoLoja;
	private String Validade;
	private int Quantidade;
	
	
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public double getPrecoFornecedor() {
		return PrecoFornecedor;
	}
	public void setPrecoFornecedor(double precoFornecedor) {
		PrecoFornecedor = precoFornecedor;
	}
	public double getPrecoLoja() {
		return PrecoLoja;
	}
	public void setPrecoLoja(double precoLoja) {
		PrecoLoja = precoLoja;
	}
	public String getValidade() {
		return Validade;
	}
	public void setValidade(String validade) {
		Validade = validade;
	}
	public int getQuantidade() {
		return Quantidade;
	}
	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return "Item [id=" + Codigo + ", descricao=" + Descricao + ", precoFornecedor=" + PrecoFornecedor + ", precoLoja="
				+ PrecoLoja + ", tipo=" + Tipo + ", validade=" + Validade + ", quantidade=" + Quantidade + "]";
	}
	
	
	

}
