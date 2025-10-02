package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ShapeContainingUtilKt {
    public static final boolean a(Outline outline, float f, float f2) {
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).f1775a;
            return rect.f1752a <= f && f < rect.c && rect.b <= f2 && f2 < rect.d;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (outline instanceof Outline.Generic) {
                return b(f, f2, ((Outline.Generic) outline).f1774a);
            }
            throw new NoWhenBranchMatchedException();
        }
        RoundRect roundRect = ((Outline.Rounded) outline).f1776a;
        float f3 = roundRect.f1753a;
        long j = roundRect.f;
        long j2 = roundRect.h;
        long j3 = roundRect.g;
        float f4 = roundRect.d;
        float f5 = roundRect.b;
        float f6 = roundRect.c;
        long j4 = roundRect.e;
        if (f < f3 || f >= f6 || f2 < f5 || f2 >= f4) {
            return false;
        }
        int i = (int) (j4 >> 32);
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) + Float.intBitsToFloat(i) <= roundRect.b()) {
            int i3 = (int) (j2 >> 32);
            int i4 = (int) (j3 >> 32);
            if (Float.intBitsToFloat(i4) + Float.intBitsToFloat(i3) <= roundRect.b()) {
                int i5 = (int) (j4 & 4294967295L);
                int i6 = (int) (j2 & 4294967295L);
                if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= roundRect.a()) {
                    int i7 = (int) (j & 4294967295L);
                    int i8 = (int) (j3 & 4294967295L);
                    if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= roundRect.a()) {
                        float fIntBitsToFloat = Float.intBitsToFloat(i) + f3;
                        float fIntBitsToFloat2 = Float.intBitsToFloat(i5) + f5;
                        float fIntBitsToFloat3 = f6 - Float.intBitsToFloat(i2);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i7) + f5;
                        float fIntBitsToFloat5 = f6 - Float.intBitsToFloat(i4);
                        float fIntBitsToFloat6 = f4 - Float.intBitsToFloat(i8);
                        float fIntBitsToFloat7 = f4 - Float.intBitsToFloat(i6);
                        float fIntBitsToFloat8 = Float.intBitsToFloat(i3) + f3;
                        if (f < fIntBitsToFloat && f2 < fIntBitsToFloat2) {
                            return c(f, f2, fIntBitsToFloat, fIntBitsToFloat2, roundRect.e);
                        }
                        if (f < fIntBitsToFloat8 && f2 > fIntBitsToFloat7) {
                            return c(f, f2, fIntBitsToFloat8, fIntBitsToFloat7, roundRect.h);
                        }
                        if (f > fIntBitsToFloat3 && f2 < fIntBitsToFloat4) {
                            return c(f, f2, fIntBitsToFloat3, fIntBitsToFloat4, roundRect.f);
                        }
                        if (f <= fIntBitsToFloat5 || f2 <= fIntBitsToFloat6) {
                            return true;
                        }
                        return c(f, f2, fIntBitsToFloat5, fIntBitsToFloat6, roundRect.g);
                    }
                }
            }
        }
        AndroidPath androidPathA = AndroidPath_androidKt.a();
        Path.k(androidPathA, roundRect);
        return b(f, f2, androidPathA);
    }

    public static final boolean b(float f, float f2, Path path) {
        Rect rect = new Rect(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        AndroidPath androidPathA = AndroidPath_androidKt.a();
        Path.r(androidPathA, rect);
        AndroidPath androidPathA2 = AndroidPath_androidKt.a();
        androidPathA2.t(path, androidPathA, 1);
        boolean zIsEmpty = androidPathA2.f1761a.isEmpty();
        androidPathA2.reset();
        androidPathA.reset();
        return !zIsEmpty;
    }

    public static final boolean c(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }
}
