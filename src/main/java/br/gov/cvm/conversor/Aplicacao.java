package br.gov.cvm.conversor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.UUID;

import javax.xml.bind.JAXBException;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;

import br.gov.cvm.conversor.de.Noticias;
import br.gov.cvm.conversor.jsontemplates.JsonTemplate;

public class Aplicacao {

	public static void criarPastas() throws FileNotFoundException, UnsupportedEncodingException {
		int contadorPasta = 76;
		// int contadorArquivo = 0;
		int contadorArquivoGeral = 76000;

		// CRIAR A PASTA 0;
		new File("/home/wesley/Desenvolvimento/workspace/conversor/target/json/content/76").mkdirs();

		createForlder("pt-br", "", contadorPasta, contadorArquivoGeral);
		System.out.println(contadorArquivoGeral);

	}

	public static void main(String[] args) throws JAXBException, JsonIOException, IOException {

		criarPastas();

		/*
		 * String caminho, arquivo, objJson; caminho =
		 * "/home/wesley/Downloads/CVM/arquivos/valerio/noticias/arquivos/2019/";
		 * arquivo = "20190104-1.html";
		 * 
		 * 
		 * 
		 * Noticias noticias = XMLJsonUtil.converteXMLParaObjeto(caminho + arquivo);
		 * objJson = XMLJsonUtil.converteObjetoParaJsonPretty(noticias);
		 * 
		 * 
		 * //XMLUtil.imprimeXMLComoStringNoConsole(caminho); //objJson =
		 * XMLJsonUtil.converteObjetoParaJsonPretty(noticias);
		 * //XMLJsonUtil.converteObjetoParaJsonInLine(noticias)
		 * 
		 * 
		 * System.out.println(objJson);
		 * 
		 * //TODO gerar os arquivos físicos Writer writer = new
		 * FileWriter("/home/wesley/Desenvolvimento/workspace/conversor/target/" +
		 * arquivo.replace(".html", ".json"));
		 * 
		 * new Gson().toJson(objJson, writer); writer.close();
		 */

		// TODO criar rotina para capturar todos os arquivos

	}

	private static void createForlder(String nomepasta, String localPasta, int contadorPasta, int contadorArquivoGeral)
			throws FileNotFoundException, UnsupportedEncodingException {

		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdDATA = new SimpleDateFormat("yyyy-MM-dd");
		sd.setTimeZone(TimeZone.getTimeZone("GMT-3"));
		sdDATA.setTimeZone(TimeZone.getTimeZone("GMT-3"));

		String dataAtual = sd.format(new Date()) + ".000000 GMT-3";

		String uuid = UUID.randomUUID().toString().replace("-", "");

		String JSON_PASTA = JsonTemplate.TEMPLATE_PASTA.replaceAll("@nomepasta", nomepasta).replaceAll("@uid", uuid)
				.replaceAll("@data_atual", dataAtual).replaceAll("@descricao", nomepasta)
				.replaceAll("@localpasta", localPasta);

		PrintWriter writer = new PrintWriter("/home/wesley/Desenvolvimento/workspace/conversor/target/json/content/"
				+ contadorPasta + "/" + contadorArquivoGeral + ".json", "UTF-8");

		writer.println(JSON_PASTA);
		writer.close();

	}

}
