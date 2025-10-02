package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;

/* loaded from: classes4.dex */
public class FloatKeyframeAnimation extends KeyframeAnimation<Float> {
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final Object f(Keyframe keyframe, float f) {
        return Float.valueOf(l(keyframe, f));
    }

    public final float k() {
        return l(this.c.a(), c());
    }

    public final float l(Keyframe keyframe, float f) {
        float f2;
        Object obj = keyframe.b;
        Object obj2 = keyframe.b;
        if (obj == null || keyframe.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        LottieValueCallback lottieValueCallback = this.e;
        if (lottieValueCallback != null) {
            f2 = f;
            Float f3 = (Float) lottieValueCallback.b(keyframe.g, keyframe.h.floatValue(), (Float) obj2, (Float) keyframe.c, f2, d(), this.d);
            if (f3 != null) {
                return f3.floatValue();
            }
        } else {
            f2 = f;
        }
        if (keyframe.i == -3987645.8f) {
            keyframe.i = ((Float) obj2).floatValue();
        }
        float f4 = keyframe.i;
        if (keyframe.j == -3987645.8f) {
            keyframe.j = ((Float) keyframe.c).floatValue();
        }
        return MiscUtils.e(f4, keyframe.j, f2);
    }
}
