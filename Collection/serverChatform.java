import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class serverChatform extends JFrame implements ActionListener {
	static ServerSocket server;
	static Socket conn;
	JPanel panel;
	JTextField NewMsg;
	JTextArea ChatHistory;
	JButton Send;
	DataInputStream dis;
	DataOutputStream dos;

	public serverChatform() throws UnknownHostException, IOException {

		panel = new JPanel();
		NewMsg = new JTextField();
		ChatHistory = new JTextArea();
		Send = new JButton("Send");
		this.setSize(500, 500);
		this.setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel.setLayout(null);
		this.add(panel);
		ChatHistory.setBounds(20, 20, 450, 360);
		panel.add(ChatHistory);
		NewMsg.setBounds(20, 400, 340, 30);
		panel.add(NewMsg);
		Send.setBounds(375, 400, 95, 30);
		panel.add(Send);
		this.setTitle("Server");
		Send.addActionListener(this);
		server = new ServerSocket(2000, 1, InetAddress.getLocalHost());
		ChatHistory.setText("Waiting for Client");
		conn = server.accept();
		ChatHistory.setText(ChatHistory.getText() + 'n' + "Client Found");
		while (true) {
			try {
				DataInputStream dis = new DataInputStream(conn.getInputStream());
				String string = dis.readUTF();
				ChatHistory.setText(ChatHistory.getText() + 'n' + "Client:"
						+ string);
			} catch (Exception e1) {
				ChatHistory.setText(ChatHistory.getText() + 'n'
						+ "Message sending fail:Network Error");
				try {
					Thread.sleep(3000);
					System.exit(0);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if ((e.getSource() == Send) && (NewMsg.getText() != "")) {
			ChatHistory.setText(ChatHistory.getText() + 'n' + "ME:"
					+ NewMsg.getText());
			try {
				DataOutputStream dos = new DataOutputStream(
						conn.getOutputStream());
				dos.writeUTF(NewMsg.getText());
			} catch (Exception e1) {
				try {
					Thread.sleep(3000);
					System.exit(0);
				} catch (InterruptedException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}
			NewMsg.setText("");
		}
	}

	public static void main(String[] args) throws UnknownHostException,
	IOException {
		new serverChatform();
	}
}