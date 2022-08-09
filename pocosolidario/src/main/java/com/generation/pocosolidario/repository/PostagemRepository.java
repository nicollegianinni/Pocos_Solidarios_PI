package com.generation.pocosolidario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.pocosolidario.model.PostagemModel;

@Repository
public interface PostagemRepository extends JpaRepository<PostagemModel, Long> {
	public List<PostagemModel> findAllByLegendaContainingIgnoreCase(String legenda);

	public List<PostagemModel> findAllByLocalizacaoContainingIgnoreCase(String localizacao);

	public List<PostagemModel> findAllByFeedbackContainingIgnoreCase(String feedback);

}
