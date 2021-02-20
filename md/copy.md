# copy



```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

class copy {
    public static void main(String[] ar) throws java.lang.Exception {
        FileReader fr = new FileReader(ar[0]);
        BufferedReader br = new BufferedReader(fr);

        FileWriter fw = new FileWriter(ar[1]);
        PrintWriter pw = new PrintWriter(fw);

        {
            String s;

            while ((s = br.readLine()) != null)
                pw.println(s);

        }

        pw.close();
        fw.close();
        br.close();
        fr.close();
    }
}
```

