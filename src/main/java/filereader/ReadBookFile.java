package filereader;

import java.io.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class ReadBookFile {
	private String pathToInputFile;
	private String pathToOutputFile;
	private BufferedReader br;

	public ReadBookFile(String pathInput, String pathOutput) {
		this.pathToInputFile = pathInput;
		this.pathToOutputFile = pathOutput;
	}
	
	@SuppressWarnings("unchecked")
	public void read() {
		String s;
		
		try {
			this.br = new BufferedReader(new InputStreamReader(new FileInputStream(pathToInputFile), "UTF-8"));
			JSONArray bookList = new JSONArray();
			while((s = this.br.readLine()) != null) {
				String[] parts = s.split("\t");
				JSONObject val = new JSONObject();
				for (int i = 0; i < parts.length; i++) {
					String[] keyValue = parts[i].split(":");
					if (keyValue.length == 1) {
						if (i == 1) {
							val.put("ISBN", keyValue[0].toString().trim());
						} else if ( i == 2) {
							val.put("Title", keyValue[0].toString().trim());
						} else {
							val.put(Integer.valueOf(i).toString().trim(), keyValue[0].toString().trim());
						}
					} else if (keyValue.length == 2) {
						val.put(keyValue[0].toString().trim(), keyValue[1].toString().trim());
					} else {
						val.put(keyValue[0].toString().trim(), parts[i].toString().substring(parts[i].indexOf(':')).trim());
					}
				}
				bookList.add(val);
			}
			Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(pathToOutputFile), "UTF-8"));
	        try {
	        	out.write(bookList.toJSONString());
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	        	out.close();
	        }
 
			
		}
		catch(IOException ex) {
			System.out.println(ex);
		}
	}
	
}
