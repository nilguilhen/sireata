
package br.edu.utfpr.dv.sireata.dao;

import br.edu.utfpr.dv.sireata.dao.algorithms.BuscarPorIdDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.CarregarObjetoDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.ExcluirDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.ListarPorAtaDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.SalvarDAO;
import br.edu.utfpr.dv.sireata.model.Anexo;
import br.edu.utfpr.dv.sireata.model.EntityDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;

public abstract class FullDAO {

    protected BuscarPorIdDAO buscarPorIDDAO;
    protected CarregarObjetoDAO carregarObjetoDAO;
    protected ListarPorAtaDAO listaPorAtaDAO;
    protected SalvarDAO salvarDAO;
    protected ExcluirDAO excluirDAO;

    public Set<? extends EntityDAO> buscar(int value) throws SQLException {
        return buscarPorIDDAO.buscarPorId(value);
    }

    public EntityDAO carregarObjeto(ResultSet rs) throws SQLException {
        return carregarObjetoDAO.carregarObjeto(rs);
    }

    public List<Anexo> listar(int value) throws SQLException {
        return listaPorAtaDAO.listarPorAta(value);
    }

    public int salvar(EntityDAO newEntity) throws SQLException {
        return salvarDAO.salvar(newEntity);
    }

    public void excluir(int value) throws SQLException {
        excluirDAO.excluir(value);
    }

}