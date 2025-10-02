package com.airbnb.lottie.value;

import com.airbnb.lottie.SimpleColorFilter;

/* loaded from: classes4.dex */
public class LottieValueCallback<T> {

    /* renamed from: a, reason: collision with root package name */
    public final LottieFrameInfo f13483a;
    public final SimpleColorFilter b;

    public LottieValueCallback() {
        this.f13483a = new LottieFrameInfo();
        this.b = null;
    }

    public Object a(LottieFrameInfo lottieFrameInfo) {
        return this.b;
    }

    public final Object b(float f, float f2, Object obj, Object obj2, float f3, float f4, float f5) {
        LottieFrameInfo lottieFrameInfo = this.f13483a;
        lottieFrameInfo.f13482a = f;
        lottieFrameInfo.b = f2;
        lottieFrameInfo.c = obj;
        lottieFrameInfo.d = obj2;
        lottieFrameInfo.e = f3;
        lottieFrameInfo.f = f4;
        lottieFrameInfo.g = f5;
        return a(lottieFrameInfo);
    }

    public LottieValueCallback(SimpleColorFilter simpleColorFilter) {
        this.f13483a = new LottieFrameInfo();
        this.b = simpleColorFilter;
    }
}
