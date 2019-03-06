package com.demo.socket;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.demo.model.Response;
import com.demo.util.DataUtil;

@Component
@EnableScheduling
public class MessageScheduler {
 
	@Autowired
	private WebSocketSessionService webSocketSession;
	
    @Scheduled(fixedRate = 2000)
    public void pushData() throws InterruptedException, IOException{
    	String user = DataUtil.getInstance().getUser();
    	String country = DataUtil.getInstance().getCountry();
    	Response response = new Response("userstatus", new com.demo.model.User(user,country,"Active"), true);	
    	webSocketSession.publishMessage(response);

    }
}
