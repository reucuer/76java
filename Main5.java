import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException{

    int elems;
    String path = "INPUT.TXT";
    File file = new File(path);
    Scanner sc = new Scanner(file);    
    int N = sc.nextInt();
    elems = N;
    LocalTime[][] a = new LocalTime[N][2];;
      String Line;
      String[] partsSp;
      String[] partsDl;
      String[] partsDl_2;    
      sc.nextLine();
      for(int i = 0; i < N; i++){
            while (sc.hasNextLine()) {
                Line = sc.nextLine();
                partsSp = Line.split(" ");
                
                partsDl = partsSp[0].split(":");
                a[i][0] = LocalTime.of(Integer.parseInt(partsDl[0]),Integer.parseInt(partsDl[1]));
                
                partsDl_2 = partsSp[1].split(":");
                a[i][1] = LocalTime.of(Integer.parseInt(partsDl_2[0]),Integer.parseInt(partsDl_2[1]));
                break;
        }
    }
    for(int i = 0; i < N; i++){
        for (int j = 0; j < 2; j++){
            System.out.print(a[i][j] + " ");
        }
        System.out.println();
    }
        for (int out = elems - 1; out >= 1; out--){
            
            for (int in = 0; in < out; in++){
                                
                if(a[in][0].compareTo(a[in + 1][0]) > 0){
                LocalTime[] dummy = new LocalTime[2];
                dummy[0] = a[in][0];
                dummy[1] = a[in][1];
                a[in][0] = a[in + 1][0];
                a[in][1] = a[in + 1][1];
                a[in + 1][0] = dummy[0];
                a[in + 1][1] = dummy[1];
                }
            }
        }
    System.out.println("");
    for(int i = 0; i < N; i++){
        for (int j = 0; j < 2; j++){
            System.out.print(a[i][j] + " ");
        }
        System.out.println();
    }
    int[] ch = new int[N];
    Arrays.fill(ch, 0);
                System.out.println("");    
    for (int i = 0; i < N; i++){
        for (int j = 0; j < N; j++){
        if (i == j) continue;
        if(a[i][1].compareTo(a[j][0]) >= 0 && a[i][0].compareTo(a[j][0]) <= 0){
            System.out.println(a[i][0] + "and" + a[i][1] + "____" + a[j][0] + "and" + a[j][1]);
            ch[i]++;
            ch[j]++;
        }
        
        }
    }
    for(int i = 0; i < N; i++) System.out.println(i + ": " + ch[i]);
    int max = ch[0];
    for(int i = 0; i < N; i++) if (max < ch[i]) max = ch[i];
    System.out.println(max);
    
        FileWriter writerS = new FileWriter("OUTPUT.TXT", false);
            writerS.write(String.valueOf(max));
            writerS.flush();
  }
}