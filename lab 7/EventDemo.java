// Create interface EventListener with performEvent() method. Create MouseListener 
// interface which inherits EventListener along with mouseClicked(), mousePressed(), 
// mouseReleased(), mouseMoved(), mouseDragged() methods. Also create KeyListener 
// interface which inherits EventListener along with keyPressed(), keyReleased() 
// methods. WAP to create EventDemo class which implements MouseListener and 
// KeyListener and demonstrate all the methods of the interfaces.


interface EventListener{
	public void performEvent();
}	
	
interface MouseListener extends EventListener{
	public void mouseClicked();
	public void mousePressed();
	public void mouseReleased();
	public void mouseMoved();
	public void mouseDragged();
}
interface KeyListener extends EventListener{
	public void keyPressed();
	public void keyReleased();
}
public class EventDemo implements MouseListener,KeyListener{ 
 	public void performEvent()
 	{
 		System.out.println("Event occured");
 	}
 	public void mouseClicked()
 	{
 		System.out.println("Mouse Clicked");
 	}
 	public void mousePressed()
 	{
 		System.out.println("Mouse Pressed");
 	}

 	public void mouseReleased()
 	{
 		System.out.println("Mouse Released");
 	}


 	public void mouseMoved()
 	{
 		System.out.println("Mouse Moved");
 	}

 	public void mouseDragged()
 	{
 		System.out.println("Mouse Dragged");
 	}
 	
 	public void keyPressed()
 	{
 		System.out.println("key Pressed");
 	}
 	public void keyReleased()
 	{
 		System.out.println("key Released");
 	}
 	
 	public static void main(String[] args) {
 		EventDemo e = new EventDemo();
 		e.performEvent();
 		e.mouseClicked();
 		e.mousePressed();
 		e.mouseReleased();
 		e.mouseMoved();
 		e.mouseDragged();
 		e.keyPressed();
 		e.keyReleased();
 	}
}
