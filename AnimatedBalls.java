import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.InvocationTargetException;
public class AnimatedBalls {


	static double acceleration;
	static String title;
   public static void main(String[] args, double x, String t) {
        new AnimatedBalls();
        acceleration = x;
        title = t;
    }


    public AnimatedBalls() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            //double acceleration = x;
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                } catch (InstantiationException ex) {
                } catch (IllegalAccessException ex) {
                } catch (UnsupportedLookAndFeelException ex) {
                }


                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                frame.add(new Balls());
                frame.setSize(400, 400);
                frame.setVisible(true);
                frame.setTitle(title);


            }
        });
    }


    public class Balls extends JPanel {


        public Balls() {
            setLayout(null);
            // Randomize the speed and direction...
            //add(new Ball("red", 10 - (int) Math.round((Math.random() * 20)), 10 - (int) Math.round((Math.random() * 20))));
            add(new Ball("blue",10 ));
        }
    }


    public class Ball extends JPanel implements Runnable {


        Color color;
        int diameter;
        long delay;
        private int vx;
        private double vy;
        private double acc;
       // private double acceleration = x;


        public Ball(String ballcolor,  double yvelocity) {
            if (ballcolor == "red") {
                color = Color.red;
            } else if (ballcolor == "blue") {
                color = Color.blue;
            } else if (ballcolor == "black") {
                color = Color.black;
            } else if (ballcolor == "cyan") {
                color = Color.cyan;
            } else if (ballcolor == "darkGray") {
                color = Color.darkGray;
            } else if (ballcolor == "gray") {
                color = Color.gray;
            } else if (ballcolor == "green") {
                color = Color.green;
            } else if (ballcolor == "yellow") {
                color = Color.yellow;
            } else if (ballcolor == "lightGray") {
                color = Color.lightGray;
            } else if (ballcolor == "magenta") {
                color = Color.magenta;
            } else if (ballcolor == "orange") {
                color = Color.orange;
            } else if (ballcolor == "pink") {
                color = Color.pink;
            } else if (ballcolor == "white") {
                color = Color.white;
            }
            diameter = 30;
            delay = 50;


            //vx = xvelocity;
            vy = yvelocity;
            acc = acceleration;


            new Thread(this).start();


        }


        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;


           int x = getX();
           int y = getY();
         //int x =0;
         //int y = 0;


            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g.setColor(color);
            g.fillOval(0, 0, 30, 30); //adds color to circle
            g.setColor(Color.black);
            g2.drawOval(0, 0, 30, 30); //draws circle
        }


        @Override
        public Dimension getPreferredSize() {
            return new Dimension(30, 30);
        }


        public void run() {


            try {
                // Randamize the location...
                SwingUtilities.invokeAndWait(new Runnable() {
                    @Override
                    public void run() {
                     //   int x = (int) (Math.round(Math.random() * getParent().getWidth()));
                      //  int y = (int) (Math.round(Math.random() * getParent().getHeight()));
                      int x = 190;
                      int y =0;


                        setLocation(x, y);
                    }
                });
            } catch (InterruptedException exp) {
                exp.printStackTrace();
            } catch (InvocationTargetException exp) {
                exp.printStackTrace();
            }


            while (isVisible()) {
                try {
                    Thread.sleep(delay);


                } catch (InterruptedException e) {
                    System.out.println("interrupted");
                }


                try {
                    SwingUtilities.invokeAndWait(new Runnable() {
                        @Override
                        public void run() {




                            move();
                            repaint();


                        }
                    });
                } catch (InterruptedException exp) {
                    exp.printStackTrace();
                } catch (InvocationTargetException exp) {
                    exp.printStackTrace();
                }
            }
        }


        public void move() {
			//double acceleration = 9.8;
            int x = getX();
            int y = getY();


            if (x + vx < 0 || x + diameter + vx > getParent().getWidth()) {
                vx *= -1;
            }
            if (y + vy < 0 || y + diameter + vy > getParent().getHeight()) {
                vy *= -1;	// acclerates if using number != -1
            }
            
            if(y + vy > getParent().getHeight())
            {
             x = 190;
             y =0;   
             setLocation(x, y);
             acc = acceleration;
             vy = 10;
            }
            //x += vx;




			vy += acc;
            y += vy;


            // Update the size and location...
            setSize(getPreferredSize());


            setLocation(x, y);




        }
    }
}










