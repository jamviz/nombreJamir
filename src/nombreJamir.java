import processing.core.*; 

public class figurasBasicas extends PApplet {
  public void setup() {

// trabajo de: Jamir Balcona

// Letra J-base
line(100,360,100,200);
line(150,500,150,200);
//cabeza
line(50,160,200,160);
line(50,200,50,160);
line(200,200,200,160);
line(50,200,100,200);
line(150,200,200,200);
//pata
line(40,360,100,360);
line(40,360,40,400);
//Letra A
line(300,160,210,400);
line(380,400,300,160);
//Letra M
line(420,400,420,160);
line(420, 160, 485, 220);
line(540, 160, 470, 220);
line(540,400,540,160);
//Letra I
rect(600,180,100,300);
rect(600,90,100,50);
//Letra R
line(760,400,760,160);
line(760, 160, 850, 160);
line(850,230,850,160);
line(915,400,850,230);
line(860,400,820,300);
line(820,400,820,303);

rect(780,180,50,50);

// dibujando un triangulo
//triangle(300,200,300,300,120,380);

// dibujando un circulo
//ellipse(200,200,200,200);

// dibujando un elipse
//ellipse(200,200,200,300);

// dibujando un cuadrado
//rect(100,100,100,100);

// cdibujando un rectangulo
//rect(100,100,100,200);

// tamanho de la ventana

    noLoop();
  }

  public void settings() { 
size(960,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "figurasBasicas" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
