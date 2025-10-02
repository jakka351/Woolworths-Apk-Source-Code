package com.caverock.androidsvg;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;

/* loaded from: classes4.dex */
public class PreserveAspectRatio {
    public static final PreserveAspectRatio c = new PreserveAspectRatio(Alignment.d, null);
    public static final PreserveAspectRatio d = new PreserveAspectRatio(Alignment.i, Scale.d);

    /* renamed from: a, reason: collision with root package name */
    public final Alignment f14008a;
    public final Scale b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Alignment {
        public static final Alignment d;
        public static final Alignment e;
        public static final Alignment f;
        public static final Alignment g;
        public static final Alignment h;
        public static final Alignment i;
        public static final Alignment j;
        public static final Alignment k;
        public static final Alignment l;
        public static final Alignment m;
        public static final /* synthetic */ Alignment[] n;

        static {
            Alignment alignment = new Alignment(DevicePublicKeyStringDef.NONE, 0);
            d = alignment;
            Alignment alignment2 = new Alignment("xMinYMin", 1);
            e = alignment2;
            Alignment alignment3 = new Alignment("xMidYMin", 2);
            f = alignment3;
            Alignment alignment4 = new Alignment("xMaxYMin", 3);
            g = alignment4;
            Alignment alignment5 = new Alignment("xMinYMid", 4);
            h = alignment5;
            Alignment alignment6 = new Alignment("xMidYMid", 5);
            i = alignment6;
            Alignment alignment7 = new Alignment("xMaxYMid", 6);
            j = alignment7;
            Alignment alignment8 = new Alignment("xMinYMax", 7);
            k = alignment8;
            Alignment alignment9 = new Alignment("xMidYMax", 8);
            l = alignment9;
            Alignment alignment10 = new Alignment("xMaxYMax", 9);
            m = alignment10;
            n = new Alignment[]{alignment, alignment2, alignment3, alignment4, alignment5, alignment6, alignment7, alignment8, alignment9, alignment10};
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) n.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Scale {
        public static final Scale d;
        public static final Scale e;
        public static final /* synthetic */ Scale[] f;

        static {
            Scale scale = new Scale("meet", 0);
            d = scale;
            Scale scale2 = new Scale("slice", 1);
            e = scale2;
            f = new Scale[]{scale, scale2};
        }

        public static Scale valueOf(String str) {
            return (Scale) Enum.valueOf(Scale.class, str);
        }

        public static Scale[] values() {
            return (Scale[]) f.clone();
        }
    }

    public PreserveAspectRatio(Alignment alignment, Scale scale) {
        this.f14008a = alignment;
        this.b = scale;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreserveAspectRatio preserveAspectRatio = (PreserveAspectRatio) obj;
        return this.f14008a == preserveAspectRatio.f14008a && this.b == preserveAspectRatio.b;
    }

    public final String toString() {
        return this.f14008a + " " + this.b;
    }
}
