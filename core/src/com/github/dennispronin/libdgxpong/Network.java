package com.github.dennispronin.libdgxpong;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryonet.EndPoint;

public class Network {

    public static void register(EndPoint endPoint) {
        Kryo kryo = endPoint.getKryo();
    }
}