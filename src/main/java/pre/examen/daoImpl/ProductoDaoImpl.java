package pre.examen.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pre.examen.dao.ProductoDao;
import pre.examen.entity.Producto;
import pre.examen.repository.ProductoRepository;

@Component
public class ProductoDaoImpl implements ProductoDao{

	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	public Producto create(Producto p) {
		// TODO Auto-generated method stub
		return productoRepository.save(p);
	}

	@Override
	public Producto update(Producto p) {
		// TODO Auto-generated method stub
		return productoRepository.save(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		productoRepository.deleteById(id);
	}

	@Override
	public Optional<Producto> read(Long id) {
		// TODO Auto-generated method stub
		return productoRepository.findById(id);
	}

	@Override
	public List<Producto> readAll() {
		// TODO Auto-generated method stub
		return productoRepository.findAll();
	}

}
