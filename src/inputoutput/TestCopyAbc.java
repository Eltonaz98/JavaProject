package inputoutput;

import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCopyAbc {

	public static void main(String[] args) throws IOException {

		final String nomefile = "abc.txt";
		final String copyfile = "copy_abc.txt";
		final String nomedirectory = "C:\\Users\\BeGear\\Desktop\\Test Input Output";
		int x;

		File copy = new File(nomedirectory, copyfile);
		copy.createNewFile();

		FileReader fr = new FileReader(new File(nomedirectory, nomefile));
		FileWriter fw = new FileWriter(copy);

		while ((x=fr.read()) != -1) {
			System.out.print((char)x);
			fw.write(x);
		}

		fw.flush();
		fw.close();

	}
}