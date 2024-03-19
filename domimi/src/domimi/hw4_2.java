package domimi;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.nio.file.Files;
import java.io.IOException;
public class hw4_2 {

	public static void main(String[] args) {
		Path filePath=Path.of("/Users/User/Desktop/0319/domimi/bin/demo.txt");
		try {
			String content=Files.readString(filePath);
			Pattern pattern=Pattern.compile("01AF0055\\/\\d{6}[a-z]\\.HRV\\.jpg\\?HRV\\.bpp");
			Matcher matcher = pattern.matcher(content);
			while(matcher.find()) {
				System.out.print(matcher.group());
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
