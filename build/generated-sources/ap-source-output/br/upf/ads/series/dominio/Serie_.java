package br.upf.ads.series.dominio;

import br.upf.ads.series.dominio.Genero;
import br.upf.ads.series.dominio.Temporada;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-14T13:12:17")
@StaticMetamodel(Serie.class)
public class Serie_ { 

    public static volatile SingularAttribute<Serie, Integer> anoLancamento;
    public static volatile ListAttribute<Serie, Temporada> temporadas;
    public static volatile SingularAttribute<Serie, Genero> generos;
    public static volatile SingularAttribute<Serie, String> nome;
    public static volatile SingularAttribute<Serie, Long> id;

}