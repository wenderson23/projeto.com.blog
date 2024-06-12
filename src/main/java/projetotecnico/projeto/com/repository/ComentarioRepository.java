package projetotecnico.projeto.com.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import projetotecnico.projeto.com.model.Comentario;
import projetotecnico.projeto.com.model.Post;

public interface ComentarioRepository  extends JpaRepository <Comentario, Long>{

    List<Comentario> findByPost(Post post); 
    

    
}
