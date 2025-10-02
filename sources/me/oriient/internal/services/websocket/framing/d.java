package me.oriient.internal.services.websocket.framing;

/* loaded from: classes7.dex */
public abstract class d extends h {
    public d(me.oriient.internal.services.websocket.enums.c cVar) {
        super(cVar);
    }

    @Override // me.oriient.internal.services.websocket.framing.h
    public void b() throws me.oriient.internal.services.websocket.exceptions.d {
        if (!this.f25673a) {
            throw new me.oriient.internal.services.websocket.exceptions.d("Control frame can't have fin==false set");
        }
        if (this.e) {
            throw new me.oriient.internal.services.websocket.exceptions.d("Control frame can't have rsv1==true set");
        }
        if (this.f) {
            throw new me.oriient.internal.services.websocket.exceptions.d("Control frame can't have rsv2==true set");
        }
        if (this.g) {
            throw new me.oriient.internal.services.websocket.exceptions.d("Control frame can't have rsv3==true set");
        }
    }
}
