int foodX = (int) random(1,501);;
int foodY = 20;
int foodX2 = (int) random(1,501);;
int foodY2 = 20;
int grav = (int) random(1,16);
int grav2 = (int) random(1,16);
int score = 0;
int text = 1;
int caughtIt = 0;
void setup() {
size(2000,1280);
}



void draw(){
background(141,233,237);
fill(20, 0, 120);
noStroke();
foodY = foodY + grav;
foodY2 = foodY2 + grav2;
ellipse(foodX,foodY, 20, 20);
fill(250, 0, 20);
ellipse(foodX2,foodY2, 20, 20);

if (foodY == 500){
foodY = 20;
foodX = (int) random(1,501);
grav = (int) random(1,16);
}

fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);
drawFish();
checkCatch(foodX,foodY);
text = (int) random(1,4);
if(text == 1){
               text("Lucky",1000,690);
               }
               if(text == 2){
               text("Fake news",1000,690);
               }
               if(text == 3){
               text("LIES",1000,690);
               }
               if(text == 4){
               text("Lucky",1000,690);
               }
caughtIt = 0;
}

void checkCatch(int x, int y){
     if(x > mouseX && x < mouseX+70){
          if(y > mouseY-30 && y < mouseY+30){
               score++;
               text = (int) random(1,4);
               
               foodY = 20; //if the food was eaten, make more food fall from the top
               foodX = (int) random(width-20);
               caughtIt = 1;
          }
     }
     else if (foodY > height && score > 0){
          score--;
          text("Wellthen",1000,690);
     }
}
void drawFish(){
     noStroke();
     fill(255,255,255);
     ellipse(mouseX-17,mouseY-17,20,20); //back side eye
     fill(255,200,88);
     ellipse(mouseX,mouseY,90,50); //body
     triangle(mouseX+30,mouseY,mouseX+70,mouseY+30,mouseX+70,mouseY-30); //tail
     stroke(0);
     triangle(mouseX,mouseY,mouseX+15,mouseY+10,mouseX+15,mouseY-10); //side fin
     noStroke();
     fill(255,200,88);
     ellipse(mouseX,mouseY,15,15); //side fin cover
     noStroke();
     fill(255,255,255);
     ellipse(mouseX-25,mouseY-15,20,20); //front eye
     fill(0,0,0);
     ellipse(mouseX-25,mouseY-15,5,5); //pupil
     fill(141,233,237);
     ellipse(mouseX-45,mouseY,25,25); //mouth
}