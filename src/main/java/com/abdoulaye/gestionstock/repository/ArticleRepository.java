package com.abdoulaye.gestionstock.repository;


import com.abdoulaye.gestionstock.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {


  //List<Article> findAllByCategorieId(Integer idCategory);
  //Optional<Article> findArticleByCodeArticle(Integer codeArticle);

}
