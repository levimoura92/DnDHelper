package DnDHelper;

public class UserDnD {
	private int cod= 0;
	private String nome = "";
	private int campanha = 0;
	
	public void setCod(int codigo) {
		this.cod = codigo;
	}
	
	public int getCod() {
		return this.cod;
	}
	public void setNome(String user) {
		this.nome = user;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCampanha(int campaign) {
		this.campanha = campaign;
	}
	
	public int getCampanha() {
		return this.campanha;
	}
}
