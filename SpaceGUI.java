 // By David Aronson
// Add gravity to each planet
// and moons
// add ability to change background to view surface of planet with interesting facts
// add menuBar to only see planets of certain catorgories, like Gas, Rock, or Moons
// add dwarf planets: Ceres(Between Mars and Jupiter), Pluto(After Neptune and before Eris), Eris
// Change gravity unit to m/s^2 and get gravity of each planet, not in comparison to earth
// Check radius and surface area, make sure all are in the same unit


// fix music spam issue: Via Booleans


// add bouncy ball animation: Earth Compared to Planet Gravity


//Link to Music Tutorial: http://stackoverflow.com/questions/21516491/looping-background-music-in-java
// make planet scales
// Surface aspect to be added
import java.awt.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.FileWriter;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import java.awt.MenuBar;
import java.io.InputStream;


import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


import javax.sound.sampled.AudioSystem;


import java.applet.*;
import java.io.*;


import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;


import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JDialog;
import java.awt.MenuItem;
// add in multiple music options that can be activated via menu buttons


public class SpaceGUI extends JFrame implements ActionListener {
   private Label lblData;    // Declare a Label component


   private JButton btnSun;   // Declare a Button component
   private JButton btnMercury;
   private JButton btnVenus;
   private JButton btnEarth;
   private JButton btnMars;
   private JButton btnCeres;
   private JButton btnJupiter;
   private JButton btnSaturn;
   private JButton btnUranus;
   private JButton btnNeptune;
   private JButton btnPluto;
   private JLabel imagelabel;
   private JButton btnEris;
   private static int soundOn = 0;


   // File buttonClick = new File("planetclick.mp3");
   //  AudioClip sound;


 //MENU RELATED
     private JLabel headerLabel;
      private JLabel statusLabel;
   private JPanel controlPanel;
  // private JFrame app;


   private JButton btnClose;


   private Label lblDate;
   private JLabel lblSpace;








   public SpaceGUI () {


	    setLayout(new BorderLayout());
	   	  setContentPane(new JLabel(new ImageIcon("space.jpg")));
	   	  setLayout(new FlowLayout());
	   	    setSize(399,399);
  // setSize(2050, 550);


      setLayout(new GridLayout());
   //   ImageIcon view = new ImageIcon("plainicon.com-57215-256px-150.png");
   //  ImageIcon space = new ImageIcon("space.jpeg");
	//  JLabel thumb = new JLabel();
		//thumb.setIcon(space);
		//thumb.setSize(2050, 550);
		//thumb.setVisible(true);


		//add(thumb);
//lblSpace = new JLabel(new ImageIcon(((new ImageIcon("Space.jpeg")).getImage()).getScaledInstance(2000, 550, java.awt.Image.SCALE_SMOOTH)));
//add(lblSpace);


//ImageIcon icon = new ImageIcon("space.jpeg");
//. . .
//label1 = new JLabel(icon, JLabel.CENTER);
//Set the position of the text, relative to the icon:
//label1.setVerticalTextPosition(JLabel.BOTTOM);
//label1.setHorizontalTextPosition(JLabel.CENTER);


//label2 = new JLabel("Text-Only Label");
//JLabel label3 = new JLabel(icon);
//add(label3);


    //   JMenuBar menuBar = new JMenuBar();


    //   setJMenuBar(menuBar);


	           // Define and add two drop down menu to the menubar
	          // JMenu fileMenu = new JMenu("File");
	      //     JMenu editMenu = new JMenu("Edit");
	      //     menuBar.add(fileMenu);
    //    menuBar.add(editMenu);


     // GridLayout(int 2, int 2);


     // lblData = new Label("Space");
     // lblData.setFont(new Font("Serif", Font.PLAIN, 15));
    //  lblData.setForeground(Color.WHITE);
   //   add(lblData);


      //lblDate = new Label("Created 9/7/2016");
      //lblDate.setFont(new Font("Serif", Font.PLAIN, 15));
      //lblDate.setForeground(Color.WHITE);
      //lblDate.setLocation(245, 95);
     // add(lblDate);
		// try{sound = Applet.newAudioClip(buttonClick.toURL());}
    	///catch(Exception e){e.printStackTrace();}




     // btnCreate = new Button("Create");   // construct the Button component
    //  btnCreate.setBackground(Color.GREEN);
  //  btnCreate = new JButton(new ImageIcon(((new ImageIcon("plus.png")).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));
 // btnCreate = new JButton("+");
  btnSun = new JButton(new ImageIcon(((new ImageIcon("sun.png")).getImage()).getScaledInstance(125, 125, java.awt.Image.SCALE_SMOOTH)));
 btnSun.setOpaque(false);
 btnSun.setContentAreaFilled(false); //to make the content area transparent
btnSun.setBorderPainted(false);
  btnSun.setVisible(true);
 // btnSun.setBounds(50, 50, 120, 120);
  add(btnSun);


  btnMercury = new JButton(new ImageIcon(((new ImageIcon("mercury.png")).getImage()).getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH)));
   btnMercury.setOpaque(false);
   btnMercury.setContentAreaFilled(false); //to make the content area transparent
  btnMercury.setBorderPainted(false);
    btnMercury.setVisible(true);
  add(btnMercury);


   btnVenus = new JButton(new ImageIcon(((new ImageIcon("Venus.png")).getImage()).getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH)));
     btnVenus.setOpaque(false);
     btnVenus.setContentAreaFilled(false); //to make the content area transparent
    btnVenus.setBorderPainted(false);
      btnVenus.setVisible(true);
  add(btnVenus);


  btnEarth = new JButton(new ImageIcon(((new ImageIcon("Earth.png")).getImage()).getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH)));
       btnEarth.setOpaque(false);
       btnEarth.setContentAreaFilled(false); //to make the content area transparent
      btnEarth.setBorderPainted(false);
        btnEarth.setVisible(true);
  add(btnEarth);


  btnMars = new JButton(new ImageIcon(((new ImageIcon("Mars.png")).getImage()).getScaledInstance(45, 45, java.awt.Image.SCALE_SMOOTH)));
         btnMars.setOpaque(false);
         btnMars.setContentAreaFilled(false); //to make the content area transparent
        btnMars.setBorderPainted(false);
          btnMars.setVisible(true);
  add(btnMars);


  btnCeres = new JButton(new ImageIcon(((new ImageIcon("Ceres.png")).getImage()).getScaledInstance(18, 18, java.awt.Image.SCALE_SMOOTH)));
         btnCeres .setOpaque(false);
         btnCeres .setContentAreaFilled(false); //to make the content area transparent
        btnCeres .setBorderPainted(false);
          btnCeres .setVisible(true);
  add(btnCeres);


btnJupiter = new JButton(new ImageIcon(((new ImageIcon("Jupiter.png")).getImage()).getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH)));
         btnJupiter.setOpaque(false);
         btnJupiter.setContentAreaFilled(false); //to make the content area transparent
        btnJupiter.setBorderPainted(false);
          btnJupiter.setVisible(true);
  add(btnJupiter);


  btnSaturn = new JButton(new ImageIcon(((new ImageIcon("Saturn.png")).getImage()).getScaledInstance(72, 72, java.awt.Image.SCALE_SMOOTH)));
           btnSaturn.setOpaque(false);
           btnSaturn.setContentAreaFilled(false); //to make the content area transparent
          btnSaturn.setBorderPainted(false);
            btnSaturn.setVisible(true);
  add(btnSaturn);


   btnUranus = new JButton(new ImageIcon(((new ImageIcon("Uranus.png")).getImage()).getScaledInstance(68, 68, java.awt.Image.SCALE_SMOOTH)));
             btnUranus.setOpaque(false);
             btnUranus.setContentAreaFilled(false); //to make the content area transparent
            btnUranus.setBorderPainted(false);
              btnUranus.setVisible(true);
  add(btnUranus);


    btnNeptune = new JButton(new ImageIcon(((new ImageIcon("Neptune.png")).getImage()).getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH)));
               btnNeptune.setOpaque(false);
               btnNeptune.setContentAreaFilled(false); //to make the content area transparent
              btnNeptune.setBorderPainted(false);
                btnNeptune.setVisible(true);
  add(btnNeptune);


    btnPluto= new JButton(new ImageIcon(((new ImageIcon("Pluto.png")).getImage()).getScaledInstance(22, 22, java.awt.Image.SCALE_SMOOTH)));
               btnPluto.setOpaque(false);
               btnPluto.setContentAreaFilled(false); //to make the content area transparent
              btnPluto.setBorderPainted(false);
                btnPluto.setVisible(true);
  add(btnPluto);


  btnEris= new JButton(new ImageIcon(((new ImageIcon("Eris.png")).getImage()).getScaledInstance(24, 24, java.awt.Image.SCALE_SMOOTH)));
               btnEris.setOpaque(false);
               btnEris.setContentAreaFilled(false); //to make the content area transparent
              btnEris.setBorderPainted(false);
                btnEris.setVisible(true);
  add(btnEris);


      //btnView.setBackground(view);
     // btnView = new JButton (view.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));
    // btnView = new JButton(new ImageIcon(((new ImageIcon("plainicon.com-57215-256px-150.png")).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));


	//btnView.setName("View");
      //btnView.setBorderPainted(false);
     // add(btnView);






      //btnClose = new Button("Close");
      //btnClose.setBackground(Color.RED);
      // btnClose = new JButton(new ImageIcon(((new ImageIcon("basics-22-128.png")).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));
      // btnClose.setName("Close");
     // add(btnClose);


    // InputStream in;
	    // try {
	 //        in = new FileInputStream(new File("music.wav"));	// find longer track and loop
	       //  AudioStream audios = new AudioStream(in);
	      //   AudioPlayer.player.start(audios);


	 //    } catch (Exception e) {
	  //       JOptionPane.showMessageDialog(null, e);


  //  }


  //  InputStream in;




     btnSun.addActionListener(this);
   		btnMercury.addActionListener(this);
      btnVenus.addActionListener(this);
        btnEarth.addActionListener(this);
        btnMars.addActionListener(this);
        btnJupiter.addActionListener(this);
        btnSaturn.addActionListener(this);
        btnUranus.addActionListener(this);
        btnNeptune.addActionListener(this);
btnPluto.addActionListener(this);
btnEris.addActionListener(this);
btnCeres.addActionListener(this);


		final JMenuBar menuBar = new JMenuBar();


		    // File Menu, F - Mnemonic
		    JMenu fileMenu = new JMenu("Settings");
		    fileMenu.setMnemonic(KeyEvent.VK_F);
		    menuBar.add(fileMenu);


		     JMenu moonMenu = new JMenu("Moons");
								    moonMenu.setMnemonic(KeyEvent.VK_F);
		    menuBar.add(moonMenu);
		    JMenuItem earthMoon = new JMenuItem("Earth Moon");
			earthMoon.setActionCommand("emoon");
			earthMoon.addActionListener(this);
			moonMenu.add(earthMoon);


			JMenu marsMoons = new JMenu("Mars Moons");
			JMenuItem phobos = new JMenuItem("Phobos");
			phobos.setActionCommand("phobos");
			phobos.addActionListener(this);
			JMenuItem deimos = new JMenuItem("Deimos");
			deimos.setActionCommand("deimos");
			deimos.addActionListener(this);


			marsMoons.add(phobos);
			marsMoons.add(deimos);


			moonMenu.add(marsMoons);


			JMenu jupiterMoons = new JMenu("Jupiter Moons");


						JMenuItem io = new JMenuItem("Io");
						io.setActionCommand("io");
						io.addActionListener(this);


						JMenuItem ganymede = new JMenuItem("Ganymede");
						ganymede.setActionCommand("ganymede");
			ganymede.addActionListener(this);


			JMenuItem callisto = new JMenuItem("Callisto");
									callisto.setActionCommand("callisto");
									callisto.addActionListener(this);


									JMenuItem europa = new JMenuItem("Europa");
									europa.setActionCommand("europa");
			europa.addActionListener(this);


			jupiterMoons.add(europa);
			jupiterMoons.add(io);
			jupiterMoons.add(ganymede);
			jupiterMoons.add(callisto);


			moonMenu.add(jupiterMoons);


			JMenu saturnMoons = new JMenu("Saturn Moons");


									JMenuItem titan = new JMenuItem("Titan");
									titan.setActionCommand("titan");
									titan.addActionListener(this);


									JMenuItem iapetus = new JMenuItem("Iapetus");
									iapetus.setActionCommand("iapetus");
						iapetus.addActionListener(this);


						JMenuItem rhea = new JMenuItem("Rhea");
												rhea.setActionCommand("rhea");
												rhea.addActionListener(this);


												JMenuItem dione = new JMenuItem("Dione");
												dione.setActionCommand("dione");
						dione.addActionListener(this);


						JMenuItem tethys = new JMenuItem("Tethys");
															tethys.setActionCommand("tethys");
												tethys.addActionListener(this);


												JMenuItem enceladus = new JMenuItem("Enceladus");
																		enceladus.setActionCommand("enceladus");
																		enceladus.addActionListener(this);


																		JMenuItem mimas = new JMenuItem("Mimas");
																		mimas.setActionCommand("mimas");
						mimas.addActionListener(this);


						saturnMoons.add(tethys);
						saturnMoons.add(dione);
						saturnMoons.add(iapetus);
						saturnMoons.add(rhea);
						saturnMoons.add(titan);
						saturnMoons.add(enceladus);
						saturnMoons.add(mimas);


			moonMenu.add(saturnMoons);


			JMenu uranusMoons = new JMenu("Uranus Moons");


									JMenuItem oberon = new JMenuItem("Oberon");
									oberon.setActionCommand("oberon");
									oberon.addActionListener(this);


									JMenuItem titania = new JMenuItem("Titania");
									titania.setActionCommand("titania");
						titania.addActionListener(this);


						JMenuItem ariel = new JMenuItem("Ariel");
												ariel.setActionCommand("ariel");
												ariel.addActionListener(this);


												JMenuItem miranda = new JMenuItem("Miranda");
												miranda.setActionCommand("miranda");
						miranda.addActionListener(this);


						JMenuItem ubmriel = new JMenuItem("Ubmriel");
																		ubmriel.setActionCommand("ubmriel");
												ubmriel.addActionListener(this);




						uranusMoons.add(ubmriel);
						uranusMoons.add(oberon);
						uranusMoons.add(titania);
						uranusMoons.add(ariel);
						uranusMoons.add(miranda);


			moonMenu.add(uranusMoons);


JMenu neptuneMoon = new JMenu("Neptune Moon");


JMenuItem triton = new JMenuItem("Triton");
triton.setActionCommand("triton");
triton.addActionListener(this);


neptuneMoon.add(triton);
moonMenu.add(neptuneMoon);


JMenu plutoMoon = new JMenu("Pluto Moon");


JMenuItem charon= new JMenuItem("Charon");
charon.setActionCommand("charon");
charon.addActionListener(this);


plutoMoon.add(charon);
moonMenu.add(plutoMoon);








		    JMenu planetMenu = new JMenu("Planet Images");
					    planetMenu.setMnemonic(KeyEvent.VK_F);
		    menuBar.add(planetMenu);


		    JMenu mathMenu = new JMenu("Math");
		    mathMenu.setMnemonic(KeyEvent.VK_F);
		    menuBar.add(mathMenu);


		    JMenuItem weight = new JMenuItem("Weight on other Planets");
		     weight.setActionCommand("weight");
		     weight.addActionListener(this);
		     mathMenu.add(weight);


		     JMenuItem gravity = new JMenuItem("Gravity on other Planets");
			 		     gravity.setActionCommand("gravity");
			 		     gravity.addActionListener(this);
		     mathMenu.add(gravity);






		    // File->New, N - Mnemonic
		   // JMenuItem newMenuItem = new JMenuItem("New", KeyEvent.VK_N);
		  //  fileMenu.add(newMenuItem);
		   // setJMenuBar(menuBar);






      setTitle("Space");
      setSize(2050, 550);
      //Container c = JFrame.getContentPane();


      setBackground(Color.black);


     // menuBar = new JMenuBar();


	  		      //create menus
	  		   //   JMenu fileMenu = new JMenu("File");
	  		   //   JMenu editMenu = new JMenu("Edit");
	  		    //  final JMenu aboutMenu = new JMenu("About");
	  		  //    final JMenu linkMenu = new JMenu("Links");


	  		      //create menu items
	  		      JMenuItem musicMenu1 = new JMenuItem("Music - Track 1");
	  		    //  newMenuItem.setMnemonic(KeyEvent.VK_N);
	  		      musicMenu1.setActionCommand("one");


	  		      JMenuItem musicMenu2 = new JMenuItem("Music - Track 2");




				  	  		    //  newMenuItem.setMnemonic(KeyEvent.VK_N);
	  		      musicMenu2.setActionCommand("two");


musicMenu1.addActionListener(this);
	  		      musicMenu2.addActionListener(this);








				  				  	  		    //  newMenuItem.setMnemonic(KeyEvent.VK_N);
JMenuItem mercurySurface = new JMenuItem("Mercury");
				  	  		mercurySurface.setActionCommand("mercury");
				  			mercurySurface.addActionListener(this);
JMenuItem venusSurface = new JMenuItem("Venus");
				  	  		venusSurface.setActionCommand("venus");
				  			venusSurface.addActionListener(this);
JMenuItem earthSurface = new JMenuItem("Earth");
				  	  		earthSurface.setActionCommand("earth");
				  			earthSurface.addActionListener(this);
				  			JMenuItem marsSurface = new JMenuItem("Mars");
				  	  		marsSurface.setActionCommand("mars");
				  			marsSurface.addActionListener(this);
JMenuItem ceresSurface = new JMenuItem("Ceres");
				  	  		ceresSurface.setActionCommand("ceres");
				  			ceresSurface.addActionListener(this);
JMenuItem jupiterSurface = new JMenuItem("Jupiter");
				  	  		jupiterSurface.setActionCommand("jupiter");
				  			jupiterSurface.addActionListener(this);
JMenuItem saturnSurface = new JMenuItem("Saturn");
				  	  		saturnSurface.setActionCommand("saturn");
				  			saturnSurface.addActionListener(this);
JMenuItem uranusSurface = new JMenuItem("Uranus");
				  	  		uranusSurface.setActionCommand("uranus");
				  			uranusSurface.addActionListener(this);
JMenuItem neptuneSurface = new JMenuItem("Neptune");
				  	  		neptuneSurface.setActionCommand("neptune");
				  			neptuneSurface.addActionListener(this);
JMenuItem plutoSurface = new JMenuItem("Pluto");
				  	  		plutoSurface.setActionCommand("pluto");
				  			plutoSurface.addActionListener(this);
JMenuItem erisSurface = new JMenuItem("Eris");
				  	  		erisSurface.setActionCommand("eris");
				  			erisSurface.addActionListener(this);


	  		     // JMenuItem openMenuItem = new JMenuItem("Open");
	  		  //    openMenuItem.setActionCommand("Open");


	  		    //  JMenuItem saveMenuItem = new JMenuItem("Save");
	  		    //  saveMenuItem.setActionCommand("Save");


	  		   //   JMenuItem exitMenuItem = new JMenuItem("Exit");
	  		   //   exitMenuItem.setActionCommand("Exit");


	  		  //    JMenuItem cutMenuItem = new JMenuItem("Cut");
	  		  //    cutMenuItem.setActionCommand("Cut");


	  		    //  JMenuItem copyMenuItem = new JMenuItem("Copy");
	  		    //  copyMenuItem.setActionCommand("Copy");


	  		   //   JMenuItem pasteMenuItem = new JMenuItem("Paste");
	  		   //   pasteMenuItem.setActionCommand("Paste");


	  		     // MenuItemListener menuItemListener = new MenuItemListener();




	  		   //   saveMenuItem.addActionListener(this);
	  		    //  exitMenuItem.addActionListener(this);
	  		    //  cutMenuItem.addActionListener(this);
	  		    //  copyMenuItem.addActionListener(this);
	  		   //   pasteMenuItem.addActionListener(this);


	  		      final JCheckBoxMenuItem showDwarfPlanets = new JCheckBoxMenuItem("Show Dwarf Planets", true);
	  		      showDwarfPlanets.addItemListener(new ItemListener() {
	  		         public void itemStateChanged(ItemEvent e) {
	  		            if(btnPluto.isVisible() == true && btnEris.isVisible() == true && btnCeres.isVisible() == true ){
	  		               btnPluto.setVisible(false);
	  		               btnCeres.setVisible(false);
	  		               btnEris.setVisible(false);
	  		            }else{
	  		                btnPluto.setVisible(true);
						   	  		               btnCeres.setVisible(true);
	  		               btnEris.setVisible(true);
	  		            }
	  		         }
	  		      });


	  		       final JCheckBoxMenuItem showPlanets = new JCheckBoxMenuItem("Show Planets", true);
				  	  		      showPlanets.addItemListener(new ItemListener() {
				  	  		         public void itemStateChanged(ItemEvent e) {
				  	  		            if(btnMercury.isVisible() == true && btnVenus.isVisible() == true && btnEarth.isVisible() == true && btnMars.isVisible() == true && btnJupiter.isVisible() == true && btnSaturn.isVisible() == true && btnUranus.isVisible() == true && btnNeptune.isVisible() == true){
				  	  		              btnMercury.setVisible(false);
				  	  		              btnVenus.setVisible(false);
				  	  		              btnEarth.setVisible(false);
				  	  		              btnMars.setVisible(false);
				  	  		              btnJupiter.setVisible(false);
				  	  		              btnSaturn.setVisible(false);
				  	  		              btnUranus.setVisible(false);
				  	  		              btnNeptune.setVisible(false);
				  	  		            }else{
				  	  		                 btnMercury.setVisible(true);
										   				  	  		              btnVenus.setVisible(true);
										   				  	  		              btnEarth.setVisible(true);
										   				  	  		              btnMars.setVisible(true);
										   				  	  		              btnJupiter.setVisible(true);
										   				  	  		              btnSaturn.setVisible(true);
										   				  	  		              btnUranus.setVisible(true);
				  	  		              btnNeptune.setVisible(true);
				  	  		            }
				  	  		         }
				  	  		      });




				  	  		      final JCheckBoxMenuItem soundOnOff = new JCheckBoxMenuItem("Sound", true);
								  	  		      soundOnOff.addItemListener(new ItemListener() {
								  	  		         public void itemStateChanged(ItemEvent e) {
								  	  		            if(soundOn == 0 ){
								  	  		               soundOn = 1;
								  	  		            }else{
								  	  		                soundOn = 0;
								  	  		            }
								  	  		         }
	  		      });




	  		    //  final JRadioButtonMenuItem showLinksMenu =
	  		       //  new JRadioButtonMenuItem("Show Links", true);
	  		   //   showLinksMenu.addItemListener(new ItemListener() {
	  		     //    public void itemStateChanged(ItemEvent e) {
	  		     //       if(menuBar.getMenu(3)!= null){
	  		             //  menuBar.remove(linkMenu);
	  		        //       repaint();
	  		        //    }else{
	  		           //    menuBar.add(linkMenu);
	  		           //    repaint();
	  		         //   }
	  		         //}
	  		      //});


	  		      //add menu items to menus
	  		      fileMenu.add(showDwarfPlanets);
	  		      fileMenu.add(showPlanets);
	  		      fileMenu.add(musicMenu1);
	  		      fileMenu.add(musicMenu2);
	  		      fileMenu.add(soundOnOff);
	  		      planetMenu.add(mercurySurface);
	  		      planetMenu.add(venusSurface);
	  		      planetMenu.add(marsSurface);
	  		      planetMenu.add(ceresSurface);
	  		      planetMenu.add(jupiterSurface);
	  		      planetMenu.add(saturnSurface);
	  		      planetMenu.add(uranusSurface);
	  		      planetMenu.add(neptuneSurface);
	  		      planetMenu.add(plutoSurface);
	  		      planetMenu.add(erisSurface);
	  		     // fileMenu.add(saveMenuItem);
	  		    //  fileMenu.addSeparator();
	  		  //    fileMenu.add(showWindowMenu);
	  		   //   fileMenu.addSeparator();
	  		  //    fileMenu.add(showLinksMenu);
	  		  //    fileMenu.addSeparator();
	  		   //   fileMenu.add(exitMenuItem);
	  		 //     editMenu.add(cutMenuItem);
	  		     // editMenu.add(copyMenuItem);
	  		   //   editMenu.add(pasteMenuItem);


	  		      //add menu to menubar
	  		      menuBar.add(fileMenu);
	  		     // menuBar.add(editMenu);
	  		     // menuBar.add(aboutMenu);
	  		    //  menuBar.add(linkMenu);


	  		      //add menubar to the frame
	  		      setJMenuBar(menuBar);
		      setVisible(true);
   	  //setForeground(






     // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);










      setVisible(true);         // "super" Frame shows








   }




   public static void main(String[] args) {


    SpaceGUI app = new SpaceGUI();


	//try {
	   	//	app.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("space.jpg")).getScaledInstance(2050, 550, java.awt.Image.SCALE_SMOOTH))));
	    	//} catch (IOException e) {
	    	//	e.printStackTrace();
	    //	}
	    //	app.pack();
    	//app.setVisible(true);
	//	app.setBackground(Color.black);
		app.getContentPane().setBackground( Color.black );






   }




   @Override
   public void actionPerformed(ActionEvent evt) {


	   if(evt.getSource() == btnSun)
	   {
PlanetClick();
			//sound.play();
			String sunmessage = "The Sun is a Star at the center of the Solar System. All the planets orbit around the Sun.\nTemperature: 5,777k\nRadius: 432,288 mi\nMass: 1.989 × 10^30 kg\nSize vs Earth: 109.2 times larger";






			       // JOptionPane sunpane = new JOptionPane(sunmessage);


			      //  sunpane.setIcon(new ImageIcon("sun.jpeg"));


			      ImageIcon sunicon = new ImageIcon("sun.png");


			     //   JInternalFrame frame = sunpane.createInternalFrame(


					 JOptionPane.showMessageDialog(null, sunmessage, "Sun",
   JOptionPane.INFORMATION_MESSAGE,   sunicon);
	}
	else if(evt.getSource() == btnMercury)
	{
		PlanetClick();
	 String mercurymessage = "Mercury is the Planet nearest to the Sun.\nIt is the smallest Planet as well.\nTemperature: 703.15k\nDistance from Sun: 35.98 million mi\nLength of day: 58d 15h 30m\nOrbital period: 88 days\nSurface area: 28.88 million mi²\nRadius: 1,516 mi\nMass: 3.285 × 10^23 kg\nGravity: 3.78 m/s2\nSize vs Earth: 2.6 times smaller";






			       // JOptionPane mercurypane = new JOptionPane(mercurymessage);


			      //  mercurypane.setIcon(new ImageIcon("mercury.jpeg"));


			    ImageIcon mercuryicon = new ImageIcon(((new ImageIcon("mercury.png")).getImage()).getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));


			     //   JInternalFrame frame = sunpane.createInternalFrame(


					 JOptionPane.showMessageDialog(null, mercurymessage, "Mercury",
   JOptionPane.INFORMATION_MESSAGE,   mercuryicon);
	}
	else if(evt.getSource() == btnVenus)
		{
			PlanetClick();
		 String venusmessage = "Venus is the second nearest Planet to the Sun.\nIt is the hottest Planet in the Solar System.\nTemperature: 735.372k\nDistance from Sun: 67.24 million mi\nLength of day: 116d 18h 0m\nOrbital period: 225 days\nSurface area: 177.7 million mi²\nRadius: 3,760 mi\nMass: 4.867 × 10^24 kg\nGravity: 8.8 m/s2\nSize vs Earth: 1.1 times smaller";






				       // JOptionPane mercurypane = new JOptionPane(mercurymessage);


				      //  mercurypane.setIcon(new ImageIcon("mercury.jpeg"));


				    ImageIcon venusicon = new ImageIcon(((new ImageIcon("Venus.png")).getImage()).getScaledInstance(220, 220, java.awt.Image.SCALE_SMOOTH));


				     //   JInternalFrame frame = sunpane.createInternalFrame(


						 JOptionPane.showMessageDialog(null, venusmessage, "Venus",
	   JOptionPane.INFORMATION_MESSAGE,   venusicon);
	}
	else if(evt.getSource() == btnEarth)
			{
			//	PlaySound();
			PlanetClick();
			 String earthmessage = "Earth is the third nearest Planet to the Sun.\nIt is the only Planet confrimed to have life.\nTemperature: 287k\nDistance from Sun: 92.96 million mi\nLength of day: 24h\nOrbital period: 1 year\nSurface area: 177.7 million mi²\nRadius: 3,959 mi\nMass: 5.972 × 10^24 kg\nGravity: 9.78 m/s2\nMoons: 1";






					       // JOptionPane mercurypane = new JOptionPane(mercurymessage);


					      //  mercurypane.setIcon(new ImageIcon("mercury.jpeg"));


					    ImageIcon earthicon = new ImageIcon(((new ImageIcon("Earth.png")).getImage()).getScaledInstance(230, 230, java.awt.Image.SCALE_SMOOTH));


					     //   JInternalFrame frame = sunpane.createInternalFrame(


							 JOptionPane.showMessageDialog(null, earthmessage, "Earth",
		   JOptionPane.INFORMATION_MESSAGE,   earthicon);
	}


	else if(evt.getSource() == btnMars)
				{
					PlanetClick();
				 String marsmessage = "Mars is the forth Planet to the Sun.\nMars has been a popular area for Space Colonization.\nTemperature: 192k\nDistance from Sun: 141.6 million mi\nLength of day: 1d 0h 40m\nOrbital period: 687 days\nSurface area: 55.91 million mi²\nRadius: 2,106 mi\nMass: 6.39 × 10^23 kg\nGravity: 3.72 m/s2\nMoons: 2\nSize vs Earth: 1.9 times smaller";










						    ImageIcon marsicon = new ImageIcon(((new ImageIcon("Mars.png")).getImage()).getScaledInstance(210, 210, java.awt.Image.SCALE_SMOOTH));






								 JOptionPane.showMessageDialog(null, marsmessage, "Mars",
			   JOptionPane.INFORMATION_MESSAGE,   marsicon);
	}
	else if(evt.getSource() == btnJupiter)
					{
						PlanetClick();
					 String jupitermessage = "Jupiter is the fifth Planet to the Sun,and the first of the four known Gas Giants.\nJupiter is also the largest Planet in the Solar System.\nTemperature: 165k\nDistance from Sun: 483.8 million mi\nLength of day: 9h 56m\nOrbital period: 12 years\nSurface area: 23.71 billion mi²\nRadius: 43,441 mi\nMass: 1.898 × 10^27 kg\nGravity: 23.1 m/s2\nMoons: 67\nSize vs Earth: 11.2 times larger";










							    ImageIcon jupitericon = new ImageIcon(((new ImageIcon("Jupiter.png")).getImage()).getScaledInstance(320, 320, java.awt.Image.SCALE_SMOOTH));






									 JOptionPane.showMessageDialog(null, jupitermessage, "Jupiter",
				   JOptionPane.INFORMATION_MESSAGE,   jupitericon);
	}
	else if(evt.getSource() == btnSaturn)
						{
							PlanetClick();
						 String saturnmessage = "Saturn is the sixth Planet to the Sun, and the second of the four known Gas Giants.\nSaturn is also known for it's Rings, which are actually a large group of rocks orbiting around it.\nTemperature: 134k\nDistance from Sun: 888.2 million mi\nLength of day: 10h 42m\nOrbital period: 29 years\nSurface area: 16.49 billion mi²\nRadius: 36,184 mi\nMass: 5.683 × 10^26 kg\nGravity: 9.05 m/s2\nMoons: 53\nSize vs Earth: 9.1 times larger";










								    ImageIcon saturnicon = new ImageIcon(((new ImageIcon("Saturn.png")).getImage()).getScaledInstance(290, 290, java.awt.Image.SCALE_SMOOTH));






										 JOptionPane.showMessageDialog(null, saturnmessage, "Saturn",
					   JOptionPane.INFORMATION_MESSAGE,   saturnicon);
	}
	else if(evt.getSource() == btnUranus)
							{
								PlanetClick();
							 String uranusmessage = "Uranus is the seventh Planet to the Sun, and the third of the four known Gas Giants.\nUranus is the coldest Planet in the Solar System.\nTemperature: 49.15k\nDistance from Sun: 1.787 billion mi\nLength of day: 17h 14m\nOrbital period: 84 years\nSurface area: 3.121 billion mi²\nRadius: 15,759 mi\nMass: 8.68 × 10^25 kg\nGravity: 8.69 m/s2\nMoons: 27\nSize vs Earth: 4 times larger";










									    ImageIcon uranusicon = new ImageIcon(((new ImageIcon("Uranus.png")).getImage()).getScaledInstance(250, 250, java.awt.Image.SCALE_SMOOTH));






											 JOptionPane.showMessageDialog(null, uranusmessage, "Uranus",
						   JOptionPane.INFORMATION_MESSAGE,   uranusicon);
	}
	else if(evt.getSource() == btnNeptune)
								{
									PlanetClick();
								 String neptunemessage = "Neptune is the eighth and last Planet to the Sun and Gas Giants.\nNeptune is the densest Planet in the Solar System.\nTemperature: 73k\nDistance from Sun: 2.795 billion mi\nLength of day: 16h 6m\nOrbital period: 165 years\nSurface area: 2.941 billion mi²\nRadius: 15,299 mi\nMass: 8.68 × 10^25 kg\nGravity: 11.0 m/s2\nMoons: 14\nSize vs Earth: 3.9 times larger";










										    ImageIcon neptuneicon = new ImageIcon(((new ImageIcon("Neptune.png")).getImage()).getScaledInstance(248, 248, java.awt.Image.SCALE_SMOOTH));






												 JOptionPane.showMessageDialog(null, neptunemessage, "Neptune",
							   JOptionPane.INFORMATION_MESSAGE,   neptuneicon);
	}
	else if(evt.getSource() == btnPluto)
									{
										PlanetClick();
									 String plutomessage = "Pluto is the second of the three dwarf planets, is nearest to Neptune.\nPluto has 3 times as much water as Earth, in the form of Ice Water\nTemperature: 44k\nDistance from Sun: 3.67 billion mi\nLength of day: 6d 9h 36m\nOrbital period: 248 years\nSurface area: 17.075 million mi²\nRadius: 737.6 mi\nMass: 1.30900 × 10^22 kg\nGravity: 0.62 m/s2\nMoons: 5\nSize vs Earth: 5.4 times smaller";










											    ImageIcon plutoicon = new ImageIcon(((new ImageIcon("Pluto.png")).getImage()).getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));






													 JOptionPane.showMessageDialog(null, plutomessage, "Pluto",
								   JOptionPane.INFORMATION_MESSAGE,   plutoicon);
	}
	else if(evt.getSource() == btnEris)
									{
										PlanetClick();
									 String erismessage = "Eris is the third and last of the Dwarf Planets.\nDue to being far from the Sun, the atmosphere of ERis freezes at times.\nTemperature: 42k\nDistance from Sun: 6.321 billion mi\nLength of day: 6d 9h 36m\nOrbital period: 560 years\nSurface area: 17.2 million mi²\nRadius: 722.65 mi\nMass: 1.66 × 10^22 kg\nGravity: 0.66 m/s2\nMoons: 1\nSize vs Earth: 5.5 times smaller";	// investigate surface area and radius










											    ImageIcon erisicon = new ImageIcon(((new ImageIcon("Eris.png")).getImage()).getScaledInstance(102, 102, java.awt.Image.SCALE_SMOOTH));






													 JOptionPane.showMessageDialog(null, erismessage, "Eris",
								   JOptionPane.INFORMATION_MESSAGE,   erisicon);
	}
	else if(evt.getSource() == btnCeres)
									{
										PlanetClick();
									 String ceresmessage = "Ceres is the first of the three Dward Planets. It is in between Mars and Jupiter.\nCeres accounts for nearly ? of the asteroid belt.\nTemperature: 168k\nDistance from Sun: 260 million mi\nLength of day: 9h 6m\nOrbital period: 1680d\nSurface area: 1.069 million mi²\nRadius: 293 mi\nMass: 8.958 × 10^20 kg\nGravity: 0.27 m/s2\nSize vs Earth: 13.5 times smaller";	// something isn’t right with units in distance from sun. Check each










											    ImageIcon ceresicon = new ImageIcon(((new ImageIcon("Ceres.png")).getImage()).getScaledInstance(75, 75, java.awt.Image.SCALE_SMOOTH));






													 JOptionPane.showMessageDialog(null, ceresmessage, "Ceres",
								   JOptionPane.INFORMATION_MESSAGE,   ceresicon);
	}
	else if(evt.getActionCommand().equals("one"))
	{
		PlanetClick();
		PlaySoundOne();


	}


	else if(evt.getActionCommand().equals("two"))
		{
			PlanetClick();
			PlaySoundTwo();
	}
	else if(evt.getActionCommand().equals("mars"))
			{
				PlanetClick();
				JDialog dialog = new JDialog();
				dialog.setUndecorated(false);
				//ImageIcon imageIcon = new ImageIcon(new ImageIcon("icon.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
				//label.setIcon(imageIcon);
				JLabel label = new JLabel( new ImageIcon("marssurface.jpg") );
				label.setPreferredSize(new Dimension(1000, 580));
				dialog.add( label );
				dialog.pack();
dialog.setVisible(true);


		//	BufferedImage image = ImageIO.read(new File("mars.png"));
			//JLabel picLabel = new JLabel(new ImageIcon(image));
//JOptionPane.showMessageDialog(null, picLabel, "About", JOptionPane.PLAIN_MESSAGE, null);
	}
else if(evt.getActionCommand().equals("earth"))
			{
				PlanetClick();
				//JDialog dialog = new JDialog();
				//dialog.setUndecorated(false);
				//ImageIcon imageIcon = new ImageIcon(new //ImageIcon("icon.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
				//label.setIcon(imageIcon);
				//JLabel label = new JLabel( new ImageIcon("marssurface.jpg") );
				//label.setPreferredSize(new Dimension(1000, 580));
				//dialog.add( label );
				//dialog.pack();
//dialog.setVisible(true);


		//	BufferedImage image = ImageIO.read(new File("mars.png"));
			//JLabel picLabel = new JLabel(new ImageIcon(image));
//JOptionPane.showMessageDialog(null, picLabel, "About", JOptionPane.PLAIN_MESSAGE, null);
	}
else if(evt.getActionCommand().equals("venus"))
			{
				PlanetClick();
				JDialog dialog = new JDialog();
				dialog.setUndecorated(false);
				//ImageIcon imageIcon = new ImageIcon(new ImageIcon("icon.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
				//label.setIcon(imageIcon);
				dialog.setTitle("Venus");
				JLabel label = new JLabel( new ImageIcon("venussurface.jpg") );
				label.setPreferredSize(new Dimension(1000, 580));
				dialog.add( label );
				dialog.pack();
dialog.setVisible(true);


		//	BufferedImage image = ImageIO.read(new File("mars.png"));
			//JLabel picLabel = new JLabel(new ImageIcon(image));
//JOptionPane.showMessageDialog(null, picLabel, "About", JOptionPane.PLAIN_MESSAGE, null);
	}
else if(evt.getActionCommand().equals("mercury"))
			{
				PlanetClick();
				JDialog dialog = new JDialog();
				dialog.setUndecorated(false);
				dialog.setTitle("Mercury");
				//ImageIcon imageIcon = new ImageIcon(new ImageIcon("icon.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
				//label.setIcon(imageIcon);
				JLabel label = new JLabel( new ImageIcon("mercurysurface.jpg") );
				label.setPreferredSize(new Dimension(1000, 580));
				dialog.add( label );
				dialog.pack();
dialog.setVisible(true);


		//	BufferedImage image = ImageIO.read(new File("mars.png"));
			//JLabel picLabel = new JLabel(new ImageIcon(image));
//JOptionPane.showMessageDialog(null, picLabel, "About", JOptionPane.PLAIN_MESSAGE, null);
	}
else if(evt.getActionCommand().equals("ceres"))
			{
				PlanetClick();
				JDialog dialog = new JDialog();
				dialog.setUndecorated(false);
				//ImageIcon imageIcon = new ImageIcon(new ImageIcon("icon.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
				//label.setIcon(imageIcon);
				dialog.setTitle("Ceres");
				JLabel label = new JLabel( new ImageIcon("ceressurface.jpg") );
				label.setPreferredSize(new Dimension(1000, 580));
				dialog.add( label );
				dialog.pack();
dialog.setVisible(true);


		//	BufferedImage image = ImageIO.read(new File("mars.png"));
			//JLabel picLabel = new JLabel(new ImageIcon(image));
//JOptionPane.showMessageDialog(null, picLabel, "About", JOptionPane.PLAIN_MESSAGE, null);
	}
else if(evt.getActionCommand().equals("jupiter"))
			{
				PlanetClick();
				JDialog dialog = new JDialog();
				dialog.setUndecorated(false);
				//ImageIcon imageIcon = new ImageIcon(new ImageIcon("icon.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
				//label.setIcon(imageIcon);
				dialog.setTitle("Jupiter");
				JLabel label = new JLabel( new ImageIcon("jupitercloseup.jpg") );
				label.setPreferredSize(new Dimension(1000, 580));
				dialog.add( label );
				dialog.pack();
dialog.setVisible(true);


		//	BufferedImage image = ImageIO.read(new File("mars.png"));
			//JLabel picLabel = new JLabel(new ImageIcon(image));
//JOptionPane.showMessageDialog(null, picLabel, "About", JOptionPane.PLAIN_MESSAGE, null);
	}
else if(evt.getActionCommand().equals("saturn"))
			{
				PlanetClick();
				JDialog dialog = new JDialog();
				dialog.setUndecorated(false);
				//ImageIcon imageIcon = new ImageIcon(new ImageIcon("icon.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
				//label.setIcon(imageIcon);
				dialog.setTitle("Saturn");
				JLabel label = new JLabel( new ImageIcon("saturncloseup.jpg") );
				label.setPreferredSize(new Dimension(1000, 580));
				dialog.add( label );
				dialog.pack();
dialog.setVisible(true);


		//	BufferedImage image = ImageIO.read(new File("mars.png"));
			//JLabel picLabel = new JLabel(new ImageIcon(image));
//JOptionPane.showMessageDialog(null, picLabel, "About", JOptionPane.PLAIN_MESSAGE, null);
	}
else if(evt.getActionCommand().equals("uranus"))
			{
				PlanetClick();
				JDialog dialog = new JDialog();
				dialog.setUndecorated(false);
				//ImageIcon imageIcon = new ImageIcon(new ImageIcon("icon.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
				//label.setIcon(imageIcon);
				dialog.setTitle("Uranus");
				JLabel label = new JLabel( new ImageIcon("uranuscloseup.jpg") );
				label.setPreferredSize(new Dimension(1000, 580));
				dialog.add( label );
				dialog.pack();
dialog.setVisible(true);


		//	BufferedImage image = ImageIO.read(new File("mars.png"));
			//JLabel picLabel = new JLabel(new ImageIcon(image));
//JOptionPane.showMessageDialog(null, picLabel, "About", JOptionPane.PLAIN_MESSAGE, null);
	}
else if(evt.getActionCommand().equals("neptune"))
			{
				PlanetClick();
				JDialog dialog = new JDialog();
				dialog.setUndecorated(false);
				//ImageIcon imageIcon = new ImageIcon(new ImageIcon("icon.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
				//label.setIcon(imageIcon);
				dialog.setTitle("Neptune");
				JLabel label = new JLabel( new ImageIcon("neptunecloseup.jpg") );
				label.setPreferredSize(new Dimension(1000, 580));
				dialog.add( label );
				dialog.pack();
dialog.setVisible(true);


		//	BufferedImage image = ImageIO.read(new File("mars.png"));
			//JLabel picLabel = new JLabel(new ImageIcon(image));
//JOptionPane.showMessageDialog(null, picLabel, "About", JOptionPane.PLAIN_MESSAGE, null);
	}
else if(evt.getActionCommand().equals("pluto"))
			{
				PlanetClick();
				JDialog dialog = new JDialog();
				dialog.setUndecorated(false);
				//ImageIcon imageIcon = new ImageIcon(new ImageIcon("icon.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
				//label.setIcon(imageIcon);
				dialog.setTitle("Pluto");
				JLabel label = new JLabel( new ImageIcon("plutosurface.jpg") );
				label.setPreferredSize(new Dimension(1000, 580));
				dialog.add( label );
				dialog.pack();
dialog.setVisible(true);


		//	BufferedImage image = ImageIO.read(new File("mars.png"));
			//JLabel picLabel = new JLabel(new ImageIcon(image));
//JOptionPane.showMessageDialog(null, picLabel, "About", JOptionPane.PLAIN_MESSAGE, null);
	}
else if(evt.getActionCommand().equals("eris"))
			{
				PlanetClick();
				JDialog dialog = new JDialog();
				dialog.setUndecorated(false);
				//ImageIcon imageIcon = new ImageIcon(new ImageIcon("icon.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
				//label.setIcon(imageIcon);
				dialog.setTitle("Eris");
				JLabel label = new JLabel( new ImageIcon("eriscloseup.jpg") );
				label.setPreferredSize(new Dimension(1000, 580));
				dialog.add( label );
				dialog.pack();
dialog.setVisible(true);


		//	BufferedImage image = ImageIO.read(new File("mars.png"));
			//JLabel picLabel = new JLabel(new ImageIcon(image));
//JOptionPane.showMessageDialog(null, picLabel, "About", JOptionPane.PLAIN_MESSAGE, null);
	}
	else if(evt.getActionCommand().equals("emoon"))
	{
		PlanetClick();
		String earthmoonmessage = "Earth has one Moon orbiting around it.\nThe Moon is believed to have once been a part of the Earth, breaking off during the formation of Earth.\nTemperature: Sun: 395.9k Dark: 120.4k\nDistance from Earth: 238,900 mi\nOrbital period: 27 days\nSurface area: 37.9 million mi²\nRadius: 1,079 mi\nMass: 7.35 × 10^22 kg\nGravity: 1.622 m/s2\nSize vs Earth: 3.6 times smaller";	// investigate surface area and radius










													    ImageIcon moonicon = new ImageIcon(((new ImageIcon("Moon.png")).getImage()).getScaledInstance(110, 110, java.awt.Image.SCALE_SMOOTH));






															 JOptionPane.showMessageDialog(null, earthmoonmessage, "Earth's Moon",
								   JOptionPane.INFORMATION_MESSAGE,   moonicon);
	}
	else if(evt.getActionCommand().equals("weight"))
	{
		PlanetClick();
		String weight1 = JOptionPane.showInputDialog(null, "Enter your weight(On Earth):: ");
		double weight = Double.parseDouble(weight1);
		double newweight = 0;
		String planet;
		boolean selectedOption = false;


		do{
			planet = JOptionPane.showInputDialog(null, "Enter the Planet of interest:: ");


		if(planet.equals("mercury") || planet.equals("Mercury"))
		{
			double a = (weight / 9.8) * 3.7;
			newweight = Math.round(a * 100.0) / 100.0;
			JOptionPane.showMessageDialog(null, "You would weigh about " + newweight + " pounds on Mercury", "Weight",
								   JOptionPane.INFORMATION_MESSAGE);


			selectedOption = true;


		}
		else if(planet.equals("venus") || planet.equals("Venus"))
		{
			double a = (weight / 9.8) * 8.87;
						newweight = Math.round(a * 100.0) / 100.0;
						JOptionPane.showMessageDialog(null, "You would weigh about " + newweight + " pounds on Venus", "Weight",
											   JOptionPane.INFORMATION_MESSAGE);


			selectedOption = true;
		}
		else if(planet.equals("mars") || planet.equals("Mars"))
		{
			double a = (weight / 9.8) * 3.711;
						newweight = Math.round(a * 100.0) / 100.0;
						JOptionPane.showMessageDialog(null, "You would weigh about " + newweight + " pounds on Mars", "Weight",
											   JOptionPane.INFORMATION_MESSAGE);


			selectedOption = true;
		}
		else if(planet.equals("ceres") || planet.equals("Ceres"))
		{
			double a = (weight / 9.8) * 0.27;
						newweight = Math.round(a * 100.0) / 100.0;
						JOptionPane.showMessageDialog(null, "You would weigh about " + newweight + " pounds on Ceres", "Weight",
											   JOptionPane.INFORMATION_MESSAGE);


			selectedOption = true;
		}
		else if(planet.equals("jupiter") || planet.equals("Jupiter"))
		{
			double a = (weight / 9.8) * 24.79;
						newweight = Math.round(a * 100.0) / 100.0;
						JOptionPane.showMessageDialog(null, "You would weigh about " + newweight + " pounds on Jupiter", "Weight",
											   JOptionPane.INFORMATION_MESSAGE);


			selectedOption = true;
		}
		else if(planet.equals("saturn") || planet.equals("Saturn"))
		{
			double a = (weight / 9.8) * 10.44;
						newweight = Math.round(a * 100.0) / 100.0;
						JOptionPane.showMessageDialog(null, "You would weigh about " + newweight + " pounds on Saturn", "Weight",
											   JOptionPane.INFORMATION_MESSAGE);


			selectedOption = true;
		}
		else if(planet.equals("uranus") || planet.equals("Uranus"))
		{
			double a = (weight / 9.8) * 8.87;
						newweight = Math.round(a * 100.0) / 100.0;
						JOptionPane.showMessageDialog(null, "You would weigh about " + newweight + " pounds on Uranus", "Weight",
											   JOptionPane.INFORMATION_MESSAGE);


			selectedOption = true;
		}
		else if(planet.equals("neptune") || planet.equals("Neptune"))
		{
			double a = (weight / 9.8) * 11.15;
						newweight = Math.round(a * 100.0) / 100.0;
						JOptionPane.showMessageDialog(null, "You would weigh about " + newweight + " pounds on Neptune", "Weight",
											   JOptionPane.INFORMATION_MESSAGE);


			selectedOption = true;
		}
		else if(planet.equals("pluto") || planet.equals("Pluto"))
		{
			double a = (weight / 9.8) * 0.62;
						newweight = Math.round(a * 100.0) / 100.0;
						JOptionPane.showMessageDialog(null, "You would weigh about " + newweight + " pounds on Pluto", "Weight",
											   JOptionPane.INFORMATION_MESSAGE);


			selectedOption = true;
		}
		else if(planet.equals("eris") || planet.equals("Eris"))
		{
			double a = (weight / 9.8) * 0.66;
						newweight = Math.round(a * 100.0) / 100.0;
						JOptionPane.showMessageDialog(null, "You would weigh about " + newweight + " pounds on Eris", "Weight",
											   JOptionPane.INFORMATION_MESSAGE);


			selectedOption = true;
		}
		else
		{


						JOptionPane.showMessageDialog(null, "Invalid Choice", "Weight",
											   JOptionPane.INFORMATION_MESSAGE);




		}
		}while(!selectedOption);
	}
	else if(evt.getActionCommand().equals("phobos"))
		{
			PlanetClick();
			String phobosmessage = "Phobos is one of two Moons of Mars.\nEventually, Phobos will either become crushed by Mars's Gravity Field, or crash on Mars\nTemperature: Sun: 269k Dark: 161.15k\nDistance from Mars: 5,826 mi\nOrbital period: 8 hours\nSurface area: 597.8 mi²\nRadius: 6.9 mi\nMass: 1.0659×10^16 kg\nGravity: 0.0057 m/s2\nSize vs Earth: 574.8 times smaller";	// investigate surface area and radius










														    ImageIcon phobosicon = new ImageIcon(((new ImageIcon("Phobos.png")).getImage()).getScaledInstance(110, 110, java.awt.Image.SCALE_SMOOTH));






																 JOptionPane.showMessageDialog(null, phobosmessage, "Phobos",
									   JOptionPane.INFORMATION_MESSAGE,   phobosicon);
	}
	else if(evt.getActionCommand().equals("deimos"))
			{
				PlanetClick();
				String deimosmessage = "Deimos is also one of two Moons of Mars.\nEventually, Deimos will float out of Mars's gravity field\nTemperature: 232.85k\nDistance from Mars: 14,573 mi\nOrbital period: 30 hours\nSurface area: 191.2 mi²\nRadius: 3.85 mi\nMass: 1.4762×10^15 kg\nGravity: 0.003 m/s2\nSize vs Earth: 1028.3 times smaller";	// investigate surface area and radius










															    ImageIcon deimosicon = new ImageIcon(((new ImageIcon("Deimos.png")).getImage()).getScaledInstance(110, 110, java.awt.Image.SCALE_SMOOTH));






																	 JOptionPane.showMessageDialog(null, deimosmessage, "Deimos",
										   JOptionPane.INFORMATION_MESSAGE,   deimosicon);
	}
	else if(evt.getActionCommand().equals("europa"))
				{
					PlanetClick();
					String europamessage = "Europa is one of the many Moons of Jupiter.\nEuropa is believed to have a Subsurface Ocean below it's icy surface.\nTemperature: 110k\nDistance from Jupiter: 414k mi\nOrbital period: 85 hours\nSurface area: 1.18×10^7 mi²\nRadius: 969.3 mi\nMass: 4.7998 ×10^22 kg\nGravity: 1.315 m/s2\nSize vs Earth: 4.1 times smaller";	// investigate surface area and radius










																    ImageIcon europaicon = new ImageIcon(((new ImageIcon("europa.png")).getImage()).getScaledInstance(110, 110, java.awt.Image.SCALE_SMOOTH));






																		 JOptionPane.showMessageDialog(null, europamessage, "Europa",
											   JOptionPane.INFORMATION_MESSAGE,   europaicon);
	}
	else if(evt.getActionCommand().equals("io"))
					{
						PlanetClick();
						String deimosmessage = "Deimos is also one of two Moons of Mars.\nEventually, Deimos will float out of Mars's gravity field\nTemperature: 232.85k\nDistance from Mars: 14,573 mi\nOrbital period: 30 hours\nSurface area: 191.2 mi²\nRadius: 3.85 mi\nMass: 1.4762×10^15 kg\nGravity: 0.003 m/s2\nSize vs Earth: 1028.3 times smaller";	// investigate surface area and radius










																	    ImageIcon deimosicon = new ImageIcon(((new ImageIcon("io.png")).getImage()).getScaledInstance(110, 110, java.awt.Image.SCALE_SMOOTH));






																			 JOptionPane.showMessageDialog(null, deimosmessage, "Deimos",
												   JOptionPane.INFORMATION_MESSAGE,   deimosicon);
	}
	else if(evt.getActionCommand().equals("callisto"))
					{
						PlanetClick();
						String deimosmessage = "Deimos is also one of two Moons of Mars.\nEventually, Deimos will float out of Mars's gravity field\nTemperature: 232.85k\nDistance from Mars: 14,573 mi\nOrbital period: 30 hours\nSurface area: 191.2 mi²\nRadius: 3.85 mi\nMass: 1.4762×10^15 kg\nGravity: 0.003 m/s2\nSize vs Earth: 1028.3 times smaller";	// investigate surface area and radius










																	    ImageIcon deimosicon = new ImageIcon(((new ImageIcon("callisto.png")).getImage()).getScaledInstance(110, 110, java.awt.Image.SCALE_SMOOTH));






																			 JOptionPane.showMessageDialog(null, deimosmessage, "Deimos",
												   JOptionPane.INFORMATION_MESSAGE,   deimosicon);
	}
	else if(evt.getActionCommand().equals("ganymede"))
					{
						PlanetClick();
						String ganymedemessage = "Ganymede is also one of Jupiter's Moons.\nGanymede is believed to possess an Subterrian-Ocean\nTemperature: 90.15k-142.15k\nDistance from Jupiter: 665k mi\nOrbital period: 172 hours\nSurface area: 33.6 million mi²\nRadius: 1635 mi\nMass: 1.4819×10^23 kg\nGravity: 1.428 m/s2\nSize vs Earth: 2.4 times smaller";	// investigate surface area and radius










																	    ImageIcon ganymedeicon = new ImageIcon(((new ImageIcon("ganymede.png")).getImage()).getScaledInstance(110, 110, java.awt.Image.SCALE_SMOOTH));






																			 JOptionPane.showMessageDialog(null, ganymedemessage, "Deimos",
												   JOptionPane.INFORMATION_MESSAGE,   ganymedeicon);
	}
else if(evt.getActionCommand().equals("titan"))
					{
						PlanetClick();
						String titanmessage = "Titan is also one Saturn’s many moons.\nTitan is known for it’s Methane Ocean\nTemperature: 94k\nDistance from Saturn: 359,234 mi\nOrbital period: 16 days\nSurface area: 32.1 million mi²\nRadius: 1,601 mi\nMass: 1.3454×10^23 kg\nGravity: 1.352 m/s2\nSize vs Earth: 2.5 times smaller";	// investigate surface area and radius










																	    ImageIcon titanicon = new ImageIcon(((new ImageIcon("titan.png")).getImage()).getScaledInstance(110, 110, java.awt.Image.SCALE_SMOOTH));






																			 JOptionPane.showMessageDialog(null, titanmessage, "Titan",
												   JOptionPane.INFORMATION_MESSAGE,   titanicon);
	}
else if(evt.getActionCommand().equals("dione"))
					{
					//	AnimatedBalls.main(null);	// call method after gaining planet of interest
						PlanetClick();
						String dionemessage= "Dione is another one Saturn’s moons.\nDione was recently discovered to be possibly harboring an ocean of Water\nTemperature: 87k\nDistance from Saturn: 234k mi\nOrbital period: 66 hours\nSurface area: 1.5 million mi²\nRadius: 349.1 mi\nMass: 1.1×10^21 kg\nGravity: 0.232 m/s2\nSize vs Earth: 11.3 times smaller";	// investigate surface area and radius












																	    ImageIcon dioneicon = new ImageIcon(((new ImageIcon("Dione.png")).getImage()).getScaledInstance(110, 110, java.awt.Image.SCALE_SMOOTH));






																			 JOptionPane.showMessageDialog(null, dionemessage, "Dione",
												   JOptionPane.INFORMATION_MESSAGE,   dioneicon);
	}
	else if(evt.getActionCommand().equals("gravity"))
		{
			PlanetClick();
			String planet;
			boolean selectedOption = false;


			do{
				planet = JOptionPane.showInputDialog(null, "Enter the Planet of interest:: ");


			if(planet.equals("mercury") || planet.equals("Mercury"))
			{
				AnimatedBalls.main(null, 3.7, "Mercury" );


				selectedOption = true;


			}
			else if(planet.equals("venus") || planet.equals("Venus"))
			{
				AnimatedBalls.main(null, 8.8, "Venus");
				selectedOption = true;
			}
			else if(planet.equals("earth") || planet.equals("Earth"))
			{
				AnimatedBalls.main(null, 9.8, "Earth" );
				selectedOption = true;
			}
			else if(planet.equals("mars") || planet.equals("Mars"))
			{
				AnimatedBalls.main(null, 3.7, "Mars");
				selectedOption = true;
			}
			else if(planet.equals("ceres") || planet.equals("Ceres"))
			{
				AnimatedBalls.main(null, 0.27, "Ceres");
				selectedOption = true;
			}
			else if(planet.equals("jupiter") || planet.equals("Jupiter"))
			{
				AnimatedBalls.main(null, 24.79, "Jupiter");
				selectedOption = true;
			}
			else if(planet.equals("saturn") || planet.equals("Saturn"))
			{
				AnimatedBalls.main(null, 10.44, "Saturn");
				selectedOption = true;
			}
			else if(planet.equals("uranus") || planet.equals("Uranus"))
			{
				AnimatedBalls.main(null, 8.69, "Uranus");
				selectedOption = true;
			}
			else if(planet.equals("neptune") || planet.equals("Neptune"))
			{
				AnimatedBalls.main(null, 11.15, "Neptune");
				selectedOption = true;
			}
			else if(planet.equals("pluto") || planet.equals("Pluto"))
			{
				AnimatedBalls.main(null, 0.62, "Pluto");
				selectedOption = true;
			}
			else if(planet.equals("eris") || planet.equals("Eris"))
			{
				AnimatedBalls.main(null, 0.6554, "Eris");
				selectedOption = true;
			}
			else
			{


							JOptionPane.showMessageDialog(null, "Invalid Choice", "Gravity",
												   JOptionPane.INFORMATION_MESSAGE);




			}
			}while(!selectedOption);
	}
























          //(DialogBoxes.this).getLayeredPane(), "Sun");
		}


		public static void PlaySoundOne() {
			if(soundOn == 0)
			{
		   InputStream in;
		   	     try {
		   	         in = new FileInputStream(new File("music.wav"));	// find longer track and loop
		   	         AudioStream audios = new AudioStream(in);
		   	         AudioPlayer.player.start(audios);


		   	     } catch (Exception e) {
		   	         JOptionPane.showMessageDialog(null, e);


		       }
		   }




		}


		public static void PlaySoundTwo() {
			if(soundOn == 0)
			{
				   InputStream in;
				   	     try {
				   	         in = new FileInputStream(new File("longmusic.wav"));	// find longer track and loop


				   	         AudioStream audios = new AudioStream(in);
				   	         AudioPlayer.player.start(audios);


				   	     } catch (Exception e) {
				   	         JOptionPane.showMessageDialog(null, e);


				       }
			}










		}


		public static void PlanetClick() {
			if(soundOn == 0)
			{
						   InputStream in;
						   	     try {
						   	         in = new FileInputStream(new File("planetclick.wav"));	// find longer track and loop
						   	         AudioStream audios = new AudioStream(in);
						   	         AudioPlayer.player.start(audios);


						   	     } catch (Exception e) {
						   	         JOptionPane.showMessageDialog(null, e);


						       }
			}










		}
















}








































