package com.airbnb.lottie.value;

import com.airbnb.lottie.utils.MiscUtils;

/* loaded from: classes4.dex */
public class LottieRelativeFloatValueCallback extends LottieValueCallback<Float> {
    @Override // com.airbnb.lottie.value.LottieValueCallback
    public final Object a(LottieFrameInfo lottieFrameInfo) {
        float fE = MiscUtils.e(((Float) lottieFrameInfo.c).floatValue(), ((Float) lottieFrameInfo.d).floatValue(), lottieFrameInfo.f);
        Object obj = this.b;
        if (obj != null) {
            return Float.valueOf(((Float) obj).floatValue() + fE);
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }
}
