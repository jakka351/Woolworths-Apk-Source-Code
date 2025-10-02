package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import com.airbnb.lottie.value.ScaleXY;
import java.util.List;

/* loaded from: classes4.dex */
public class ScaleKeyframeAnimation extends KeyframeAnimation<ScaleXY> {
    public final ScaleXY i;

    public ScaleKeyframeAnimation(List list) {
        super(list);
        this.i = new ScaleXY();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final Object f(Keyframe keyframe, float f) {
        Object obj;
        float f2;
        Object obj2 = keyframe.b;
        if (obj2 == null || (obj = keyframe.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        ScaleXY scaleXY = (ScaleXY) obj2;
        ScaleXY scaleXY2 = (ScaleXY) obj;
        LottieValueCallback lottieValueCallback = this.e;
        if (lottieValueCallback != null) {
            f2 = f;
            ScaleXY scaleXY3 = (ScaleXY) lottieValueCallback.b(keyframe.g, keyframe.h.floatValue(), scaleXY, scaleXY2, f2, d(), this.d);
            if (scaleXY3 != null) {
                return scaleXY3;
            }
        } else {
            f2 = f;
        }
        float fE = MiscUtils.e(scaleXY.f13484a, scaleXY2.f13484a, f2);
        float fE2 = MiscUtils.e(scaleXY.b, scaleXY2.b, f2);
        ScaleXY scaleXY4 = this.i;
        scaleXY4.f13484a = fE;
        scaleXY4.b = fE2;
        return scaleXY4;
    }
}
