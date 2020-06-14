/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.upf.ads.series.dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author leonardo.bertuzzi
 */
@Entity
@Table(name = "temporada")
public class Temporada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "temporada_id")
    private Long id;

    @Column(name ="numero")
    private Integer numero;
    
    @Column(name = "anoLancamento")
    private Integer anoLancamento;
    
    @OneToMany(mappedBy = "temporada")
    private List<Episodio> episodios;

    @ManyToOne
    private Produtora produtora;
    
    @ManyToOne
    private Serie serie;

    public Temporada(Long id, Integer numero, Integer anoLancamento, List<Episodio> episodios, Produtora produtora, Serie serie) {
        this.id = id;
        this.numero = numero;
        this.anoLancamento = anoLancamento;
        this.episodios = episodios;
        this.produtora = produtora;
        this.serie = serie;
    }

    public Temporada() {
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public List<Episodio> getEpisodios() {
        return episodios;
    }

    public void setEpisodios(List<Episodio> episodios) {
        this.episodios = episodios;
    }

    public Produtora getProdutora() {
        return produtora;
    }

    public void setProdutora(Produtora produtora) {
        this.produtora = produtora;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Temporada)) {
            return false;
        }
        Temporada other = (Temporada) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.valueOf(numero) + "º temporada " + serie.getNome();
    }
    
}
