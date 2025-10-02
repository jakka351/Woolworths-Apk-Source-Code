package com.airbnb.lottie;

import com.airbnb.lottie.LottieDrawable;
import java.util.List;

/* loaded from: classes4.dex */
public final /* synthetic */ class k implements LottieDrawable.LazyCompositionTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13385a;
    public final /* synthetic */ LottieDrawable b;
    public final /* synthetic */ String c;

    public /* synthetic */ k(LottieDrawable lottieDrawable, String str, int i) {
        this.f13385a = i;
        this.b = lottieDrawable;
        this.c = str;
    }

    @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
    public final void run() {
        int i = this.f13385a;
        String str = this.c;
        LottieDrawable lottieDrawable = this.b;
        switch (i) {
            case 0:
                List list = LottieDrawable.U;
                lottieDrawable.u(str);
                break;
            case 1:
                List list2 = LottieDrawable.U;
                lottieDrawable.t(str);
                break;
            default:
                List list3 = LottieDrawable.U;
                lottieDrawable.w(str);
                break;
        }
    }
}
