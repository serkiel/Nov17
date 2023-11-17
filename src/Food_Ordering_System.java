import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Food_Ordering_System extends JFrame{
    private JPanel JPanel;
    private JButton btnOrder;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    public Food_Ordering_System(){
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double sum = 0;
                double discount = 0;
                if(cPizza.isSelected()){
                    sum += 100;
                }
                if(cBurger.isSelected()){
                    sum += 80;
                }
                if(cFries.isSelected()){
                    sum += 65;
                }
                if(cSoftDrinks.isSelected()){
                    sum += 55;
                }
                if(cTea.isSelected()){
                    sum += 50;
                }
                if(cSundae.isSelected()){
                    sum += 40;
                }
                if(rb15.isSelected()){
                    discount *= 0.15;
                    sum -= discount;
                }
                if(rb10.isSelected()){
                    discount *= 0.10;
                    sum -= discount;
                }
                if(rbNone.isSelected()){
                    sum += 0;
                }
                JOptionPane.showMessageDialog(null, "The total price is Php " + String.format("%.2f", sum));
            }
        });
    }

    public static void main(String[] args) {

        Food_Ordering_System app = new Food_Ordering_System();
        app.setContentPane(app.JPanel);
        app.setSize(1000, 400);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
