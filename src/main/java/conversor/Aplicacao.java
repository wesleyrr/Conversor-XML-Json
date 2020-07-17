package conversor;

public class Aplicacao {

    public static void main(String[] args) {
    	String caminho = "";
    	
    	//caminho = "/home/wesley/staff.xml";
    	caminho = "/home/wesley/Downloads/CVM/arquivos/valerio/noticias/arquivos/2019/20190104-1.html"; 
    	
        ImprimeXMLnoConsole imp = new ImprimeXMLnoConsole();
        
        imp.imprime(caminho);
        
    }

}
