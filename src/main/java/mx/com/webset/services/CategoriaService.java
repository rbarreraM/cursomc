package mx.com.webset.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.webset.dominio.Categoria;
import mx.com.webset.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo; 
	
	public Categoria buscar( Integer id ) {
		
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null); 
		
	}
	
}
