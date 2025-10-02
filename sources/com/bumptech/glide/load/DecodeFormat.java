package com.bumptech.glide.load;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class DecodeFormat {
    public static final DecodeFormat d;
    public static final DecodeFormat e;
    public static final DecodeFormat f;
    public static final /* synthetic */ DecodeFormat[] g;

    static {
        DecodeFormat decodeFormat = new DecodeFormat("PREFER_ARGB_8888", 0);
        d = decodeFormat;
        DecodeFormat decodeFormat2 = new DecodeFormat("PREFER_RGB_565", 1);
        e = decodeFormat2;
        g = new DecodeFormat[]{decodeFormat, decodeFormat2};
        f = decodeFormat;
    }

    public static DecodeFormat valueOf(String str) {
        return (DecodeFormat) Enum.valueOf(DecodeFormat.class, str);
    }

    public static DecodeFormat[] values() {
        return (DecodeFormat[]) g.clone();
    }
}
