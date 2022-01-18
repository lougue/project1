package Start;

import java.sql.*;

public class DemoJdbc {

    public static void main(String[] args) {
        //Information d`acces a la base de donnees
        String url="jdbc:mysql://localhost/formation";
        String login = "root";
        String password = "root";

        try {

        //Etape 2: recuperation de la connexion
            Connection cn = DriverManager.getConnection(url, login, password);

            //Etape 3: preparation de la requette
            Statement st = cn.createStatement();
            String sql = "SELECT * FROM utilisateurs";

            //Etape 4: execution de la requette
            ResultSet rs = st.executeQuery(sql);

            //Etape 5: parcours result
            while (rs.next()){
                System.out.println(rs.getString("prenom"));
            }
        }

    catch (SQLException e){
        System.out.println("Erreur de service");
        e.printStackTrace();
        }
    }
}
