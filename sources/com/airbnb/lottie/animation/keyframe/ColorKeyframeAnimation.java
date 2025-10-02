package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.utils.GammaEvaluator;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes4.dex */
public class ColorKeyframeAnimation extends KeyframeAnimation<Integer> {
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final Object f(Keyframe keyframe, float f) {
        return Integer.valueOf(l(keyframe, f));
    }

    public final int k() {
        return l(this.c.a(), c());
    }

    public final int l(Keyframe keyframe, float f) {
        float f2;
        Float f3;
        Object obj = keyframe.b;
        Object obj2 = keyframe.b;
        if (obj == null || keyframe.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        LottieValueCallback lottieValueCallback = this.e;
        if (lottieValueCallback == null || (f3 = keyframe.h) == null) {
            f2 = f;
        } else {
            f2 = f;
            Integer num = (Integer) lottieValueCallback.b(keyframe.g, f3.floatValue(), (Integer) obj2, (Integer) keyframe.c, f2, d(), this.d);
            if (num != null) {
                return num.intValue();
            }
        }
        return GammaEvaluator.c(MiscUtils.b(f2, BitmapDescriptorFactory.HUE_RED, 1.0f), ((Integer) obj2).intValue(), ((Integer) keyframe.c).intValue());
    }
}
