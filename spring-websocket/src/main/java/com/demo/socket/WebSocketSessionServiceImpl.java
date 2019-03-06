package com.demo.socket;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import com.demo.model.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@Component
public class WebSocketSessionServiceImpl implements WebSocketSessionService{


	private List<WebSocketSession> sessions = new CopyOnWriteArrayList<>();
	
	public void addSession(WebSocketSession session){
		sessions.add(session);
	}
	
	@Override
	public void removeSession(WebSocketSession session) {
		if(sessions.contains(session)){
			sessions.remove(session);
		}
	}
	
	public void publishMessage(TextMessage msg) throws IOException{
		for (WebSocketSession webSocketSession : sessions) {
			webSocketSession.sendMessage(msg);
		}
	}
	
	@Override
	public void publishMessage(Response msg) throws IOException {
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String textMessage = ow.writeValueAsString(msg);
		this.publishMessage(new TextMessage(textMessage));
	}
}
