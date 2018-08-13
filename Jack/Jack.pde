PImage friend;
PImage mustache;
void setup(){
friend = loadImage("friend.jpeg");
size(800,600);
friend.resize(800,600);
}
void draw(){
  background(friend);
}