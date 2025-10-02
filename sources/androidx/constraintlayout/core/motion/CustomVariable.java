package androidx.constraintlayout.core.motion;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;

/* loaded from: classes2.dex */
public class CustomVariable {

    /* renamed from: a, reason: collision with root package name */
    public final String f2268a;
    public final int b;
    public int c;
    public float d;
    public String e;
    public final boolean f;

    public CustomVariable(CustomVariable customVariable) {
        this.c = Integer.MIN_VALUE;
        this.d = Float.NaN;
        this.e = null;
        this.f2268a = customVariable.f2268a;
        this.b = customVariable.b;
        this.c = customVariable.c;
        this.d = customVariable.d;
        this.e = customVariable.e;
        this.f = customVariable.f;
    }

    public static int a(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static String b(int i) {
        return "#" + a.k(i, new StringBuilder("00000000")).substring(r2.length() - 8);
    }

    public final float c() {
        switch (this.b) {
            case 900:
                return this.c;
            case 901:
                return this.d;
            case 902:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 903:
                throw new RuntimeException("Cannot interpolate String");
            default:
                return Float.NaN;
        }
    }

    public final void d(float[] fArr) {
        switch (this.b) {
            case 900:
                fArr[0] = this.c;
                return;
            case 901:
                fArr[0] = this.d;
                return;
            case 902:
                int i = (this.c >> 24) & 255;
                float fPow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i / 255.0f;
                return;
            case 903:
                throw new RuntimeException("Cannot interpolate String");
            default:
                return;
        }
    }

    public final int e() {
        return this.b != 902 ? 1 : 4;
    }

    public final void f(MotionWidget motionWidget, float[] fArr) {
        String str = this.f2268a;
        int i = this.b;
        switch (i) {
            case 900:
                motionWidget.f2271a.f(i, (int) fArr[0], str);
                return;
            case 901:
                motionWidget.f2271a.g(str, i, fArr[0]);
                return;
            case 902:
                motionWidget.f2271a.f(i, (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)), str);
                return;
            case 903:
                throw new RuntimeException(YU.a.A("unable to interpolate ", str));
            default:
                return;
        }
    }

    public final String toString() {
        String strR = b.r(new StringBuilder(), this.f2268a, ':');
        switch (this.b) {
            case 900:
                StringBuilder sbS = YU.a.s(strR);
                sbS.append(this.c);
                return sbS.toString();
            case 901:
                StringBuilder sbS2 = YU.a.s(strR);
                sbS2.append(this.d);
                return sbS2.toString();
            case 902:
                StringBuilder sbS3 = YU.a.s(strR);
                sbS3.append(b(this.c));
                return sbS3.toString();
            case 903:
                StringBuilder sbS4 = YU.a.s(strR);
                sbS4.append(this.e);
                return sbS4.toString();
            default:
                return YU.a.g(strR, "????");
        }
    }

    public CustomVariable(String str, int i, int i2) {
        this.c = Integer.MIN_VALUE;
        this.d = Float.NaN;
        this.e = null;
        this.f2268a = str;
        this.b = i;
        if (i == 901) {
            this.d = i2;
        } else {
            this.c = i2;
        }
    }

    public CustomVariable(String str, int i, float f) {
        this.c = Integer.MIN_VALUE;
        this.e = null;
        this.f2268a = str;
        this.b = i;
        this.d = f;
    }
}
