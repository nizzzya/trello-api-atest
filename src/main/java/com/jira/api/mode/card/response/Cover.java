package com.jira.api.mode.card.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cover{

	@JsonProperty("idUploadedBackground")
	private Object idUploadedBackground;

	@JsonProperty("brightness")
	private String brightness;

	@JsonProperty("color")
	private Object color;

	@JsonProperty("size")
	private String size;

	@JsonProperty("idAttachment")
	private Object idAttachment;

	@JsonProperty("idPlugin")
	private Object idPlugin;

	public void setIdUploadedBackground(Object idUploadedBackground){
		this.idUploadedBackground = idUploadedBackground;
	}

	public Object getIdUploadedBackground(){
		return idUploadedBackground;
	}

	public void setBrightness(String brightness){
		this.brightness = brightness;
	}

	public String getBrightness(){
		return brightness;
	}

	public void setColor(Object color){
		this.color = color;
	}

	public Object getColor(){
		return color;
	}

	public void setSize(String size){
		this.size = size;
	}

	public String getSize(){
		return size;
	}

	public void setIdAttachment(Object idAttachment){
		this.idAttachment = idAttachment;
	}

	public Object getIdAttachment(){
		return idAttachment;
	}

	public void setIdPlugin(Object idPlugin){
		this.idPlugin = idPlugin;
	}

	public Object getIdPlugin(){
		return idPlugin;
	}

	@Override
 	public String toString(){
		return 
			"Cover{" + 
			"idUploadedBackground = '" + idUploadedBackground + '\'' + 
			",brightness = '" + brightness + '\'' + 
			",color = '" + color + '\'' + 
			",size = '" + size + '\'' + 
			",idAttachment = '" + idAttachment + '\'' + 
			",idPlugin = '" + idPlugin + '\'' + 
			"}";
		}
}