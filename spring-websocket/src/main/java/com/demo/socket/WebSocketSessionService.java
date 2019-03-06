package com.demo.socket;

import java.io.IOException;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import com.demo.model.Response;

public interface WebSocketSessionService {

	public void addSession(WebSocketSession session);
	
	public void removeSession(WebSocketSession session);
	
	public void publishMessage(TextMessage msg) throws IOException;
	
	public void publishMessage(Response msg) throws IOException;
}
