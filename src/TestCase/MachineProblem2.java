package TestCase;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;

public class MachineProblem2 {

    static ProgramLogic pl = new ProgramLogic();

    public static void main(String[] args) {
        pl.setArray();
        SwingMe ewan = new SwingMe();
        ewan.setVisible(true);
    }

}

class SwingMe extends JFrame implements ActionListener {

    ProgramLogic pl = new ProgramLogic();

    //Components
    //Labels
    JLabel lbl_phrase = new JLabel("Enter Phrases/Sentence Here:");
    JLabel lbl_results = new JLabel("Result:");
    //
    JLabel lbl_replace = new JLabel("Replace:");
    JLabel lbl_with = new JLabel("With:");
    //
    JLabel lbl_word = new JLabel("Word:");
    JLabel lbl_index = new JLabel("Index:");

    //Textfields
    JTextField txt_phrase = new JTextField(33);
    JTextField txt_results = new JTextField(33);
    //
    JTextField txt_replace = new JTextField(10);
    JTextField txt_with = new JTextField(10);
    //
    JTextField txt_word = new JTextField(10);
    JTextField txt_index = new JTextField(10);

    //Button
    JButton cmd_replace = new JButton("Replace Word");
    JButton cmd_insert = new JButton("Insert Word");
    //
    JButton cmd_submit = new JButton("Submit");
    JButton cmd_rep = new JButton("Replace");
    JButton cmd_search = new JButton("Search");
    JButton cmd_delete = new JButton("Delete");
    JButton cmd_ins = new JButton("Insert");
    JButton cmd_clear = new JButton("Clear");
    JButton cmd_reset = new JButton("Reset");

    //Fonts
    Font fnt_labels = new Font("courier new", Font.BOLD, 15);
    Font fnt_txtup = new Font("courier new", Font.BOLD, 20);
    Font fnt_txtupPlain = new Font("courier new", Font.PLAIN, 20);
    Font fnt_ordinary = new Font("courier new", Font.PLAIN, 15);
    Font fnt_buttons = new Font("courier new", Font.PLAIN, 15);

    //Layouts
    FlowLayout flow = new FlowLayout(FlowLayout.LEFT, 10, 10);
    FlowLayout right = new FlowLayout(FlowLayout.RIGHT, 10, 15);
    GridLayout grid = new GridLayout(7, 1, 5, 5);

    //Panels
    JPanel pnl_up = new JPanel();
    JPanel pnl_left = new JPanel();
    JPanel pnl_right = new JPanel();
    JPanel pnl_down = new JPanel();
    JPanel pnl_compress = new JPanel();
    JPanel pnl_buttons = new JPanel();

    public SwingMe() {
        setTitle("Text Editor");
        //setSize(645, 455);
        //465,525

        setResizable(false);

        //Buttons Set
        cmd_replace.setFont(fnt_ordinary);
        cmd_insert.setFont(fnt_ordinary);
        //
        cmd_submit.setFont(fnt_buttons);
        cmd_rep.setFont(fnt_buttons);
        cmd_search.setFont(fnt_buttons);
        cmd_delete.setFont(fnt_buttons);
        cmd_ins.setFont(fnt_buttons);
        cmd_clear.setFont(fnt_buttons);
        cmd_reset.setFont(fnt_buttons);

        //Labels Set Font
        lbl_phrase.setFont(fnt_labels);
        lbl_results.setFont(fnt_labels);
        lbl_replace.setFont(fnt_labels);
        lbl_with.setFont(fnt_labels);
        lbl_word.setFont(fnt_labels);
        lbl_index.setFont(fnt_labels);

        //----------------------------------------------------------------------
        //                          PANEL UP
        //----------------------------------------------------------------------
        //txt_phrase
        txt_phrase.setFont(fnt_txtupPlain);
        txt_phrase.setBounds(5, 5, 100, 100);
        txt_phrase.setPreferredSize(new Dimension(100, 50));
        txt_phrase.setHorizontalAlignment(JTextField.CENTER);

        //txt_results
        txt_results.setFont(fnt_txtup);
        txt_results.setBounds(5, 5, 100, 100);
        txt_results.setPreferredSize(new Dimension(100, 50));
        txt_results.setHorizontalAlignment(JTextField.CENTER);
        txt_results.setEditable(false);

        //Panel Up Set Up
        pnl_up.setPreferredSize(new Dimension(440, 210));
        pnl_up.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.black, 5), BorderFactory.createLineBorder(Color.gray, 5)));
        pnl_up.setLayout(flow);
        pnl_up.add(lbl_phrase);
        pnl_up.add(txt_phrase);
        pnl_up.add(lbl_results);
        pnl_up.add(txt_results);
        pnl_up.setBackground(Color.white);

        //----------------------------------------------------------------------
        //                          PANEL LEFT
        //----------------------------------------------------------------------
        //txt_replace
        txt_replace.setFont(fnt_ordinary);
        txt_replace.setBounds(5, 5, 100, 100);
        txt_replace.setHorizontalAlignment(JTextField.CENTER);

        //txt_with
        txt_with.setFont(fnt_ordinary);
        txt_with.setBounds(5, 5, 100, 100);
        txt_with.setHorizontalAlignment(JTextField.CENTER);

        //Panel Left Setup
        pnl_left.setPreferredSize(new Dimension(215, 165));
        pnl_left.setBorder(BorderFactory.createTitledBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.black, 5), BorderFactory.createLineBorder(Color.gray, 5)), "Replace"));
        pnl_left.setLayout(right);
        pnl_left.add(lbl_replace);
        pnl_left.add(txt_replace);
        pnl_left.add(lbl_with);
        pnl_left.add(txt_with);
        pnl_left.add(cmd_replace);

        //----------------------------------------------------------------------
        //                          PANEL RIGHT
        //----------------------------------------------------------------------
        //txt_insert
        txt_word.setFont(fnt_ordinary);
        txt_word.setBounds(5, 5, 100, 100);
        txt_word.setHorizontalAlignment(JTextField.CENTER);
        //txt_index
        txt_index.setFont(fnt_ordinary);
        txt_index.setBounds(5, 5, 100, 100);
        txt_index.setHorizontalAlignment(JTextField.CENTER);

        //Panel Right Setup
        pnl_right.setPreferredSize(new Dimension(215, 165));
        //pnl_right.setBorder(BorderFactory.createTitledBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.black, 5), BorderFactory.createLineBorder(Color.gray, 5)), "Insert", TitledBorder.ABOVE_TOP, PROPERTIES, fnt_labels));
        pnl_right.setBorder(BorderFactory.createTitledBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.black, 5), BorderFactory.createLineBorder(Color.gray, 5)), "Insert"));
        pnl_right.setLayout(right);
        pnl_right.add(lbl_word);
        pnl_right.add(txt_word);
        pnl_right.add(lbl_index);
        pnl_right.add(txt_index);
        pnl_right.add(cmd_insert);

        //----------------------------------------------------------------------
        //                          PANEL DOWN
        //----------------------------------------------------------------------
        pnl_down.setPreferredSize(new Dimension(150, 405));
        //405//80
        pnl_down.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.darkGray, 5), BorderFactory.createLineBorder(Color.darkGray, 5)));
        pnl_down.setBackground(Color.darkGray);
        pnl_down.setLayout(grid);

        pnl_down.add(cmd_submit);
        pnl_down.add(cmd_search);
        pnl_down.add(cmd_ins);
        pnl_down.add(cmd_rep);
        pnl_down.add(cmd_delete);
        pnl_down.add(cmd_clear);
        pnl_down.add(cmd_reset);

        //----------------------------------------------------------------------
        //                         PANEL COMPRESS
        //----------------------------------------------------------------------
        pnl_compress.setPreferredSize(new Dimension(460, 405));
        pnl_compress.setLayout(flow);
        pnl_compress.add(pnl_up);
        pnl_compress.add(pnl_left);
        pnl_compress.add(pnl_right);
        pnl_compress.setBackground(Color.darkGray);

        //Configure Frame
        setLayout(flow);
        add(pnl_compress);
        add(pnl_down);

        //Start Up
        //disable replace
        txt_replace.setEnabled(false);
        txt_with.setEnabled(false);
        cmd_replace.setEnabled(false);
        //disable insert
        txt_word.setEnabled(false);
        txt_index.setEnabled(false);
        cmd_insert.setEnabled(false);

        //
        //
        cmd_search.setEnabled(false);
        cmd_ins.setEnabled(false);
        cmd_rep.setEnabled(false);
        cmd_delete.setEnabled(false);
        cmd_clear.setEnabled(false);
        cmd_reset.setEnabled(false);

        //Add Action Listener
        cmd_insert.addActionListener(this);
        cmd_replace.addActionListener(this);

        cmd_submit.addActionListener(this);
        cmd_search.addActionListener(this);
        cmd_ins.addActionListener(this);
        cmd_rep.addActionListener(this);
        cmd_delete.addActionListener(this);
        cmd_clear.addActionListener(this);
        cmd_reset.addActionListener(this);
        pack();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.gray);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //--------------------------------------------------------------------------
    //                          MESSAGE BOX
    //--------------------------------------------------------------------------
    public void error(String msg, String title) {
        JOptionPane.showMessageDialog(this, msg, title, JOptionPane.ERROR_MESSAGE);
    }

    public void info(String msg, String title) {
        JOptionPane.showMessageDialog(this, msg, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public String ask(String msg, String title) {
        String results;
        results = JOptionPane.showInputDialog(this, msg, title, JOptionPane.QUESTION_MESSAGE);
        return results;

    }

    public int confirm(String msg, String title) {
        int x = 0;
        x = JOptionPane.showConfirmDialog(this, msg, title, JOptionPane.YES_NO_OPTION);
        return x;
    }

    //--------------------------------------------------------------------------
    //                          MESSAGE BOX
    //--------------------------------------------------------------------------
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Submit")) {
            pl.accepted(false);

            pl.getString(txt_phrase.getText());

            if (pl.textEmpty()) {
                txt_phrase.setText("");
                error("Please Enter a String.", "Empty String");
            } else {

                if (pl.isLetter()) {
                    pl.accepted(true);
                    pl.split();
                    info("Phrase/Sentence Saved Succesfully.", "Success");
                    txt_phrase.setEditable(false);
                    cmd_submit.setEnabled(false);
                    //
                    cmd_search.setEnabled(true);
                    cmd_ins.setEnabled(true);
                    cmd_rep.setEnabled(true);
                    cmd_delete.setEnabled(true);
                    cmd_clear.setEnabled(true);
                    cmd_reset.setEnabled(true);
                } else {
                    error("Please Enter Words Only.", "Invalid Input");
                }
            }

        } else if (e.getActionCommand().equals("Search")) {
            String item;
            String occur;

            item = (ask("Enter Word To Search.", "Search"));
            item = item.trim().toLowerCase();
            pl.checkEmpty(item);
            if (pl.textEmpty()) {
                info("Search String is Empty", "Empty String");
                return;
            }

            if (!pl.isLetter()) {
                error("Search String not Valid", "Search Not Found");
                return;
            }

            pl.search(item);
            occur = Integer.toString(pl.occurence());

            if (occur.equals("0")) {
                error(item.toUpperCase() + " not found.", "String Not Found");
            }

            txt_results.setText(item.toUpperCase() + " Has " + occur + " Occurence/s.");
        } else if (e.getActionCommand().equals("Insert")) {
            txt_word.setText("");
            txt_index.setText("");

            //disable replace
            txt_replace.setEnabled(false);
            txt_with.setEnabled(false);
            cmd_replace.setEnabled(false);
            //enable insert
            txt_word.setEnabled(true);
            txt_index.setEnabled(true);
            cmd_insert.setEnabled(true);

        } else if (e.getActionCommand().equals("Replace")) {

            txt_replace.setText("");
            txt_with.setText("");

            //enable replace
            txt_replace.setEnabled(true);
            txt_with.setEnabled(true);
            cmd_replace.setEnabled(true);
            //disable insert
            txt_word.setEnabled(false);
            txt_index.setEnabled(false);
            cmd_insert.setEnabled(false);
            //txt_phrase.setText("Replace");

        } else if (e.getActionCommand().equals("Delete")) {
            String item;
            item = (ask("Enter Word to Delete", "Delete"));
            item = item.trim().toLowerCase();
            pl.checkEmpty(item);
            if (pl.textEmpty()) {
                error("Delete String is Empty", "Empty String");
                return;
            }

            if (!pl.isLetter()) {
                error("Delete String Not Valid", "Word Not Found");
                return;
            }

            pl.search(item);
            if (pl.occurence() == 0) {
                error("Delete Failed, Word Not Found", "Failed");
                return;
            }
            pl.delete();
            txt_results.setText(pl.displayUpdate());

            info("Word Succesfully Deleted", "Delete");

        } else if (e.getActionCommand().equals("Reset")) {

            int choice;
            choice = confirm("Are You Sure You Want To Reset?", "Reset Text Editor");
            if (choice == 0) {
                info("Reset Complete", "Reset");
                pl.accepted(false);
                txt_phrase.setText("");
                txt_results.setText("");
                txt_phrase.setEditable(true);
                cmd_submit.setEnabled(true);

                //
                cmd_search.setEnabled(false);
                cmd_ins.setEnabled(false);
                cmd_rep.setEnabled(false);
                cmd_delete.setEnabled(false);
                cmd_clear.setEnabled(false);
                cmd_reset.setEnabled(false);

                //
                txt_word.setEnabled(false);
                txt_index.setEnabled(false);
                cmd_insert.setEnabled(false);

                //
                txt_replace.setEnabled(false);
                txt_with.setEnabled(false);
                cmd_replace.setEnabled(false);

            } else {
                info("You May Continue Using The Prgram", "Operation Canceled");
            }

        } else if (e.getActionCommand().equals("Insert Word")) {
            String myWord;
            int myIndex = 0;

            myWord = txt_word.getText().trim();

            if ((myWord.isEmpty())) {
                info("String is Empty", "Insert");
                return;
            }
            pl.checkLettersAll(myWord);
            if (!pl.isLetter()) {
                error("You Hava Entered an Invalid Word.", "Insert");
                return;
            }

            try {
                myIndex = Integer.parseInt(txt_index.getText());
            } catch (NumberFormatException nfe) {
                error("Invalid Index", "Invalid");
                return;
            }

            if ((myIndex <= 0) || (myIndex > pl.wordCounter())) {
                error("Invalid Index", "Invalid");
                return;
            }

            pl.insert((myIndex - 1), myWord);
            txt_results.setText(pl.displayUpdate());
            // txt_word.setText("");
            //txt_index.setText("");

        } else if (e.getActionCommand().equals("Replace Word")) {
            String myText;
            myText = txt_replace.getText().trim().toLowerCase();

            pl.checkEmpty(myText);
            if (pl.textEmpty()) {
                info("Replace String is Empty", "Empty String");
                return;
            }

            if (!pl.isLetter()) {
                error("Word is Invalid", "Search Not Found");
                return;
            }

            pl.search(myText);
            if (pl.occurence() == 0) {
                error("Cannot Replace Word, Not Existing", "Search Not Found");
                return;
            }

            String replaceText;
            replaceText = txt_with.getText().trim().toLowerCase();
            if (replaceText.isEmpty()) {
                info("Replace With is empty", "Replace With");
                return;
            }

            pl.checkLettersAll(replaceText);
            if (!pl.isLetter()) {
                error("You Are Replacing it With Invalid Characters", "Invalid");
                return;
            }

            pl.getReplace(replaceText);
            pl.replace();
            txt_results.setText(pl.displayUpdate());
            info("Successfully Replaced", "Replace");
            //txt_replace.setText("");
            //txt_with.setText("");

        } else if (e.getActionCommand().equals("Clear")) {
            txt_replace.setText("");
            txt_with.setText("");
            txt_word.setText("");
            txt_index.setText("");
            txt_word.setEnabled(false);
            txt_index.setEnabled(false);
            cmd_insert.setEnabled(false);

            //
            txt_replace.setEnabled(false);
            txt_with.setEnabled(false);
            cmd_replace.setEnabled(false);
            txt_results.setText(pl.displayUpdate());

            info("Succesfully Cleared", "Clear");

        }

    }
}

class ProgramLogic extends CheckIt {

    ProgramLogic() {
        //Constructor
    }
    static String myWords[] = new String[1000];
    //static String copy[] = new String[1000];
    static String searchWord;
    static int sLocation;
    static String replaceWord;
    String newString = "";
    //static String words[] = new String[1000];

    public static void setArray() {
        for (int x = 0; x < 1000; x++) {
            myWords[x] = "";
            //copy[x] = "";
            //words[x] = "";
        }
    }

    public int wordCounter() {
        int count = 0;

        for (String s : myWords) {
            if (s.isEmpty()) {
            } else {
                count++;
            }

        }
        return count;
    }

    public void insert(int index, String element) {
        int counter = 0;
        String temp_string = "";

        for (String s : myWords) {

            if (counter == index) {
                temp_string = temp_string.trim() + " " + element.toLowerCase();
            }

            temp_string = temp_string.trim() + " " + s;
            counter++;

        }
        temp_string = temp_string.trim();
        System.out.println(temp_string);
        myWords = temp_string.split(" ");

    }

    public void split() {
        myWords = userString.split(" ");
        //myWords = words.clone();

    }

    public void search(String text) {
        searchWord = text;
    }

    public void getReplace(String text) {
        replaceWord = text;
    }

    public int occurence() {
        int occur = 0;

        for (int x = 0; x < myWords.length; x++) {
            if (searchWord.equalsIgnoreCase(myWords[x])) {
                occur++;
            } else {

            }
        }

        return occur;
    }

    public void replace() {

        for (int x = 0; x < myWords.length; x++) {
            if (searchWord.equalsIgnoreCase(myWords[x])) {
                myWords[x] = replaceWord;
            } else {

            }
        }

    }

    public void delete() {

        for (int x = 0; x < myWords.length; x++) {
            if (searchWord.equalsIgnoreCase(myWords[x])) {
                myWords[x] = "";
            } else {

            }
        }

    }

    public String displayUpdate() {
        newString = "";

        for (String s : myWords) {
            if (s.isEmpty()) {
            }
            newString = newString.trim() + " " + s.trim();

        }
        newString = newString.trim();
        return newString;
    }
}

class CheckIt {

    CheckIt() {
        //constructor
    }

    static String userString;

    //Flags
    static boolean empty;
    static boolean letters;
    static boolean accepted;

    public void getString(String text) {
        userString = text.toLowerCase().trim();
        checkEmpty(userString);
    }

    public void checkEmpty(String text) {
        if (text.isEmpty()) {
            empty = true;
        } else {
            empty = false;
            checkLetters(text);
        }
    }

    public boolean textEmpty() {
        return empty;
    }

    public void checkLetters(String text) {
        for (char c : text.toCharArray()) {
            if ((Character.isLetter(c)) || Character.toString(c).equals(" ")) {
                letters = true;
            } else {
                letters = false;
                break;
            }
        }
    }

    public void checkLettersAll(String text) {
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                letters = true;
            } else {
                letters = false;
                break;
            }
        }
    }

    public boolean isLetter() {
        return letters;
    }

    public void accepted(boolean flag) {
        accepted = flag;
    }

}
