package br.upf.ads.series.dominio;

import br.upf.ads.series.dominio.Episodio;
import br.upf.ads.series.dominio.Produtora;
import br.upf.ads.series.dominio.Serie;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-14T13:12:17")
@StaticMetamodel(Temporada.class)
public class Temporada_ { 

    public static volatile SingularAttribute<Temporada, Integer> anoLancamento;
    public static volatile SingularAttribute<Temporada, Integer> numero;
    public static volatile SingularAttribute<Temporada, Serie> serie;
    public static volatile ListAttribute<Temporada, Episodio> episodios;
    public static volatile SingularAttribute<Temporada, Long> id;
    public static volatile SingularAttribute<Temporada, Produtora> produtora;

}