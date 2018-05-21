
package br.edu.utfpr.dv.sireata.dao.algorithms;


import br.edu.utfpr.dv.sireata.model.EntityDAO;
import java.sql.ResultSet;
import java.sql.SQLException;


public interface CarregarObjetoDAO {
    
    public EntityDAO carregarObjeto(ResultSet rs) throws SQLException;
  
}
