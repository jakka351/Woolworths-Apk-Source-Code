package com.airbnb.lottie.value;

import android.graphics.PointF;
import com.airbnb.lottie.utils.MiscUtils;

/* loaded from: classes4.dex */
public class LottieRelativePointValueCallback extends LottieValueCallback<PointF> {
    @Override // com.airbnb.lottie.value.LottieValueCallback
    public final Object a(LottieFrameInfo lottieFrameInfo) {
        Object obj = lottieFrameInfo.c;
        float f = ((PointF) obj).x;
        Object obj2 = lottieFrameInfo.d;
        float f2 = ((PointF) obj2).x;
        PointF pointF = MiscUtils.f13479a;
        float f3 = ((PointF) obj).y;
        float f4 = ((PointF) obj2).y;
        throw null;
    }
}
