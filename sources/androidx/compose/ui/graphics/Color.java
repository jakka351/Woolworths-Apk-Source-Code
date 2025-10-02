package androidx.compose.ui.graphics;

import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Connector;
import androidx.compose.ui.graphics.colorspace.ConnectorKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.UnsignedKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "", "Companion", "value", "Lkotlin/ULong;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Color {
    public static final long b = ColorKt.d(4278190080L);
    public static final long c = ColorKt.d(4282664004L);
    public static final long d = ColorKt.d(4287137928L);
    public static final long e = ColorKt.d(4291611852L);
    public static final long f = ColorKt.d(4294967295L);
    public static final long g = ColorKt.d(4294901760L);
    public static final long h;
    public static final long i;
    public static final long j;
    public static final long k;
    public static final /* synthetic */ int l = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f1766a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/Color$Companion;", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        ColorKt.d(4278255360L);
        h = ColorKt.d(4278190335L);
        i = ColorKt.d(4294967040L);
        ColorKt.d(4278255615L);
        ColorKt.d(4294902015L);
        j = ColorKt.b(0);
        float[] fArr = ColorSpaces.f1791a;
        k = ColorKt.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, ColorSpaces.u);
    }

    public /* synthetic */ Color(long j2) {
        this.f1766a = j2;
    }

    public static final long a(long j2, ColorSpace colorSpace) {
        Connector connectorD;
        ColorSpace colorSpaceF = f(j2);
        int i2 = colorSpaceF.c;
        int i3 = colorSpace.c;
        if ((i2 | i3) < 0) {
            connectorD = ColorSpaceKt.d(colorSpaceF, colorSpace);
        } else {
            MutableIntObjectMap mutableIntObjectMap = ConnectorKt.f1793a;
            int i4 = i2 | (i3 << 6);
            Object objB = mutableIntObjectMap.b(i4);
            if (objB == null) {
                objB = ColorSpaceKt.d(colorSpaceF, colorSpace);
                mutableIntObjectMap.h(i4, objB);
            }
            connectorD = (Connector) objB;
        }
        return connectorD.a(j2);
    }

    public static long b(long j2, float f2) {
        return ColorKt.a(h(j2), g(j2), e(j2), f2, f(j2));
    }

    public static final boolean c(long j2, long j3) {
        return j2 == j3;
    }

    public static final float d(long j2) {
        float fB;
        float f2;
        if ((63 & j2) == 0) {
            fB = (float) UnsignedKt.b((j2 >>> 56) & 255);
            f2 = 255.0f;
        } else {
            fB = (float) UnsignedKt.b((j2 >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return fB / f2;
    }

    public static final float e(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) UnsignedKt.b((j2 >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 16) & 65535);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - Float16Kt.f1768a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final ColorSpace f(long j2) {
        float[] fArr = ColorSpaces.f1791a;
        return ColorSpaces.y[(int) (j2 & 63)];
    }

    public static final float g(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) UnsignedKt.b((j2 >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 32) & 65535);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - Float16Kt.f1768a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final float h(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) UnsignedKt.b((j2 >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 48) & 65535);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - Float16Kt.f1768a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static String i(long j2) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(h(j2));
        sb.append(", ");
        sb.append(g(j2));
        sb.append(", ");
        sb.append(e(j2));
        sb.append(", ");
        sb.append(d(j2));
        sb.append(", ");
        return androidx.camera.core.impl.b.r(sb, f(j2).f1790a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Color) {
            return this.f1766a == ((Color) obj).f1766a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1766a);
    }

    public final String toString() {
        return i(this.f1766a);
    }
}
