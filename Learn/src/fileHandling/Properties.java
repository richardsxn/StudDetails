package fileHandling;

public class Properties {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir")+"\\richard\\.properties";
			File f =new File(path);
		f.createNewFile();
		
		
		Properties prop =new Properties();
		OutputStream fio=null;
		fio =new FileOutputStream(path);
		prop.setProperty("selectMobileNo","select**From Mobile:");
		prop.store(fio,"SQL Query");
		
		InputStream fi =new FileInputStream(path);
		prop.load(inStream);
		String q=prop.getProperty("selectMobileNo");
		System.out.println("Query to get all mob no"+q);
		
		
				

	}

}
