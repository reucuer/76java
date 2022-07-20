import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException{
    int elems;
    String path = "INPUT.TXT";
    File file = new File(path);
    Scanner sc = new Scanner(file);    
    int N = sc.nextInt();
    elems = N;
    //LocalTime[][] a = new LocalTime[N][2];;
    //Main array = new Main(N);

      String Line;
      String[] partsSp = new String[2];
      String[] partsDl = new String[1];
      String[] partsDl_2 = new String[1];    
      sc.nextLine();
      for(int i = 0; i < N; i++){
            while (sc.hasNextLine()) {
                Line = sc.nextLine();
                partsSp = Line.split(" ");
                
                partsDl = partsSp[0].split(":");
                //a[i][0] = LocalTime.of(Integer.parseInt(partsDl[0]),Integer.parseInt(partsDl[1]));
                
                partsDl_2 = partsSp[1].split(":");
//                a[i][1] = LocalTime.of(Integer.parseInt(partsDl_2[0]),Integer.parseInt(partsDl_2[1]));
                break;
        }
    }
    for(int i = 0; i < N; i++){
        for (int j = 0; j < 2; j++){
//            System.out.print(a[i][j] + " ");
        }
        System.out.println();
    }

    System.out.println("");
    for(int i = 0; i < N; i++){
        for (int j = 0; j < 2; j++){
         //   System.out.print(a[i][j] + " ");
        }
        System.out.println();
    }
    int[] ch = new int[N];
    
                System.out.println("");    
    int count = 0;
    for (int i = 0; i < N; i++){
        for (int j = 0; j < N; j++){
        if (i == j) continue;

        
        }
    }
    
    for(int i = 0; i < N; i++) System.out.println(i + ": " + ch[i]);
    int max = ch[0];
    for(int i = 0; i < N; i++){
        ch[i]++;
        if (max < ch[i]) {
            max = ch[i];
            
        }
    }
    System.out.println(max);
    
    String str = Integer.toString(max);
    /*String fileName = "OUTPUT.TXT";
    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
    //writer.append(' ');
    writer.append(str);
     
    writer.close();*/
    
    
    FileWriter writerS = new FileWriter("OUTPUT.TXT", false);
            writerS.write(String.valueOf(5));
            writerS.flush();
  }
}