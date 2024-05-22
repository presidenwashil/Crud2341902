package crud2341902;

import java.sql.ResultSet;

public interface DatabaseOperations {
    public ResultSet tampilData();
    public String simpanData();
    public String ubahData();
    public String hapusData();
    public void cariData(String keyword);
    public ResultSet getHasil();
}