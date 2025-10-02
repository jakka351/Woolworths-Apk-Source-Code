package com.airbnb.lottie;

import com.airbnb.lottie.LottieDrawable;
import java.util.List;

/* loaded from: classes4.dex */
public final /* synthetic */ class m implements LottieDrawable.LazyCompositionTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13386a;
    public final /* synthetic */ LottieDrawable b;
    public final /* synthetic */ int c;

    public /* synthetic */ m(LottieDrawable lottieDrawable, int i, int i2) {
        this.f13386a = i2;
        this.b = lottieDrawable;
        this.c = i;
    }

    @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
    public final void run() {
        int i = this.f13386a;
        int i2 = this.c;
        LottieDrawable lottieDrawable = this.b;
        switch (i) {
            case 0:
                List list = LottieDrawable.U;
                lottieDrawable.s(i2);
                break;
            case 1:
                List list2 = LottieDrawable.U;
                lottieDrawable.v(i2);
                break;
            default:
                List list3 = LottieDrawable.U;
                lottieDrawable.r(i2);
                break;
        }
    }
}
