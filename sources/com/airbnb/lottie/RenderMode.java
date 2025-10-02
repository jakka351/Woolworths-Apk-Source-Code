package com.airbnb.lottie;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class RenderMode {
    public static final RenderMode d;
    public static final RenderMode e;
    public static final RenderMode f;
    public static final /* synthetic */ RenderMode[] g;

    /* renamed from: com.airbnb.lottie.RenderMode$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13351a;

        static {
            int[] iArr = new int[RenderMode.values().length];
            f13351a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13351a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13351a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        RenderMode renderMode = new RenderMode("AUTOMATIC", 0);
        d = renderMode;
        RenderMode renderMode2 = new RenderMode("HARDWARE", 1);
        e = renderMode2;
        RenderMode renderMode3 = new RenderMode("SOFTWARE", 2);
        f = renderMode3;
        g = new RenderMode[]{renderMode, renderMode2, renderMode3};
    }

    public static RenderMode valueOf(String str) {
        return (RenderMode) Enum.valueOf(RenderMode.class, str);
    }

    public static RenderMode[] values() {
        return (RenderMode[]) g.clone();
    }
}
