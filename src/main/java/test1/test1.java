package test1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.Random;
import java.io.File;

public class test1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.err.println("Hola mundo 2024.04.07 - 10.40 v1");
		System.err.println(new test().getMessage());
		(new test1()).readPropFile();
		// branch feature_branch v1 10.40
	}

	private static final String _subdir="src/test/resources/";
	public Properties read_write_PropFile() throws Exception {
		
        System.out.println("Crearemos un nuevo archivo de configuraciones");
		File archivo = new File(_subdir+"localproperties.properties");       
        OutputStream outputStream = new FileOutputStream(archivo);
        Properties prop = new Properties();
        System.out.println("Creados..");

        
        // set the properties value
        prop.setProperty("db.url", "localhost");
        prop.setProperty("db.user", "mkyong");
        prop.setProperty("db.password", "password");

        Random random = new Random();
        int randomInt = random.nextInt(100000);
        double randomDouble = random.nextDouble();
        String randomValueString=String.valueOf(randomDouble);
        
        prop.setProperty("currentTimeMillis",randomValueString);

        // save properties to project root folder
        prop.store(outputStream, "comment");
    
        System.out.println(archivo.getAbsolutePath());	
        System.out.println(prop);	
        
        return prop;
	}

	public String readed_db_user=null;
	public String readed_currentTimeMillis=null;
	
	public void readPropFile() throws Exception {
        System.out.println("Leyendo un nuevo archivo de configuraciones");
		File archivo = new File(_subdir+"localproperties.properties");       
        InputStream outputStream = new FileInputStream(archivo);
        Properties prop = new Properties();
        prop.load(outputStream);
        readed_db_user=prop.getProperty("db.user");
        readed_currentTimeMillis=prop.getProperty("currentTimeMillis");
	}
}
