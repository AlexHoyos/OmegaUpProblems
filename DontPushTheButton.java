import java.util.*;
public class DontPushTheButton {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
       int total = in.nextInt(), dButton = in.nextInt();
       Vector<Integer> botones = new Vector<Integer>();
       for(int i = 0; i<total; i++){
           int btn = in.nextInt();
           if(btn != dButton){
               botones.add(btn);
           }
       }

       for(int i = 0; i<botones.size(); i++){
           System.out.print(botones.elementAt(i) + " ");
       }

    }
}
