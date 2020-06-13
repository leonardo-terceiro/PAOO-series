package br.upf.ads.series.dominio;

import br.upf.ads.series.dominio.Temporada;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-13T16:37:11")
@StaticMetamodel(Produtora.class)
public class Produtora_ { 

    public static volatile ListAttribute<Produtora, Temporada> temporadas;
    public static volatile SingularAttribute<Produtora, String> nome;
    public static volatile SingularAttribute<Produtora, Long> id;
    public static volatile SingularAttribute<Produtora, String> nacionalidade;

}