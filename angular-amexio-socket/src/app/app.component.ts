import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  title = 'Angular Socket Demo';
  data: any [];

  constructor() {
    this.data = [];
  }

  ngOnInit() {

    if ("WebSocket" in window) {
      const ws = new WebSocket('ws://localhost:8080/connect');

      ws.onopen = () => {
        //console.log("Socket connection established");
      };

      ws.onmessage = (message) => {
        //console.log("New Message received ", message.data);
        const msg = JSON.parse(message.data);
        this.data.push(msg.data);
        this.data = this.data.reverse();
      };

      ws.onclose = () => {
        //console.log("Socket connection closed");
      };
    } else {

      // The browser doesn't support WebSocket
      alert("WebSocket NOT supported by your Browser!");
    }

  }

}
