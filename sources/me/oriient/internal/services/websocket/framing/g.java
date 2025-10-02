package me.oriient.internal.services.websocket.framing;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f25672a;

    static {
        int[] iArr = new int[me.oriient.internal.services.websocket.enums.c.values().length];
        f25672a = iArr;
        try {
            iArr[me.oriient.internal.services.websocket.enums.c.PING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f25672a[me.oriient.internal.services.websocket.enums.c.PONG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f25672a[me.oriient.internal.services.websocket.enums.c.TEXT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f25672a[me.oriient.internal.services.websocket.enums.c.BINARY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f25672a[me.oriient.internal.services.websocket.enums.c.CLOSING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f25672a[me.oriient.internal.services.websocket.enums.c.CONTINUOUS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
