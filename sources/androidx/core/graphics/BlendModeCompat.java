package androidx.core.graphics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class BlendModeCompat {
    public static final BlendModeCompat d;
    public static final BlendModeCompat e;
    public static final BlendModeCompat f;
    public static final BlendModeCompat g;
    public static final BlendModeCompat h;
    public static final BlendModeCompat i;
    public static final /* synthetic */ BlendModeCompat[] j;

    /* JADX INFO: Fake field, exist only in values array */
    BlendModeCompat EF1;

    static {
        BlendModeCompat blendModeCompat = new BlendModeCompat("CLEAR", 0);
        BlendModeCompat blendModeCompat2 = new BlendModeCompat("SRC", 1);
        BlendModeCompat blendModeCompat3 = new BlendModeCompat("DST", 2);
        BlendModeCompat blendModeCompat4 = new BlendModeCompat("SRC_OVER", 3);
        BlendModeCompat blendModeCompat5 = new BlendModeCompat("DST_OVER", 4);
        BlendModeCompat blendModeCompat6 = new BlendModeCompat("SRC_IN", 5);
        BlendModeCompat blendModeCompat7 = new BlendModeCompat("DST_IN", 6);
        BlendModeCompat blendModeCompat8 = new BlendModeCompat("SRC_OUT", 7);
        BlendModeCompat blendModeCompat9 = new BlendModeCompat("DST_OUT", 8);
        BlendModeCompat blendModeCompat10 = new BlendModeCompat("SRC_ATOP", 9);
        BlendModeCompat blendModeCompat11 = new BlendModeCompat("DST_ATOP", 10);
        BlendModeCompat blendModeCompat12 = new BlendModeCompat("XOR", 11);
        BlendModeCompat blendModeCompat13 = new BlendModeCompat("PLUS", 12);
        d = blendModeCompat13;
        BlendModeCompat blendModeCompat14 = new BlendModeCompat("MODULATE", 13);
        e = blendModeCompat14;
        BlendModeCompat blendModeCompat15 = new BlendModeCompat("SCREEN", 14);
        f = blendModeCompat15;
        BlendModeCompat blendModeCompat16 = new BlendModeCompat("OVERLAY", 15);
        g = blendModeCompat16;
        BlendModeCompat blendModeCompat17 = new BlendModeCompat("DARKEN", 16);
        h = blendModeCompat17;
        BlendModeCompat blendModeCompat18 = new BlendModeCompat("LIGHTEN", 17);
        i = blendModeCompat18;
        j = new BlendModeCompat[]{blendModeCompat, blendModeCompat2, blendModeCompat3, blendModeCompat4, blendModeCompat5, blendModeCompat6, blendModeCompat7, blendModeCompat8, blendModeCompat9, blendModeCompat10, blendModeCompat11, blendModeCompat12, blendModeCompat13, blendModeCompat14, blendModeCompat15, blendModeCompat16, blendModeCompat17, blendModeCompat18, new BlendModeCompat("COLOR_DODGE", 18), new BlendModeCompat("COLOR_BURN", 19), new BlendModeCompat("HARD_LIGHT", 20), new BlendModeCompat("SOFT_LIGHT", 21), new BlendModeCompat("DIFFERENCE", 22), new BlendModeCompat("EXCLUSION", 23), new BlendModeCompat("MULTIPLY", 24), new BlendModeCompat("HUE", 25), new BlendModeCompat("SATURATION", 26), new BlendModeCompat("COLOR", 27), new BlendModeCompat("LUMINOSITY", 28)};
    }

    public static BlendModeCompat valueOf(String str) {
        return (BlendModeCompat) Enum.valueOf(BlendModeCompat.class, str);
    }

    public static BlendModeCompat[] values() {
        return (BlendModeCompat[]) j.clone();
    }
}
