package estudos.doichejunior.controletarefas.model;

import java.util.Date;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="tb_tafefas")
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String icon;
    private String descricao;
    private Boolean status;
    private Date DtAtribuicao;
    private Date DtFinalizacao;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public Date getDtAtribuicao() {
        return DtAtribuicao;
    }
    public void setDtAtribuicao(Date dtAtribuicao) {
        DtAtribuicao = dtAtribuicao;
    }
    public Date getDtFinalizacao() {
        return DtFinalizacao;
    }
    public void setDtFinalizacao(Date dtFinalizacao) {
        DtFinalizacao = dtFinalizacao;
    }

    
    

}
