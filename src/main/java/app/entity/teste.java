
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;


/**
* Classe que representa a tabela TESTE
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"TESTE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.teste")
public class teste implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Column(name = "name", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String name;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date data;


    /**
    * Construtor
    * @generated
    */
    public teste(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public teste setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém name
    * return name
    * @generated
    */
    public java.lang.String getName() {
        return this.name;
    }

    /**
    * Define name
    * @param name name
    * @generated
    */
    public teste setName(java.lang.String name) {
        this.name = name;
        return this;
    }
    /**
    * Obtém data
    * return data
    * @generated
    */
    public java.util.Date getData() {
        return this.data;
    }

    /**
    * Define data
    * @param data data
    * @generated
    */
    public teste setData(java.util.Date data) {
        this.data = data;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
teste object = (teste)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}