package com.airbnb.lottie.value;

import android.graphics.PointF;
import com.airbnb.lottie.utils.MiscUtils;

/* loaded from: classes4.dex */
public class LottieRelativeIntegerValueCallback extends LottieValueCallback<Integer> {
    @Override // com.airbnb.lottie.value.LottieValueCallback
    public final Object a(LottieFrameInfo lottieFrameInfo) {
        int iIntValue = ((Integer) lottieFrameInfo.c).intValue();
        int iIntValue2 = ((Integer) lottieFrameInfo.d).intValue();
        float f = lottieFrameInfo.f;
        PointF pointF = MiscUtils.f13479a;
        int i = (int) ((f * (iIntValue2 - iIntValue)) + iIntValue);
        Object obj = this.b;
        if (obj != null) {
            return Integer.valueOf(((Integer) obj).intValue() + i);
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }
}
