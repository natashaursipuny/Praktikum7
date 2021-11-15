import javax.swing.*;

public class Prak2JavaSwing {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("title");
		JPanel p = new JPanel();
		JButton b = new JButton("press me");
		
		f.setSize(400, 400);
		
		p.add(b);
		f.setContentPane(p);
		
		f.show();
	}
}

// Perbedaan antara 	Prak1 dan Prak2 adalah Prak1 belum di setting untuk sizenya sedangkan Prak2 sudah ditentukan sizenya.