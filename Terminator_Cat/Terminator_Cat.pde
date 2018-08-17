PImage catPic;
int x= 142;
int y= 188;
int x2= 334;
int y2= 188;
int acceleration= 5;
void setup(){
size(500,500);
  catPic = loadImage("cat.jpg");
  catPic.resize(500,500);
  background(catPic);
}
void draw(){
   if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
noStroke();
ellipse(x, y, 100, 100);
ellipse(x2, y2, 100, 100);
fill(30,100,90);
}
void keyPressed() {
                 x++;
y++;

                 x2++;
y2++;

 y+=2*acceleration;
x+=2*acceleration;

 y2+=2*acceleration;
x2+=2*acceleration;
if(x>=500 && x2>= 500){
  background(catPic);
   x= 142;
y= 188;
x2= 334;
 y2= 188;
 acceleration = 1;
 
}
}