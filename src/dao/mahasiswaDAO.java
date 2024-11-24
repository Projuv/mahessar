package dao;

import model.Mahasiswa;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class mahasiswaDAO {
    private static SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

    // Create
    public void saveMahasiswa(Mahasiswa mahasiswa) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(mahasiswa);
        tx.commit();
        session.close();
    }

    // Read
    public Mahasiswa getMahasiswa(int id) {
        Session session = factory.openSession();
        Mahasiswa mahasiswa = (Mahasiswa) session.get(Mahasiswa.class, id);
        session.close();
        return mahasiswa;
    }

    // Update
    public void updateMahasiswa(int id, String npm, String nama, int tinggi, String pindahan) {
    Session session = factory.openSession();
    Transaction tx = session.beginTransaction();

    // Mencari mahasiswa berdasarkan ID
    Mahasiswa mahasiswa = (Mahasiswa) session.get(Mahasiswa.class, id);
    if (mahasiswa != null) {
        mahasiswa.setNpm(npm);
        mahasiswa.setNama(nama);
        mahasiswa.setTinggi(tinggi);
        mahasiswa.setPindahan(pindahan); // Pastikan ini menggunakan String

        session.update(mahasiswa);
        tx.commit();
    } else {
        System.out.println("Mahasiswa dengan ID " + id + " tidak ditemukan.");
    }
    session.close();
}


    // Delete
    public void deleteMahasiswa(int id) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        // Mencari mahasiswa berdasarkan ID
        Mahasiswa mahasiswa = (Mahasiswa) session.get(Mahasiswa.class, id);
        if (mahasiswa != null) {
            session.delete(mahasiswa); // Menghapus mahasiswa
            tx.commit();
        } else {
            System.out.println("Mahasiswa dengan ID " + id + " tidak ditemukan.");
        }

        session.close();
    }
}

