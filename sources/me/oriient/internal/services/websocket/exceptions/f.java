package me.oriient.internal.services.websocket.exceptions;

/* loaded from: classes7.dex */
public final class f extends c {
    public final int b;

    public f(int i) {
        super(1009);
        this.b = i;
    }

    public f(int i, int i2) {
        super(1009, "Payload limit reached.");
        this.b = i;
    }

    public f(String str) {
        super(1009, str);
        this.b = Integer.MAX_VALUE;
    }
}
