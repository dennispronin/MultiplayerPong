package com.github.dennispronin.libdgxpong.multiplayer.server.event.handler;

import com.esotericsoftware.kryonet.Connection;
import com.github.dennispronin.libdgxpong.multiplayer.server.state.ServerState;

public interface EventHandler {

    void handleEvent(Object event, Connection connection, ServerState serverState);
}