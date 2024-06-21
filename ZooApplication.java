import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ZooApplication extends JFrame {
    private ArrayList<iAnimal> animals;

    public ZooApplication() {
        animals = new ArrayList<>();

        setTitle("Zoo Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JTextField animalTypeField = new JTextField(10);
        JTextField idTagField = new JTextField(10);
        JButton addButton = new JButton("Add Animal");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String animalType = animalTypeField.getText();
                int idTag = Integer.parseInt(idTagField.getText());

                iAnimal newAnimal;

                if ("Dolphin".equalsIgnoreCase(animalType)) {
                    newAnimal = new Dolphin(idTag);
                } else if ("Hawk".equalsIgnoreCase(animalType)) {
                    newAnimal = new Hawk(idTag);
                } else {
                    JOptionPane.showMessageDialog(ZooApplication.this,
                            "Invalid animal type", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                boolean found = false;
                for (iAnimal animal : animals) {
                    if (animal.compareTo(newAnimal) == 0) {
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    animals.add(newAnimal);
                    JOptionPane.showMessageDialog(ZooApplication.this,
                            "Animal added successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(ZooApplication.this,
                            "Animal already exists", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        add(new JLabel("Animal Type:"));
        add(animalTypeField);
        add(new JLabel("ID Tag:"));
        add(idTagField);
        add(addButton);

        pack();
        setLocationRelativeTo(null); // Center the frame on the screen
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ZooApplication app = new ZooApplication();
            app.setVisible(true);
        });
    }
}
