package com.abdoulaye.gestionstock.dto;




import com.abdoulaye.gestionstock.models.Article;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;


@Builder
@Data
public class ArticleDto {
    private int id;
    private int codeArticle;
    private String designation;
    private BigDecimal prixUnitaire;
    private String description;
    private String image;
    private Instant dateFab;
    private Instant dateExp;
    private CategorieDto categorieDto;

    public ArticleDto fromEntity(Article article){
        if(article == null){
            return null;
        }

        return ArticleDto.builder()
                .id(article.getId())
                .codeArticle(article.getCodeArticle())
                .description(article.getDescription())
                .image(article.getImage())
                .prixUnitaire(article.getPrixUnitaire())
                .dateFab(article.getDateFab())
                .dateExp(article.getDateExp())
                .build();
    }

    public Article toEntity(ArticleDto articleDto){
        if(articleDto == null){
            return null;
        }

        Article article = new Article();
        article.setId(articleDto.getId());
        article.setCodeArticle(articleDto.getCodeArticle());
        article.setDescription(articleDto.getDescription());
        article.setPrixUnitaire(articleDto.getPrixUnitaire());
        article.setImage(articleDto.getImage());
        article.setDateFab(articleDto.getDateFab());
        article.setDateExp(articleDto.getDateExp());
        return article;
    }
}
