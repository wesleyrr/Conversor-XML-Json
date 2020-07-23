package br.gov.cvm.conversor.de;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Link {

	@SerializedName("target")
	@Expose
	private String target;
	@SerializedName("uuid")
	@Expose
	private String uuid;
	@SerializedName("_name")
	@Expose
	private String name;
	@SerializedName("_internal")
	@Expose
	private String internal;
	@SerializedName("_type")
	@Expose
	private String type;

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInternal() {
		return internal;
	}

	public void setInternal(String internal) {
		this.internal = internal;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
