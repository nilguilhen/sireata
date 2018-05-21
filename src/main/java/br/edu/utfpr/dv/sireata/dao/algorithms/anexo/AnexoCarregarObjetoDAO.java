
package br.edu.utfpr.dv.sireata.dao.algorithms.anexo;

import br.edu.utfpr.dv.sireata.dao.algorithms.CarregarObjetoDAO;
import br.edu.utfpr.dv.sireata.model.Anexo;
import br.edu.utfpr.dv.sireata.model.EntityDAO;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AnexoCarregarObjetoDAO implements CarregarObjetoDAO {
    
        public EntityDAO carregarObjeto(ResultSet rs) throws SQLException{
        
            	Anexo anexo = new Anexo();
		
		anexo.setIdAnexo(rs.getInt("idAnexo"));
		anexo.getAta().setIdAta(rs.getInt("idAta"));
		anexo.setDescricao(rs.getString("descricao"));
		anexo.setOrdem(rs.getInt("ordem"));
		anexo.setArquivo(rs.getBytes("arquivo"));
		
		return (EntityDAO)anexo;
	}
            
        
}

    