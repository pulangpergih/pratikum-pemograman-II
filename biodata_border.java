import java.awt.Component;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;


/*
 * @author 
 * Raka Dwi Kris Setiawan / 183040186
 */

public class biodata_border extends JFrame {

public biodata_border(){
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel labelInput = new JLabel("Nama :");
    labelInput.setBounds(15,20,350,20);
    
    JLabel labelInput1 = new JLabel("No. HP :");
    labelInput1.setBounds(15,80,350,10);

    JLabel labelInput2 = new JLabel("Alamat :");
    labelInput2.setBounds(15,145,350,20);

    JTextField textField = new JTextField();
    textField.setBounds(15,40,350,30);
    JTextField textField1 = new JTextField();
    textField1.setBounds(15,100,350,30);
    JTextField textField2 = new JTextField();
    textField2.setBounds(15,170,350,50);

    JLabel labelRadio = new JLabel("Jenis Kelamin :");
    labelRadio.setBounds(15,220,350,30);

    JRadioButton radioButton1 = new JRadioButton("Laki - Laki", true);
    radioButton1.setBounds(12,240,350,30);
    JRadioButton radioButton2 = new JRadioButton("Perempuan", true);
    radioButton2.setBounds(12,265,350,30);

    ButtonGroup bg = new ButtonGroup();
    bg.add(radioButton1);
    bg.add(radioButton2);

    javax.swing.JTable table = new JTable();
    JScrollPane scrollableTable = new JScrollPane(table);
    scrollableTable.setBounds(15,350,500,100);

    JButton button= new JButton("Simpan");
    button.setBounds(15,300,100,40);

    biodata_table tableModel = new biodata_table();
    table.setModel(tableModel);

    button.addActionListener(new ActionListener(){
        private Component biodata_border;

        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(biodata_border, "APAKAH ANDA YAKIN ?");
            String Kategori = "";
            if(radioButton1.isSelected()){
                Kategori = radioButton1.getText();
            }
            if(radioButton2.isSelected()){
                Kategori = radioButton2.getText();
            }
            String hp = textField1.getText();
            String nama = textField.getText();
            String alamat = textField2.getText();
            tableModel.add(new ArrayList<>(Arrays.asList(nama, hp, Kategori, alamat )));
            
        }

      
      
    });

    this.add(button);
    this.add(textField);
    this.add(textField1);
    this.add(textField2);
    this.add(labelRadio);
    this.add(radioButton1);
    this.add(radioButton2);
    this.add(labelInput);
    this.add(labelInput1);
    this.add(labelInput2);
    this.add(scrollableTable);
    this.setSize(550,550);
    this.setLayout(null);   
}    

    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                biodata_border h = new biodata_border();
                h.setVisible(true);
                
            }
        });
}   
}
