package com.airbnb.lottie.animation.keyframe;

import YU.a;
import android.graphics.PointF;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* loaded from: classes4.dex */
public class PointKeyframeAnimation extends KeyframeAnimation<PointF> {
    public final PointF i;

    public PointKeyframeAnimation(List list) {
        super(list);
        this.i = new PointF();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final Object f(Keyframe keyframe, float f) {
        return g(keyframe, f, f, f);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final PointF g(Keyframe keyframe, float f, float f2, float f3) {
        Object obj;
        PointF pointF;
        Object obj2 = keyframe.b;
        if (obj2 == null || (obj = keyframe.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF2 = (PointF) obj2;
        PointF pointF3 = (PointF) obj;
        LottieValueCallback lottieValueCallback = this.e;
        if (lottieValueCallback != null && (pointF = (PointF) lottieValueCallback.b(keyframe.g, keyframe.h.floatValue(), pointF2, pointF3, f, d(), this.d)) != null) {
            return pointF;
        }
        float f4 = pointF2.x;
        float fA = a.a(pointF3.x, f4, f2, f4);
        float f5 = pointF2.y;
        float fA2 = a.a(pointF3.y, f5, f3, f5);
        PointF pointF4 = this.i;
        pointF4.set(fA, fA2);
        return pointF4;
    }
}
