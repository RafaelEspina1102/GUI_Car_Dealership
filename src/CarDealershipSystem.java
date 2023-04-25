import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarDealershipSystem extends JFrame{
    private JPanel login;
    private JTextField txtName;
    private JButton btnClick;
public CarDealershipSystem() {
    btnClick.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            JOptionPane.showMessageDialog(btnClick, txtName.getText() + " Hello");
        }
    });
}

    public static void main(String[] args) {

    }

    public static void testing()
    {
        CarDealershipSystem h = new CarDealershipSystem();
        h.setContentPane(h.login);
        h.setTitle("Car Dealership");
        h.setSize(300, 400);
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
