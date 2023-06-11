package com.abdoulaye.gestionstock.dto;



import com.abdoulaye.gestionstock.models.Fournisseur;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class FournisseurDto {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String phone;
    private String image;
    private AdresseDto adresseDto;
    private List<CommandeFournisseurDto> commandeFournisseursDto;

    public static FournisseurDto fromEntity(Fournisseur fournisseur){
        if(fournisseur == null){
            return null;
        }

        return FournisseurDto.builder()
                .id(fournisseur.getId())
                .nom(fournisseur.getNom())
                .image(fournisseur.getImage())
                .email(fournisseur.getImage())
                .phone(fournisseur.getPhone())
                .build();
    }
    public static Fournisseur toEntity(FournisseurDto fournisseurDto){
        if(fournisseurDto == null){
            return null;

        }

        Fournisseur fournisseur = new Fournisseur();
        fournisseur.setId(fournisseurDto.getId());
        fournisseur.setNom(fournisseurDto.getNom());
        fournisseur.setImage(fournisseurDto.getImage());
        fournisseur.setEmail(fournisseurDto.getEmail());
        fournisseur.setPhone(fournisseurDto.getPhone());

        return fournisseur;
    }
}
