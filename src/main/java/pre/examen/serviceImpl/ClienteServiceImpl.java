package pre.examen.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pre.examen.dao.ClienteDao;
import pre.examen.entity.Cliente;
import pre.examen.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired ClienteDao dao;
	
	@Override
	public Cliente create(Cliente c) {
		// TODO Auto-generated method stub
		return dao.create(c);
	}

	@Override
	public Cliente update(Cliente c) {
		// TODO Auto-generated method stub
		return dao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Cliente> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Cliente> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
