package com.generation.pocosolidario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.pocosolidario.model.PostagemModel;

@Repository
public interface PostagemRepository extends JpaRepository<PostagemModel, Long> {


	List <PostagemModel> findAllBylocalizacaoContainingIgnoreCase(@Param ("localizacao") String localizacao);

	public List<PostagemModel> findAllByLegendaContainingIgnoreCase(String legenda);

	public List<PostagemModel> findAllByLocalizacaoContainingIgnoreCase(String localizacao);

	public List<PostagemModel> findAllByFeedbackContainingIgnoreCase(String feedback);
	
	@Query(nativeQuery=true, value="SELECT * from tb_postagens a LEFT JOIN tb_usuarios b ON a.usuario_id = b.id WHERE a.usuario_id = :usuario")
    public List<PostagemModel> findAllByUsuarioContainingIgnoreCase(@Param("usuario") Long id);

}
