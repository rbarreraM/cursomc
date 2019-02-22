package mx.com.webset;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mx.com.webset.dominio.Categoria;
import mx.com.webset.repositories.CategoriaRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria obj1 = new Categoria( null, "Informatica");
		Categoria obj2 = new Categoria( null, "Escritorio");
		
		categoriaRepository.saveAll( Arrays.asList(obj1, obj2 ));
		
	}

}
