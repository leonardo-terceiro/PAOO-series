package br.upf.ads.series.dominio;

import br.upf.ads.series.dominio.Temporada;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-14T14:09:29")
@StaticMetamodel(Episodio.class)
public class Episodio_ { 

    public static volatile SingularAttribute<Episodio, Temporada> temporada;
    public static volatile SingularAttribute<Episodio, String> nome;
    public static volatile SingularAttribute<Episodio, String> resumo;
    public static volatile SingularAttribute<Episodio, Long> id;

}