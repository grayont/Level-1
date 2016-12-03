float bx = 150;
float by = 250;
float bsy = by + 5;
float vby = 1;
float rx = 400;
float rsy = 300;
float rv = -5;
float g = .5;
float random = (float) random(100, 500);
void setup(){
  size(500, 500);
  
}

void draw(){
 background(0, 170, 255); 
 fill(221, 255, 0);
 ellipse(bx, by, 21, 20);
 ellipse(bx - 17, bsy, 9, 8);
 fill(136, 170, 204);
 rect(rx, 350, 50, rsy);
 by += vby;
 bsy += vby;
 vby += g;
 rx += -5;
 
 if(rx == 0){
    rx = 450;
    rsy = random;
    random = (float) random(100, 500);
}
}


void mousePressed(){
  vby = -9;
}
