
package br.edu.utfpr.dv.sireata.dao.algorithms;

import br.edu.utfpr.dv.sireata.model.Anexo;
import java.sql.SQLException;
import java.util.List;

public interface ListarPorAtaDAO {
    
    public List<Anexo> listarPorAta(int value) throws SQLException;

    
}
