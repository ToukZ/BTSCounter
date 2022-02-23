package br.viniboyprojects.BTSCounter;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Toolkit;

public class Janela extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8154373L;
	private JPanel contentPane;
	int delay = 1666;
	private JLabel current = new JLabel();

	public Janela() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Janela.class.getResource("/resources/lysy!.jpg")));
		setTitle("Livia Yourself Speak Yourself");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("");
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setIcon(new ImageIcon(Janela.class.getResource("/resources/mikrokosmos.png")));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 8));

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(Janela.class.getResource("/resources/dionysus.jpg")));
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 9));

		JButton button_9 = new JButton("");
		button_9.setIcon(new ImageIcon(Janela.class.getResource("/resources/micdrop14.jpg")));
		button_9.setBounds(0, 105, 106, 23);
		contentPane.add(button_9);
		button_9.setVisible(false);

		JButton button_8 = new JButton("");
		button_8.setIcon(new ImageIcon(Janela.class.getResource("/resources/epiphany13.jpg")));
		button_8.setBounds(0, 83, 106, 23);
		contentPane.add(button_8);
		button_8.setVisible(false);

		JButton button_7 = new JButton("");
		button_7.setIcon(new ImageIcon(Janela.class.getResource("/resources/fakelove12.jpg")));
		button_7.setBounds(470, 271, 106, 23);
		contentPane.add(button_7);
		button_7.setVisible(false);

		JButton button_10 = new JButton("");
		button_10.setIcon(new ImageIcon(Janela.class.getResource("/resources/tear16.jpg")));
		button_10.setBounds(614, 175, 106, 23);
		contentPane.add(button_10);
		button_10.setVisible(false);

		JButton button_11 = new JButton("");
		button_11.setIcon(new ImageIcon(Janela.class.getResource("/resources/thetruthuntold15.jpg")));
		button_11.setBounds(470, 105, 106, 23);
		contentPane.add(button_11);
		button_11.setVisible(false);

		JButton button_6 = new JButton("");
		button_6.setIcon(new ImageIcon(Janela.class.getResource("/resources/singularity11.jpg")));
		button_6.setBounds(470, 249, 106, 23);
		contentPane.add(button_6);
		button_6.setVisible(false);

		JButton button_5 = new JButton("");
		button_5.setIcon(new ImageIcon(Janela.class.getResource("/resources/idol10.jpg")));
		button_5.setBounds(614, 106, 106, 23);
		contentPane.add(button_5);
		button_5.setVisible(false);

		JButton button_4 = new JButton("");
		button_4.setIcon(new ImageIcon(Janela.class.getResource("/resources/fire9.jpg")));
		button_4.setBounds(614, 83, 106, 23);
		contentPane.add(button_4);
		button_4.setVisible(false);

		JButton button_3 = new JButton("");
		button_3.setIcon(new ImageIcon(Janela.class.getResource("/resources/bestofme8.jpg")));
		button_3.setBounds(0, 176, 106, 23);
		contentPane.add(button_3);
		button_3.setVisible(false);

		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon(Janela.class.getResource("/resources/serendipity7.jpg")));
		button_2.setBounds(0, 153, 106, 23);
		contentPane.add(button_2);
		button_2.setVisible(false);

		JButton button_12 = new JButton("");
		button_12.setIcon(new ImageIcon(Janela.class.getResource("/resources/love20.jpg")));
		button_12.setBounds(614, 248, 106, 23);
		contentPane.add(button_12);
		button_12.setVisible(false);

		JButton button_13 = new JButton("");
		button_13.setIcon(new ImageIcon(Janela.class.getResource("/resources/makeitright19.jpg")));
		button_13.setBounds(614, 225, 106, 23);
		contentPane.add(button_13);
		button_13.setVisible(false);

		JButton button_16 = new JButton("");
		button_16.setIcon(new ImageIcon(Janela.class.getResource("/resources/seesaw24.jpg")));
		button_16.setBounds(140, 105, 106, 23);
		contentPane.add(button_16);
		button_16.setVisible(false);

		JButton button_17 = new JButton("");
		button_17.setIcon(new ImageIcon(Janela.class.getResource("/resources/wings23.jpg")));
		button_17.setBounds(140, 82, 106, 23);
		contentPane.add(button_17);
		button_17.setVisible(false);

		JButton button_18 = new JButton("");
		button_18.setIcon(new ImageIcon(Janela.class.getResource("/resources/nottoday22.jpg")));
		button_18.setBounds(140, 271, 106, 23);
		contentPane.add(button_18);
		button_18.setVisible(false);

		JButton button_19 = new JButton("");
		button_19.setIcon(new ImageIcon(Janela.class.getResource("/resources/just dance21.jpg")));
		button_19.setBounds(140, 248, 106, 23);
		contentPane.add(button_19);
		button_19.setVisible(false);

		JButton button_14 = new JButton("");
		button_14.setIcon(new ImageIcon(Janela.class.getResource("/resources/sowhat18.jpg")));
		button_14.setBounds(0, 320, 106, 23);
		contentPane.add(button_14);
		button_14.setVisible(false);

		JButton button_15 = new JButton("");
		button_15.setIcon(new ImageIcon(Janela.class.getResource("/resources/anpanman17.jpg")));
		button_15.setBounds(0, 297, 106, 23);
		contentPane.add(button_15);
		button_15.setVisible(false);

		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(Janela.class.getResource("/resources/baepsae6.jpg")));
		button_1.setBounds(0, 248, 106, 23);
		contentPane.add(button_1);
		button_1.setVisible(false);

		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon(Janela.class.getResource("/resources/dope5.jpg")));
		btnNewButton_3.setBounds(0, 225, 106, 23);
		contentPane.add(btnNewButton_3);
		btnNewButton_3.setVisible(false);

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(Janela.class.getResource("/resources/euphoria.jpg")));
		btnNewButton_2.setBounds(614, 29, 106, 23);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.setVisible(false);

		JButton button = new JButton("");
		button.setIcon(new ImageIcon(Janela.class.getResource("/resources/boywithluv.jpg")));
		button.setBounds(614, 49, 106, 23);
		contentPane.add(button);
		button.setVisible(false);

		btnNewButton_1.setBounds(470, 83, 106, 23);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setVisible(false);

		btnNewButton.setBounds(614, 153, 106, 23);
		contentPane.add(btnNewButton);
		btnNewButton.setVisible(false);

		JButton btnNewButton_4 = new JButton("+");
		btnNewButton_4.setBackground(Color.DARK_GRAY);
		btnNewButton_4.setForeground(Color.RED);
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Soundtrack.setLevel('+');
			}
		});
		btnNewButton_4.setBounds(564, 320, 50, 23);
		contentPane.add(btnNewButton_4);
		btnNewButton_4.setVisible(false);

		ActionListener taskPerformer = new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

				if (!Soundtrack.isPlaying()) {
					if (!Soundtrack.getRepeat()) {
						if (Soundtrack.getCurrentTrack() < 24) {
							Soundtrack.setCurrentTrack(Soundtrack.getCurrentTrack() + 1);
							Soundtrack.changeTrack("musicbts" + Soundtrack.getCurrentTrack(),
									Soundtrack.getCurrentTrack());
							if (!button.isVisible()) {
								current.setIcon(new ImageIcon(this.getClass()
										.getResource("/resources/WP" + Soundtrack.getCurrentTrack() + ".jpg")));
							}
						} else {
							Soundtrack.setCurrentTrack(1);
							Soundtrack.changeTrack("musicbts" + Soundtrack.getCurrentTrack(),
									Soundtrack.getCurrentTrack());
							current.setIcon(new ImageIcon(this.getClass().getResource("/resources/WP1.jpg")));
						}
					} else {
						Soundtrack.changeTrack("musicbts" + Soundtrack.getCurrentTrack(), Soundtrack.getCurrentTrack());
					}
				}
			}

		};
		new Timer(delay, taskPerformer).start();

		JButton button_21 = new JButton("-");
		button_21.setForeground(Color.PINK);
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Soundtrack.setLevel('-');
			}
		});
		button_21.setBackground(Color.DARK_GRAY);
		button_21.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_21.setBounds(515, 320, 50, 23);
		contentPane.add(button_21);
		button_21.setVisible(false);

		JButton btnL = new JButton("||  /  l>");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Soundtrack.pause();
			}
		});
		btnL.setForeground(Color.GREEN);
		btnL.setBackground(Color.DARK_GRAY);
		btnL.setBounds(631, 283, 69, 23);
		contentPane.add(btnL);
		btnL.setVisible(false);

		JButton btnRepeat = new JButton("Repeat");
		btnRepeat.setForeground(Color.BLUE);
		btnRepeat.setBackground(Color.DARK_GRAY);
		btnRepeat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (Soundtrack.getRepeat()) {
					Soundtrack.setRepeat(false);
				} else {
					Soundtrack.setRepeat(true);
				}
			}
		});
		btnRepeat.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 11));
		btnRepeat.setBounds(443, 320, 74, 23);
		contentPane.add(btnRepeat);
		btnRepeat.setVisible(false);

		JButton button_20 = new JButton("");
		button_20.setBackground(Color.CYAN);
		button_20.setIcon(new ImageIcon(Janela.class.getResource("/resources/world tour.jpg")));
		button_20.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (button.isVisible()) {
					button.setVisible(false);
					button_1.setVisible(false);
					button_2.setVisible(false);
					button_3.setVisible(false);
					button_4.setVisible(false);
					button_5.setVisible(false);
					button_6.setVisible(false);
					button_7.setVisible(false);
					button_8.setVisible(false);
					button_9.setVisible(false);
					button_10.setVisible(false);
					button_11.setVisible(false);
					button_12.setVisible(false);
					button_13.setVisible(false);
					button_14.setVisible(false);
					button_15.setVisible(false);
					button_16.setVisible(false);
					button_17.setVisible(false);
					button_18.setVisible(false);
					button_19.setVisible(false);
					btnNewButton.setVisible(false);
					btnNewButton_1.setVisible(false);
					btnNewButton_2.setVisible(false);
					btnNewButton_3.setVisible(false);
					btnNewButton_4.setVisible(false);
					button_21.setVisible(false);
					btnL.setVisible(false);
					btnRepeat.setVisible(false);
					current.setIcon(new ImageIcon(
							this.getClass().getResource("/resources/WP" + Soundtrack.getCurrentTrack() + ".jpg")));
				} else {
					button.setVisible(true);
					button_1.setVisible(true);
					button_2.setVisible(true);
					button_3.setVisible(true);
					button_4.setVisible(true);
					button_5.setVisible(true);
					button_6.setVisible(true);
					button_7.setVisible(true);
					button_8.setVisible(true);
					button_9.setVisible(true);
					button_10.setVisible(true);
					button_11.setVisible(true);
					button_12.setVisible(true);
					button_13.setVisible(true);
					button_14.setVisible(true);
					button_15.setVisible(true);
					button_16.setVisible(true);
					button_17.setVisible(true);
					button_18.setVisible(true);
					button_19.setVisible(true);
					btnNewButton.setVisible(true);
					btnNewButton_1.setVisible(true);
					btnNewButton_2.setVisible(true);
					btnNewButton_3.setVisible(true);
					btnNewButton_4.setVisible(true);
					button_21.setVisible(true);
					btnL.setVisible(true);
					btnRepeat.setVisible(true);
					current.setIcon(new ImageIcon(this.getClass().getResource("/resources/tour-kv-m.jpg")));
				}

			}
		});
		button_20.setBounds(619, 320, 89, 23);
		contentPane.add(button_20);

		JLabel lblvinitoukz = new JLabel("@vinitoukz");
		lblvinitoukz.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 11));
		lblvinitoukz.setForeground(Color.LIGHT_GRAY);
		lblvinitoukz.setBounds(651, 0, 69, 23);
		contentPane.add(lblvinitoukz);

		current.setForeground(Color.WHITE);
		current.setBounds(0, 0, 720, 358);
		contentPane.add(current);

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Soundtrack.changeTrack("musicbts1", 1);

			}
		});

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Soundtrack.changeTrack("musicbts2", 2);

			}
		});

		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Soundtrack.changeTrack("musicbts14", 14);

			}
		});

		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Soundtrack.changeTrack("musicbts13", 13);

			}
		});

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Soundtrack.changeTrack("musicbts4", 4);

			}
		});

		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Soundtrack.changeTrack("musicbts17", 17);

			}
		});

		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Soundtrack.changeTrack("musicbts6", 6);

			}
		});

		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Soundtrack.changeTrack("musicbts5", 5);

			}
		});

		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Soundtrack.changeTrack("musicbts3", 3);

			}
		});

		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Soundtrack.changeTrack("musicbts18", 18);

			}
		});

		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Soundtrack.changeTrack("musicbts21", 21);

			}
		});

		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Soundtrack.changeTrack("musicbts22", 22);

			}
		});

		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Soundtrack.changeTrack("musicbts23", 23);

			}
		});

		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Soundtrack.changeTrack("musicbts24", 24);

			}
		});

		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Soundtrack.changeTrack("musicbts19", 19);

			}
		});

		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Soundtrack.changeTrack("musicbts20", 20);

			}
		});

		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Soundtrack.changeTrack("musicbts7", 7);

			}
		});
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Soundtrack.changeTrack("musicbts12", 12);

			}
		});
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Soundtrack.changeTrack("musicbts15", 15);

			}
		});
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Soundtrack.changeTrack("musicbts11", 11);

			}
		});
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Soundtrack.changeTrack("musicbts10", 10);

			}
		});
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Soundtrack.changeTrack("musicbts9", 9);

			}
		});
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Soundtrack.changeTrack("musicbts8", 8);

			}
		});
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Soundtrack.changeTrack("musicbts16", 16);

			}
		});

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
					frame.setResizable(false);
					new Soundtrack();
					frame.current.setIcon(new ImageIcon(frame.getClass().getResource("/resources/WP1.jpg")));
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}