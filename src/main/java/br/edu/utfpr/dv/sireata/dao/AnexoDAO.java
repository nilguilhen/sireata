package br.edu.utfpr.dv.sireata.dao;

import br.edu.utfpr.dv.sireata.dao.algorithms.BuscarPorIdDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.CarregarObjetoDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.ExcluirDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.ListarPorAtaDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.SalvarDAO;


public class AnexoDAO extends FullDAO {
	
        BuscarPorIdDAO buscarPorIdDAO;
        CarregarObjetoDAO carregarObjetoDAO;
        ExcluirDAO excluirDAO;
        ListarPorAtaDAO listarPorAtaDAO;
        SalvarDAO salvarDAO;
    
       
        public AnexoDAO(BuscarPorIdDAO buscar,
                        CarregarObjetoDAO carregar,
                        ExcluirDAO excluir,
                        ListarPorAtaDAO listar,
                        SalvarDAO salvar){
       
            this.buscarPorIdDAO = buscar;
            this.carregarObjetoDAO = carregar;
            this.excluirDAO = excluir;
            this.listarPorAtaDAO = listar;
            this.salvarDAO = salvar;
        }
}