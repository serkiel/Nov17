package Nov10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anything extends JFrame{
    private JButton btn_okay;
    private JTextField tf_name;
    private JRadioButton male_RadioButton;
    private JRadioButton female_RadioButton;
    private JRadioButton others_RadioButton;
    private JTextArea taOutput;
    private JComboBox cb_Program;
    private JPanel jpanel;
    private JCheckBox Checkbox_C;
    private JCheckBox Checkbox_Java;
    private JCheckBox Checkbox_cplusplus;
    private JCheckBox CheckBox_all;

    public Anything() {
        btn_okay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello");
                String name = tf_name.getText();
                if(name.equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter name");
                }
                taOutput.setText("\nHello " + name);

                if(cb_Program.getSelectedIndex() == 0){
                    int res = JOptionPane.showConfirmDialog(null, "No program. Use BSCS?");
                    if(res == JOptionPane.YES_OPTION){
                        cb_Program.setSelectedIndex(2);
                    }else{
                        cb_Program.setForeground(Color.CYAN);
                        return;
                    }
                }


                cb_Program.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        cb_Program.setForeground(Color.BLACK);
                    }
                });


                JRadioButton[] bgGender = {male_RadioButton, female_RadioButton, others_RadioButton};
                others_RadioButton.setSelected(true);
                for(JComponent comp : bgGender){
                    comp.setFont(new Font(null, Font.BOLD, 26));
                    comp.setForeground(Color.orange);
                }
                for (JRadioButton bgGen : bgGender){
                    if(bgGen.isSelected()){
                        taOutput.append("\nYour gender: " + bgGen.getText());
                    }
                }
                taOutput.append("\nYour program is: " + cb_Program.getSelectedItem());
                JCheckBox[] bgLanguage = {Checkbox_Java, Checkbox_C, Checkbox_cplusplus};
                taOutput.append("\nLanguages learned: ");
                int prg = 0;
                for(JCheckBox comp : bgLanguage){
                    if(comp.isSelected()){
                        taOutput.append(comp.getText() + " ");
                        prg++;
                    }
                }

                if(prg == 0) taOutput.append("No languages learned");
                CheckBox_all.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }
                });

             }
        });
    }

    public static void main(String[] args) {
        Anything app = new Anything();
        app.setSize(1000, 400);
        app.setContentPane(app.jpanel);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Hello World");
        app.setVisible(true);
    }


}
