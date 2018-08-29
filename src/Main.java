import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("ใส่ตัวเลข 1 ตัว","0");
        JOptionPane.showMessageDialog(null,"message","tittle",JOptionPane.INFORMATION_MESSAGE);
        int ans = JOptionPane.showConfirmDialog(null,"รักหรือเปล่า","ถามเธอ",JOptionPane.YES_NO_OPTION);
        if(ans==JOptionPane.YES_NO_OPTION){
            JOptionPane.showMessageDialog(null,"รักนะจุ๊บๆ");
        }else {
            //message
            JOptionPane.showMessageDialog(null,"จำไว้เลย");

        }

    }
}
