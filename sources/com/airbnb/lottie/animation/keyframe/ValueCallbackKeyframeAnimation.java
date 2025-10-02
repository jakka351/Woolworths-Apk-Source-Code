package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;

/* loaded from: classes4.dex */
public class ValueCallbackKeyframeAnimation<K, A> extends BaseKeyframeAnimation<K, A> {
    public final Object i;

    public ValueCallbackKeyframeAnimation(LottieValueCallback lottieValueCallback, Object obj) {
        super(Collections.EMPTY_LIST);
        j(lottieValueCallback);
        this.i = obj;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final float b() {
        return 1.0f;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final Object e() {
        LottieValueCallback lottieValueCallback = this.e;
        Object obj = this.i;
        float f = this.d;
        return lottieValueCallback.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, obj, obj, f, f, f);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final Object f(Keyframe keyframe, float f) {
        return e();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final void h() {
        if (this.e != null) {
            super.h();
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final void i(float f) {
        this.d = f;
    }
}
