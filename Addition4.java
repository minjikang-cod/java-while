import java.io.*;
import java.util.StringTokenizer;

public class Addition4{
    
    public static void main(String[] args) throws IOException{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int sum=0;
        String str = "";
        
        while((str=bfr.readLine())!=null) {
        	StringTokenizer st = new StringTokenizer(str);
         	
        	if(st.hasMoreTokens() ) {
        		int A = Integer.parseInt(st.nextToken());
           		int B = Integer.parseInt(st.nextToken());
           		sum = A + B;
            		
           		bfw.write(Integer.toString(sum));
           		bfw.write("\n");
        	}
        	else { break;}
        }
        bfw.flush();
        bfw.close();
    }
}
