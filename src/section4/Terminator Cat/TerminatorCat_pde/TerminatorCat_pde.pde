PImage catPic;
PImage explosion;
int ellipserX = 330;
int ellipserY = 150;
int ellipselX = 195;
int ellipselY = 145;
int accel = 1;
void setup()  {
  size(600,338);
  catPic = loadImage("cat");
  explosion = loadImage("explosion");
  catPic.resize(600,338);
  explosion.resize(600,338);
  background(catPic);
}

void draw()  {
   if(mousePressed){

println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
 fill(255,0,0);

keyPressed();
if(ellipserY > 338)  {
  background(explosion);
}
}

void keyPressed()  {
if(mousePressed)  {
  noStroke();
ellipse(ellipserX,ellipserY,40,40);
ellipse(ellipselX,ellipselY,40,40); 
   
  ellipserX-=2*accel;
  ellipserY+=2*accel;
  ellipselX-=2*accel;
  ellipselY+=2*accel;
}
}
