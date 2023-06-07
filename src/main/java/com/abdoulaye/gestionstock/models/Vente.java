package com.abdoulaye.gestionstock.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vente ")
public class Vente extends AbstratEntity{

    @Column(name = "code")
    private String code;
    @Column(name = "datevente")
    private Instant dateVente;
    @Column(name = "commentaire")
    private String commentaire;

}
