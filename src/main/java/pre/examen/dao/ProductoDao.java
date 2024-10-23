package pre.examen.dao;

import java.util.List;
import java.util.Optional;

import pre.examen.entity.Producto;

public interface ProductoDao {
	Producto create(Producto p);
	Producto update(Producto p);
	void delete(Long id);
	Optional<Producto> read(Long id);
	List<Producto> readAll();
}
