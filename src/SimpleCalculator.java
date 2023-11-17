import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame{

    private JButton btn_compute;
    private JTextArea Result_Output;
    private JComboBox cb_operation;
    private javax.swing.JPanel JPanel;
    private JTextField tf_num1;
    private JTextField tf_num2;

    public SimpleCalculator(){
        btn_compute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int num1 = Integer.parseInt(tf_num1.getText());
                int num2 = Integer.parseInt(tf_num2.getText());

                if(cb_operation.getSelectedIndex() == 0){
                    Result_Output.setText(String.valueOf(num1 + num2));
                }
                if(cb_operation.getSelectedIndex() == 1){
                    Result_Output.setText(String.valueOf(num1 - num2));
                }
                if(cb_operation.getSelectedIndex() == 2){
                    Result_Output.setText(String.valueOf(num1*num2));
                }
                if(cb_operation.getSelectedIndex() == 3){
                    Result_Output.setText(String.valueOf(num1/num2));
                }

            }
        });
            }



    public static void main(String[] args) {

        SimpleCalculator app = new SimpleCalculator();
        app.setContentPane(app.JPanel);
        app.setSize(1000, 400);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
