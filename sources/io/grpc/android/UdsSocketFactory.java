package io.grpc.android;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.SocketFactory;

/* loaded from: classes7.dex */
class UdsSocketFactory extends SocketFactory {
    public static Socket a() throws IOException {
        UdsSocket udsSocket = new UdsSocket();
        udsSocket.connect(new InetSocketAddress(0));
        return udsSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        return a();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return a();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        return a();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return a();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        return new UdsSocket();
    }
}
