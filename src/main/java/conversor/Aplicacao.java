package conversor;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.jsoup.Jsoup;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;

import conversor.beans.Noticias;

public class Aplicacao {

    public static void main(String[] args) throws JAXBException, JsonIOException, IOException {
    	String caminho, arquivo, objJson;
    	caminho = "/home/wesley/Downloads/CVM/arquivos/valerio/noticias/arquivos/2019/"; 
    	arquivo = "20190104-1.html";
    	
        //XMLUtil.imprimeXMLComoStringNoConsole(caminho);
        
    	Noticias noticias = XMLJsonUtil.converteXMLParaObjeto(caminho + arquivo);
    	
    	objJson = XMLJsonUtil.converteObjetoParaJsonPretty(noticias);
    	
    	System.out.println("------------------------------------------");
    	System.out.println(objJson);

    	System.out.println("------------------------------------------");

    	String noticiasJson = XMLJsonUtil.converteObjetoParaJsonInLine(noticias);
    	System.out.println(noticiasJson);
    	
    	//new Gson().toJson(objJson, new FileWriter("/home/wesley/Desenvolvimento/workspace/conversor/target/noticias/noticias.json"));
    	
    }

}
