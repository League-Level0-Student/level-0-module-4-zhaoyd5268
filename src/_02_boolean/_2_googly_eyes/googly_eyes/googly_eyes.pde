PImage face;
void setup() {
  size(800, 800);
  face = loadImage("SpongeBob_stock_art.png");
  face.resize(800,800);
}
//////////////////////////
//  copy if needed println(mouseX + " " , mouseY + " ");
//////////////////////////
// left eye
//////////////////////////
void draw() {
println(mouseX + " " , mouseY + " ");
  background(#FFFFFF);
background(face);
if (mouseX<245) {
mouseX=245;
}
if (mouseX>325) {
mouseX=325;
}
if (mouseY<105) {
mouseY=105;
}
if (mouseY>185) {
mouseY=185;
}
fill(#FCFCFC);
ellipse(285,144,120,120);
fill(000000);
ellipse(mouseX, mouseY, 25, 25);

/////////////////////////////////////////////
// right eye
/////////////////////////////////////////////



fill(#FCFCFC);
ellipse(400,144,120,120);
fill(000000);
ellipse(mouseX+100, mouseY+0, 25, 25);
}
