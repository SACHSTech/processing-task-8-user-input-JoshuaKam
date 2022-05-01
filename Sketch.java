import processing.core.PApplet;

public class Sketch extends PApplet {
	
  int x;
  int y;
  float circleX = 200;
  float circleY = 200;
	String message = "";
 

  public void settings() {
	// put your size call here
    size(400, 400);
  }

 
  public void setup() {
    background(173,216,230);
    textSize(20);
  }

   //grass
  public void mouseDragged(){
      stroke(0,255,0);
    float rand = random(height/30*15,height/30*19);
    line(mouseX,375, mouseX, rand);
    
  }

  public void draw() {
fill(0,255,0);
    rect(0,375,width,height);

    
    //moving circle
  if (keyPressed) {
    if (keyCode == UP) {
      circleY--;
    } 
    else if (keyCode == DOWN) {
      circleY++;
    } 
    else if(keyCode == LEFT){
      circleX--;
    }
    else if(keyCode == RIGHT){
     circleX++; 

     ellipse(circleX, circleY, 50, 50);
    }
  } 

    //background colour
    if(keyPressed){

      if(key == '1' ){
        background(230,230,250);
      }
    else if(key == '2'){
     background(255,0,0);
    }
     else if(key == '3'){
       background(255,20,147);
     }
     }




//flower
if (keyPressed){
translate(width/4*3, height/4*3);
   for(int c = 0; c <= 3; c++){
     stroke(255,140,0);
   fill(255,140,0);
  ellipse(0,0,30,110);
   fill(0,100,0);
  ellipse(0, 0, width/40*5, height/40*5);
  rotate(PI/4);
   }
}
}
  
  //sun
public void mouseWheel(){
fill(255,255,0);
ellipse(400,0,100,100);
  }

 

  //clouds
  public void mouseClicked(){
    fill(220,220,220);
    ellipse(mouseX,mouseY,50,50);
  }

  public void keyReleased(){
    translate(width/4*3, height/4*3);
   for(int c = 0; c <= 3; c++){
   fill(255,140,0);
  ellipse(0,0,30,110);
   fill(0,100,0);
  ellipse(0, 0, width/40*5, height/40*5);
  rotate(PI/4);
   }
}
  }



  // define other methods down here.
