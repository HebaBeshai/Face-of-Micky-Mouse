/***********************************************************************************************************************
 * @file  CreativeExercise.java
 * @brief This prints the face of mickey mouse
 * @author Heba Beshai
 * @date   Appril 6, 2016
 ***********************************************************************************************************************/
public class CreativeExercise {
    public static void main(String[] args) {
        StdDraw.setPenColor(StdDraw.BOOK_RED);
        StdDraw.setPenRadius(.02);


          drawEyes();
          drawFace();
          drawMouth();

        StdDraw.circle(.2, .8, .2);
        StdDraw.circle(.8, .8, .2);
        StdDraw.circle(.4, .5, .05);



        StdDraw.circle(.5, .4, .03);

        StdDraw.setPenColor(StdDraw.BOOK_BLUE);
        StdDraw.setPenRadius(.02);


    }
    public static void drawEyes() {
        StdDraw.circle(.6, .5, .05);//eye
        StdDraw.circle(.6, .5, .05);//eye
    }
    public static void drawFace(){
        StdDraw.circle(.5, .4, .3);//face

    }
    public static void drawMouth(){
        StdDraw.arc(.5, .3, .1, 250, 10);//mouth?

    }
}
