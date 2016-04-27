# About

This lab is about implementing a tiny chat server using [Tyrus](https://tyrus.java.net/), the reference implementation of the Java API for WebSocket (JSR 356).

The goal is to provide a simple chat application called "Tiny Chat" with a server and CLI clients.

Original post: [Using the Java API for WebSocket to create a chat server](http://benas.github.io/2016/02/21/using-the-java-api-for-webSocket-to-create-a-chat-server.html)

## Build from source

```bash
$> git clone https://github.com/benas/web-socket-lab.git
$> cd web-socket-lab
$> mvn package
```

## Start the server

Open a terminal and run the following command in the `target` directory:

```bash
$> java -cp "web-socket-lab-1.0-SNAPSHOT.jar:lib/*" io.github.benas.websocket.server.Server
```

_If you are on Windows, make sure to change the classpath separator to ; instead of :_

## Launch a first client

Open a second terminal and run the following command in the `target` directory:

```bash
$> java -cp "web-socket-lab-1.0-SNAPSHOT.jar:lib/*" io.github.benas.websocket.client.Client
```

_If you are on Windows, make sure to change the classpath separator to ; instead of :_

## Launch a second client in a separate terminal and start chatting :smile:

# Example

### Server

```
INFO: Provider class loaded: org.glassfish.tyrus.container.grizzly.GrizzlyEngine
INFO: Started listener bound to [0.0.0.0:8025]
INFO: [HttpServer] Started.
INFO: WebSocket Registered apps: URLs all start with ws://localhost:8025
INFO: WebSocket server started.
Please press a key to stop the server.
INFO: 7718a10e-d965-48ce-a324-44996322d469 joined the chat room.
INFO: 1c721ade-74e6-4de2-8d26-53e74a126cb8 joined the chat room.
INFO: [7718a10e-d965-48ce-a324-44996322d469:Wed Oct 15 22:07:04 CEST 2014] hi there!
INFO: [1c721ade-74e6-4de2-8d26-53e74a126cb8:Wed Oct 15 22:07:25 CEST 2014] fine?
INFO: [7718a10e-d965-48ce-a324-44996322d469:Wed Oct 15 22:07:33 CEST 2014] yeah!
INFO: 1c721ade-74e6-4de2-8d26-53e74a126cb8 left the chat room.
INFO: 7718a10e-d965-48ce-a324-44996322d469 left the chat room.

INFO: Stopped listener bound to [0.0.0.0:8025]
INFO: Websocket Server stopped.
```

### Client 1

```
Welcome to Tiny Chat!
What' your name?
benas
Connection established. session id: 79b967e0-3dc0-40dd-b380-71af2d7adfe3
You are logged in as benas
[benas] hi there!
[10/15/14 10:07 PM:tom] fine?
[benas] yeah!
[10/15/14 10:07 PM:Server] tom left the chat room.
[benas] quit
```

### Client 2

```
Welcome to Tiny Chat!
What' your name?
tom
Connection established. session id: 8824899f-5b6f-4d58-8054-c896e414ceef
You are logged in as tom
[10/15/14 10:07 PM:benas] hi there!
[tom] fine?
[10/15/14 10:07 PM:benas] yeah!
quit
```
