import java.io.*;

public class AdditionCycle{
    
    public static void main(String[] args) throws IOException{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int target = Integer.parseInt(bfr.readLine());
        if (target <10) {target = target*10;}

        int count = 0;
        int num = target;
        int compare = 100;
        
        while(target != compare) {
        	count++;
        	
        	int ten = num/10; int one = num%10;		// ten = 10의 자리, one = 1의 자리
        	int plus = ten + one;		// 10의 자리와 1의 자리를 더함
        	compare = one*10 + (plus%10);	// 새로운 수
        	num = compare;
        }
        bfw.write(Integer.toString(count));
        bfw.flush();
        bfw.close();
    }
}
