package com.generation.pocosolidario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.data.repository.query.Param;
=======
>>>>>>> 2629c7cabd75d7501e85a9400b407262d56f5bcc
import org.springframework.stereotype.Repository;

import com.generation.pocosolidario.model.PostagemModel;

@Repository
public interface PostagemRepository extends JpaRepository<PostagemModel, Long> {
<<<<<<< HEAD

	List <PostagemModel> findAllBylocalizacaoContainingIgnoreCase(@Param ("localizacao") String localizacao);
=======
	public List<PostagemModel> findAllByLegendaContainingIgnoreCase(String legenda);

	public List<PostagemModel> findAllByLocalizacaoContainingIgnoreCase(String localizacao);

	public List<PostagemModel> findAllByFeedbackContainingIgnoreCase(String feedback);

>>>>>>> 2629c7cabd75d7501e85a9400b407262d56f5bcc
}
