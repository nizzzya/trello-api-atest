package com.jira.api.mode.card.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AttachmentsByType{

	@JsonProperty("trello")
	private Trello trello;

	public void setTrello(Trello trello){
		this.trello = trello;
	}

	public Trello getTrello(){
		return trello;
	}

	@Override
 	public String toString(){
		return 
			"AttachmentsByType{" + 
			"trello = '" + trello + '\'' + 
			"}";
		}
}