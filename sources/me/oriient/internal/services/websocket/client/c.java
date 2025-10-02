package me.oriient.internal.services.websocket.client;

import com.medallia.digital.mobilesdk.q2;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlinx.coroutines.BuildersKt;
import me.oriient.internal.services.eventManager.n;
import me.oriient.internal.services.eventManager.w;
import me.oriient.internal.services.websocket.enums.d;
import me.oriient.internal.services.websocket.enums.e;
import me.oriient.internal.services.websocket.exceptions.g;
import me.oriient.internal.services.websocket.f;
import me.oriient.internal.services.websocket.framing.k;
import me.oriient.internal.services.websocket.h;

/* loaded from: classes7.dex */
public abstract class c extends me.oriient.internal.services.websocket.b implements Runnable, f {
    public final URI g;
    public final h h;
    public Socket i;
    public OutputStream j;
    public final Proxy k;
    public Thread l;
    public Thread m;
    public final CountDownLatch n;
    public final CountDownLatch o;
    public final a p;

    public c(URI uri) {
        me.oriient.internal.services.websocket.drafts.b bVar = new me.oriient.internal.services.websocket.drafts.b(Collections.EMPTY_LIST, Collections.singletonList(new me.oriient.internal.services.websocket.protocols.b()), Integer.MAX_VALUE);
        this.g = null;
        this.h = null;
        this.i = null;
        this.k = Proxy.NO_PROXY;
        this.n = new CountDownLatch(1);
        this.o = new CountDownLatch(1);
        this.p = null;
        if (uri == null) {
            throw new IllegalArgumentException();
        }
        this.g = uri;
        this.p = new a();
        this.h = new h(this, bVar);
    }

    public final void a(int i, String str, boolean z) {
        synchronized (this.f) {
            try {
                ScheduledExecutorService scheduledExecutorService = this.b;
                if (scheduledExecutorService != null || this.c != null) {
                    this.e = false;
                    if (scheduledExecutorService != null) {
                        scheduledExecutorService.shutdownNow();
                        this.b = null;
                    }
                    ScheduledFuture scheduledFuture = this.c;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.c = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Thread thread = this.l;
        if (thread != null) {
            thread.interrupt();
        }
        ((me.oriient.internal.services.websocket.c) this).q.a(i, str, z);
        this.n.countDown();
        this.o.countDown();
    }

    public abstract void a(me.oriient.internal.services.websocket.handshake.f fVar);

    public final void b(String str) {
        h hVar = this.h;
        if (str == null) {
            hVar.getClass();
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        me.oriient.internal.services.websocket.drafts.b bVar = hVar.e;
        boolean z = hVar.f == e.CLIENT;
        bVar.getClass();
        k kVar = new k();
        kVar.c = ByteBuffer.wrap(me.oriient.internal.services.websocket.util.b.b(str));
        kVar.d = z;
        try {
            kVar.b();
            hVar.a(Collections.singletonList(kVar));
        } catch (me.oriient.internal.services.websocket.exceptions.c e) {
            throw new g(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() throws me.oriient.internal.services.websocket.exceptions.e {
        String rawPath = this.g.getRawPath();
        String rawQuery = this.g.getRawQuery();
        if (rawPath == null || rawPath.length() == 0) {
            rawPath = q2.c;
        }
        if (rawQuery != null) {
            rawPath = rawPath + '?' + rawQuery;
        }
        int iA = a();
        StringBuilder sb = new StringBuilder();
        sb.append(this.g.getHost());
        sb.append((iA == 80 || iA == 443) ? "" : YU.a.d(iA, ":"));
        String string = sb.toString();
        me.oriient.internal.services.websocket.handshake.b bVar = new me.oriient.internal.services.websocket.handshake.b();
        if (rawPath == null) {
            throw new IllegalArgumentException("http resource descriptor must not be null");
        }
        bVar.b = rawPath;
        bVar.f25676a.put("Host", string);
        h hVar = this.h;
        me.oriient.internal.services.websocket.drafts.b bVar2 = hVar.e;
        bVar2.getClass();
        bVar.f25676a.put("Upgrade", "websocket");
        bVar.f25676a.put("Connection", "Upgrade");
        byte[] bArr = new byte[16];
        bVar2.k.nextBytes(bArr);
        bVar.f25676a.put("Sec-WebSocket-Key", me.oriient.internal.services.websocket.util.a.a(bArr));
        bVar.f25676a.put("Sec-WebSocket-Version", "13");
        StringBuilder sb2 = new StringBuilder();
        Iterator it = bVar2.d.iterator();
        while (it.hasNext()) {
            ((me.oriient.internal.services.websocket.extensions.b) it.next()).getClass();
        }
        if (sb2.length() != 0) {
            bVar.f25676a.put("Sec-WebSocket-Extensions", sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        Iterator it2 = bVar2.g.iterator();
        while (it2.hasNext()) {
            ((me.oriient.internal.services.websocket.protocols.b) ((me.oriient.internal.services.websocket.protocols.a) it2.next())).getClass();
        }
        if (sb3.length() != 0) {
            bVar.f25676a.put("Sec-WebSocket-Protocol", sb3.toString());
        }
        hVar.h = bVar;
        String str = bVar.b;
        if (!h.n && str == null) {
            throw new AssertionError();
        }
        try {
            hVar.b.getClass();
            me.oriient.internal.services.websocket.drafts.b bVar3 = hVar.e;
            me.oriient.internal.services.websocket.handshake.b bVar4 = hVar.h;
            bVar3.getClass();
            StringBuilder sb4 = new StringBuilder(100);
            if (bVar4 != 0) {
                sb4.append("GET ");
                sb4.append(bVar4.b);
                sb4.append(" HTTP/1.1");
            } else {
                if (!(bVar4 instanceof me.oriient.internal.services.websocket.handshake.f)) {
                    throw new IllegalArgumentException("unknown role");
                }
                sb4.append("HTTP/1.1 101 ");
                sb4.append(((me.oriient.internal.services.websocket.handshake.c) ((me.oriient.internal.services.websocket.handshake.f) bVar4)).c);
            }
            sb4.append("\r\n");
            for (String str2 : Collections.unmodifiableSet(bVar4.f25676a.keySet())) {
                String strA = bVar4.a(str2);
                sb4.append(str2);
                sb4.append(": ");
                sb4.append(strA);
                sb4.append("\r\n");
            }
            sb4.append("\r\n");
            byte[] bArrA = me.oriient.internal.services.websocket.util.b.a(sb4.toString());
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrA.length);
            byteBufferAllocate.put(bArrA);
            byteBufferAllocate.flip();
            hVar.b(Collections.singletonList(byteBufferAllocate));
        } catch (RuntimeException e) {
            c cVar = hVar.b;
            cVar.getClass();
            ((me.oriient.internal.services.websocket.c) cVar).q.a(e);
            throw new me.oriient.internal.services.websocket.exceptions.e("rejected because of " + e);
        } catch (me.oriient.internal.services.websocket.exceptions.c unused) {
            throw new me.oriient.internal.services.websocket.exceptions.e("Handshake data rejected by client.");
        }
    }

    public final void d() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
        sSLContext.init(null, null, null);
        this.i = sSLContext.getSocketFactory().createSocket(this.i, this.g.getHost(), a(), true);
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        int i;
        InetSocketAddress inetSocketAddress;
        try {
            boolean zB = b();
            this.i.setTcpNoDelay(false);
            this.i.setReuseAddress(false);
            if (!this.i.isConnected()) {
                if (this.p == null) {
                    inetSocketAddress = InetSocketAddress.createUnresolved(this.g.getHost(), a());
                } else {
                    a aVar = this.p;
                    URI uri = this.g;
                    aVar.getClass();
                    inetSocketAddress = new InetSocketAddress(InetAddress.getByName(uri.getHost()), a());
                }
                this.i.connect(inetSocketAddress, 0);
            }
            if (zB && "wss".equals(this.g.getScheme())) {
                d();
            }
            Socket socket = this.i;
            if (socket instanceof SSLSocket) {
                SSLSocket sSLSocket = (SSLSocket) socket;
                SSLParameters sSLParameters = sSLSocket.getSSLParameters();
                sSLParameters.setEndpointIdentificationAlgorithm("HTTPS");
                sSLSocket.setSSLParameters(sSLParameters);
            }
            InputStream inputStream = this.i.getInputStream();
            this.j = this.i.getOutputStream();
            c();
            Thread thread = new Thread(new b(this, this));
            this.l = thread;
            thread.start();
            byte[] bArr = new byte[16384];
            while (this.h.d != d.CLOSING && this.h.d != d.CLOSED && (i = inputStream.read(bArr)) != -1) {
                try {
                    this.h.a(ByteBuffer.wrap(bArr, 0, i));
                } catch (IOException e) {
                    if (e instanceof SSLException) {
                        ((me.oriient.internal.services.websocket.c) this).q.a(e);
                    }
                    this.h.a();
                } catch (RuntimeException e2) {
                    ((me.oriient.internal.services.websocket.c) this).q.a(e2);
                    this.h.b(1006, e2.getMessage(), false);
                }
            }
            this.h.a();
            this.m = null;
        } catch (Exception e3) {
            ((me.oriient.internal.services.websocket.c) this).q.a(e3);
            this.h.b(-1, e3.getMessage(), false);
        } catch (InternalError e4) {
            if (!(e4.getCause() instanceof InvocationTargetException) || !(e4.getCause().getCause() instanceof IOException)) {
                throw e4;
            }
            IOException iOException = (IOException) e4.getCause().getCause();
            ((me.oriient.internal.services.websocket.c) this).q.a(iOException);
            this.h.b(-1, iOException.getMessage(), false);
        }
    }

    public final boolean b() throws IOException {
        if (this.k != Proxy.NO_PROXY) {
            this.i = new Socket(this.k);
            return true;
        }
        Socket socket = this.i;
        if (socket == null) {
            this.i = new Socket(this.k);
            return true;
        }
        if (socket.isClosed()) {
            throw new IOException();
        }
        return false;
    }

    public final int a() {
        int port = this.g.getPort();
        String scheme = this.g.getScheme();
        if ("wss".equals(scheme)) {
            if (port == -1) {
                return 443;
            }
            return port;
        }
        if (!"ws".equals(scheme)) {
            throw new IllegalArgumentException(YU.a.A("unknown scheme: ", scheme));
        }
        if (port == -1) {
            return 80;
        }
        return port;
    }

    public final void a(String str) {
        me.oriient.internal.services.websocket.e eVar = ((me.oriient.internal.services.websocket.c) this).q;
        if (str != null) {
            eVar.d.incoming(String.valueOf(eVar.hashCode()), str);
            me.oriient.internal.services.websocket.d dVar = eVar.c;
            if (dVar != null) {
                w wVar = (w) dVar;
                BuildersKt.c(wVar.j, null, null, new n(wVar, str, null), 3);
                return;
            }
            return;
        }
        eVar.f.e(eVar.e, "got null message from server");
    }
}
