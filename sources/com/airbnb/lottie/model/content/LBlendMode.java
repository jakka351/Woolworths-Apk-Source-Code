package com.airbnb.lottie.model.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class LBlendMode {
    public static final LBlendMode d;
    public static final LBlendMode e;
    public static final /* synthetic */ LBlendMode[] f;

    /* renamed from: com.airbnb.lottie.model.content.LBlendMode$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13409a;

        static {
            int[] iArr = new int[LBlendMode.values().length];
            f13409a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13409a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13409a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13409a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13409a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13409a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13409a[16] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13409a[6] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13409a[7] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13409a[8] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13409a[9] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13409a[10] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f13409a[11] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f13409a[12] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f13409a[13] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f13409a[14] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f13409a[15] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f13409a[17] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    static {
        LBlendMode lBlendMode = new LBlendMode("NORMAL", 0);
        d = lBlendMode;
        LBlendMode lBlendMode2 = new LBlendMode("MULTIPLY", 1);
        e = lBlendMode2;
        f = new LBlendMode[]{lBlendMode, lBlendMode2, new LBlendMode("SCREEN", 2), new LBlendMode("OVERLAY", 3), new LBlendMode("DARKEN", 4), new LBlendMode("LIGHTEN", 5), new LBlendMode("COLOR_DODGE", 6), new LBlendMode("COLOR_BURN", 7), new LBlendMode("HARD_LIGHT", 8), new LBlendMode("SOFT_LIGHT", 9), new LBlendMode("DIFFERENCE", 10), new LBlendMode("EXCLUSION", 11), new LBlendMode("HUE", 12), new LBlendMode("SATURATION", 13), new LBlendMode("COLOR", 14), new LBlendMode("LUMINOSITY", 15), new LBlendMode("ADD", 16), new LBlendMode("HARD_MIX", 17)};
    }

    public static LBlendMode valueOf(String str) {
        return (LBlendMode) Enum.valueOf(LBlendMode.class, str);
    }

    public static LBlendMode[] values() {
        return (LBlendMode[]) f.clone();
    }
}
