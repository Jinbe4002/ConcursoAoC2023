package concursoAoC2023;
import java.io.*;

public class ConcursoAoC2023 
{
	
	public static int calibration(File txt)
	{
		int sum = 0;

        try (FileReader fr = new FileReader(txt);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                char[] chars = line.toCharArray();

                int first = -1;
                int last = -1;

                for (int i = 0; i < chars.length; i++) 
                {
                    if (Character.isDigit(chars[i])) 
                    {
                        if (first == -1) 
                        {
                            first = chars[i] - '0';
                        }
                        last = chars[i] - '0';
                    }
                }

                if (first != -1 && last != -1) 
                {
                    int calibrationValue = first * 10 + last;
                    sum += calibrationValue;
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return sum;
	}

}