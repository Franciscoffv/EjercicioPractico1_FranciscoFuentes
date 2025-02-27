package Farmacia.demo.service.impl;

import Farmacia.demo.dao.CategoriaDao;
import Farmacia.demo.domain.Categoria;
import Farmacia.demo.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Categoria> getCategorias(boolean activos) {
        if (activos) {
            return categoriaDao.findByActivoTrue();
        } else {
            return categoriaDao.findAll();
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<Categoria> obtenerTodas() {
        return categoriaDao.findAll();
    }
}