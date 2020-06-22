

void setup() {
  background(#FFFFFF);
  size(600,600);
}

void draw() {
  if (mousePressed)  {
    fill(#3993FF);
  } else {
    fill(#23FA4C);
  }
  ellipse(300,300,400,400);
}
