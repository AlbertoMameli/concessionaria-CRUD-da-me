package org.lessons.springboot.cars.concessionaria.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "cars_db")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer id;
    @NotBlank
    private String name;

    private LocalDate dataImmatricolazione;
    private Integer cilindrata;
    private Integer cavalli;
    private String carrozeria;
    private float km;
    private String statoVeicolo;
    private String urlImage;


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDataImmatricolazione() {
        return this.dataImmatricolazione;
    }

    public void setDataImmatricolazione(LocalDate dataImmatricolazione) {
        this.dataImmatricolazione = dataImmatricolazione;
    }

    public Integer getCilindrata() {
        return this.cilindrata;
    }

    public void setCilindrata(Integer cilindrata) {
        this.cilindrata = cilindrata;
    }

    public Integer getCavalli() {
        return this.cavalli;
    }

    public void setCavalli(Integer cavalli) {
        this.cavalli = cavalli;
    }

    public String getCarrozeria() {
        return this.carrozeria;
    }

    public void setCarrozeria(String carrozeria) {
        this.carrozeria = carrozeria;
    }

    public float getKm() {
        return this.km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public String getStatoVeicolo() {
        return this.statoVeicolo;
    }

    public void setStatoVeicolo(String statoVeicolo) {
        this.statoVeicolo = statoVeicolo;
    }

    public String getUrlImage() {
        return this.urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }


    @Override
    public String toString() {
        
        return this.name;
    }

}