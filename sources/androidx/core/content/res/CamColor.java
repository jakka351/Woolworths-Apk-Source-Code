package androidx.core.content.res;

import android.graphics.Color;
import androidx.annotation.RestrictTo;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

@RestrictTo
/* loaded from: classes2.dex */
public class CamColor {

    /* renamed from: a, reason: collision with root package name */
    public final float f2415a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public CamColor(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f2415a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public static CamColor a(int i) {
        ViewingConditions viewingConditions = ViewingConditions.k;
        float fB = CamUtils.b(Color.red(i));
        float fB2 = CamUtils.b(Color.green(i));
        float fB3 = CamUtils.b(Color.blue(i));
        float[][] fArr = CamUtils.d;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * fB3) + (fArr2[1] * fB2) + (fArr2[0] * fB);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[2] * fB3) + (fArr3[1] * fB2) + (fArr3[0] * fB);
        float[] fArr4 = fArr[2];
        float f3 = (fB3 * fArr4[2]) + (fB2 * fArr4[1]) + (fB * fArr4[0]);
        float[][] fArr5 = CamUtils.f2416a;
        float[] fArr6 = fArr5[0];
        float f4 = (fArr6[2] * f3) + (fArr6[1] * f2) + (fArr6[0] * f);
        float[] fArr7 = fArr5[1];
        float f5 = (fArr7[2] * f3) + (fArr7[1] * f2) + (fArr7[0] * f);
        float[] fArr8 = fArr5[2];
        float f6 = (f3 * fArr8[2]) + (f2 * fArr8[1]) + (f * fArr8[0]);
        float[] fArr9 = viewingConditions.g;
        float f7 = viewingConditions.i;
        float f8 = viewingConditions.d;
        float f9 = viewingConditions.f2427a;
        float f10 = fArr9[0] * f4;
        float f11 = fArr9[1] * f5;
        float f12 = fArr9[2] * f6;
        float f13 = viewingConditions.h;
        float fPow = (float) Math.pow((Math.abs(f10) * f13) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((Math.abs(f11) * f13) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((Math.abs(f12) * f13) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f10) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f11) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f12) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f14 = ((float) (((fSignum2 * (-12.0d)) + (fSignum * 11.0d)) + d)) / 11.0f;
        float f15 = ((float) ((fSignum + fSignum2) - (d * 2.0d))) / 9.0f;
        float f16 = fSignum2 * 20.0f;
        float f17 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f16)) / 20.0f;
        float f18 = (((fSignum * 40.0f) + f16) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f15, f14)) * 180.0f) / 3.1415927f;
        if (fAtan2 < BitmapDescriptorFactory.HUE_RED) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f19 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f18 * viewingConditions.b) / f9, viewingConditions.j * f8)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f20 = f9 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, viewingConditions.f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * viewingConditions.e) * viewingConditions.c) * ((float) Math.sqrt((f15 * f15) + (f14 * f14)))) / (f17 + 0.305f), 0.9d)) * ((float) Math.sqrt(fPow4 / 100.0d));
        Math.sqrt((r0 * f8) / f20);
        float f21 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f7 * fPow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f19;
        return new CamColor(fAtan2, fPow5, fPow4, f21, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    public static CamColor b(float f, float f2, float f3) {
        ViewingConditions viewingConditions = ViewingConditions.k;
        float f4 = viewingConditions.d;
        Math.sqrt(f / 100.0d);
        float f5 = viewingConditions.f2427a + 4.0f;
        float f6 = viewingConditions.i * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(r1))) * viewingConditions.d) / f5);
        float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((f6 * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new CamColor(f3, f2, f, f7, fLog * ((float) Math.cos(d)), fLog * ((float) Math.sin(d)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(androidx.core.content.res.ViewingConditions r20) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.CamColor.c(androidx.core.content.res.ViewingConditions):int");
    }
}
