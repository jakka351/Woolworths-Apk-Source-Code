package com.airbnb.lottie;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class LottieResult<V> {

    /* renamed from: a, reason: collision with root package name */
    public final LottieComposition f13347a;
    public final Throwable b;

    public LottieResult(LottieComposition lottieComposition) {
        this.f13347a = lottieComposition;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieResult)) {
            return false;
        }
        LottieResult lottieResult = (LottieResult) obj;
        LottieComposition lottieComposition = this.f13347a;
        if (lottieComposition != null && lottieComposition.equals(lottieResult.f13347a)) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || lottieResult.b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13347a, this.b});
    }

    public LottieResult(Throwable th) {
        this.b = th;
        this.f13347a = null;
    }
}
