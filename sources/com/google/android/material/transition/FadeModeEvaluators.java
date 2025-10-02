package com.google.android.material.transition;

/* loaded from: classes6.dex */
class FadeModeEvaluators {

    /* renamed from: a, reason: collision with root package name */
    public static final AnonymousClass1 f14677a = new AnonymousClass1();
    public static final AnonymousClass2 b = new AnonymousClass2();

    /* renamed from: com.google.android.material.transition.FadeModeEvaluators$1, reason: invalid class name */
    public class AnonymousClass1 implements FadeModeEvaluator {
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public final FadeModeResult a(float f, float f2, float f3) {
            return new FadeModeResult(255, TransitionUtils.e(f2, f3, f, 0, 255), true);
        }
    }

    /* renamed from: com.google.android.material.transition.FadeModeEvaluators$2, reason: invalid class name */
    public class AnonymousClass2 implements FadeModeEvaluator {
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public final FadeModeResult a(float f, float f2, float f3) {
            return new FadeModeResult(TransitionUtils.e(f2, f3, f, 255, 0), 255, false);
        }
    }

    /* renamed from: com.google.android.material.transition.FadeModeEvaluators$3, reason: invalid class name */
    public class AnonymousClass3 implements FadeModeEvaluator {
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public final FadeModeResult a(float f, float f2, float f3) {
            return new FadeModeResult(TransitionUtils.e(f2, f3, f, 255, 0), TransitionUtils.e(f2, f3, f, 0, 255), false);
        }
    }

    /* renamed from: com.google.android.material.transition.FadeModeEvaluators$4, reason: invalid class name */
    public class AnonymousClass4 implements FadeModeEvaluator {
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public final FadeModeResult a(float f, float f2, float f3) {
            float fA = YU.a.a(f3, f2, 0.35f, f2);
            return new FadeModeResult(TransitionUtils.e(f2, fA, f, 255, 0), TransitionUtils.e(fA, f3, f, 0, 255), false);
        }
    }
}
