package com.airbnb.lottie.animation.keyframe;

import android.graphics.Color;
import android.graphics.Matrix;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;

/* loaded from: classes4.dex */
public class DropShadowKeyframeAnimation implements BaseKeyframeAnimation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final BaseLayer f13372a;
    public final Object b;
    public final ColorKeyframeAnimation c;
    public final FloatKeyframeAnimation d;
    public final FloatKeyframeAnimation e;
    public final FloatKeyframeAnimation f;
    public final FloatKeyframeAnimation g;
    public float h = Float.NaN;
    public float i = Float.NaN;
    public float j = Float.NaN;
    public int k = 0;
    public final float[] l = new float[9];

    public DropShadowKeyframeAnimation(BaseKeyframeAnimation.AnimationListener animationListener, BaseLayer baseLayer, DropShadowEffect dropShadowEffect) {
        this.b = animationListener;
        this.f13372a = baseLayer;
        BaseKeyframeAnimation baseKeyframeAnimationG = dropShadowEffect.f13444a.g();
        this.c = (ColorKeyframeAnimation) baseKeyframeAnimationG;
        baseKeyframeAnimationG.a(this);
        baseLayer.c(baseKeyframeAnimationG);
        FloatKeyframeAnimation floatKeyframeAnimationG = dropShadowEffect.b.g();
        this.d = floatKeyframeAnimationG;
        floatKeyframeAnimationG.a(this);
        baseLayer.c(floatKeyframeAnimationG);
        FloatKeyframeAnimation floatKeyframeAnimationG2 = dropShadowEffect.c.g();
        this.e = floatKeyframeAnimationG2;
        floatKeyframeAnimationG2.a(this);
        baseLayer.c(floatKeyframeAnimationG2);
        FloatKeyframeAnimation floatKeyframeAnimationG3 = dropShadowEffect.d.g();
        this.f = floatKeyframeAnimationG3;
        floatKeyframeAnimationG3.a(this);
        baseLayer.c(floatKeyframeAnimationG3);
        FloatKeyframeAnimation floatKeyframeAnimationG4 = dropShadowEffect.e.g();
        this.g = floatKeyframeAnimationG4;
        floatKeyframeAnimationG4.a(this);
        baseLayer.c(floatKeyframeAnimationG4);
    }

    public final void a(LPaint lPaint, Matrix matrix, int i) {
        float fK = this.e.k() * 0.017453292f;
        float fFloatValue = ((Float) this.f.e()).floatValue();
        double d = fK;
        float fSin = ((float) Math.sin(d)) * fFloatValue;
        float fCos = ((float) Math.cos(d + 3.141592653589793d)) * fFloatValue;
        Matrix matrixE = this.f13372a.w.e();
        float[] fArr = this.l;
        matrixE.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[4];
        matrix.getValues(fArr);
        float f3 = fArr[0] / f;
        float f4 = fSin * f3;
        float f5 = fCos * (fArr[4] / f2);
        int iIntValue = ((Integer) this.c.e()).intValue();
        int iArgb = Color.argb(Math.round((((Float) this.d.e()).floatValue() * i) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
        float fMax = Math.max(((Float) this.g.e()).floatValue() * f3 * 0.33f, Float.MIN_VALUE);
        if (this.h == fMax && this.i == f4 && this.j == f5 && this.k == iArgb) {
            return;
        }
        this.h = fMax;
        this.i = f4;
        this.j = f5;
        this.k = iArgb;
        lPaint.setShadowLayer(fMax, f4, f5, iArgb);
    }

    public final void b(final LottieValueCallback lottieValueCallback) {
        FloatKeyframeAnimation floatKeyframeAnimation = this.d;
        if (lottieValueCallback == null) {
            floatKeyframeAnimation.j(null);
        } else {
            floatKeyframeAnimation.j(new LottieValueCallback<Float>() { // from class: com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation.1
                @Override // com.airbnb.lottie.value.LottieValueCallback
                public final Object a(LottieFrameInfo lottieFrameInfo) {
                    Float f = (Float) lottieValueCallback.a(lottieFrameInfo);
                    if (f == null) {
                        return null;
                    }
                    return Float.valueOf(f.floatValue() * 2.55f);
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$AnimationListener, java.lang.Object] */
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public final void e() {
        this.b.e();
    }
}
