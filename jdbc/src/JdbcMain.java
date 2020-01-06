import oracle.jdbc.OracleDriver;

import java.sql.*;

public class JdbcMain {
    public static void main(String[] args) throws Exception {
        JdbcMain ex = new JdbcMain();
        ex.execute();
    }
    Connection createConnection() throws SQLException{
        DriverManager.registerDriver(new OracleDriver());
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        Connection connection=DriverManager.getConnection(url,"scott","tiger");
        return connection;
    }

    public void  addRow(){
        try {
            Connection connection = createConnection();
            String sql = "insert into department(deptid,deptname) values(44,'CHE')";
            PreparedStatement statement = connection.prepareStatement(sql);
            int result=statement.executeUpdate();
            System.out.println("no of rows updated" + result);
         System.out.println("NO OF ROWS UPDATED IS:"+result);
        } catch (SQLException e) {
            System.out.println("hurrah!Asusually error came");
            e.printStackTrace();

        }
    }

    public void execute() throws SQLException {
        addRow();
        fetchAndDisplay();
    }
    public void fetchAndDisplay() throws SQLException {
     //   DriverManager.registerDriver(new OracleDriver());
     //   String url="jdbc:oracle:thin:@localhost:1521:orcl";
        Connection connection=createConnection();
        String sql="select * from department";
        PreparedStatement statement=connection.prepareStatement(sql);
        ResultSet resultSet=statement.executeQuery();
        while(resultSet.next())
        {
            int id=resultSet.getInt("deptid");
            String name=resultSet.getString("deptname");
            System.out.println("id: "+id+"name: "+name);
        }
    }
}


