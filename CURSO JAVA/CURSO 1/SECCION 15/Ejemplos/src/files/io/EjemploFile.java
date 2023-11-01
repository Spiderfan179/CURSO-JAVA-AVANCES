package files.io;

import java.io.File;

public class EjemploFile {

	public static void main(String[] args)
	{
		File f = new File("C:\\Users\\Spide\\Desktop\\Cosas Del Bootcamp de CONSITI\\CURSO JAVA\\CURSO 1\\SECCION 15\\Archivos de files");
      System.out.println("is file "+f.isFile());
      System.out.println("is directory " + f.isDirectory());
      System.out.println("name "+ f.getName());
      System.out.println("can read "+ f.canRead());
      File[] content = f.listFiles();
      
      System.out.println();
      for (File file : content) 
      {
    	     System.out.println("List -is file "+file.isFile());
    	      System.out.println("List -is directory " + file.isDirectory());
    	      System.out.println("List -name "+ file.getName());
    	      System.out.println("List -can read "+ file.canRead());
	}
      
	}

}
