package com.medallia.digital.mobilesdk;

/* loaded from: classes6.dex */
final class d8 {

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16435a;

        static {
            int[] iArr = new int[c8.values().length];
            f16435a = iArr;
            try {
                iArr[c8.Fade.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16435a[c8.SlideDown.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16435a[c8.SlideUp.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16435a[c8.SlideLeft.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16435a[c8.SlideRight.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16435a[c8.None.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static p2 a(c8 c8Var) {
        if (c8Var == null) {
            return new p2(R.anim.medallia_from_fade_in, R.anim.medallia_to_fade_out);
        }
        switch (a.f16435a[c8Var.ordinal()]) {
        }
        return new p2(R.anim.medallia_from_fade_in, R.anim.medallia_to_fade_out);
    }

    public static p2 b(c8 c8Var) {
        if (c8Var == null) {
            return new p2(R.anim.medallia_from_fade_out, R.anim.medallia_to_fade_in);
        }
        switch (a.f16435a[c8Var.ordinal()]) {
        }
        return new p2(R.anim.medallia_from_fade_out, R.anim.medallia_to_fade_in);
    }
}
