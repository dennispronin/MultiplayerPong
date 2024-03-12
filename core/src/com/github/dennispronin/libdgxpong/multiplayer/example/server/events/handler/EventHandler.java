package com.github.dennispronin.libdgxpong.multiplayer.example.server.events.handler;

import com.esotericsoftware.kryonet.Connection;
import com.github.dennispronin.libdgxpong.multiplayer.example.server.state.ServerState;

public interface EventHandler {

    void handleEvent(Object event, Connection connection, ServerState serverState);
}