package androidx.camera.core.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class Timebase {
    public static final Timebase d;
    public static final Timebase e;
    public static final /* synthetic */ Timebase[] f;

    static {
        Timebase timebase = new Timebase("UPTIME", 0);
        d = timebase;
        Timebase timebase2 = new Timebase("REALTIME", 1);
        e = timebase2;
        f = new Timebase[]{timebase, timebase2};
    }

    public static Timebase valueOf(String str) {
        return (Timebase) Enum.valueOf(Timebase.class, str);
    }

    public static Timebase[] values() {
        return (Timebase[]) f.clone();
    }
}
