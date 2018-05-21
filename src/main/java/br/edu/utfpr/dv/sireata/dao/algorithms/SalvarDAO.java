
package br.edu.utfpr.dv.sireata.dao.algorithms;

import br.edu.utfpr.dv.sireata.model.EntityDAO;
import java.sql.SQLException;

public interface SalvarDAO {
    
    	public int salvar(EntityDAO newEntity) throws SQLException;
}
