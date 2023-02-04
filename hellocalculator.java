import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class hellocalculator {
    private double total1=0.0;
    private double total2=0.0;
    private char math_operator;
    private JPanel jcalculator;
    private JTextField textdisplay;
    private JButton btnMultiply;
    private JButton btnTwo;
    private JButton btnThree;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnPoint;
    private JButton btnPlus;
    private JButton btnsix;
    private JButton btnNine;
    private JButton btnClear;
    private JButton btnMinus;
    private JButton btnDivide;
    private JButton btnEqual;
    private JButton btnOne;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnZero;


    private void getoperator(String btntext) {
        math_operator = btntext.charAt(0);
        total1 = total1 + Double.parseDouble(textdisplay.getText());
        textdisplay.setText("");
    }
    public hellocalculator() {
        btnOne.addActionListener(new ActionListener() { //btnOne
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText=textdisplay.getText()+btnOne.getText();
                textdisplay.setText(btnOneText);
            }
        });
        btnTwo.addActionListener(new ActionListener() { //btnTwo
            @Override
            public void actionPerformed(ActionEvent e) {
                String btntwoText=textdisplay.getText()+btnTwo.getText();
                textdisplay.setText(btntwoText);
            }
        });
        btnThree.addActionListener(new ActionListener() { //btnThree
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnthreeText=textdisplay.getText()+btnThree.getText();
                textdisplay.setText(btnthreeText);
            }
        });
        btnFour.addActionListener(new ActionListener() { //btnFour
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnfourText=textdisplay.getText()+btnFour.getText();
                textdisplay.setText(btnfourText);
            }
        });
        btnFive.addActionListener(new ActionListener() { //btnFive
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnfiveText=textdisplay.getText()+btnFive.getText();
                textdisplay.setText(btnfiveText);
            }
        });
        btnsix.addActionListener(new ActionListener() { //btnSix
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnsixText=textdisplay.getText()+btnsix.getText();
                textdisplay.setText(btnsixText);
            }
        });
        btnSeven.addActionListener(new ActionListener() { //btnSeven
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnsevenText=textdisplay.getText()+btnSeven.getText();
                textdisplay.setText(btnsevenText);
            }
        });
        btnEight.addActionListener(new ActionListener() { // btnEight
            @Override
            public void actionPerformed(ActionEvent e) {
                String btneightText=textdisplay.getText()+btnEight.getText();
                textdisplay.setText(btneightText);
            }
        });
        btnNine.addActionListener(new ActionListener() { // btnNine
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnnineText=textdisplay.getText()+btnNine.getText();
                textdisplay.setText(btnnineText);
            }
        });
        btnZero.addActionListener(new ActionListener() { // btnZero
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnzeroText=textdisplay.getText()+btnZero.getText();
                textdisplay.setText(btnzeroText);
            }
        });
        btnPlus.addActionListener(new ActionListener() { //btnPlus
            @Override
            public void actionPerformed(ActionEvent e) {
String button_text = btnPlus.getText();
            getoperator(button_text);}
        });
        btnEqual.addActionListener(new ActionListener() { //btnEqual
            @Override
            public void actionPerformed(ActionEvent e) {

                switch (math_operator){
                    case '+':
                        total2=total1 + Double.parseDouble(textdisplay.getText());
                        break;
                    case '-':
                        total2=total1-Double.parseDouble(textdisplay.getText());
                        break;
                    case '/':
                        total2=total1 / Double.parseDouble(textdisplay.getText());
                        break;
                    case '*':
                        total2=total1*Double.parseDouble(textdisplay.getText());
                        break;
                }
                textdisplay.setText(Double.toString(total2));
                total1=0;
            }
        });
        btnClear.addActionListener(new ActionListener() { //btnclear
            @Override
            public void actionPerformed(ActionEvent e) {
               total2=0;
               textdisplay.setText("");
            }
        });
        btnPoint.addActionListener(new ActionListener() { //btnpoint
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textdisplay.getText().equals("")){
                    textdisplay.setText("0.");
                }
                else if (textdisplay.getText().contains(".")) {
                   btnPoint.setEnabled(false);
                }else {
                    String btnPointText=textdisplay.getText()+btnPoint.getText();
                    textdisplay.setText(btnPointText);
                }
                btnPoint.setEnabled(true);
            }
        });
        btnMinus.addActionListener(new ActionListener() { //btnminus
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttton_text = btnMinus.getText();
                getoperator(buttton_text);
            }
        });
        btnDivide.addActionListener(new ActionListener() { //btndivide
            @Override
            public void actionPerformed(ActionEvent e) {
              String button_text =btnDivide.getText();
              getoperator(button_text);
            }
        });
        btnMultiply.addActionListener(new ActionListener() { //btnmultiply
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text =btnMultiply.getText();
                getoperator(button_text);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame("jcalculator");
        frame.setContentPane(new hellocalculator().jcalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
