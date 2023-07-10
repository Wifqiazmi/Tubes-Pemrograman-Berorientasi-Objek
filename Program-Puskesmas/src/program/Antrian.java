package program;

abstract class Antrian {
    public int cekDataPasien(Pasien pasien){return 0;};
    public int cekDataDokter(Dokter dokter){return 0;};
    public String getIdPasienDatabase(String nomorAntrian){return "";};
    public void inputDatabaseAntrian(String nomorAntrian, Pasien pasien, Dokter dokter){};
    public void updateDatabaseAntrian(String nomorAntrian, Pasien pasien, Dokter dokter){};
    public void deleteDatabaseAntrian(String nomorAntrian){};
    
}
