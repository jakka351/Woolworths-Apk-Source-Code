package me.oriient.internal.services.websocket;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import me.oriient.internal.services.websocket.framing.i;

/* loaded from: classes7.dex */
public abstract class b extends g {
    public ScheduledExecutorService b;
    public ScheduledFuture c;
    public long d = TimeUnit.SECONDS.toNanos(60);
    public boolean e = false;
    public final Object f = new Object();

    public static void a(f fVar, long j) {
        if (fVar instanceof h) {
            h hVar = (h) fVar;
            if (hVar.l < j) {
                hVar.b(1006, "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection", false);
                return;
            }
            if (hVar.b()) {
                me.oriient.internal.services.websocket.client.c cVar = hVar.b;
                if (cVar.f25674a == null) {
                    cVar.f25674a = new i();
                }
                i iVar = cVar.f25674a;
                if (iVar == null) {
                    throw new NullPointerException("onPreparePing(WebSocket) returned null. PingFrame to sent can't be null.");
                }
                hVar.a(Collections.singletonList(iVar));
            }
        }
    }
}
