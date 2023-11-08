
package controlador;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.CampoDeportivo;



public class Ctrl_CampoDeportivo {
    
    
        public boolean guardar(CampoDeportivo objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into tb_campodeportivo values(?,?,?,?,?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getUbicacion());
            consulta.setString(4, objeto.getFvalido());
            consulta.setString(5, objeto.getFtamaño());
            consulta.setDouble(6, objeto.getFprecioMinuto());
            
            consulta.setString(7, objeto.getVvalido());
            consulta.setString(8, objeto.getVtamaño());
            consulta.setDouble(9, objeto.getVprecioMinuto());
            
            consulta.setString(10, objeto.getBvalido());
            consulta.setString(11, objeto.getBtamaño());
            consulta.setDouble(12, objeto.getBprecioMinuto());
         
            

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar campo deportivo: " + e);
        }

        return respuesta;
    }
        
        
        
         public boolean existeCategoria(String campodeportivo) {
        boolean respuesta = false;
        String sql = "select descripcion from tb_campodeportivo where nombre = '" + campodeportivo + "';";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar campo deportivo: " + e);
        }
        return respuesta;
    }
         
         
    public boolean actualizar(CampoDeportivo objeto, int idCampo) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {

            PreparedStatement consulta = 
          cn.prepareStatement("update tb_campodeportivo set nombre=?,ubicacion=? ,Fvalido=?, Ftamaño=?,FprecioMinuto=?,"
                  + "Vvalido=?, Vtamaño=?,VprecioMinuto=?, Bvalido=?, Btamaño=?,BprecioMinuto=? where idCampo ='" + idCampo + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getUbicacion());
            consulta.setString(3, objeto.getFvalido());
            consulta.setString(4, objeto.getFtamaño());
            consulta.setDouble(5, objeto.getFprecioMinuto());
            
            consulta.setString(6, objeto.getVvalido());
            consulta.setString(7, objeto.getVtamaño());
            consulta.setDouble(8, objeto.getVprecioMinuto());
            
            consulta.setString(9, objeto.getBvalido());
            consulta.setString(10, objeto.getBtamaño());
            consulta.setDouble(11, objeto.getBprecioMinuto());
         
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al actualizar campo deportivo: " + e);
        }

        return respuesta;
    }
    
    
  
    public boolean eliminar(int idCampo) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement(
                    "delete from tb_campodeportivo where idCampo ='" + idCampo + "'");
            consulta.executeUpdate();
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al eliminar campo deportivo : " + e);
        }

        return respuesta;
    }    
         
         
         
         
}
