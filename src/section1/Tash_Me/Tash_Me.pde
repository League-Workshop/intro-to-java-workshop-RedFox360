PImage mustache;
PImage friend;
void setup() {
friend = loadImage("friend");
mustache = loadImage("mustache");
size(800, 600);
friend.resize(800,600);
}

void draw() {
background(friend);
if(mousePressed)  {
  background(friend);
  image(mustache,mouseX,mouseY);
}
}
