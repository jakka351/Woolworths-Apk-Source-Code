package com.airbnb.lottie;

import com.airbnb.lottie.LottieDrawable;
import java.util.List;

/* loaded from: classes4.dex */
public final /* synthetic */ class q implements LottieDrawable.LazyCompositionTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13475a;
    public final /* synthetic */ LottieDrawable b;

    public /* synthetic */ q(LottieDrawable lottieDrawable, int i) {
        this.f13475a = i;
        this.b = lottieDrawable;
    }

    @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
    public final void run() {
        int i = this.f13475a;
        LottieDrawable lottieDrawable = this.b;
        switch (i) {
            case 0:
                List list = LottieDrawable.U;
                lottieDrawable.p();
                break;
            default:
                List list2 = LottieDrawable.U;
                lottieDrawable.n();
                break;
        }
    }
}
