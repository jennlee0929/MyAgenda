package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyAgendaOperator extends JFrame {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JPanel myAgendaDisplay;
    private JList list;
    private DateFormat date;

    public MyAgendaOperator(){
        add(myAgendaDisplay);

        setTitle("MyAgenda");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        DefaultListModel listModel = new DefaultListModel();

        list.setModel(listModel);

        listModel.addElement("Jennifer you should have known this");

        //int selectedIndex = list.getSelectedIndex();

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String eventContext = JOptionPane.showInputDialog("Enter the context of the event");

            }
        });


        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = list.getSelectedIndex();
                if (selectedIndex > -1) {
                    list.remove(selectedIndex);
                    listModel.remove(selectedIndex);
                }

            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //stuff you write here will happen if that button is pressed
                String test = JOptionPane.showInputDialog("enter something and look");
                listModel.addElement(test);

            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }

    public static void main(String[] args) {
        MyAgendaOperator myAgendaOperator = new MyAgendaOperator();
        myAgendaOperator.setVisible(true);
    }

}