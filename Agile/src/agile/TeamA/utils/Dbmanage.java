package agile.TeamA.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dbmanage {
    public Connection initDB() {
        // ��ʼ�����ݿ����ӷ���
        Connection conn = null;
        // ����һ��Connection���
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // �������ݿ�����
            String url = "jdbc:mysql://localhost:3307/DemoDB?charaterEncoding=utf-8";
            // �������ݿ��ַurl�������ñ����ʽ
            conn = DriverManager.getConnection(url,"root", "admin");
            // �õ���������
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return conn;
        // �������ݿ�����
    }

    public void closeDB(Statement sta, Connection conn) {
        // �ر����ݿ����ӣ��޽������
        try {
            sta.close();
            conn.close();
        } catch (SQLException e) {

            e.printStackTrace();
        }

    }

    public void closeDB(ResultSet rs, Statement sta, Connection conn) {
        // �ر����ݿ����ӣ��н������
        try {
            rs.close();
            sta.close();
            conn.close();
        } catch (SQLException e) {

            e.printStackTrace();
        }

    }
}