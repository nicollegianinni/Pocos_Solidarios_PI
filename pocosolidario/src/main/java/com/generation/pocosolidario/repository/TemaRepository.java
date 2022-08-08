package com.generation.pocosolidario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.generation.pocosolidario.model.TemaModel;

@Repository
public interface TemaRepository extends JpaRepository <TemaModel, Long> {

	List <TemaModel> findAllByDescricaoContainingIgnoreCase(@Param ("descricao") String descricao);
}
