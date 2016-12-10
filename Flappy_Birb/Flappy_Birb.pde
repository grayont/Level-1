float bx = 150;
float by = 250;
float bsy = by + 5;
float vby = 1;
float rx = 400;
float rpy = 300;
float rv = -5;
float vx = -5;
float g = .5;
float b2 = 170;
float b3 = 255;
float random = (float) random(100, 400);
boolean end = false;
void setup(){
  size(500, 500);
}

void draw(){
  background(0, b2, b3);
 fill(221, 255, 0);
 ellipse(bx, by, 21, 20);
 ellipse(bx - 17, bsy, 9, 8);
 fill(136, 170, 204);
 rect(rx, 500 - rpy, 50, 500);
 rect(rx, 500 - rpy - 150, 50, -500);
 by += vby;
 bsy += vby;
 vby += g;
 rx += vx;
 
 if(rx == 0){
    rx = 450;
    rpy = random;
    random = (float) random(50, 450);
}
boolean bot = intersects((int) bx, (int) by, (int) rx, (int) (500 - rpy), (int) 50);
if(bot == true){
 vx = 0;
 b2 = 0;
 b3 = 0;
  }
  boolean top = intersect((int) bx, (int) by, (int) rx, (int) (500 - rpy - 150), (int) 50);
  if(top == true){
 vx = 0;
 b2 = 0;
 b3 = 0;
  }
  if(bx == rx){
  print(by + "  ");
  }
}



void mousePressed(){
  vby = -9;
}

boolean intersects(int birdX, int birdY, int paddleX, int paddleY, int paddleLength) {
if (birdY > paddleY - 4 && birdX > paddleX && birdX < paddleX + paddleLength)
return true;
else 
return false;
}

boolean intersect(int birdX, int birdY, int paddleX, int paddleY, int paddleLength) {
  print(paddleY + "  ");
if (birdY < paddleY + 4 && birdX > paddleX && birdX < paddleX + paddleLength)
return true;
else 
return false;

}