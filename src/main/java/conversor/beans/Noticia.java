package conversor.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Noticia")
public class Noticia {

	@SerializedName("titulo")
	@Expose
	private String Titulo;

	@SerializedName("subTitulo")
	@Expose
	private String Subtitulo;

	@SerializedName("data")
	@Expose
	private String Data;

	@SerializedName("dataBusca")
	@Expose
	private String DataBusca;

	@SerializedName("bloco")
	@Expose
	private Bloco Bloco;

	@SerializedName("tags")
	@Expose
	private String Tags;

	@SerializedName("_language")
	@Expose
	private String language;

	public String getTitulo() {
		return Titulo;
	}

	public String getSubtitulo() {
		return Subtitulo;
	}

	public void setSubtitulo(String subtitulo) {
		Subtitulo = subtitulo;
	}

	public String getData() {
		return Data;
	}

	public void setData(String data) {
		Data = data;
	}

	public String getDataBusca() {
		return DataBusca;
	}

	public void setDataBusca(String dataBusca) {
		DataBusca = dataBusca;
	}

	public Bloco getBloco() {
		return Bloco;
	}

	public void setBloco(Bloco bloco) {
		Bloco = bloco;
	}

	public String getTags() {
		return Tags;
	}

	public void setTags(String tags) {
		Tags = tags;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
