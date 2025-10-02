package me.oriient.internal.services.websocket.framing;

/* loaded from: classes7.dex */
public final class k extends e {
    public k() {
        super(me.oriient.internal.services.websocket.enums.c.TEXT);
    }

    @Override // me.oriient.internal.services.websocket.framing.e, me.oriient.internal.services.websocket.framing.h
    public final void b() throws me.oriient.internal.services.websocket.exceptions.c {
        if (!me.oriient.internal.services.websocket.util.b.a(this.c)) {
            throw new me.oriient.internal.services.websocket.exceptions.c(1007, "Received text is no valid utf8 string!");
        }
    }
}
