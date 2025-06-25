package org.lessons.springboot.cars.concessionaria.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "cars_db")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "This name must be not blank, empty or null")
    private String name;
    @NotNull(message = "Insert date please")
    private LocalDate dataImmatricolazione;
    @NotNull(message = "Insert cilindrata please")
    private Integer cilindrata;

    @NotNull(message = "Insert cavalli please")
    private Integer cavalli;

    @NotNull(message = "Insert kilometers please")
    private Float km; // Modifica float → Float

    @NotBlank(message = "This name must be not blank, empty or null")
    private String carrozeria;

    @NotBlank(message = "This camp must be not blank, empty or null")
    private String statoVeicolo;
    @Lob
    @NotBlank(message = "This camp must be not blank, empty or null")
    private String urlImage;
    @Lob
    @Size(min = 10, max = 2000, message = "Description must be contain at least 10 caracters and not more than 2000")
    @NotBlank(message = "This name must be not blank, empty or null")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

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