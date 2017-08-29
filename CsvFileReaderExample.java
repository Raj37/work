import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CsvFileReaderExample extends SentimentTest{
	public static void main(String[] args) {
		String csvFile = "/Users/rajka/csv/Client_Sentiment_Analysis.csv";
		BufferedReader br = null;
		String line = "";
		try {
			br = new BufferedReader(new FileReader(csvFile));
			int n=0;			
			while ((line = br.readLine()) != null) {
				if(line.trim().length()==0){
					System.out.println(line.trim().length());
					n=n+1;
					System.out.println("Line No : "+n);
					String text = line;
					System.out.println("Text"+text);
					CsvFileReaderExample obj = new CsvFileReaderExample();
					obj.sentimentResult(text);
				}
				else{
					n=n+1;
					System.out.println("Line No : "+n);
					String text = line;
					System.out.println("Text"+text);
					CsvFileReaderExample obj = new CsvFileReaderExample();
					obj.sentimentResult(text);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}


