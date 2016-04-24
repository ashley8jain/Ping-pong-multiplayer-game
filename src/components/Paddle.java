package components;
import javax.swing.ImageIcon;

public class Paddle extends Sprite implements Commons {

    int dx,dy;
    int side;

    public Paddle(int side) {
    	this.side = side;
    	
    	ImageIcon ii;
    	if(side==1 || side==3){
    		ii = new ImageIcon("paddle.png");
    	}
    	else{
    		ii = new ImageIcon("paddle_rotated.png");
    	}
        image = ii.getImage();

        this.i_width = image.getWidth(null);
        this.i_height = image.getHeight(null);

        resetState();
    }

    public void move(Ball b) {    
    	if(this.x >= 0 && this.x <= (WIDTH-this.i_width)){
			this.x += this.dx;
		}
		else if(this.x<0)
			this.x = 1;
		else if(this.x > WIDTH-this.i_width)
			this.x = WIDTH-this.i_width-1;
    }

    private void resetState() {
    	if(side==1){			//down side
    		this.x = WIDTH/2;
            this.y = HEIGHT-this.getHeight()-30;
    	}
    	if(side==2){			//left side
    		this.x = 30;
            this.y = HEIGHT/2;
    	}
    	if(side==3){			//top side
    		this.x = WIDTH/2;
    		this.y = 10;
    	}
    	if(side==4){			//right side
    		this.x = WIDTH-this.getWidth()-30;
    		this.y = HEIGHT/2;
    	}
    	
    }
}