package com.airbnb.lottie;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.utils.LottieValueAnimator;
import com.airbnb.lottie.utils.MiscUtils;
import java.util.List;

/* loaded from: classes4.dex */
public final /* synthetic */ class o implements LottieDrawable.LazyCompositionTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13434a;
    public final /* synthetic */ LottieDrawable b;
    public final /* synthetic */ float c;

    public /* synthetic */ o(LottieDrawable lottieDrawable, float f, int i) {
        this.f13434a = i;
        this.b = lottieDrawable;
        this.c = f;
    }

    @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
    public final void run() {
        int i = this.f13434a;
        float f = this.c;
        LottieDrawable lottieDrawable = this.b;
        switch (i) {
            case 0:
                List list = LottieDrawable.U;
                LottieComposition lottieComposition = lottieDrawable.d;
                if (lottieComposition != null) {
                    LottieValueAnimator lottieValueAnimator = lottieDrawable.e;
                    lottieValueAnimator.i(lottieValueAnimator.m, MiscUtils.e(lottieComposition.l, lottieComposition.m, f));
                    break;
                } else {
                    lottieDrawable.j.add(new o(lottieDrawable, f, 0));
                    break;
                }
            case 1:
                List list2 = LottieDrawable.U;
                LottieComposition lottieComposition2 = lottieDrawable.d;
                if (lottieComposition2 != null) {
                    lottieDrawable.v((int) MiscUtils.e(lottieComposition2.l, lottieComposition2.m, f));
                    break;
                } else {
                    lottieDrawable.j.add(new o(lottieDrawable, f, 1));
                    break;
                }
            default:
                List list3 = LottieDrawable.U;
                lottieDrawable.x(f);
                break;
        }
    }
}
