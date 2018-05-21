
package br.edu.utfpr.dv.sireata.dao.algorithms;

import br.edu.utfpr.dv.sireata.model.EntityDAO;
import java.sql.SQLException;
import java.util.Set;

public interface BuscarPorIdDAO {
    
       public Set<? extends EntityDAO> buscarPorId(int value) throws SQLException;
    
}
