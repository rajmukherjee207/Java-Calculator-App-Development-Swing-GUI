import java.awt.EventQueue;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.DropMode;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class My_Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtJtextfield;
	private final ButtonGroup buttonGroup = new ButtonGroup(); // Create a ButtonGroup
	private double firstNum;
	private double secondNum;
	private double result;
	private String operation;

	
	//important otherwise error occure
   // private JButton btnAdd, btnSubtract, btnMultiply, btnDivide, btnEqual, btnNumber0, btnNumber1, btnNumber2, btnNumber3, btnNumber4, btnNumber5, btnNumber6, btnNumber7, btnNumber8, btnNumber9, btnPoint, btnClear, btnBackspace;
	
	private JButton btnAdd;
	private JButton btnSubtract;
	private JButton btnMultiply;
	private JButton btnDivide;
	private JButton btnEqual;
	private JButton btnNumber0;
	private JButton btnNumber1;
	private JButton btnNumber2;
	private JButton btnNumber3;
	private JButton btnNumber4;
	private JButton btnNumber5;
	private JButton btnNumber6;
	private JButton btnNumber7;
	private JButton btnNumber8;
	private JButton btnNumber9;
	private JButton btnPoint;
	private JButton btnClear;
	private JButton btnBackspace;
	
    
    
    
    /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					My_Calculator frame = new My_Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public My_Calculator() {
		setLocation(new Point(250, 500));
		setResizable(true);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 332, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null); // Set layout to null for absolute positioning
		setContentPane(contentPane);

		txtJtextfield = new JTextField();
		txtJtextfield.setHorizontalAlignment(SwingConstants.RIGHT);
		txtJtextfield.setFont(new Font("Tahoma", Font.BOLD, 23));
	  //txtJtextfield.setDropMode(DropMode.INSERT); // Use a valid drop mode
		txtJtextfield.setBounds(10, 50, 293, 45); // Set initial position and size
		contentPane.add(txtJtextfield);
		txtJtextfield.setColumns(10);

		// radio button ON OFF
		JRadioButton rdbtnOn = new JRadioButton("ON");
        buttonGroup.add(rdbtnOn); // Add to ButtonGroup
        rdbtnOn.setFont(new Font("Tahoma", Font.BOLD, 11));
        rdbtnOn.setBounds(10, 102, 55, 23);
        contentPane.add(rdbtnOn);

        JRadioButton rdbtnOff = new JRadioButton("OFF");
        buttonGroup.add(rdbtnOff); // Add to ButtonGroup
        rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 11));
        rdbtnOff.setBounds(10, 128, 55, 23);
        contentPane.add(rdbtnOff);
        
        
     // ActionListener for enabling or disabling the calculator
        ActionListener onOffListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean enabled = rdbtnOn.isSelected();
                enableComponents(enabled);
            }
        };

        rdbtnOn.addActionListener(onOffListener);
        rdbtnOff.addActionListener(onOffListener);

        // Initialize buttons
        initializeButtons();

        // Initially, turn off the calculator
        enableComponents(false);
    }
	
	/**
     * Method to initialize all buttons.
     */
	private void initializeButtons() {
        // Backspace button
        btnBackspace = new JButton("<--");
        btnBackspace.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnBackspace.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String backspace = null;
                if (txtJtextfield.getText().length() > 0) {
                    StringBuilder strB = new StringBuilder(txtJtextfield.getText());
                    strB.deleteCharAt(txtJtextfield.getText().length() - 1);
                    backspace = strB.toString();
                    txtJtextfield.setText(backspace);
				}
			}
		});
        btnBackspace.setBounds(68, 106, 63, 31);
        contentPane.add(btnBackspace);
//        C
	    btnClear = new JButton("C");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtJtextfield.setText(null);
			}
		});
		btnClear.setBounds(153, 104, 63, 33);
		contentPane.add(btnClear);


//        7
	    btnNumber7 = new JButton("7");
		btnNumber7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtJtextfield.getText() + "7";
				txtJtextfield.setText(enterNumber);
			}
		});
		btnNumber7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNumber7.setBounds(10, 158, 63, 33);
		contentPane.add(btnNumber7);

//        4 btnNumber4
		 btnNumber4 = new JButton("4");
		btnNumber4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtJtextfield.getText() + "4";
				txtJtextfield.setText(enterNumber);
			}
		});
		btnNumber4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNumber4.setBounds(10, 202, 63, 33);
		contentPane.add(btnNumber4);

//        1 btnNumber1
		btnNumber1 = new JButton("1");
		btnNumber1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtJtextfield.getText() + "1";
				txtJtextfield.setText(enterNumber);
			}
		});
		btnNumber1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNumber1.setBounds(10, 251, 63, 33);
		contentPane.add(btnNumber1);

//        0  btnNumber0
		 btnNumber0 = new JButton("0");
		btnNumber0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtJtextfield.getText() + "0";
				txtJtextfield.setText(enterNumber);
			}
		});
		btnNumber0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNumber0.setBounds(10, 295, 63, 33);
		contentPane.add(btnNumber0);

//        8 btnNumber8
		 btnNumber8 = new JButton("8");
		btnNumber8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtJtextfield.getText() + "8";
				txtJtextfield.setText(enterNumber);
			}
		});
		btnNumber8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNumber8.setBounds(88, 158, 63, 33);
		contentPane.add(btnNumber8);

//        5 btnNumber5
		 btnNumber5 = new JButton("5");
		btnNumber5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtJtextfield.getText() + "5";
				txtJtextfield.setText(enterNumber);
			}
		});
		btnNumber5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNumber5.setBounds(88, 202, 63, 33);
		contentPane.add(btnNumber5);

//        2 btnNumber2
		 btnNumber2 = new JButton("2");
		btnNumber2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtJtextfield.getText() + "2";
				txtJtextfield.setText(enterNumber);
			}
		});
		btnNumber2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNumber2.setBounds(88, 251, 63, 33);
		contentPane.add(btnNumber2);

//        . btnPoint
	 btnPoint = new JButton(".");
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtJtextfield.getText() + ".";
				txtJtextfield.setText(enterNumber);
			}
		});
		btnPoint.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPoint.setBounds(88, 295, 63, 33);
		contentPane.add(btnPoint);

//        9 btnNumber9
		 btnNumber9 = new JButton("9");
		btnNumber9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtJtextfield.getText() + "9";
				txtJtextfield.setText(enterNumber);
			}
		});
		btnNumber9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNumber9.setBounds(167, 158, 63, 33);
		contentPane.add(btnNumber9);

//        6 btnNumber6
		btnNumber6 = new JButton("6");
		btnNumber6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtJtextfield.getText() + "6";
				txtJtextfield.setText(enterNumber);
			}
		});
		btnNumber6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNumber6.setBounds(167, 202, 63, 33);
		contentPane.add(btnNumber6);

//        3 btnNumber3
		btnNumber3 = new JButton("3");
		btnNumber3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtJtextfield.getText() + "3";
				txtJtextfield.setText(enterNumber);
			}
		});
		btnNumber3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNumber3.setBounds(167, 251, 63, 33);
		contentPane.add(btnNumber3);
		
		

//        = btnEqual           Equals button action listener
		btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String[] parts = txtJtextfield.getText().split(" ");
		        firstNum = Double.parseDouble(parts[0]);
		        secondNum = Double.parseDouble(parts[2]);

		        switch (operation) {
		            case "+":
		                result = firstNum + secondNum;
		                break;
		            case "-":
		                result = firstNum - secondNum;
		                break;
		            case "*":
		                result = firstNum * secondNum;
		                break;
		            case "/":
		                result = firstNum / secondNum;
		                break;
		        }
		        txtJtextfield.setText(String.valueOf(result));
		    }
		});

		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEqual.setBounds(167, 295, 136, 33);
		contentPane.add(btnEqual);
		
//      + btnAdd
	    btnAdd = new JButton("+");
	    btnAdd.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	/*This is code if we  dont want to display number side by side ---> sidefirstNum = Double.parseDouble(txtJtextfield.getText());
				txtJtextfield.setText("");
				or
				If u want to display number side by side with operator ---> String enterNumber = txtJtextfield.getText() + " + ";
	            txtJtextfield.setText(enterNumber);
	            operation = "+";
				*/
	        	
	            String enterNumber = txtJtextfield.getText() + " + ";
	            txtJtextfield.setText(enterNumber);
	            operation = "+";
	        }
	    });


		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAdd.setBounds(240, 104, 63, 33);
		contentPane.add(btnAdd);
		
		
//      - btnSubtract
		btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            String enterNumber = txtJtextfield.getText() + " - ";
	            txtJtextfield.setText(enterNumber);
	            operation = "-";
	        }
	    });

		btnSubtract.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSubtract.setBounds(240, 158, 63, 33);
		contentPane.add(btnSubtract);

//        * btnMultiply
		btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtJtextfield.getText() + " * ";
		        txtJtextfield.setText(enterNumber);
				operation = "*";
			}
		});
		
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMultiply.setBounds(240, 202, 63, 33);
		contentPane.add(btnMultiply);

//        /  btnDivide
		btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtJtextfield.getText() + " / ";
		        txtJtextfield.setText(enterNumber);
				operation = "/";
			}
		});
			
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDivide.setBounds(240, 251, 63, 33);
		contentPane.add(btnDivide);
	}
		/**
	     * Method to enable or disable all buttons and text field.
	     */
	    private void enableComponents(boolean enable) {
	        txtJtextfield.setEnabled(enable);
	        btnAdd.setEnabled(enable);
	        btnSubtract.setEnabled(enable);
	        btnMultiply.setEnabled(enable);
	        btnDivide.setEnabled(enable);
	        btnEqual.setEnabled(enable);
	        btnNumber0.setEnabled(enable);
	        btnNumber1.setEnabled(enable);
	        btnNumber2.setEnabled(enable);
	        btnNumber3.setEnabled(enable);
	        btnNumber4.setEnabled(enable);
	        btnNumber5.setEnabled(enable);
	        btnNumber6.setEnabled(enable);
	        btnNumber7.setEnabled(enable);
	        btnNumber8.setEnabled(enable);
	        btnNumber9.setEnabled(enable);
	        btnPoint.setEnabled(enable);
	        btnClear.setEnabled(enable);
	        btnBackspace.setEnabled(enable);
	

	}

}
