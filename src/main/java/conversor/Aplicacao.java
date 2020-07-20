package conversor;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

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
		
		//objJson = XMLJsonUtil.converteObjetoParaJsonInLine(noticias);

		System.out.println(objJson);
		 
    	//TODO gerar os arquivos físicos
    	Writer writer = new FileWriter("/home/wesley/Desenvolvimento/workspace/conversor/target/noticias/" + arquivo.replace(".html", ".json"));

    	new Gson().toJson(objJson, writer);
    	writer.close();
    	
    	
    	//TODO tornar os métodos genéricos
    	//TODO criar rotina para capturar todos os arquivos
    	
		
    }

}
