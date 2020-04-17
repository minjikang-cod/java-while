import java.io.*;
import java.util.StringTokenizer;

public class Addition5{
    
    public static void main(String[] args) throws IOException{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true) {
         	String str = bfr.readLine();
         	StringTokenizer st = new StringTokenizer(str);
         	
         	int A = Integer.parseInt(st.nextToken());
         	int B = Integer.parseInt(st.nextToken());
         	
         	if(A==0 && B==0) {
         		break;
         	}
         	bfw.write(Integer.toString(A+B));
         	bfw.write("\n");
        	
        }
        bfw.flush();
        bfw.close();
    }
}
