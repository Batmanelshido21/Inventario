
import java.io.*;
import java.util.*;
 class ReadingMaterials implements Serializable {
	private static final long serialVersionUID = 1L;
	protected String author;
	protected String subject;
	protected int yearwritten;
	public ReadingMaterials() {}
	ReadingMaterials(String auth, String sub, int year) {
	author = auth;
	subject = sub;
	yearwritten = year;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getYearwritten() {
		return yearwritten;
	}
	public void setYearwritten(int yearwritten) {
		this.yearwritten = yearwritten;
	}
}
class Book extends ReadingMaterials implements Serializable{
	private static final long serialVersionUID = 1L;
	int numpages;
	String name;
	boolean ishardcover;
	Book(int pages, String n, boolean hardcover, String author,
	String subject, int yearwritten)
	{
	super(author, subject, yearwritten);
	numpages = pages;
	name = n;
	ishardcover = hardcover;
	}
	private void writeObject(ObjectOutputStream out) throws
	IOException {
	out.defaultWriteObject(); //escribe ishardcover, name,numpages
	out.writeObject(author);
	out.writeObject(subject);
	out.writeInt(yearwritten);
	}
	private void readObject(ObjectInputStream in)

			throws IOException, ClassNotFoundException {
			in.defaultReadObject();
			author = (String) in.readObject();
			subject = (String) in.readObject();
			yearwritten = in.readInt();
			}
			
	public int getNumpages() {
		return numpages;
	}
	public void setNumpages(int numpages) {
		this.numpages = numpages;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isIshardcover() {
		return ishardcover;
	}
	public void setIshardcover(boolean ishardcover) {
		this.ishardcover = ishardcover;
	}
	public String toString() {
			return("Name: " + name + "\n" + "Author: " + author + "\n" +"Pages:" 
	+ numpages + "\n" + "Subject: " + subject + "\n" + "Year: " +yearwritten + "\n"+"Tiene pasta protectora\n"+ishardcover);
			}
}
public class Serialización {
	public static void main(String[]args){
		Scanner lector= new Scanner(System.in); //Programa que guarda objetos de tipo libro como book(cualquier numero).ser
		//Cada vez que se corre el programa crea un nuevo archivo
		int cont3=0;
		for(int i=0;i<100;i++){
			File extra=new File("Book.ser"+cont3);
			if(extra.exists()){
				cont3++;
			}
			else{
				i=100;
			}
		}
		String name1="Book.ser"+cont3;
		File file=new File(name1);//Esto hace que puedas crear un archivo nuevo cada corrida
		System.out.println("Introduce el numero de libros");
		int num=lector.nextInt();
		Book[] book=new Book[100];
		if(!file.exists()){
			try{
			file.createNewFile();//se crea el archivo con la condicion de no existe
			System.out.println(file.getName()+" Se ha creado el archivo");
			}
			catch(IOException ex){
				ex.printStackTrace();
		    }
		}
		System.out.println("=====================================");
		int cont=1;
		System.out.println("Desea realizar alguna operacion\n1=si\n2=no");
		int res1=lector.nextInt();
		while(res1==1){
		System.out.println("introduzca accion que desea realizar\n1=Introducir libros\n2=Leer libros\n3=buscar libro\n4=leer archivo anterior\n5=Salir");
		int op=lector.nextInt();
		switch(op){
		case 1:
			for(int i=0;i<num;i++){
				System.out.println("Nombre del autor");
				lector.nextLine();
				String author = lector.nextLine();
				System.out.println("Introduce nombre del libro");
				String name=lector.nextLine();
				System.out.println("Introduce numero de paginas");
				int numpages = lector.nextInt();
				System.out.println("Introduce el tema");
				lector.nextLine();
				String subject = lector.nextLine();
				System.out.println("Introduce el año en que fue escrito");
				int yearwritten = lector.nextInt();
				System.out.println("Tiene pasta protectora \ntrue/flase");
				boolean ishardcover = lector.nextBoolean();
				book[i]=new Book(numpages,name,ishardcover,author,subject,yearwritten);
				System.out.println();//guarda el primer objeto en ishardcover solo se introduce true o false
			}
			try{
				ObjectOutputStream ObjetoArchivo= new ObjectOutputStream(new FileOutputStream(name1));
				ObjetoArchivo.writeObject(book);
				
			}
			catch(Exception mono){
			}
			break;
		case 2:
			System.out.println("=====================================");
			try{
				ObjectInputStream ObjetoArchivo1=new ObjectInputStream(new FileInputStream(name1));
				Book[] PersonalRec=(Book[])ObjetoArchivo1.readObject();
				for(int i=0;i<num;i++){		
						System.out.println(PersonalRec[i]);
						System.out.println();
						//lee los objetos guardados
			}
			}
				catch(Exception mono){
				
			}
			System.out.println("=====================================");
			break;
				
		
		case 3:
			System.out.println("Introduce nombre del autor");
			lector.nextLine();
			System.out.println("=====================================");
			String matriculan=lector.nextLine();
			for(int i=0;i<num;i++){
				if(matriculan.equals(book[i].getAuthor())){
					System.out.println(book[i].toString());
					//busca un objeto serializado con el nombre del autor
				}
				
			}
			System.out.println("=====================================");
			break;
		case 5:
			res1=2;
			break;
		case 4:
			System.out.println("introduce el nombre");
			lector.nextLine();
			String nombrearch=lector.nextLine();
			System.out.println("=====================================");
			try{
				ObjectInputStream ObjetoArchivo1=new ObjectInputStream(new FileInputStream(nombrearch));
				Book[] PersonalRec=(Book[])ObjetoArchivo1.readObject();
				int aux=0;	
				while(PersonalRec[aux]!=null){
					System.out.println(PersonalRec[aux]);
					System.out.println();
					aux++;
					//Busca el archivo introducido y lo imprime en pantalla
				}
			}
			catch(Exception mono){
			}
			System.out.println("=====================================");
			break;
		}
		}
	}
}
