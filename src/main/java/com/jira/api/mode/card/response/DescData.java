package com.jira.api.mode.card.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DescData{

	@JsonProperty("emoji")
	private Emoji emoji;

	public void setEmoji(Emoji emoji){
		this.emoji = emoji;
	}

	public Emoji getEmoji(){
		return emoji;
	}

	@Override
 	public String toString(){
		return 
			"DescData{" + 
			"emoji = '" + emoji + '\'' + 
			"}";
		}
}