import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class InWork {
    int width;
    int height;
    int depth;

    InWork(){
        System.out.println("constraction copmlete");
        width = 10;
        height = 15;
        depth = 20;
    }
      int volume(){
          return width*height*depth;
      }
}
     class DemoInWork{
         public static void main(String[] args){
             InWork work1 = new InWork();
             InWork work2 = new InWork();

             int vol;

             vol = work1.volume();
             System.out.println("objem raven " + vol);
             vol = work2.volume();
             System.out.println("objem raven " + vol);

             }
         }
