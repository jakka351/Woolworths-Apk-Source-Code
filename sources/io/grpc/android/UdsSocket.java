package io.grpc.android;

import android.net.LocalSocket;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;

/* loaded from: classes7.dex */
class UdsSocket extends Socket {
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public final LocalSocket d = new LocalSocket();

    /* renamed from: io.grpc.android.UdsSocket$2, reason: invalid class name */
    class AnonymousClass2 extends SocketAddress {
    }

    /* renamed from: io.grpc.android.UdsSocket$4, reason: invalid class name */
    class AnonymousClass4 extends SocketAddress {
    }

    public static SocketException a(IOException iOException) {
        SocketException socketException = new SocketException();
        socketException.initCause(iOException);
        return socketException;
    }

    @Override // java.net.Socket
    public final void bind(SocketAddress socketAddress) {
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.e) {
                return;
            }
            if (!this.f) {
                shutdownInput();
            }
            if (!this.g) {
                shutdownOutput();
            }
            this.d.close();
            this.e = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.net.Socket
    public final void connect(SocketAddress socketAddress) throws IOException {
        this.d.connect(null);
    }

    @Override // java.net.Socket
    public final SocketChannel getChannel() {
        throw new UnsupportedOperationException("getChannel() not supported");
    }

    @Override // java.net.Socket
    public final InetAddress getInetAddress() {
        throw new UnsupportedOperationException("getInetAddress() not supported");
    }

    @Override // java.net.Socket
    public final InputStream getInputStream() {
        return new FilterInputStream(this.d.getInputStream()) { // from class: io.grpc.android.UdsSocket.1
            @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                UdsSocket.this.close();
            }
        };
    }

    @Override // java.net.Socket
    public final boolean getKeepAlive() {
        throw new UnsupportedOperationException("Unsupported operation getKeepAlive()");
    }

    @Override // java.net.Socket
    public final InetAddress getLocalAddress() {
        throw new UnsupportedOperationException("Unsupported operation getLocalAddress()");
    }

    @Override // java.net.Socket
    public final int getLocalPort() {
        throw new UnsupportedOperationException("Unsupported operation getLocalPort()");
    }

    @Override // java.net.Socket
    public final SocketAddress getLocalSocketAddress() {
        return new AnonymousClass2();
    }

    @Override // java.net.Socket
    public final boolean getOOBInline() {
        throw new UnsupportedOperationException("Unsupported operation getOOBInline()");
    }

    @Override // java.net.Socket
    public final OutputStream getOutputStream() {
        return new FilterOutputStream(this.d.getOutputStream()) { // from class: io.grpc.android.UdsSocket.3
            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                UdsSocket.this.close();
            }
        };
    }

    @Override // java.net.Socket
    public final int getPort() {
        throw new UnsupportedOperationException("Unsupported operation getPort()");
    }

    @Override // java.net.Socket
    public final int getReceiveBufferSize() throws SocketException {
        try {
            return this.d.getReceiveBufferSize();
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override // java.net.Socket
    public final SocketAddress getRemoteSocketAddress() {
        return new AnonymousClass4();
    }

    @Override // java.net.Socket
    public final boolean getReuseAddress() {
        throw new UnsupportedOperationException("Unsupported operation getReuseAddress()");
    }

    @Override // java.net.Socket
    public final int getSendBufferSize() throws SocketException {
        try {
            return this.d.getSendBufferSize();
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override // java.net.Socket
    public final int getSoLinger() {
        return -1;
    }

    @Override // java.net.Socket
    public final int getSoTimeout() throws SocketException {
        try {
            return this.d.getSoTimeout();
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override // java.net.Socket
    public final boolean getTcpNoDelay() {
        return true;
    }

    @Override // java.net.Socket
    public final int getTrafficClass() {
        throw new UnsupportedOperationException("Unsupported operation getTrafficClass()");
    }

    @Override // java.net.Socket
    public final boolean isBound() {
        return this.d.isBound();
    }

    @Override // java.net.Socket
    public final synchronized boolean isClosed() {
        return this.e;
    }

    @Override // java.net.Socket
    public final boolean isConnected() {
        return this.d.isConnected();
    }

    @Override // java.net.Socket
    public final synchronized boolean isInputShutdown() {
        return this.f;
    }

    @Override // java.net.Socket
    public final synchronized boolean isOutputShutdown() {
        return this.g;
    }

    @Override // java.net.Socket
    public final void sendUrgentData(int i) {
        throw new UnsupportedOperationException("Unsupported operation sendUrgentData()");
    }

    @Override // java.net.Socket
    public final void setKeepAlive(boolean z) {
        throw new UnsupportedOperationException("Unsupported operation setKeepAlive()");
    }

    @Override // java.net.Socket
    public final void setOOBInline(boolean z) {
        throw new UnsupportedOperationException("Unsupported operation setOOBInline()");
    }

    @Override // java.net.Socket
    public final void setPerformancePreferences(int i, int i2, int i3) {
        throw new UnsupportedOperationException("Unsupported operation setPerformancePreferences()");
    }

    @Override // java.net.Socket
    public final void setReceiveBufferSize(int i) throws IOException {
        try {
            this.d.setReceiveBufferSize(i);
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override // java.net.Socket
    public final void setReuseAddress(boolean z) {
        throw new UnsupportedOperationException("Unsupported operation setReuseAddress()");
    }

    @Override // java.net.Socket
    public final void setSendBufferSize(int i) throws IOException {
        try {
            this.d.setSendBufferSize(i);
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override // java.net.Socket
    public final void setSoLinger(boolean z, int i) {
        throw new UnsupportedOperationException("Unsupported operation setSoLinger()");
    }

    @Override // java.net.Socket
    public final void setSoTimeout(int i) throws IOException {
        try {
            this.d.setSoTimeout(i);
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override // java.net.Socket
    public final void setTcpNoDelay(boolean z) {
    }

    @Override // java.net.Socket
    public final void setTrafficClass(int i) {
        throw new UnsupportedOperationException("Unsupported operation setTrafficClass()");
    }

    @Override // java.net.Socket
    public final synchronized void shutdownInput() {
        this.d.shutdownInput();
        this.f = true;
    }

    @Override // java.net.Socket
    public final synchronized void shutdownOutput() {
        this.d.shutdownOutput();
        this.g = true;
    }

    @Override // java.net.Socket
    public final void connect(SocketAddress socketAddress, int i) throws IOException {
        this.d.connect(null, i);
    }
}
