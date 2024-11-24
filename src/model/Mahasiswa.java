package model;

import javax.persistence.*;

@Entity
@Table(name = "mahasiswa")
public class Mahasiswa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String npm;
    private String nama;
    private int tinggi;
    private String pindahan; // Ubah tipe data dari boolean ke String

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNpm() { return npm; }
    public void setNpm(String npm) { this.npm = npm; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public int getTinggi() { return tinggi; }
    public void setTinggi(int tinggi) { this.tinggi = tinggi; }

    public String getPindahan() { return pindahan; } // Getter untuk String pindahan
    public void setPindahan(String pindahan) { this.pindahan = pindahan; } // Setter untuk String pindahan
}
