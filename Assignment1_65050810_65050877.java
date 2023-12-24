import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.Queue;

/*
 * Inspirational Image: https://www.istockphoto.com/th/%E0%B9%80%E0%B8%A7%E0%B8%84%E0%B9%80%E0%B8%95%E0%B8
 *                      %AD%E0%B8%A3%E0%B9%8C/%E0%B8%A7%E0%B8%B1%E0%B8%99%E0%B8%95%E0%B8%A3%E0%B8%B8%E0%B
 *                      8%A9%E0%B8%88%E0%B8%B5%E0%B8%99-%E0%B8%95%E0%B8%A3%E0%B8%B8%E0%B8%A9%E0%B8%88%E0%
 *                      B8%B5%E0%B8%99-2024-%E0%B8%9B%E0%B8%B5%E0%B8%A1%E0%B8%B1%E0%B8%87%E0%B8%81%E0%B8%A
 *                      3-%E0%B8%A3%E0%B8%B2%E0%B8%A8%E0%B8%B5-gm1437614094-478358881?phrase=chinese%2Bnew
 *                      %2Byear%2Bdragon&searchscope=image%2Cfilm
 * Redesign images by ourselves : https://drive.google.com/file/d/1zEXKbiDHg4il9ZVePlafwMRBiX_9154Y/view?usp=sharing
 */

public class Assignment1_65050810_65050877 extends JPanel {
    public static void main(String[] args) {
        Assignment1_65050810_65050877 m = new Assignment1_65050810_65050877();
        JFrame f = new JFrame();

        f.add(m);
        f.setTitle("2024 New Year");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void paintComponent(Graphics g) {

        BufferedImage buffer = new BufferedImage(601, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = buffer.createGraphics();

        //Position preferences
        int x = -25;
        int y = -40;

        g2.setColor(Color.white);//set Background
        g2.fillRect(0, 0,600, 600);
        g2.setColor(Color.BLACK);
      
/*
*
Dragon
*
*/


// Dragon's Body Outline
        bezierCurve(g2,470+x, 210+y,470+x, 220+y,460+x, 240+y,450+x, 240+y,2); 
        bresenhamLine(g2, 450+x, 240+y, 340+x,240+y,2);
        bezierCurve(g2,340+x,240+y,260+x,250+y,260+x,360+y,330+x,370+y,2); 
        bresenhamLine(g2, 360+x, 370+y, 470+x,370+y,2);
        bezierCurve(g2,470+x,370+y,520+x,368+y,520+x,470+y,415+x,420+y,2); 
        bezierCurve(g2,415+x,420+y,320+x,400+y,300+x,500+y,230+x,370+y,2); 
        bezierCurve(g2,230+x,370+y,250+x,470+y,300+x,470+y,350+x,450+y,2); 
        bezierCurve(g2,350+x,450+y,360+x,445+y,380+x,445+y,390+x,450+y,2); 
        bezierCurve(g2,420+x,460+y,550+x,510+y,590+x,340+y,470+x,330+y,2);
        bezierCurve(g2,420+x,460+y,460+x,460+y,480+x,470+y,525+x,440+y,2);
        bresenhamLine(g2, 470+x,330+y, 340+x,330+y,2);
        bezierCurve(g2,340+x,330+y,310+x,330+y,310+x,280+y,340+x,280+y,2);  
        bresenhamLine(g2, 340+x,280+y, 450+x, 280+y,2);
        bezierCurve(g2,450+x, 280+y,510+x, 280+y,510+x, 210+y,510+x, 210+y,2); 
        bresenhamLine(g2,510+x, 210+y, 470+x, 210+y,2);


// Dragon's Right Leg Outline
        bresenhamLine(g2, 390+x,450+y, 359+x,481+y,2);
        bezierCurve(g2,420+x,460+y,415+x,470+y,405+x, 475+y,400+x, 480+y,2);
        bresenhamLine(g2, 360+x,480+y,400+x, 500+y,2); 
        bresenhamLine(g2, 400+x, 480+y,411+x, 490+y,2); 

        bresenhamLine(g2, 410+x, 490+y,435+x, 480+y,2); //finger1
        bresenhamLine(g2, 433+x, 480+y,435+x, 494+y,2); 
        bresenhamLine(g2, 435+x, 492+y,420+x, 497+y,2);
        drawTriangle(g2, new int[] {438+x,440+x,451+x}, 
                         new int[] {480+y,492+y,484+y},2);


        bresenhamLine(g2, 420+x, 497+y,440+x, 505+y,2); //finger2
        bresenhamLine(g2, 438+x, 505+y,428+x, 513+y,2);
        bresenhamLine(g2, 430+x, 513+y,415+x, 505+y,2); 
        drawTriangle(g2, new int[] {442+x,432+x,444+x}, 
                         new int[] {510+y,518+y,522+y},2);

        bresenhamLine(g2, 415+x, 505+y,420+x, 522+y,2); //finger3
        bresenhamLine(g2, 420+x, 520+y,410+x, 522+y,2);
        bresenhamLine(g2, 410+x, 522+y,403+x, 503+y,2); 
        drawTriangle(g2, new int[] {420+x,410+x,416+x}, 
                         new int[] {524+y,526+y,536+y},2);

        bresenhamLine(g2, 405+x, 505+y,400+x, 520+y,2); //finger4
        bresenhamLine(g2, 400+x, 520+y,390+x, 515+y,2);
        bresenhamLine(g2, 390+x, 515+y,399+x, 498+y,2); 
        drawTriangle(g2, new int[] {397+x,387+x,389+x}, 
                         new int[] {523+y,518+y,531+y},2);


        bresenhamLine(g2, 370+x,470+y, 350+x,460+y,2); // something like fur
        bezierCurve(g2,350+x,460+y,345+x,465+y,350+x,475+y,352+x,475+y,2); 
        bresenhamLine(g2, 352+x,475+y, 325+x,485+y,2);
        bezierCurve(g2,325+x,485+y,325+x,490+y,340+x,495+y,352+x,495+y,2); 
        bresenhamLine(g2, 352+x,495+y, 360+x,510+y,2);
        bresenhamLine(g2, 360+x,510+y, 375+x,485+y,2);

// Dragon's Left Leg Outline
        bresenhamLine(g2, 455+x,468+y, 485+x,490+y,2);
        bresenhamLine(g2, 480+x,468+y, 500+x,485+y,2);

        bresenhamLine(g2, 485+x,490+y, 475+x,501+y,2); //finger1
        bresenhamLine(g2, 475+x,500+y, 485+x,505+y,2);
        bresenhamLine(g2, 485+x,505+y, 490+x,495+y,2);
        drawTriangle(g2, new int[] {475+x,485+x,475+x}, 
                         new int[] {505+y,510+y,520+y},2);

        bresenhamLine(g2, 490+x,495+y, 491+x,515+y,2); //finger2
        bresenhamLine(g2, 491+x,515+y, 502+x,515+y,2);
        bresenhamLine(g2, 502+x,515+y, 497+x,495+y,2);
        drawTriangle(g2, new int[] {491+x,502+x,497+x}, 
                         new int[] {520+y,520+y,530+y},2);
        
        bresenhamLine(g2, 497+x,495+y, 510+x,510+y,2); //finger3
        bresenhamLine(g2, 510+x,510+y, 517+x,500+y,2);
        bresenhamLine(g2, 517+x,500+y, 501+x,490+y,2);
        drawTriangle(g2, new int[] {513+x,520+x,522+x}, 
                         new int[] {513+y,503+y,517+y},2);

        bresenhamLine(g2, 501+x,490+y, 515+x,490+y,2); //finger4
        bresenhamLine(g2, 515+x,490+y, 515+x,480+y,2);
        bresenhamLine(g2, 515+x,480+y, 498+x,485+y,2);
        drawTriangle(g2, new int[] {518+x,518+x,527+x}, 
                         new int[] {490+y,480+y,488+y},2);

//Dragon's Tail Outline

        bezierCurve(g2,240+x,390+y,250+x,390+y,260+x,370+y,255+x,360+y,2); 
        bresenhamLine(g2, 255+x,360+y, 240+x,370+y,2);
        bezierCurve(g2,240+x,370+y,245+x,370+y,250+x,350+y,250+x,340+y,2); 
        bresenhamLine(g2, 250+x,340+y, 235+x,355+y,2);
        bresenhamLine(g2, 235+x,355+y, 240+x,330+y,2);
        bresenhamLine(g2, 240+x,330+y, 215+x,300+y,2);
        bresenhamLine(g2, 215+x,300+y, 205+x,340+y,2);
        bresenhamLine(g2, 205+x,340+y, 215+x,360+y,2);
        bresenhamLine(g2, 215+x,360+y, 200+x,350+y,2);
        bezierCurve(g2,200+x,350+y,200+x,360+y,210+x,375+y,215+x,375+y,2); 
        bresenhamLine(g2, 215+x,375+y, 200+x,370+y,2);
        bezierCurve(g2,200+x,370+y,200+x,380+y,210+x,395+y,235+x,395+y,2); 
        drawTriangle(g2, new int[] {240+x,250+x,257+x}, 
                         new int[] {390+y,399+y,390+y},2);
        drawTriangle(g2, new int[] {250+x,258+x,271+x}, 
                         new int[] {399+y,412+y,397+y},2);
        drawTriangle(g2, new int[] {235+x,237+x,222+x}, 
                         new int[] {393+y,403+y,402+y},2);
        drawTriangle(g2, new int[] {237+x,243+x,222+x}, 
                         new int[] {403+y,415+y,418+y},2);


//Dragon's Left Arm  Outline
        bresenhamLine(g2, 325+x, 357+y, 335+x, 380+y,2);
        bresenhamLine(g2, 335+x, 380+y, 310+x, 390+y,2);
        bresenhamLine(g2, 360+x, 357+y, 358+x, 390+y,2);
        bresenhamLine(g2, 358+x, 390+y, 315+x, 400+y,2);
                    
        bresenhamLine(g2, 310+x, 390+y, 290+x, 380+y,2); //finger1
        bresenhamLine(g2, 290+x, 380+y, 285+x, 390+y,2);
        bresenhamLine(g2, 285+x, 390+y, 300+x, 395+y,2);
        drawTriangle(g2, new int[] {287+x,282+x,270+x}, 
                         new int[] {378+y,388+y,380+y},2);

        bresenhamLine(g2, 300+x, 395+y, 280+x, 398+y,2); //finger2
        bresenhamLine(g2, 280+x, 398+y, 285+x, 408+y,2);
        bresenhamLine(g2, 285+x, 408+y, 303+x, 400+y,2);
        drawTriangle(g2, new int[] {277+x,282+x,270+x}, 
                         new int[] {400+y,410+y,412+y},2);

        bresenhamLine(g2, 303+x, 400+y, 295+x, 417+y,2); //finger3
        bresenhamLine(g2, 295+x, 417+y, 307+x, 420+y,2);
        bresenhamLine(g2, 307+x, 420+y, 310+x, 405+y,2);
        drawTriangle(g2, new int[] {294+x,306+x,300+x}, 
                         new int[] {421+y,424+y,432+y},2);

        bresenhamLine(g2, 310+x, 405+y, 320+x, 418+y,2); //finger4
        bresenhamLine(g2, 319+x, 418+y, 329+x, 410+y,2);
        bresenhamLine(g2, 328+x, 410+y, 315+x, 400+y,2);
        drawTriangle(g2, new int[] {321+x,330+x,329+x}, 
                         new int[] {421+y,413+y,425+y},2);
                        
//Dragon's Right Arm  Outline 

        bresenhamLine(g2, 310+x, 250+y, 280+x, 230+y,2);
        bezierCurve(g2,340+x, 240+y, 325+x, 220+y,320+x, 220+y,305+x, 215+y,2);
        bresenhamLine(g2, 280+x, 230+y, 280+x, 190+y,2);
        bresenhamLine(g2, 305+x, 215+y, 298+x, 176+y,2);

        bresenhamLine(g2, 280+x, 190+y, 267+x, 196+y,2); //finger1
        bresenhamLine(g2, 267+x, 196+y, 264+x, 183+y,2);
        bresenhamLine(g2, 264+x, 183+y, 276+x, 180+y,2);
        drawTriangle(g2, new int[] {263+x,260+x,248+x}, 
                         new int[] {195+y,185+y,190+y},2);

        bresenhamLine(g2, 276+x, 180+y, 257+x, 170+y,2); //finger2
        bresenhamLine(g2, 257+x, 170+y, 266+x, 157+y,2);
        bresenhamLine(g2, 266+x, 157+y, 270+x, 167+y,2);
        bresenhamLine(g2, 270+x, 167+y, 283+x, 174+y,2);
        drawTriangle(g2, new int[] {253+x,262+x,244+x}, 
                         new int[] {169+y,156+y,160+y},2);

        bresenhamLine(g2, 283+x, 174+y, 280+x, 153+y,2); //finger3
        bresenhamLine(g2, 280+x, 153+y, 292+x, 151+y,2);
        bresenhamLine(g2, 292+x, 151+y, 291+x, 172+y,2);
        drawTriangle(g2, new int[] {279+x,291+x,280+x}, 
                         new int[] {149+y,147+y,137+y},2);

        bresenhamLine(g2, 291+x, 172+y, 303+x, 152+y,2); //finger4
        bresenhamLine(g2, 303+x, 152+y, 314+x, 159+y,2);
        bresenhamLine(g2, 314+x, 159+y, 297+x, 178+y,2);
        drawTriangle(g2, new int[] {305+x,316+x,311+x}, 
                         new int[] {149+y,156+y,137+y},2);
        
        bresenhamLine(g2, 290+x, 235+y, 284+x, 255+y,2); // something like fur
        bezierCurve(g2,284+x, 255+y,280+x, 255+y,272+x, 245+y,272+x, 240+y,2); 
        bresenhamLine(g2, 272+x, 240+y, 254+x, 256+y,2);
        bezierCurve(g2,254+x, 256+y,254+x, 250+y,255+x, 237+y,265+x, 232+y,2); 
        bresenhamLine(g2, 265+x, 232+y, 260+x, 218+y,2);
        bresenhamLine(g2, 260+x, 218+y, 281+x, 225+y,2);

//Detail of Dragon's Stomach
        bresenhamLine(g2, 360+x, 357+y, 460+x,357+y,2);
        bezierCurve(g2,460+x,357+y,470+x,357+y,490+x,370+y,495+x,380+y,2); 
        bezierCurve(g2,325+x,357+y,280+x,343+y,280+x,265+y,330+x,255+y,2); 
        bresenhamLine(g2, 330+x,255+y, 430+x,255+y,2);
        bezierCurve(g2,430+x,255+y,460+x,260+y,485+x,245+y,490+x, 210+y,2);
        
        for (int i = 0; i < 120; i+=30) {
            bresenhamLine(g2, 365+x+i, 357+y, 378+x+i,372+y,2);
        }

        bresenhamLine(g2, 320+x, 355+y, 285+x,340+y,2);
        bresenhamLine(g2, 293+x, 320+y, 276+x,312+y,2);
        bresenhamLine(g2, 293+x, 295+y, 279+x,287+y,2);
        bresenhamLine(g2, 310+x, 265+y, 295+x,258+y,2);
        bresenhamLine(g2, 328+x, 255+y, 315+x,245+y,2);

        for (int i = 0; i < 120; i+=30) {
            bresenhamLine(g2, 340+x+i, 240+y, 353+x+i,257+y,2);
        }

        bresenhamLine(g2, 450+x, 240+y, 465+x,250+y,2);
        bresenhamLine(g2, 465+x, 225+y, 483+x,232+y,2);




//Detail of Dragon's Back
        bezierCurve(g2,370+x, 417+y,380+x, 414+y,400+x,405+y,410+x,410+y,2); 
        bresenhamLine(g2, 410+x,410+y, 409+x,400+y,2);
        bresenhamLine(g2, 409+x,400+y, 435+x,415+y,2);
        bresenhamLine(g2, 435+x,415+y, 434+x,400+y,2);
        bresenhamLine(g2, 434+x,400+y, 465+x,418+y,2);
        bresenhamLine(g2, 465+x,418+y, 475+x,435+y,2);

        for (int i = 0; i < 150; i+=30) {
            bezierCurve(g2,340+x+i, 328+y,345+x+i, 320+y,350+x+i,315+y,370+x+i,310+y,2); 
            bezierCurve(g2,370+x+i,310+y,365+x+i,310+y,360+x+i,328+y,360+x+i,329+y,2); 
        }

        bezierCurve(g2,490+x, 332+y,495+x, 328+y,500+x,318+y,525+x,325+y,2); 
        bezierCurve(g2,525+x,325+y,515+x,328+y,512+x,335+y,510+x,341+y,2);
        bezierCurve(g2,515+x,345+y,530+x,340+y,548+x,350+y,555+x,355+y,2);
        bezierCurve(g2,533+x,365+y,537+x,355+y,554+x,357+y,555+x,355+y,2);
        bezierCurve(g2,330+x, 328+y,340+x, 330+y,333+x, 300+y,325+x, 300+y,2);
        bresenhamLine(g2, 325+x, 300+y, 340+x, 310+y,2);
        bezierCurve(g2,340+x, 310+y,345+x, 300+y,338+x, 290+y,338+x, 290+y,2);
        bezierCurve(g2,338+x, 290+y,338+x, 290+y,350+x, 295+y,350+x, 300+y,2);
        bezierCurve(g2,350+x, 300+y,355+x, 300+y,357+x, 285+y,355+x, 280+y,2);

        for (int i = 0; i < 90; i+=30) {
            bezierCurve(g2,370+x+i, 280+y,370+x+i, 285+y,370+x+i, 295+y,365+x+i, 300+y,2); 
            bezierCurve(g2,365+x+i, 300+y,370+x+i, 300+y,390+x+i, 290+y,390+x+i, 280+y,2); 
        }

        bresenhamLine(g2, 460+x, 280+y, 460+x, 300+y,2);
        bezierCurve(g2,460+x, 300+y,470+x, 300+y,480+x, 290+y, 485+x, 270+y,2); 
        bezierCurve(g2,485+x, 270+y,485+x, 280+y,505+x, 290+y, 515+x, 290+y,2); 
        bresenhamLine(g2,  515+x, 290+y, 510+x, 260+y,2);
        bezierCurve(g2,510+x, 260+y,510+x, 265+y, 530+x, 275+y, 540+x, 270+y,2); 
        bresenhamLine(g2,  540+x, 270+y, 510+x, 210+y,2);



// Dragon's Head 
        bezierCurve(g2,400+x, 160+y,455+x, 270+y, 470+x, 130+y, 540+x, 150+y,2); 
        bezierCurve(g2,390+x, 160+y,460+x, 280+y, 472+x, 135+y, 545+x, 152+y,2); 
        bresenhamLine(g2,410+x, 210+y, 470+x, 210+y,2);
        bresenhamLine(g2,410+x, 210+y, 410+x, 225+y,2);
        bezierCurve(g2,395+x, 210+y,398+x, 215+y,400+x, 223+y,410+x, 225+y,2); 
        bresenhamLine(g2,395+x, 210+y, 395+x, 225+y,2);
        bezierCurve(g2,380+x, 210+y,380+x, 215+y,385+x, 223+y,395+x, 225+y,2); 
        bresenhamLine(g2,340+x, 210+y, 380+x, 210+y,2);
        bezierCurve(g2,340+x, 210+y,340+x, 200+y,350+x, 190+y,360+x, 190+y,2); 
        bresenhamLine(g2,360+x, 190+y,410+x, 190+y,2);
        bezierCurve(g2,420+x, 190+y,430+x, 190+y,430+x, 160+y,415+x, 160+y,2); 
        bresenhamLine(g2,400+x, 160+y,415+x, 160+y,2);
        bresenhamLine(g2,350+x, 160+y,390+x, 160+y,2);
        bezierCurve(g2,340+x, 150+y,340+x, 155+y,345+x, 160+y,350+x, 160+y,2); 
        bezierCurve(g2,340+x, 150+y,345+x, 120+y,355+x, 120+y,380+x, 135+y,2); 
        bezierCurve(g2,380+x, 135+y,380+x, 125+y,390+x, 120+y,400+x, 125+y,2); 
        bezierCurve(g2,400+x, 125+y,410+x, 105+y,410+x, 105+y,455+x, 100+y,2); 
        bresenhamLine(g2,455+x, 100+y,445+x, 110+y,2);
        bresenhamLine(g2,445+x, 110+y,480+x, 105+y,2);
        bresenhamLine(g2,480+x, 105+y,470+x, 115+y,2);
        bresenhamLine(g2,470+x, 115+y,520+x, 115+y,2);
        bezierCurve(g2,505+x, 135+y,515+x, 130+y,520+x, 125+y,520+x, 115+y,2); 
        bresenhamLine(g2,505+x, 135+y,565+x, 135+y,2);
        bezierCurve(g2,530+x, 175+y,540+x, 175+y,565+x, 155+y,566+x, 135+y,2); 
        bezierCurve(g2,530+x, 175+y,540+x, 175+y,560+x, 200+y,560+x, 210+y,2); 
        bresenhamLine(g2,510+x, 210+y,560+x, 210+y,2);
        bresenhamLine(g2,345+x, 197+y,420+x, 197+y,2);
        bezierCurve(g2,425+x, 197+y,440+x, 190+y,440+x, 153+y,415+x, 153+y,2); 
        bresenhamLine(g2,340+x, 153+y,420+x, 153+y,2);




        bezierCurve(g2,480+x, 115+y,481+x, 110+y,490+x, 102+y,500+x, 101+y,2);  //horn 1
        bresenhamLine(g2,500+x, 101+y,550+x, 101+y,2);
        bezierCurve(g2,550+x, 101+y,560+x, 100+y,565+x, 95+y, 570+x, 85+y,2); 
        bezierCurve(g2,490+x, 115+y,490+x, 110+y,498+x, 108+y,500+x, 108+y,2); 
        bresenhamLine(g2,500+x, 108+y,550+x, 108+y,2);
        bezierCurve(g2,550+x, 108+y,565+x, 108+y,580+x, 95+y, 570+x, 85+y,2); 

        bezierCurve(g2,457+x, 107+y,461+x, 100+y,470+x, 92+y,480+x, 90+y,2);  //horn 2
        bresenhamLine(g2,480+x, 90+y,530+x, 90+y,2);
        bezierCurve(g2,530+x, 90+y,540+x, 90+y,545+x, 85+y, 550+x, 75+y,2); 
        bezierCurve(g2,467+x, 105+y,470+x, 100+y,478+x, 98+y,480+x, 97+y,2); 
        bresenhamLine(g2,480+x, 97+y,530+x, 97+y,2);
        bezierCurve(g2,530+x, 97+y,545+x, 98+y,560+x, 85+y, 550+x, 75+y,2); 
   
//Detail Of Dragon
        

        bresenhamLine(g2,410+x, 140+y,430+x, 130+y,2); //eye
        bresenhamLine(g2,430+x, 130+y,450+x, 140+y,2); 
        bezierCurve(g2,400+x, 135+y,425+x, 155+y,435+x, 155+y, 450+x, 140+y,2);
        bezierCurve(g2,450+x, 140+y,450+x, 143+y,460+x, 140+y, 465+x, 136+y,2); 
        bezierCurve(g2,406+x, 137+y,435+x, 122+y,425+x, 122+y, 457+x, 138+y,2);
        bezierCurve(g2,400+x, 135+y,435+x, 115+y,425+x, 115+y, 465+x, 136+y,2);
        plot(g2, 427+x, 138+y, 7);
        
        bresenhamLine(g2,435+x, 165+y,448+x, 155+y,2);  // marking
        bresenhamLine(g2,448+x, 155+y,444+x, 170+y,2); 
        bresenhamLine(g2,444+x, 170+y,455+x, 175+y,2); 
        bresenhamLine(g2,455+x, 175+y,444+x, 185+y,2);
        bresenhamLine(g2,444+x, 185+y,445+x, 195+y,2); 
        bresenhamLine(g2,435+x, 185+y,445+x, 195+y,2); 
        int[] p_x = {490,498,485,493,496,482,490,485,477,315,323,311,319,327,315,
                     323,492,500,488,504,492,500,519,523,515,507,519,515,507,531,
                     511,519,527,515,507,531,490,498,486,494,502,490,498,389,397,
                     385,393,401,389,397};
        int[] p_y = {230,230,237,237,243,250,250,259,265,332,332,339,339,339,346,
                     346,345,345,352,352,359,359,359,366,366,366,373,380,380,380,
                     387,387,387,394,394,394,433,433,440,440,440,447,447,458,458,
                     465,465,465,472,472};
        g2.setColor(new Color(255, 175, 14));           
        for (int i = 0; i < p_x.length; i++) {
            plot(g2, p_x[i]+x, p_y[i]+y, 4);
        }
        g2.setColor(Color.black);
        for (int i = 0; i < 40; i+=10) {
            bezierCurve(g2,350+x+i, 160+y,350+x+i, 162+y,352+x+i, 170+y, 360+x+i, 170+y,2);
            bresenhamLine(g2,360+x+i, 160+y,360+x+i, 170+y,2); 
        }
        bresenhamLine(g2,409+x, 165+y,405+x, 170+y,2); 
        bezierCurve(g2,408+x, 160+y,405+x, 162+y,410+x, 170+y, 415+x, 170+y,2);
        bresenhamLine(g2,415+x, 160+y,415+x, 170+y,2); 
        for (int i = 0; i < 40; i+=10) {
            bezierCurve(g2,360+x+i, 190+y,360+x+i, 185+y,365+x+i, 180+y, 370+x+i, 180+y,2);
            bresenhamLine(g2,370+x+i, 190+y,370+x+i, 180+y,2); 
        }
        bresenhamLine(g2,420+x, 190+y,422+x, 178+y,2); 
        bresenhamLine(g2,411+x, 182+y,423+x, 178+y,2); 

        g2.setColor(new Color(187, 37, 48));
        bresenhamLine(g2,460+x, 155+y,485+x, 155+y,2); //cheack
        bresenhamLine(g2,460+x, 155+y,470+x, 140+y,2); 
        bresenhamLine(g2,470+x, 140+y,470+x, 148+y,2); 
        bezierCurve(g2,470+x, 148+y,480+x, 148+y,485+x, 155+y, 485+x, 155+y,2);
        g2.setColor(Color.BLACK);
        


/*
*
Text New year
*
 */


        //backdrop 2024
        x = 10;
        y = 10;
        bresenhamLine(g2,50+x, 105+y,50+x, 140+y,20); //2
        bresenhamLine(g2,130+x, 50+y,130+x, 100+y,20);
        bresenhamLine(g2,50+x, 50+y,130+x, 50+y,20); 
        bresenhamLine(g2,50+x, 140+y,130+x, 140+y,20); 
        bresenhamLine(g2,50+x, 100+y,130+x, 100+y,20); 

        
        bresenhamLine(g2,50+x, 180+y,50+x, 270+y,20);//0
        bresenhamLine(g2,130+x, 180+y,130+x, 270+y,20);
        bresenhamLine(g2,50+x, 180+y,130+x, 180+y,20); 
        bresenhamLine(g2,50+x, 270+y,130+x, 270+y,20); 

        bresenhamLine(g2,50+x, 360+y,50+x, 400+y,20); //2
        bresenhamLine(g2,130+x, 310+y,130+x, 360+y,20);
        bresenhamLine(g2,50+x, 310+y,130+x, 310+y,20); 
        bresenhamLine(g2,50+x, 400+y,130+x, 400+y,20); 
        bresenhamLine(g2,50+x, 360+y,130+x, 360+y,20); 

        bresenhamLine(g2,50+x, 440+y,50+x, 490+y,20);//2
        bresenhamLine(g2,130+x, 440+y,130+x, 530+y,20);
        bresenhamLine(g2,50+x, 490+y,130+x, 490+y,20); 

        //Text 2024
        g2.setColor(new Color(255, 175, 14));
        x = 0;
        y = 0;
        bresenhamLine(g2,50+x, 105+y,50+x, 140+y,20); //2
        bresenhamLine(g2,130+x, 50+y,130+x, 100+y,20);
        bresenhamLine(g2,50+x, 50+y,130+x, 50+y,20); 
        bresenhamLine(g2,50+x, 140+y,130+x, 140+y,20); 
        bresenhamLine(g2,50+x, 100+y,130+x, 100+y,20); 

        
        bresenhamLine(g2,50+x, 180+y,50+x, 270+y,20);//0
        bresenhamLine(g2,130+x, 180+y,130+x, 270+y,20);
        bresenhamLine(g2,50+x, 180+y,130+x, 180+y,20); 
        bresenhamLine(g2,50+x, 270+y,130+x, 270+y,20); 

        bresenhamLine(g2,50+x, 360+y,50+x, 400+y,20); //2
        bresenhamLine(g2,130+x, 310+y,130+x, 360+y,20);
        bresenhamLine(g2,50+x, 310+y,130+x, 310+y,20); 
        bresenhamLine(g2,50+x, 400+y,130+x, 400+y,20); 
        bresenhamLine(g2,50+x, 360+y,130+x, 360+y,20); 

        bresenhamLine(g2,50+x, 440+y,50+x, 490+y,20);//2
        bresenhamLine(g2,130+x, 440+y,130+x, 530+y,20);
        bresenhamLine(g2,50+x, 490+y,130+x, 490+y,20); 

        //"Happy New year" Chinese Text

        x = -10;
        
        bresenhamLine(g2,250+x, 537+y,250+x, 570+y,3); //first letter
        bresenhamLine(g2,235+x, 537+y,265+x, 537+y,3); 
        bresenhamLine(g2,235+x, 550+y,265+x, 550+y,3); 
        bresenhamLine(g2,235+x, 520+y,265+x, 520+y,3); 
        bresenhamLine(g2,235+x, 562+y,250+x, 550+y,3); 
        bresenhamLine(g2,250+x, 552+y,263+x, 560+y,3);
        bresenhamLine(g2,252+x, 537+y,260+x, 522+y,3);  
        bresenhamLine(g2,248+x, 537+y,240+x, 522+y,3);  
        bresenhamLine(g2,250+x, 520+y,253+x, 510+y,3);  

        bezierCurve(g2,260+x, 570+y,270+x, 570+y,270+x, 530+y, 270+x, 520+y,3);
        bresenhamLine(g2,270+x, 537+y,295+x, 537+y,3); 
        bresenhamLine(g2,285+x, 537+y,285+x, 570+y,3); 
        bezierCurve(g2,270+x, 520+y,280+x, 520+y,285+x, 515+y,290+x, 513+y,3);


        bresenhamLine(g2,340+x, 520+y,340+x, 570+y,3); //second letter
        bresenhamLine(g2,325+x, 537+y,355+x, 537+y,3); 
        bresenhamLine(g2,313+x, 555+y,365+x, 555+y,3);
        bresenhamLine(g2,325+x, 537+y,325+x, 555+y,3); 
        bezierCurve(g2,315+x, 535+y,320+x, 535+y,335+x, 510+y,330+x, 510+y,3);
        bresenhamLine(g2,327+x, 520+y,355+x, 520+y,3); 



        bresenhamLine(g2,395+x, 512+y,395+x, 570+y,3); //third letter
        bresenhamLine(g2,385+x, 540+y,390+x, 527+y,3); 
        bresenhamLine(g2,400+x, 525+y,404+x, 535+y,3); 

        bresenhamLine(g2,402+x, 540+y,440+x, 540+y,3); 
        bezierCurve(g2,400+x, 570+y,423+x, 570+y,418+x, 530+y,418+x, 510+y,3);
        bresenhamLine(g2,405+x, 520+y,430+x, 520+y,3); 
        bresenhamLine(g2,430+x, 520+y,430+x, 540+y,3); 
        bezierCurve(g2,418+x, 540+y,418+x, 550+y,425+x, 570+y,435+x, 570+y,3);

        bresenhamLine(g2,460+x, 540+y,500+x, 540+y,3); //forth letter
        bresenhamLine(g2,479+x, 525+y,479+x, 570+y,3); 
        bresenhamLine(g2,472+x, 566+y,480+x, 569+y,3);
        bresenhamLine(g2,460+x, 565+y,472+x, 545+y,3);
        bresenhamLine(g2,483+x, 545+y,500+x, 562+y,3); 
        bresenhamLine(g2,460+x, 540+y,465+x, 515+y,3); 
        bresenhamLine(g2,463+x, 522+y,498+x, 515+y,3); 
      

/*
*
Frame
*
*/
        g2.setColor(new Color(255, 175, 14));
        bresenhamLine(g2,8, 10,30, 10,10); // top left
        bresenhamLine(g2,8, 30,45, 30,10);
        bresenhamLine(g2,8, 10,8, 30,10);
        bresenhamLine(g2,28, 10,28, 45,10);
        bresenhamLine(g2,8, 45,30, 45,10);
        bresenhamLine(g2,43, 10,43, 30,10);
        bresenhamLine(g2,45, 10,95, 10,10);
        bresenhamLine(g2,8, 45,8, 95,10);

        bresenhamLine(g2,558, 10,580, 10,10); // top right
        bresenhamLine(g2,543, 30,580, 30,10);
        bresenhamLine(g2,558, 10,558, 45,10);
        bresenhamLine(g2,578, 10,578, 30,10);
        bresenhamLine(g2,543, 10,543, 30,10);
        bresenhamLine(g2,558, 45,580, 45,10);
        bresenhamLine(g2,493, 10,543, 10,10);
        bresenhamLine(g2,578, 45,578, 95,10);

        bresenhamLine(g2,8, 560,45, 560,10); // bot left
        bresenhamLine(g2,8, 580,30, 580,10);
        bresenhamLine(g2,8, 560,8, 580,10);
        bresenhamLine(g2,28, 545,28, 580,10);
        bresenhamLine(g2,45, 560,45, 580,10);
        bresenhamLine(g2,8, 545,30, 545,10);
        bresenhamLine(g2,8, 495,8, 545,10); 
        bresenhamLine(g2,45, 580,95, 580,10);

        bresenhamLine(g2,543, 560,580, 560,10); // bot right
        bresenhamLine(g2,558, 580,580, 580,10);
        bresenhamLine(g2,558, 545,558, 580,10);
        bresenhamLine(g2,578, 560,578, 580,10);
        bresenhamLine(g2,558, 545,580, 545,10);         
        bresenhamLine(g2,543, 560,543, 580,10);
        bresenhamLine(g2,578, 495,578, 545,10);
        bresenhamLine(g2,493, 580,543, 580,10);

        g2.setColor(Color.BLUE);

/*
*
* Fill Color
* 
 */ 
        floodFill(buffer, 0, 0, Color.white, new Color(122,0,17)); //fill Background
        floodFill(buffer, 20, 20, Color.white, new Color(122,0,17));
        floodFill(buffer, 570, 20, Color.white, new Color(122,0,17));
        floodFill(buffer, 20, 570, Color.white, new Color(122,0,17));
        floodFill(buffer, 570, 570, Color.white, new Color(122,0,17));
        floodFill(buffer, 80, 250, Color.white, new Color(122,0,17));
        floodFill(buffer, 415, 530, Color.white, new Color(122,0,17));
        floodFill(buffer, 320, 540, Color.white, new Color(122,0,17));
        floodFill(buffer, 395, 128, Color.white, new Color(122,0,17));

        floodFill(buffer, 330, 400, Color.white, new Color(231,58,51)); //fill Color R:231  G:58  B:51
        floodFill(buffer, 330, 100, Color.white, new Color(231,58,51));
        floodFill(buffer, 260, 150, Color.white, new Color(231,58,51));
        floodFill(buffer, 465, 450, Color.white, new Color(231,58,51));


        floodFill(buffer, 465, 420, Color.white, new Color(255, 175, 14));//fill Color R:255  G:175  B:14
        floodFill(buffer, 440, 320, Color.white, new Color(255, 175, 14));
        floodFill(buffer, 410, 320, Color.white, new Color(255, 175, 14));
        floodFill(buffer, 400, 320, Color.white, new Color(255, 175, 14));
        floodFill(buffer, 360, 320, Color.white, new Color(255, 175, 14));
        floodFill(buffer, 340, 320, Color.white, new Color(255, 175, 14));
        floodFill(buffer, 300, 320, Color.white, new Color(255, 175, 14));
        floodFill(buffer, 265, 290, Color.white, new Color(255, 175, 14));
        floodFill(buffer, 265, 270, Color.white, new Color(255, 175, 14));
        floodFill(buffer, 265, 240, Color.white, new Color(255, 175, 14));
        floodFill(buffer, 290, 215, Color.white, new Color(255, 175, 14));
        floodFill(buffer, 310, 210, Color.white, new Color(255, 175, 14));
        floodFill(buffer, 330, 210, Color.white, new Color(255, 175, 14));
        floodFill(buffer, 370, 210, Color.white, new Color(255, 175, 14));
        floodFill(buffer, 400, 210, Color.white, new Color(255, 175, 14));
        floodFill(buffer, 430, 210, Color.white, new Color(255, 175, 14));
        floodFill(buffer, 440, 200, Color.white, new Color(255, 175, 14));
        floodFill(buffer, 445, 180, Color.white, new Color(255, 175, 14));
        floodFill(buffer, 200, 320, Color.white, new Color(255, 175, 14));
        floodFill(buffer, 250, 200, Color.white, new Color(255, 175, 14));
        floodFill(buffer, 330, 440, Color.white, new Color(255, 175, 14));
        floodFill(buffer, 210, 370, Color.white, new Color(255, 175, 14));
        floodFill(buffer, 205, 360, Color.white, new Color(255, 175, 14));
        floodFill(buffer, 225, 355, Color.white, new Color(255, 175, 14));
        floodFill(buffer, 230, 362, Color.white, new Color(255, 175, 14));

        


        floodFill(buffer, 490, 200, Color.white, new Color(194, 105, 1));//fill Color R:194  G:105  B:1
        floodFill(buffer, 440, 250, Color.white, new Color(194, 105, 1));
        floodFill(buffer, 410, 250, Color.white, new Color(194, 105, 1));
        floodFill(buffer, 380, 250, Color.white, new Color(194, 105, 1));
        floodFill(buffer, 350, 250, Color.white, new Color(194, 105, 1));
        floodFill(buffer, 310, 250, Color.white, new Color(194, 105, 1));
        floodFill(buffer, 325, 280, Color.white, new Color(194, 105, 1));
        floodFill(buffer, 355, 280, Color.white, new Color(194, 105, 1));
        floodFill(buffer, 385, 280, Color.white, new Color(194, 105, 1));
        floodFill(buffer, 415, 280, Color.white, new Color(194, 105, 1));
        floodFill(buffer, 445, 280, Color.white, new Color(194, 105, 1));
        floodFill(buffer, 480, 290, Color.white, new Color(194, 105, 1));
        floodFill(buffer, 510, 310, Color.white, new Color(194, 105, 1));
        floodFill(buffer, 415, 380, Color.white, new Color(194, 105, 1));
        floodFill(buffer, 200, 320, Color.white, new Color(194, 105, 1));
        floodFill(buffer, 415, 140, Color.white, new Color(194, 105, 1));
        floodFill(buffer, 400, 90, Color.white, new Color(194, 105, 1));


        floodFill(buffer, 390, 115, Color.white, new Color(224, 204, 99));//fill Color R:224  G:204  B:99
        floodFill(buffer, 350, 155, Color.white, new Color(224, 204, 99));
        floodFill(buffer, 400, 85, Color.white, new Color(224, 204, 99));

        floodFill(buffer, 441, 110, Color.white, new Color(187, 37, 48));//fill Color R:187  G:37  B:48
        

/*
 * Draw Picture
 */
        g.drawImage(buffer, 0, 0, null);
 
        
    }

    public void drawTriangle(Graphics g , int[] x , int[] y ,int size){
        bresenhamLine(g, x[0],y[0],x[1],y[1],2); 
        bresenhamLine(g, x[1],y[1],x[2],y[2],2);
        bresenhamLine(g, x[2],y[2],x[0],y[0],2);
    }
    
    public void bezierCurve(Graphics g , int x1 , int y1 , int x2 , int y2 ,int x3 , int y3, int x4 , int y4,int size){
        for(int i = 0; i <= 1000; i++){

            double t = i / 1000.0;
            
            int x = (int)(Math.pow((1 - t) , 3 ) * x1 +
                   3 * t *  Math.pow((1 - t) , 2) * x2 +
                   3 * Math.pow(t , 2) * (1 - t) * x3  +
                   Math.pow(t , 3) * x4);
        
            int y = (int)(Math.pow((1 - t) , 3 ) * y1 +
                   3 * t *  Math.pow((1 - t) , 2) * y2 +
                   3 * Math.pow(t , 2) * (1 - t) * y3  +
                   Math.pow(t , 3) * y4);
            
            plot(g,x,y,size);
        }
    }
    public void bresenhamLine(Graphics g, int x1 , int y1, int x2 ,int y2,int size){
        double dx = Math.abs(x2-x1);
        double dy = Math.abs(y2-y1);

        double sx = (x1 < x2) ? 1 : -1;
        double sy = (y1 < y2) ? 1 : -1;

        boolean isSwap = false;
        if(dy > dx){
            double dd = dx;
            dx = dy;
            dy = dd;
            isSwap = true;
        }
        double D = 2 * dy - dx;
        double x = x1;
        double y = y1;
        for(int i = 1 ; i < dx; i++){
            plot(g, (int)x , (int)y , size);
            if(D >= 0){
                if(isSwap)  {
                    x += sx;
                }
                else {
                    y += sy;
                }       
                D -= 2 * dx; 
            }
            if(isSwap) {
                y += sy;
            }
            else{
                x += sx;
            }
            D += 2 * dy;     
        }   
    }
    public BufferedImage floodFill (BufferedImage m , int x , int y , Color targetColor , Color replacementColor){
        Graphics2D g2 = m .createGraphics();
        Queue<Point> q = new LinkedList<Point>();

        if(m.getRGB(x,y) == targetColor.getRGB()){
            g2.setColor(replacementColor);
            plot(g2, x, y, 1);
            q.add(new Point (x,y));
        }
        while(!q.isEmpty()){
            Point p = q.poll();

             //south
             if(p.y < 600 && m.getRGB(p.x , p.y + 1) == targetColor.getRGB()){
                g2.setColor(replacementColor);
                plot(g2, p.x, p.y + 1, 1);
                q.add(new Point (p.x,p.y + 1));
            }
            //north
            if(p.y > 0 && m.getRGB(p.x , p.y - 1) == targetColor.getRGB()){
                g2.setColor(replacementColor);
                plot(g2, p.x, p.y - 1, 1);
                q.add(new Point (p.x,p.y - 1));
            }
            //east
            if(p.x < 600 && m.getRGB(p.x + 1 , p.y) == targetColor.getRGB()){
                g2.setColor(replacementColor);
                plot(g2, p.x + 1, p.y , 1);
                q.add(new Point (p.x + 1,p.y));
            }
            //west
            if(p.x > 0 && m.getRGB(p.x - 1 , p.y) == targetColor.getRGB()){
                g2.setColor(replacementColor);
                plot(g2, p.x - 1, p.y , 1);
                q.add(new Point (p.x - 1,p.y));
            }
        }
        return m;
       
    }
    public void plot(Graphics g , int x , int y, int size){
        g.fillRect(x, y, size, size);
    }
 
}