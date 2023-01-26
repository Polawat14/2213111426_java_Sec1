import java.util.*;
import javax.swing.*;
public class BookDemo2 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Input author name: ");
		String email = JOptionPane.showInputDialog("Input author e-mail: ");
		String title = JOptionPane.showInputDialog("Input book title: ");
		int page = Integer.parseInt(JOptionPane.showInputDialog("Input book page: "));
		int confirm = JOptionPane.showConfirmDialog(null,"is the page correct?"
				,"Confirm",JOptionPane.YES_NO_OPTION);
		Book bk = new Book (title,new Author(name,email),page);
		if(confirm != 0) {
			page = Integer.parseInt(JOptionPane.showInputDialog("Input book page,again: "));
			bk.setPage(page);
		}
		JOptionPane.showMessageDialog(null,"Book Title : "+bk.getTitle()
				+"\n"+"Author name : "+bk.getAuthor().getName()+"("+bk.getPage()+")"
				+"\n"+"Author e-mail: "+bk.getAuthor().getEmail());
		

	}

}
