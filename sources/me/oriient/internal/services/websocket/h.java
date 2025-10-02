package me.oriient.internal.services.websocket;

import com.google.android.gms.location.GeofenceStatusCodes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class h implements f {
    public static final /* synthetic */ boolean n = true;
    public final me.oriient.internal.services.websocket.client.c b;
    public final me.oriient.internal.services.websocket.drafts.b e;
    public final me.oriient.internal.services.websocket.enums.e f;
    public boolean c = false;
    public volatile me.oriient.internal.services.websocket.enums.d d = me.oriient.internal.services.websocket.enums.d.NOT_YET_CONNECTED;
    public ByteBuffer g = ByteBuffer.allocate(0);
    public me.oriient.internal.services.websocket.handshake.b h = null;
    public String i = null;
    public Integer j = null;
    public Boolean k = null;
    public long l = System.nanoTime();
    public final Object m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final LinkedBlockingQueue f25675a = new LinkedBlockingQueue();

    public h(me.oriient.internal.services.websocket.client.c cVar, me.oriient.internal.services.websocket.drafts.b bVar) {
        this.e = null;
        new LinkedBlockingQueue();
        this.b = cVar;
        this.f = me.oriient.internal.services.websocket.enums.e.CLIENT;
        ArrayList arrayList = new ArrayList();
        Iterator it = bVar.d.iterator();
        while (it.hasNext()) {
            ((me.oriient.internal.services.websocket.extensions.a) ((me.oriient.internal.services.websocket.extensions.b) it.next())).getClass();
            arrayList.add(new me.oriient.internal.services.websocket.extensions.a());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = bVar.g.iterator();
        while (it2.hasNext()) {
            ((me.oriient.internal.services.websocket.protocols.b) ((me.oriient.internal.services.websocket.protocols.a) it2.next())).getClass();
            arrayList2.add(new me.oriient.internal.services.websocket.protocols.b());
        }
        this.e = new me.oriient.internal.services.websocket.drafts.b(arrayList, arrayList2, bVar.l);
    }

    public final void a(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        boolean z = n;
        if (!z && !byteBuffer.hasRemaining()) {
            throw new AssertionError();
        }
        if (this.d != me.oriient.internal.services.websocket.enums.d.NOT_YET_CONNECTED) {
            if (this.d == me.oriient.internal.services.websocket.enums.d.OPEN) {
                b(byteBuffer);
                return;
            }
            return;
        }
        if (this.g.capacity() == 0) {
            byteBuffer2 = byteBuffer;
        } else {
            if (this.g.remaining() < byteBuffer.remaining()) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining() + this.g.capacity());
                this.g.flip();
                byteBufferAllocate.put(this.g);
                this.g = byteBufferAllocate;
            }
            this.g.put(byteBuffer);
            this.g.flip();
            byteBuffer2 = this.g;
        }
        byteBuffer2.mark();
        try {
            try {
                me.oriient.internal.services.websocket.enums.e eVar = this.f;
                if (eVar == me.oriient.internal.services.websocket.enums.e.SERVER) {
                    me.oriient.internal.services.websocket.drafts.b bVar = this.e;
                    bVar.getClass();
                    me.oriient.internal.services.websocket.handshake.d dVarB = bVar.b(byteBuffer2);
                    if (!(dVarB instanceof me.oriient.internal.services.websocket.handshake.a)) {
                        c(1002, "wrong http function", false);
                        return;
                    }
                    me.oriient.internal.services.websocket.handshake.a aVar = (me.oriient.internal.services.websocket.handshake.a) dVarB;
                    if (this.e.a(aVar) != me.oriient.internal.services.websocket.enums.b.MATCHED) {
                        a(1002, "the handshake did finally not match", false);
                        return;
                    }
                    a(aVar);
                } else {
                    if (eVar != me.oriient.internal.services.websocket.enums.e.CLIENT) {
                        return;
                    }
                    me.oriient.internal.services.websocket.drafts.b bVar2 = this.e;
                    bVar2.f25667a = eVar;
                    me.oriient.internal.services.websocket.handshake.d dVarB2 = bVar2.b(byteBuffer2);
                    if (!(dVarB2 instanceof me.oriient.internal.services.websocket.handshake.f)) {
                        c(1002, "wrong http function", false);
                        return;
                    }
                    me.oriient.internal.services.websocket.handshake.f fVar = (me.oriient.internal.services.websocket.handshake.f) dVarB2;
                    if (this.e.a(this.h, fVar) != me.oriient.internal.services.websocket.enums.b.MATCHED) {
                        a(1002, "draft " + this.e + " refuses handshake", false);
                        return;
                    }
                    try {
                        this.b.getClass();
                        a(fVar);
                    } catch (RuntimeException e) {
                        me.oriient.internal.services.websocket.client.c cVar = this.b;
                        cVar.getClass();
                        ((c) cVar).q.a(e);
                        c(-1, e.getMessage(), false);
                        return;
                    } catch (me.oriient.internal.services.websocket.exceptions.c e2) {
                        c(e2.f25671a, e2.getMessage(), false);
                        return;
                    }
                }
                if (this.d == me.oriient.internal.services.websocket.enums.d.CLOSING || this.d == me.oriient.internal.services.websocket.enums.d.CLOSED) {
                    return;
                }
                if (!z && this.g.hasRemaining() == byteBuffer.hasRemaining() && byteBuffer.hasRemaining()) {
                    throw new AssertionError();
                }
                if (byteBuffer.hasRemaining()) {
                    b(byteBuffer);
                } else if (this.g.hasRemaining()) {
                    b(this.g);
                }
            } catch (me.oriient.internal.services.websocket.exceptions.e e3) {
                a(e3.f25671a, e3.getMessage(), false);
            }
        } catch (me.oriient.internal.services.websocket.exceptions.b e4) {
            if (this.g.capacity() != 0) {
                ByteBuffer byteBuffer3 = this.g;
                byteBuffer3.position(byteBuffer3.limit());
                ByteBuffer byteBuffer4 = this.g;
                byteBuffer4.limit(byteBuffer4.capacity());
                return;
            }
            byteBuffer2.reset();
            int iCapacity = e4.f25670a;
            if (iCapacity == 0) {
                iCapacity = byteBuffer2.capacity() + 16;
            } else if (!n && iCapacity < byteBuffer2.remaining()) {
                throw new AssertionError();
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(iCapacity);
            this.g = byteBufferAllocate2;
            byteBufferAllocate2.put(byteBuffer);
        }
    }

    public final void b(ByteBuffer byteBuffer) {
        try {
            Iterator it = this.e.d(byteBuffer).iterator();
            while (it.hasNext()) {
                this.e.a(this, (me.oriient.internal.services.websocket.framing.f) it.next());
            }
        } catch (LinkageError e) {
            throw e;
        } catch (ThreadDeath e2) {
        } catch (VirtualMachineError e3) {
        } catch (Error e4) {
            Exception exc = new Exception(e4);
            me.oriient.internal.services.websocket.client.c cVar = this.b;
            cVar.getClass();
            ((c) cVar).q.a(exc);
            a(1011, "Got error ".concat(e4.getClass().getName()), false);
        } catch (me.oriient.internal.services.websocket.exceptions.f e5) {
            if (e5.b == Integer.MAX_VALUE) {
                me.oriient.internal.services.websocket.client.c cVar2 = this.b;
                cVar2.getClass();
                ((c) cVar2).q.a(e5);
            }
            a(e5.f25671a, e5.getMessage(), false);
        } catch (me.oriient.internal.services.websocket.exceptions.c e6) {
            me.oriient.internal.services.websocket.client.c cVar3 = this.b;
            cVar3.getClass();
            ((c) cVar3).q.a(e6);
            a(e6.f25671a, e6.getMessage(), false);
        }
    }

    public final synchronized void c(int i, String str, boolean z) {
        if (this.c) {
            return;
        }
        this.j = Integer.valueOf(i);
        this.i = str;
        this.k = Boolean.valueOf(z);
        this.c = true;
        this.b.getClass();
        try {
            this.b.getClass();
        } catch (RuntimeException e) {
            me.oriient.internal.services.websocket.client.c cVar = this.b;
            cVar.getClass();
            ((c) cVar).q.a(e);
        }
        me.oriient.internal.services.websocket.drafts.b bVar = this.e;
        if (bVar != null) {
            bVar.j = null;
            bVar.b = new me.oriient.internal.services.websocket.extensions.a();
            bVar.f = null;
        }
        this.h = null;
    }

    public final synchronized void b(int i, String str, boolean z) {
        if (this.d == me.oriient.internal.services.websocket.enums.d.CLOSED) {
            return;
        }
        if (this.d == me.oriient.internal.services.websocket.enums.d.OPEN && i == 1006) {
            this.d = me.oriient.internal.services.websocket.enums.d.CLOSING;
        }
        try {
            this.b.a(i, str, z);
        } catch (RuntimeException e) {
            me.oriient.internal.services.websocket.client.c cVar = this.b;
            cVar.getClass();
            ((c) cVar).q.a(e);
        }
        me.oriient.internal.services.websocket.drafts.b bVar = this.e;
        if (bVar != null) {
            bVar.j = null;
            bVar.b = new me.oriient.internal.services.websocket.extensions.a();
            bVar.f = null;
        }
        this.h = null;
        this.d = me.oriient.internal.services.websocket.enums.d.CLOSED;
    }

    public final void b(List list) {
        synchronized (this.m) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f25675a.add((ByteBuffer) it.next());
                    this.b.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        return this.d == me.oriient.internal.services.websocket.enums.d.OPEN;
    }

    public final synchronized void a(int i, String str, boolean z) {
        try {
            me.oriient.internal.services.websocket.enums.d dVar = this.d;
            me.oriient.internal.services.websocket.enums.d dVar2 = me.oriient.internal.services.websocket.enums.d.CLOSING;
            if (dVar == dVar2 || this.d == me.oriient.internal.services.websocket.enums.d.CLOSED) {
                return;
            }
            if (this.d == me.oriient.internal.services.websocket.enums.d.OPEN) {
                if (i == 1006) {
                    if (!n && z) {
                        throw new AssertionError();
                    }
                    this.d = dVar2;
                    c(i, str, false);
                    return;
                }
                this.e.getClass();
                if (me.oriient.internal.services.websocket.enums.a.TWOWAY != me.oriient.internal.services.websocket.enums.a.NONE) {
                    if (!z) {
                        try {
                            try {
                                this.b.getClass();
                            } catch (me.oriient.internal.services.websocket.exceptions.c e) {
                                me.oriient.internal.services.websocket.client.c cVar = this.b;
                                cVar.getClass();
                                ((c) cVar).q.a(e);
                                c(1006, "generated frame is invalid", false);
                            }
                        } catch (RuntimeException e2) {
                            me.oriient.internal.services.websocket.client.c cVar2 = this.b;
                            cVar2.getClass();
                            ((c) cVar2).q.a(e2);
                        }
                    }
                    if (b()) {
                        me.oriient.internal.services.websocket.framing.b bVar = new me.oriient.internal.services.websocket.framing.b();
                        String str2 = str == null ? "" : str;
                        bVar.i = str2;
                        byte[] bArrB = me.oriient.internal.services.websocket.util.b.b(str2);
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                        byteBufferAllocate.putInt(bVar.h);
                        byteBufferAllocate.position(2);
                        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArrB.length + 2);
                        byteBufferAllocate2.put(byteBufferAllocate);
                        byteBufferAllocate2.put(bArrB);
                        byteBufferAllocate2.rewind();
                        bVar.c = byteBufferAllocate2;
                        bVar.h = i;
                        if (i == 1015) {
                            bVar.h = GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT;
                            bVar.i = "";
                        }
                        byte[] bArrB2 = me.oriient.internal.services.websocket.util.b.b(bVar.i);
                        ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(4);
                        byteBufferAllocate3.putInt(bVar.h);
                        byteBufferAllocate3.position(2);
                        ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(bArrB2.length + 2);
                        byteBufferAllocate4.put(byteBufferAllocate3);
                        byteBufferAllocate4.put(bArrB2);
                        byteBufferAllocate4.rewind();
                        bVar.c = byteBufferAllocate4;
                        bVar.b();
                        a(Collections.singletonList(bVar));
                    }
                }
                c(i, str, z);
            } else if (i == -3) {
                if (!n && !z) {
                    throw new AssertionError();
                }
                c(-3, str, true);
            } else if (i == 1002) {
                c(i, str, z);
            } else {
                c(-1, str, false);
            }
            this.d = me.oriient.internal.services.websocket.enums.d.CLOSING;
            this.g = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a() {
        if (this.d == me.oriient.internal.services.websocket.enums.d.NOT_YET_CONNECTED) {
            b(-1, "", true);
            return;
        }
        if (this.c) {
            b(this.j.intValue(), this.i, this.k.booleanValue());
            return;
        }
        this.e.getClass();
        me.oriient.internal.services.websocket.enums.a aVar = me.oriient.internal.services.websocket.enums.a.TWOWAY;
        if (aVar == me.oriient.internal.services.websocket.enums.a.NONE) {
            b(1000, "", true);
            return;
        }
        this.e.getClass();
        if (aVar == me.oriient.internal.services.websocket.enums.a.ONEWAY) {
            if (this.f == me.oriient.internal.services.websocket.enums.e.SERVER) {
                b(1006, "", true);
                return;
            } else {
                b(1000, "", true);
                return;
            }
        }
        b(1006, "", true);
    }

    public final void a(List list) {
        int i;
        byte b;
        if (!b()) {
            throw new me.oriient.internal.services.websocket.exceptions.h();
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                me.oriient.internal.services.websocket.framing.f fVar = (me.oriient.internal.services.websocket.framing.f) it.next();
                me.oriient.internal.services.websocket.drafts.b bVar = this.e;
                me.oriient.internal.services.websocket.extensions.b bVar2 = bVar.b;
                ByteBuffer byteBufferA = fVar.a();
                boolean z = bVar.f25667a == me.oriient.internal.services.websocket.enums.e.CLIENT;
                if (byteBufferA.remaining() <= 125) {
                    i = 1;
                } else {
                    i = byteBufferA.remaining() <= 65535 ? 2 : 8;
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferA.remaining() + (i > 1 ? i + 1 : i) + 1 + (z ? 4 : 0));
                me.oriient.internal.services.websocket.framing.h hVar = (me.oriient.internal.services.websocket.framing.h) fVar;
                me.oriient.internal.services.websocket.enums.c cVar = hVar.b;
                if (cVar == me.oriient.internal.services.websocket.enums.c.CONTINUOUS) {
                    b = 0;
                } else if (cVar == me.oriient.internal.services.websocket.enums.c.TEXT) {
                    b = 1;
                } else if (cVar == me.oriient.internal.services.websocket.enums.c.BINARY) {
                    b = 2;
                } else if (cVar == me.oriient.internal.services.websocket.enums.c.CLOSING) {
                    b = 8;
                } else if (cVar == me.oriient.internal.services.websocket.enums.c.PING) {
                    b = 9;
                } else {
                    if (cVar != me.oriient.internal.services.websocket.enums.c.PONG) {
                        throw new IllegalArgumentException("Don't know how to handle " + cVar.toString());
                    }
                    b = 10;
                }
                byte b2 = (byte) (b | ((byte) (hVar.f25673a ? -128 : 0)));
                if (hVar.e) {
                    b2 = (byte) (b2 | 64);
                }
                if (hVar.f) {
                    b2 = (byte) (b2 | 32);
                }
                if (hVar.g) {
                    b2 = (byte) (b2 | 16);
                }
                byteBufferAllocate.put(b2);
                long jRemaining = byteBufferA.remaining();
                byte[] bArr = new byte[i];
                int i2 = (i * 8) - 8;
                int i3 = 0;
                while (i3 < i) {
                    bArr[i3] = (byte) (r20 >>> (i2 - (i3 * 8)));
                    i3++;
                    jRemaining = jRemaining;
                }
                if (i == 1) {
                    byteBufferAllocate.put((byte) (bArr[0] | (z ? (byte) -128 : (byte) 0)));
                } else if (i == 2) {
                    byteBufferAllocate.put((byte) ((z ? (byte) -128 : (byte) 0) | 126));
                    byteBufferAllocate.put(bArr);
                } else if (i == 8) {
                    byteBufferAllocate.put((byte) ((z ? (byte) -128 : (byte) 0) | 127));
                    byteBufferAllocate.put(bArr);
                } else {
                    throw new IllegalStateException("Size representation not supported/specified");
                }
                if (z) {
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                    byteBufferAllocate2.putInt(bVar.k.nextInt());
                    byteBufferAllocate.put(byteBufferAllocate2.array());
                    int i4 = 0;
                    while (byteBufferA.hasRemaining()) {
                        byteBufferAllocate.put((byte) (byteBufferA.get() ^ byteBufferAllocate2.get(i4 % 4)));
                        i4++;
                    }
                } else {
                    byteBufferAllocate.put(byteBufferA);
                    byteBufferA.flip();
                }
                if (!me.oriient.internal.services.websocket.drafts.b.m && byteBufferAllocate.remaining() != 0) {
                    throw new AssertionError(byteBufferAllocate.remaining());
                }
                byteBufferAllocate.flip();
                arrayList.add(byteBufferAllocate);
            }
            b(arrayList);
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void a(me.oriient.internal.services.websocket.handshake.d dVar) {
        this.d = me.oriient.internal.services.websocket.enums.d.OPEN;
        this.l = System.nanoTime();
        try {
            me.oriient.internal.services.websocket.client.c cVar = this.b;
            synchronized (cVar.f) {
                try {
                    if (cVar.d > 0) {
                        cVar.e = true;
                        ScheduledExecutorService scheduledExecutorService = cVar.b;
                        if (scheduledExecutorService != null) {
                            scheduledExecutorService.shutdownNow();
                            cVar.b = null;
                        }
                        ScheduledFuture scheduledFuture = cVar.c;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                            cVar.c = null;
                        }
                        cVar.b = Executors.newSingleThreadScheduledExecutor(new me.oriient.internal.services.websocket.util.d());
                        a aVar = new a(cVar);
                        ScheduledExecutorService scheduledExecutorService2 = cVar.b;
                        long j = cVar.d;
                        cVar.c = scheduledExecutorService2.scheduleAtFixedRate(aVar, j, j, TimeUnit.NANOSECONDS);
                    }
                } finally {
                }
            }
            cVar.a((me.oriient.internal.services.websocket.handshake.f) dVar);
            cVar.n.countDown();
        } catch (RuntimeException e) {
            me.oriient.internal.services.websocket.client.c cVar2 = this.b;
            cVar2.getClass();
            ((c) cVar2).q.a(e);
        }
    }
}
