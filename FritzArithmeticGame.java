
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class FritzArithmeticGame extends JFrame {
    private JComboBox<String> operationBox;
    private JComboBox<String> levelBox;
    private JTextField num1Field, num2Field, answerField;
    private JLabel operatorLabel, correctLabel, incorrectLabel;
    private JButton submitButton, newQuestionButton;
    private int correctCount = 0, incorrectCount = 0;
    private int num1, num2;
    private String operation;

    public FritzArithmeticGame() {
        setTitle("Fritz's Arithmetic Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout(10, 10));

    
        JLabel title = new JLabel("FRITZ'S ARITHMETIC GAME", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        add(title, BorderLayout.NORTH);


        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout());

        num1Field = new JTextField(5);
        num1Field.setEditable(false);
        operatorLabel = new JLabel("+", SwingConstants.CENTER);
        num2Field = new JTextField(5);
        num2Field.setEditable(false);
        answerField = new JTextField(5);

        submitButton = new JButton("Submit");
        newQuestionButton = new JButton("New Question");

        centerPanel.add(num1Field);
        centerPanel.add(operatorLabel);
        centerPanel.add(num2Field);
        centerPanel.add(new JLabel("="));
        centerPanel.add(answerField);
        centerPanel.add(submitButton);
        centerPanel.add(newQuestionButton);

        add(centerPanel, BorderLayout.CENTER);

    
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(3, 2, 5, 5));

        bottomPanel.add(new JLabel("Operation:"));
        operationBox = new JComboBox<>(new String[]{"Addition", "Subtraction", "Multiplication", "Division"});
        bottomPanel.add(operationBox);

        bottomPanel.add(new JLabel("Level:"));
        levelBox = new JComboBox<>(new String[]{"Level 1 (1-100)", "Level 2 (101-500)", "Level 3 (501-1000)"});
        bottomPanel.add(levelBox);

        correctLabel = new JLabel("Correct: 0");
        incorrectLabel = new JLabel("Incorrect: 0");

        bottomPanel.add(correctLabel);
        bottomPanel.add(incorrectLabel);

        add(bottomPanel, BorderLayout.SOUTH);

    
        newQuestionButton.addActionListener(e -> generateQuestion());
        submitButton.addActionListener(e -> checkAnswer());
        operationBox.addActionListener(e -> generateQuestion());
        levelBox.addActionListener(e -> generateQuestion());

        generateQuestion();
        setVisible(true);
    }

    private void generateQuestion() {
        Random rand = new Random();

        int min = 1, max = 100;
        switch (levelBox.getSelectedIndex()) {
            case 1 -> { min = 101; max = 500; }
            case 2 -> { min = 501; max = 1000; }
        }

        num1 = rand.nextInt(max - min + 1) + min;
        num2 = rand.nextInt(max - min + 1) + min;
        operation = (String) operationBox.getSelectedItem();

        operatorLabel.setText(getOperatorSymbol(operation));

    
        if ("Division".equals(operation)) {
            num1 = num1 * num2;
        }

        num1Field.setText(String.valueOf(num1));
        num2Field.setText(String.valueOf(num2));
        answerField.setText("");
    }

    private String getOperatorSymbol(String operation) {
        return switch (operation) {
            case "Addition" -> "+";
            case "Subtraction" -> "-";
            case "Multiplication" -> "×";
            case "Division" -> "÷";
            default -> "?";
        };
    }

    private void checkAnswer() {
        try {
            double userAnswer = Double.parseDouble(answerField.getText());
            double correctAnswer = switch (operation) {
                case "Addition" -> num1 + num2;
                case "Subtraction" -> num1 - num2;
                case "Multiplication" -> (double) num1 * num2;
                case "Division" -> (double) num1 / num2;
                default -> 0;
            };

            if (Math.abs(userAnswer - correctAnswer) < 0.0001) {
                correctCount++;
                JOptionPane.showMessageDialog(this, "Correct!");
            } else {
                incorrectCount++;
                String formattedAnswer = (correctAnswer % 1 == 0) ? 
                    String.format("%.0f", correctAnswer) : 
                    String.valueOf(correctAnswer);
                JOptionPane.showMessageDialog(this, "Incorrect! Correct answer: " + formattedAnswer);
            }

            updateScore();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number.");
        }
    }

    private void updateScore() {
        correctLabel.setText("Correct: " + correctCount);
        incorrectLabel.setText("Incorrect: " + incorrectCount);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FritzArithmeticGame::new);
    }
}