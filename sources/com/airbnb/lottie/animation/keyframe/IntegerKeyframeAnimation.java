package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;

/* loaded from: classes4.dex */
public class IntegerKeyframeAnimation extends KeyframeAnimation<Integer> {
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final Object f(Keyframe keyframe, float f) {
        return Integer.valueOf(l(keyframe, f));
    }

    public final int k() {
        return l(this.c.a(), c());
    }

    public final int l(Keyframe keyframe, float f) {
        int i;
        float f2;
        Object obj = keyframe.b;
        Object obj2 = keyframe.b;
        if (obj == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        Object obj3 = keyframe.c;
        if (obj3 == null) {
            if (keyframe.k == 784923401) {
                keyframe.k = ((Integer) obj).intValue();
            }
            i = keyframe.k;
        } else {
            if (keyframe.l == 784923401) {
                keyframe.l = ((Integer) obj3).intValue();
            }
            i = keyframe.l;
        }
        LottieValueCallback lottieValueCallback = this.e;
        if (lottieValueCallback != null) {
            f2 = f;
            Integer num = (Integer) lottieValueCallback.b(keyframe.g, keyframe.h.floatValue(), (Integer) obj2, Integer.valueOf(i), f2, d(), this.d);
            if (num != null) {
                return num.intValue();
            }
        } else {
            f2 = f;
        }
        if (keyframe.k == 784923401) {
            keyframe.k = ((Integer) obj2).intValue();
        }
        int i2 = keyframe.k;
        PointF pointF = MiscUtils.f13479a;
        return (int) (((i - i2) * f2) + i2);
    }
}
