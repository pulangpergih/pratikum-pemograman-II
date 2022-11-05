import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/*
 * @author 
 * Raka Dwi Kris Setiawan / 183040186
 */

public class biodata_table extends AbstractTableModel {
    private String[] columnNames = {"Nama", "Nomer HP", "Jenis Kelamin", "Alamat"};
    private ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();

    public int getColumnCount() {
        return columnNames.length;
    }
    public int getRowCount (){
        return data.size();
    }
    public String getColumnName(int col) {
        return columnNames[col];
    }
    public Object getValueAt(int row, int col){
        List<String> rowItem = data.get(row);
        return rowItem.get(col);
    }
    public boolean isCellEditable(int row, int col){
        return false;
    }
    public void add(ArrayList<String> value){
        data.add(value);
        fireTableRowsInserted(data.size() - 1, data.size() - 1);
    }
    public void add(Object value) {
    }
}
