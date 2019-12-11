package inputoutput;

import java.io.File;

public class TestReadDesktop {

	public static void main(String[] args) {

		final String directory = ("C:\\Users\\BeGear\\Desktop");
		File desktop = new File(directory);

		String[] file = desktop.list();

		for (int i=0; i<file.length; i++) {
			String fileName=file[i];
			
			System.out.println(fileName);
		}
	}

}


