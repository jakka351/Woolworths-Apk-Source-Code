package me.oriient.internal.services.websocket;

import java.net.URI;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlinx.coroutines.BuildersKt;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.eventManager.o;
import me.oriient.internal.services.eventManager.w;

/* loaded from: classes7.dex */
public final class c extends me.oriient.internal.services.websocket.client.c {
    public final e q;
    public final ELog r;

    public c(URI uri, e eVar, ELog eLog) {
        super(uri);
        this.q = eVar;
        this.r = eLog;
    }

    @Override // me.oriient.internal.services.websocket.client.c
    public final void a(me.oriient.internal.services.websocket.handshake.f fVar) {
        ELog eLog = this.r;
        Integer numValueOf = Integer.valueOf(hashCode());
        StringBuilder sb = new StringBuilder("{status: ");
        me.oriient.internal.services.websocket.handshake.c cVar = (me.oriient.internal.services.websocket.handshake.c) fVar;
        sb.append((int) cVar.b);
        sb.append(", message: ");
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("socket", numValueOf), new AbstractMap.SimpleEntry("handshakeData", YU.a.o(sb, cVar.c, "}"))};
        HashMap map = new HashMap(2);
        for (int i = 0; i < 2; i++) {
            Map.Entry entry = entryArr[i];
            Object key = entry.getKey();
            if (kotlin.reflect.jvm.internal.impl.types.checker.a.d(key, entry, map, key) != null) {
                throw new IllegalArgumentException(androidx.camera.core.impl.b.m(key, "duplicate key: "));
            }
        }
        eLog.d("c", "onOpen() called", Collections.unmodifiableMap(map));
        e eVar = this.q;
        eVar.getClass();
        String str = "onOpen() called with: handshakedata = [" + fVar + "]";
        Logger logger = eVar.g;
        if (logger != null) {
            logger.d(eVar.e, str);
        }
        d dVar = eVar.c;
        if (dVar != null) {
            w wVar = (w) dVar;
            BuildersKt.c(wVar.j, null, null, new o(wVar, eVar, null), 3);
        }
    }
}
