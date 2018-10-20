package org.ititandev.model;

import java.util.Date;

public class Message {
	
	String messageId;
	String type;
	String content;
	String datetime;
	String conversationId;
	String username;
	Boolean read;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Boolean getRead() {
		return read;
	}

	public void setRead(Boolean read) {
		this.read = read;
	}

	public static class MessageType {
		public static final String JOIN = "JOIN";
		public static final String LEAVE = "LEAVE";
		public static final String TEXT = "TEXT";
		public static final String IMAGE = "IMAGE";
		public static final String FILE = "FILE";
		public static final String CALL = "CALL";
	}
}
