package components;

import java.awt.event.KeyEvent;

public class userPaddle extends Paddle{

	public userPaddle() {
		super(1);
	}
	
	@Override
	public void move(Ball b){
		if(this.x > 0 && this.x < (WIDTH-this.i_width)){
			this.x += this.dx;
		}
	}
	
	public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            this.dx = -2;
        }

        if (key == KeyEvent.VK_RIGHT) {
        	this.dx = 2;
        }
    }

    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            this.dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
        	this.dx = 0;
        }
    }
	
}
