package crud2341902;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUD extends Controller implements DatabaseOperations {
    private Connection CRUDkoneksi;
    private PreparedStatement CRUDpsmt;
    private Statement CRUDstat;
    private ResultSet CRUDhasil;
    private String CRUDquery;
    
    public CRUD() {
        try {
            KoneksiMysql  connection = new KoneksiMysql();
            CRUDkoneksi = connection.getKoneksi();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    @Override
    public ResultSet tampilData() {
        CRUDquery = "select * from siswa";
        try {
            CRUDstat = CRUDkoneksi.createStatement();
            CRUDhasil = CRUDstat.executeQuery(CRUDquery);
        } catch (Exception e) {
            //
        }
        return CRUDhasil;
    }
    
    @Override
    public String simpanData () {
        String result = "";
        CRUDquery = "insert into siswa values ( ?, ?, ? )";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, getID());
            CRUDpsmt.setString(2, getNama());
            CRUDpsmt.setString(3, getAlamat());
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
            result = "Data berhasil disimpan.";
        } catch (Exception e) {
            System.out.println(e);
            result = "Data gagal disimpan.";
        }
        return result;
    }

    @Override
    public String ubahData () {
        String result = "";
        CRUDquery = "update siswa set nama = ?, alamat = ? where id = ?";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, getNama());
            CRUDpsmt.setString(2, getAlamat());
            CRUDpsmt.setString(3, getID());
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
            result = "Data berhasil diubah.";
        } catch (Exception e) {
            System.out.println(e);
            result = "Data gagal diubah.";
        }
        return result;
    }

    @Override
    public String hapusData() {
        String result = "";
        CRUDquery = "delete from siswa where id = ?";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, getID());
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
            result = "Data berhasil dihapus.";
        } catch (Exception e) {
            System.out.println(e);
            result = "Data gagal dihapus.";
        }
        return result;
    }

    @Override
    public void cariData(String keyword) {
        CRUDquery = "select * from siswa where id like ? or nama like ? or alamat like ?";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, "%" + keyword + "%");
            CRUDpsmt.setString(2, "%" + keyword + "%");
            CRUDpsmt.setString(3, "%" + keyword + "%");
            CRUDhasil = CRUDpsmt.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public ResultSet getHasil() {
        return CRUDhasil;
    }
}