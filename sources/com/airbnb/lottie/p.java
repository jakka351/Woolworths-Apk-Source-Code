package com.airbnb.lottie;

import com.airbnb.lottie.LottieDrawable;
import java.util.List;

/* loaded from: classes4.dex */
public final /* synthetic */ class p implements LottieDrawable.LazyCompositionTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LottieDrawable f13435a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ p(LottieDrawable lottieDrawable, int i, int i2) {
        this.f13435a = lottieDrawable;
        this.b = i;
        this.c = i2;
    }

    @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
    public final void run() {
        List list = LottieDrawable.U;
        LottieDrawable lottieDrawable = this.f13435a;
        LottieComposition lottieComposition = lottieDrawable.d;
        int i = this.b;
        int i2 = this.c;
        if (lottieComposition == null) {
            lottieDrawable.j.add(new p(lottieDrawable, i, i2));
        } else {
            lottieDrawable.e.i(i, i2 + 0.99f);
        }
    }
}
