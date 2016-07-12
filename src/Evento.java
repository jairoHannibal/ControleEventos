import java.awt.List;
import java.util.Date;

public class Evento {
	String descricao;
	String nome;
	Boolean ativo;
	List atividades;
	Date dataInicio;
	Date dataFim;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public List getAtividades() {
		return atividades;
	}

	public void setAtividades(List atividades) {
		this.atividades = atividades;
	}

}
