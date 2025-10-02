package androidx.camera.core;

import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public final class DynamicRange {
    public static final DynamicRange c = new DynamicRange(0, 0);
    public static final DynamicRange d = new DynamicRange(1, 8);
    public static final DynamicRange e = new DynamicRange(3, 10);
    public static final DynamicRange f = new DynamicRange(4, 10);
    public static final DynamicRange g = new DynamicRange(5, 10);
    public static final DynamicRange h = new DynamicRange(6, 10);
    public static final DynamicRange i = new DynamicRange(6, 8);

    /* renamed from: a, reason: collision with root package name */
    public final int f400a;
    public final int b;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface BitDepth {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface DynamicRangeEncoding {
    }

    public DynamicRange(int i2, int i3) {
        this.f400a = i2;
        this.b = i3;
    }

    public final boolean a() {
        return b() && this.f400a != 1 && this.b == 10;
    }

    public final boolean b() {
        int i2 = this.f400a;
        return (i2 == 0 || i2 == 2 || this.b == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DynamicRange) {
            DynamicRange dynamicRange = (DynamicRange) obj;
            if (this.f400a == dynamicRange.f400a && this.b == dynamicRange.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f400a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DynamicRange@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("{encoding=");
        switch (this.f400a) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb.append(str);
        sb.append(", bitDepth=");
        return YU.a.m(sb, this.b, "}");
    }
}
