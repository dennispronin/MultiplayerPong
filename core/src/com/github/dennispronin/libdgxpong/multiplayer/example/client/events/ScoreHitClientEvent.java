package com.github.dennispronin.libdgxpong.multiplayer.example.client.events;

import com.github.dennispronin.libdgxpong.multiplayer.example.client.PlayerSide;

public class ScoreHitClientEvent {

    private PlayerSide playerSide;
    private String sessionId;

    public ScoreHitClientEvent() {
    }

    public ScoreHitClientEvent(PlayerSide playerSide, String sessionId) {
        this.playerSide = playerSide;
        this.sessionId = sessionId;
    }

    public PlayerSide getPlayerSide() {
        return playerSide;
    }

    public String getSessionId() {
        return sessionId;
    }
}