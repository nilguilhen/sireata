
package br.edu.utfpr.dv.sireata.dao.algorithms.anexo;


import br.edu.utfpr.dv.sireata.dao.ConnectionDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.ExcluirDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AnexoExcluirDAO implements ExcluirDAO{
 
        @Override
        public void excluir(int value) throws SQLException{
                
                Connection conn = null;
		Statement stmt = null;
		
		try{
			conn = ConnectionDAO.getInstance().getConnection();
			stmt = conn.createStatement();
		
			stmt.execute("DELETE FROM anexos WHERE idanexo=" + String.valueOf(value));
		}finally{
			if((stmt != null) && !stmt.isClosed())
				stmt.close();
			if((conn != null) && !conn.isClosed())
				conn.close();
		}
        
        }
       
}
