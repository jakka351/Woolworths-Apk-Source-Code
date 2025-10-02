package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Oklab;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ColorKt {
    /* JADX WARN: Removed duplicated region for block: B:106:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long a(float r21, float r22, float r23, float r24, androidx.compose.ui.graphics.colorspace.ColorSpace r25) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.ColorKt.a(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    public static final long b(int i) {
        long j = i << 32;
        int i2 = Color.l;
        return j;
    }

    public static final long c(int i, int i2, int i3, int i4) {
        return b(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }

    public static final long d(long j) {
        long j2 = j << 32;
        int i = Color.l;
        return j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long f(float r17, float r18, float r19, float r20, androidx.compose.ui.graphics.colorspace.ColorSpace r21) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.ColorKt.f(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    public static final long g(long j, long j2) {
        float f;
        float f2;
        long jA = Color.a(j, Color.f(j2));
        float fD = Color.d(j2);
        float fD2 = Color.d(jA);
        float f3 = 1.0f - fD2;
        float f4 = (fD * f3) + fD2;
        float fH = Color.h(jA);
        float fH2 = Color.h(j2);
        float f5 = BitmapDescriptorFactory.HUE_RED;
        if (f4 == BitmapDescriptorFactory.HUE_RED) {
            f = 0.0f;
        } else {
            f = (((fH2 * fD) * f3) + (fH * fD2)) / f4;
        }
        float fG = Color.g(jA);
        float fG2 = Color.g(j2);
        if (f4 == BitmapDescriptorFactory.HUE_RED) {
            f2 = 0.0f;
        } else {
            f2 = (((fG2 * fD) * f3) + (fG * fD2)) / f4;
        }
        float fE = Color.e(jA);
        float fE2 = Color.e(j2);
        if (f4 != BitmapDescriptorFactory.HUE_RED) {
            f5 = (((fE2 * fD) * f3) + (fE * fD2)) / f4;
        }
        return f(f, f2, f5, f4, Color.f(j2));
    }

    public static final long h(long j, float f, long j2) {
        Oklab oklab = ColorSpaces.x;
        long jA = Color.a(j, oklab);
        long jA2 = Color.a(j2, oklab);
        float fD = Color.d(jA);
        float fH = Color.h(jA);
        float fG = Color.g(jA);
        float fE = Color.e(jA);
        float fD2 = Color.d(jA2);
        float fH2 = Color.h(jA2);
        float fG2 = Color.g(jA2);
        float fE2 = Color.e(jA2);
        if (f < BitmapDescriptorFactory.HUE_RED) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return Color.a(f(MathHelpersKt.b(fH, fH2, f), MathHelpersKt.b(fG, fG2, f), MathHelpersKt.b(fE, fE2, f), MathHelpersKt.b(fD, fD2, f), oklab), Color.f(j2));
    }

    public static final float i(long j) {
        ColorSpace colorSpaceF = Color.f(j);
        if (!ColorModel.a(colorSpaceF.b, ColorModel.f1789a)) {
            InlineClassHelperKt.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.b(colorSpaceF.b)));
        }
        androidx.compose.ui.graphics.colorspace.b bVar = ((Rgb) colorSpaceF).p;
        double d = bVar.d(Color.h(j));
        float fD = (float) ((bVar.d(Color.e(j)) * 0.0722d) + (bVar.d(Color.g(j)) * 0.7152d) + (d * 0.2126d));
        if (fD < BitmapDescriptorFactory.HUE_RED) {
            fD = 0.0f;
        }
        if (fD > 1.0f) {
            return 1.0f;
        }
        return fD;
    }

    public static final int j(long j) {
        float[] fArr = ColorSpaces.f1791a;
        return (int) (Color.a(j, ColorSpaces.e) >>> 32);
    }
}
