/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myapplet;

/**
 *
 * @author aashish
 */
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prataprudraathapu
 */
public class aashish {

    /**
     * @param args the command line arguments
     */
    static String PSM="Third",CTG="Good",SEM="Good",ASS="Yes",GP="Yes",ATT="Good",LW="Yes",ESM;
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        FileInputStream fis=new FileInputStream("vowelWithGainRatio.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(fis));
        String s,temp[] = new String[4],temp5[] = new String[4],temp3,temp1,temp2 = " ";
        StringTokenizer st;
        int i=0,j=0,h=0;
        s=br.readLine();
        s=br.readLine();
        /*s=br.readLine();
        st= new StringTokenizer(s," [];->=");
             i=0;
             while (st.hasMoreElements()) {
			temp[i]=(String) st.nextElement();
                        i++;
		}
             temp2=temp[2];
             temp[0]=temp[2];*/
        while((s=br.readLine())!=null)
        {
             
                 st= new StringTokenizer(s," [];->=");
            System.out.println(st.countTokens());
             i=0;
             while (st.hasMoreElements()) {
			temp[i]=(String) st.nextElement();
                        i++;
		}
             
             if((temp2.equalsIgnoreCase(temp[0]))||(h==0))
             {
                 temp3=calcy(temp[2]);
                 temp1=temp[0];
                 while((s=br.readLine())!=null)
                        {
                            st= new StringTokenizer(s," [];->=");
                            //System.out.println(st.countTokens());
                            j=0;
                            while (st.hasMoreElements()) {
                                temp5[j]=(String) st.nextElement();
                                j++;
                            }
                            if(temp5[0].equalsIgnoreCase(temp1)&temp3.equalsIgnoreCase(temp5[3])){
                                //&&(temp3==temp5[3])
                                System.out.println("temp"+temp5[0]);
                                break;
                            }
                        }
                 System.out.println("temp1"+temp5[1]);
                 temp2=temp5[1];
                 h++;
             }
             /*if(temp.length==3&&temp2==temp[0])
             {
                   temp3=calcy(temp[2]);;
                   if(temp3==" ")
                   {
                       System.out.println(temp[2]);
                   }
                   while((s=br.readLine())!=null)
                        {
                            st= new StringTokenizer(s," [];->=");
                            j=0;
                            while (st.hasMoreElements()) {
                                temp1[j]=(String) st.nextElement();
                                j++;
                            }
                            if(temp1[0]==temp[0]&&temp3==temp1[3])
                                break;
                        }
                   temp2=temp1[1];
                   h=1;
               }*/

          }
        System.out.println("ESM"+temp[2]);
        
     }
    static String calcy(String sp)
    {
        if(sp.equalsIgnoreCase("PSM")){ 
            return PSM;}
        if(sp.equalsIgnoreCase("CTG")){ 
            return CTG;}
        if(sp.equalsIgnoreCase("SEM")){ 
            return SEM;}
        if(sp.equalsIgnoreCase("ASS")){ 
            return ASS;}
        if(sp.equalsIgnoreCase("GP")){ 
            return GP;}
        if(sp.equalsIgnoreCase("ATT")){ 
            return ATT;}
        if(sp.equalsIgnoreCase("LW")){ 
            return LW;}
        
        
        return " ";
    }
}
   