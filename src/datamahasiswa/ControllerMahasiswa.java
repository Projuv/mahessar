/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datamahasiswa;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ControllerMahasiswa {
    ArrayList<DataMahasiswa> ArrayData;
    DefaultTableModel tabellist;
    
    public ControllerMahasiswa(){
        ArrayData = new ArrayList<DataMahasiswa>();
    }
    public void InsertData(String npm, String nama, int tinggi, boolean pindahan ){
       DataMahasiswa mhs = new DataMahasiswa(npm, nama, tinggi, pindahan);
       ArrayData.add(mhs);
    }

    TableModel showData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
