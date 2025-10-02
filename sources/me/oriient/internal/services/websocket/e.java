package me.oriient.internal.services.websocket;

import java.net.SocketException;
import java.net.URI;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.BuildersKt;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.eventManager.l;
import me.oriient.internal.services.eventManager.o;
import me.oriient.internal.services.eventManager.w;
import me.oriient.internal.services.websocket.util.ELogIOManager;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final c f25668a;
    public final URI b;
    public d c;
    public final ELogIOManager d;
    public final String e;
    public final ELog f;
    public final Logger g;

    public e(ELogIOManager eLogIOManager, URI uri, ELog eLog, Logger logger) {
        this.d = eLogIOManager;
        c cVar = new c(uri, this, eLog);
        this.f25668a = cVar;
        synchronized (cVar.f) {
            try {
                long nanos = TimeUnit.SECONDS.toNanos(60);
                cVar.d = nanos;
                if (nanos <= 0) {
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
                } else if (cVar.e) {
                    try {
                        Iterator it = new ArrayList(Collections.singletonList(cVar.h)).iterator();
                        while (it.hasNext()) {
                            f fVar = (f) it.next();
                            if (fVar instanceof h) {
                                ((h) fVar).l = System.nanoTime();
                            }
                        }
                    } catch (Exception unused) {
                    }
                    ScheduledExecutorService scheduledExecutorService2 = cVar.b;
                    if (scheduledExecutorService2 != null) {
                        scheduledExecutorService2.shutdownNow();
                        cVar.b = null;
                    }
                    ScheduledFuture scheduledFuture2 = cVar.c;
                    if (scheduledFuture2 != null) {
                        scheduledFuture2.cancel(false);
                        cVar.c = null;
                    }
                    cVar.b = Executors.newSingleThreadScheduledExecutor(new me.oriient.internal.services.websocket.util.d());
                    a aVar = new a(cVar);
                    ScheduledExecutorService scheduledExecutorService3 = cVar.b;
                    long j = cVar.d;
                    cVar.c = scheduledExecutorService3.scheduleAtFixedRate(aVar, j, j, TimeUnit.NANOSECONDS);
                }
            } finally {
            }
        }
        this.b = uri;
        this.f = eLog;
        this.g = logger;
        String str = "e(" + this.f25668a.hashCode() + ")";
        this.e = str;
        String str2 = "SocketWrapper() called with: eLogIOManager = [" + eLogIOManager + "], serverUrl = [" + uri + "]";
        if (logger != null) {
            logger.d(str, str2);
        }
    }

    public final void a() {
        this.f.d(this.e, "connect() called");
        int i = 0;
        if (this.f25668a.h.d == me.oriient.internal.services.websocket.enums.d.CLOSED) {
            ELog eLog = this.f;
            String str = this.e;
            Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("socket", Integer.valueOf(this.f25668a.hashCode())), new AbstractMap.SimpleEntry("uri", this.b)};
            HashMap map = new HashMap(2);
            while (i < 2) {
                Map.Entry entry = entryArr[i];
                Object key = entry.getKey();
                if (kotlin.reflect.jvm.internal.impl.types.checker.a.d(key, entry, map, key) != null) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(key, "duplicate key: "));
                }
                i++;
            }
            eLog.d(str, "cannot reuse socket", Collections.unmodifiableMap(map));
            d dVar = this.c;
            if (dVar != null) {
                ((w) dVar).a(new SocketException("cannot reuse socket"));
                return;
            }
            return;
        }
        if (this.f25668a.h.b()) {
            this.f.d(this.e, "connect: socket already open");
            d dVar2 = this.c;
            if (dVar2 != null) {
                w wVar = (w) dVar2;
                BuildersKt.c(wVar.j, null, null, new o(wVar, this, null), 3);
                return;
            }
            return;
        }
        this.f25668a.getClass();
        if (this.f25668a.h.d == me.oriient.internal.services.websocket.enums.d.CLOSING) {
            this.f.d(this.e, "connect: socket is in disconnecting process");
            d dVar3 = this.c;
            if (dVar3 != null) {
                ((w) dVar3).a(new SocketException("socket is disconnecting"));
                return;
            }
            return;
        }
        ELog eLog2 = this.f;
        String str2 = this.e;
        Map.Entry[] entryArr2 = {new AbstractMap.SimpleEntry("socket", Integer.valueOf(this.f25668a.hashCode())), new AbstractMap.SimpleEntry("uri", this.b)};
        HashMap map2 = new HashMap(2);
        while (i < 2) {
            Map.Entry entry2 = entryArr2[i];
            Object key2 = entry2.getKey();
            if (kotlin.reflect.jvm.internal.impl.types.checker.a.d(key2, entry2, map2, key2) != null) {
                throw new IllegalArgumentException(androidx.camera.core.impl.b.m(key2, "duplicate key: "));
            }
            i++;
        }
        eLog2.d(str2, "connecting socket", Collections.unmodifiableMap(map2));
        c cVar = this.f25668a;
        if (cVar.m != null) {
            throw new IllegalStateException("WebSocketClient objects are not reuseable");
        }
        Thread thread = new Thread(cVar);
        cVar.m = thread;
        thread.setName("WebSocketConnectReadThread-" + cVar.m.getId());
        cVar.m.start();
    }

    public final void b() {
        this.f.d(this.e, "disconnect() called");
        if (!this.f25668a.h.b()) {
            if (this.f25668a.h.d != me.oriient.internal.services.websocket.enums.d.CLOSED) {
                this.f.d(this.e, "disconnect: socket is busy");
                d dVar = this.c;
                if (dVar != null) {
                    ((w) dVar).a(new SocketException("socket is busy"));
                    return;
                }
                return;
            }
            this.f.d(this.e, "disconnect: socket already closed");
            d dVar2 = this.c;
            if (dVar2 != null) {
                w wVar = (w) dVar2;
                BuildersKt.c(wVar.j, null, null, new l(wVar, null), 3);
                return;
            }
            return;
        }
        ELog eLog = this.f;
        String str = this.e;
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("socket", Integer.valueOf(this.f25668a.hashCode())), new AbstractMap.SimpleEntry("uri", this.b)};
        HashMap map = new HashMap(2);
        for (int i = 0; i < 2; i++) {
            Map.Entry entry = entryArr[i];
            Object key = entry.getKey();
            if (kotlin.reflect.jvm.internal.impl.types.checker.a.d(key, entry, map, key) != null) {
                throw new IllegalArgumentException(androidx.camera.core.impl.b.m(key, "duplicate key: "));
            }
        }
        eLog.d(str, "disconnecting socket", Collections.unmodifiableMap(map));
        c cVar = this.f25668a;
        if (cVar.l != null) {
            cVar.h.a(1000, "", false);
        }
    }

    public final Outcome a(String str) {
        if (this.f25668a.h.b()) {
            try {
                this.d.outgoing(String.valueOf(this.f25668a.hashCode()), str);
                this.f25668a.b(str);
                return new Outcome.Success(null);
            } catch (Exception e) {
                e.printStackTrace();
                d dVar = this.c;
                if (dVar != null) {
                    ((w) dVar).a(new SocketException(YU.a.f(e, new StringBuilder("failed to send data through socket: "))));
                }
                return new Outcome.Failure(new IllegalStateException(YU.a.f(e, new StringBuilder("failed to send data: "))));
            }
        }
        d dVar2 = this.c;
        if (dVar2 != null) {
            ((w) dVar2).a(new SocketException("socket is not open"));
        }
        return new Outcome.Failure(new IllegalStateException("Socket is closed, unable to send data"));
    }

    public final void a(int i, String str, boolean z) {
        ELog eLog = this.f;
        String str2 = this.e;
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("code", Integer.valueOf(i)), new AbstractMap.SimpleEntry("reason", str), new AbstractMap.SimpleEntry("remote", Boolean.valueOf(z))};
        HashMap map = new HashMap(3);
        for (int i2 = 0; i2 < 3; i2++) {
            Map.Entry entry = entryArr[i2];
            Object key = entry.getKey();
            if (kotlin.reflect.jvm.internal.impl.types.checker.a.d(key, entry, map, key) != null) {
                throw new IllegalArgumentException(androidx.camera.core.impl.b.m(key, "duplicate key: "));
            }
        }
        eLog.d(str2, "onClose() called", Collections.unmodifiableMap(map));
        d dVar = this.c;
        if (dVar != null) {
            w wVar = (w) dVar;
            BuildersKt.c(wVar.j, null, null, new l(wVar, null), 3);
        }
    }

    public final void a(Exception exc) {
        ELog eLog = this.f;
        String str = this.e;
        String message = exc.getMessage();
        if (message == null) {
            message = "null";
        }
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("errorMessage", message)};
        HashMap map = new HashMap(1);
        Map.Entry entry = entryArr[0];
        Object key = entry.getKey();
        if (kotlin.reflect.jvm.internal.impl.types.checker.a.d(key, entry, map, key) == null) {
            eLog.e(str, "onError() called with exception", Collections.unmodifiableMap(map));
            exc.printStackTrace();
            SocketException socketException = new SocketException(YU.a.f(exc, new StringBuilder("")));
            d dVar = this.c;
            if (dVar != null) {
                ((w) dVar).a(socketException);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(key, "duplicate key: "));
    }
}
