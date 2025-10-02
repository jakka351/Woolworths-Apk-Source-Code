package com.google.android.material.transition.platform;

import android.graphics.RectF;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes6.dex */
class FitModeEvaluators {

    /* renamed from: a, reason: collision with root package name */
    public static final AnonymousClass1 f14691a = new AnonymousClass1();
    public static final AnonymousClass2 b = new AnonymousClass2();

    /* renamed from: com.google.android.material.transition.platform.FitModeEvaluators$1, reason: invalid class name */
    public class AnonymousClass1 implements FitModeEvaluator {
        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public final FitModeResult a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float fD = TransitionUtils.d(f4, f6, f2, f3, f, true);
            float f8 = fD / f4;
            float f9 = fD / f6;
            return new FitModeResult(f8, f9, fD, f5 * f8, fD, f7 * f9);
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public final boolean b(FitModeResult fitModeResult) {
            return fitModeResult.d > fitModeResult.f;
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public final void c(RectF rectF, float f, FitModeResult fitModeResult) {
            rectF.bottom -= Math.abs(fitModeResult.f - fitModeResult.d) * f;
        }
    }

    /* renamed from: com.google.android.material.transition.platform.FitModeEvaluators$2, reason: invalid class name */
    public class AnonymousClass2 implements FitModeEvaluator {
        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public final FitModeResult a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float fD = TransitionUtils.d(f5, f7, f2, f3, f, true);
            float f8 = fD / f5;
            float f9 = fD / f7;
            return new FitModeResult(f8, f9, f4 * f8, fD, f6 * f9, fD);
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public final boolean b(FitModeResult fitModeResult) {
            return fitModeResult.c > fitModeResult.e;
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public final void c(RectF rectF, float f, FitModeResult fitModeResult) {
            float fAbs = (Math.abs(fitModeResult.e - fitModeResult.c) / 2.0f) * f;
            rectF.left += fAbs;
            rectF.right -= fAbs;
        }
    }
}
