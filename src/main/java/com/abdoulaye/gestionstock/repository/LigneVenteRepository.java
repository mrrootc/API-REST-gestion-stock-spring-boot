package com.abdoulaye.gestionstock.repository;


import com.abdoulaye.gestionstock.model.LigneVente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LigneVenteRepository extends JpaRepository<LigneVente, Integer> {

  List<LigneVente> findAllByArticleId(Integer idArticle);

  List<LigneVente> findAllByVenteId(Integer id);
}
