int frogx;
int frogy;
int hop = 25;

Car a = new Car(275, 0, 100, 20, 50);

class Car{
 int speed, x, y, sizex, sizey;
 void display() 
  {
    fill(0,255,0);
    rect(x , y,  sizex, sizey);
  }

 
 Car(int x, int y, int speed, int sizex, int sizey){
  this.x = x;
  this.y = y;
  this.speed = speed;
  this.sizex = sizex;
  this.sizey = sizey;
 }

}



void setup(){
  size(400, 400);
  frogx = width/2;
  frogy = height/2;
  background(0, 0, 40);
  fill(0, 255, 0);
}

void draw(){
      ellipse(frogx, frogy, 20, 20);
      checkWin();
      a.display();
  }
  

void keyPressed()
{
  if(key == CODED){
      if(keyCode == UP)
      {
      //Frog Y position goes up
      frogy = frogy - hop;
        background(0, 0, 40);
      }
      else if(keyCode == DOWN)
      {
        //Frog Y position goes down 
        frogy = frogy + hop;
        background(0, 0, 40);
      }
      else if(keyCode == RIGHT)
      {
       //Frog X position goes right
       frogx = frogx + hop;
       background(0, 0, 40);
      }
      else if(keyCode == LEFT)
      {
        //Frog X position goes left
        frogx = frogx - hop;
        background(0, 0, 40);
      }
   }
}

void checkWin(){
 if(frogx >= 400){
  text("You win!", 200, 200);
  textSize(24);
 }
 else if(frogx <= 0){
   text("You win!", 200, 200);
  textSize(24);
 }
 else if(frogy >= 400){
   text("You win!", 200, 200);
  textSize(24);
 }
 else if(frogy <= 0){
  text("You win!", 200, 200);
  textSize(24); 
 }
}