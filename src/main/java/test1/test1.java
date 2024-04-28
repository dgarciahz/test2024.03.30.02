package test1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;
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
	public void readPropFile() throws Exception {
		
        System.out.println("Crearemos un nuevo archivo de configuraciones");
		File archivo = new File(_subdir+"localproperties.properties");       
        OutputStream outputStream = new FileOutputStream(archivo);
        Properties prop = new Properties();
        System.out.println("Creados...");

        
        // set the properties value
        prop.setProperty("db.url", "localhost");
        prop.setProperty("db.user", "mkyong");
        prop.setProperty("db.password", "password");
        prop.setProperty("currentTimeMillis",new Long(System.currentTimeMillis()).toString());

        // save properties to project root folder
        prop.store(outputStream, "comment");
    
        System.out.println(archivo.getAbsolutePath());	
        System.out.println(prop);	
	}
}
