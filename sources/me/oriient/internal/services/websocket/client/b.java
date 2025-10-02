package me.oriient.internal.services.websocket.client;

import java.io.IOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.Iterator;
import javax.net.ssl.SSLException;

/* loaded from: classes7.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f25666a;

    public b(c cVar, c cVar2) {
        this.f25666a = cVar;
    }

    public final void a() throws IOException {
        try {
            Socket socket = this.f25666a.i;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            c cVar = this.f25666a;
            cVar.getClass();
            ((me.oriient.internal.services.websocket.c) cVar).q.a(e);
        }
    }

    public final void b() throws IOException {
        while (!Thread.interrupted()) {
            try {
                ByteBuffer byteBuffer = (ByteBuffer) this.f25666a.h.f25675a.take();
                this.f25666a.j.write(byteBuffer.array(), 0, byteBuffer.limit());
                this.f25666a.j.flush();
            } catch (InterruptedException unused) {
                Iterator it = this.f25666a.h.f25675a.iterator();
                while (it.hasNext()) {
                    ByteBuffer byteBuffer2 = (ByteBuffer) it.next();
                    this.f25666a.j.write(byteBuffer2.array(), 0, byteBuffer2.limit());
                    this.f25666a.j.flush();
                }
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        Thread.currentThread().setName("WebSocketWriteThread-" + Thread.currentThread().getId());
        try {
            b();
        } catch (IOException e) {
            c cVar = this.f25666a;
            cVar.getClass();
            if (e instanceof SSLException) {
                ((me.oriient.internal.services.websocket.c) cVar).q.a(e);
            }
            cVar.h.a();
        } finally {
            a();
            this.f25666a.l = null;
        }
    }
}
