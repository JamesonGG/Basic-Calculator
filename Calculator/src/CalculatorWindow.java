import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;


@SuppressWarnings("serial")
public class CalculatorWindow extends JFrame{
	public static int height;
	public static int width;
	public static JFrame frame;
    public static JTextPane jta;
    public static JTextField textA;
    public static JTextField textB;
    public static JLabel input1;
    public static JLabel input2;
    public static JTextField output;
    public static JComboBox<String> operator;
    public static JButton runButton;
	
	public static void main(String[] args) throws IOException {
		Init();
        
        runButton.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){  
        		String textValA = textA.getText();
        		String textValB = textB.getText();
                
                Calculator.a = Float.parseFloat(textValA);
                Calculator.b = Float.parseFloat(textValB);
                Calculator.operation = (String) operator.getSelectedItem();
                
        		float result = Calculator.result(Calculator.operation, Calculator.a, Calculator.b);
        	    String outputText = String.valueOf(result);
        	    output.setText(outputText);
        	}  
        }); 
	}
	
	
	public static void Init() {
		String[] op = new String[]{"add", "subtract", "multiply", "divide", "modulo", "power", "factorial", "sine", "cosine", "tangent", "absolute", "dec2imp", "imp2dec"};
		height = 300;
		width = 400;
		
		frame = new JFrame("Basic Calculator");
		input1 = new JLabel("Input 1: ");
		input2 = new JLabel("Input 2: ");
		jta = new JTextPane();
		textA = new JTextField("");
		textB = new JTextField("");
		output = new JTextField("");
		runButton = new JButton("Compute");
		operator = new JComboBox<>(op);
		
		frame.setLayout(new BorderLayout());
        frame.setSize(width, height);
		
        textA.setBounds(width/4, height/14, width/4, height/9);
        textB.setBounds(width/4, height/6, width/4, height/9);
        operator.setBounds(width/4, 3*height/11, width/4, height/9);
        runButton.setBounds(width/4, 2*height/5, width/2, height/9);
        output.setBounds(3*width/8, 2*height/3, width/4, height/9);
        input1.setBounds(width/8, height/14, width/4, height/9);
        input2.setBounds(width/8, height/6, width/4, height/9);
        
        frame.add(jta,BorderLayout.CENTER);
        frame.add(textA);
        frame.add(textB);
        frame.add(runButton);
        frame.add(output);
        frame.add(operator);
        frame.add(input1);
        frame.add(input2);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    	frame.setResizable(false);
    	output.setEditable(false);
    }
}
