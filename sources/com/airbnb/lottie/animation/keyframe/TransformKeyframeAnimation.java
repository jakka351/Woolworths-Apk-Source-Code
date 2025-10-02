package com.airbnb.lottie.animation.keyframe;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePathValue;
import com.airbnb.lottie.model.animatable.AnimatableScaleValue;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import com.airbnb.lottie.value.ScaleXY;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;

/* loaded from: classes4.dex */
public class TransformKeyframeAnimation {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f13374a = new Matrix();
    public final Matrix b;
    public final Matrix c;
    public final Matrix d;
    public final float[] e;
    public BaseKeyframeAnimation f;
    public BaseKeyframeAnimation g;
    public BaseKeyframeAnimation h;
    public BaseKeyframeAnimation i;
    public BaseKeyframeAnimation j;
    public FloatKeyframeAnimation k;
    public FloatKeyframeAnimation l;
    public BaseKeyframeAnimation m;
    public BaseKeyframeAnimation n;
    public final boolean o;

    public TransformKeyframeAnimation(AnimatableTransform animatableTransform) {
        AnimatablePathValue animatablePathValue = animatableTransform.f13402a;
        this.f = animatablePathValue == null ? null : animatablePathValue.g();
        AnimatableValue animatableValue = animatableTransform.b;
        this.g = animatableValue == null ? null : animatableValue.g();
        AnimatableScaleValue animatableScaleValue = animatableTransform.c;
        this.h = animatableScaleValue == null ? null : animatableScaleValue.g();
        AnimatableFloatValue animatableFloatValue = animatableTransform.d;
        this.i = animatableFloatValue == null ? null : animatableFloatValue.g();
        AnimatableFloatValue animatableFloatValue2 = animatableTransform.f;
        FloatKeyframeAnimation floatKeyframeAnimationG = animatableFloatValue2 == null ? null : animatableFloatValue2.g();
        this.k = floatKeyframeAnimationG;
        this.o = animatableTransform.j;
        if (floatKeyframeAnimationG != null) {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        AnimatableFloatValue animatableFloatValue3 = animatableTransform.g;
        this.l = animatableFloatValue3 == null ? null : animatableFloatValue3.g();
        AnimatableIntegerValue animatableIntegerValue = animatableTransform.e;
        if (animatableIntegerValue != null) {
            this.j = animatableIntegerValue.g();
        }
        AnimatableFloatValue animatableFloatValue4 = animatableTransform.h;
        if (animatableFloatValue4 != null) {
            this.m = animatableFloatValue4.g();
        } else {
            this.m = null;
        }
        AnimatableFloatValue animatableFloatValue5 = animatableTransform.i;
        if (animatableFloatValue5 != null) {
            this.n = animatableFloatValue5.g();
        } else {
            this.n = null;
        }
    }

    public final void a(BaseLayer baseLayer) {
        baseLayer.c(this.j);
        baseLayer.c(this.m);
        baseLayer.c(this.n);
        baseLayer.c(this.f);
        baseLayer.c(this.g);
        baseLayer.c(this.h);
        baseLayer.c(this.i);
        baseLayer.c(this.k);
        baseLayer.c(this.l);
    }

    public final void b(BaseKeyframeAnimation.AnimationListener animationListener) {
        BaseKeyframeAnimation baseKeyframeAnimation = this.j;
        if (baseKeyframeAnimation != null) {
            baseKeyframeAnimation.a(animationListener);
        }
        BaseKeyframeAnimation baseKeyframeAnimation2 = this.m;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.a(animationListener);
        }
        BaseKeyframeAnimation baseKeyframeAnimation3 = this.n;
        if (baseKeyframeAnimation3 != null) {
            baseKeyframeAnimation3.a(animationListener);
        }
        BaseKeyframeAnimation baseKeyframeAnimation4 = this.f;
        if (baseKeyframeAnimation4 != null) {
            baseKeyframeAnimation4.a(animationListener);
        }
        BaseKeyframeAnimation baseKeyframeAnimation5 = this.g;
        if (baseKeyframeAnimation5 != null) {
            baseKeyframeAnimation5.a(animationListener);
        }
        BaseKeyframeAnimation baseKeyframeAnimation6 = this.h;
        if (baseKeyframeAnimation6 != null) {
            baseKeyframeAnimation6.a(animationListener);
        }
        BaseKeyframeAnimation baseKeyframeAnimation7 = this.i;
        if (baseKeyframeAnimation7 != null) {
            baseKeyframeAnimation7.a(animationListener);
        }
        FloatKeyframeAnimation floatKeyframeAnimation = this.k;
        if (floatKeyframeAnimation != null) {
            floatKeyframeAnimation.a(animationListener);
        }
        FloatKeyframeAnimation floatKeyframeAnimation2 = this.l;
        if (floatKeyframeAnimation2 != null) {
            floatKeyframeAnimation2.a(animationListener);
        }
    }

    public final boolean c(LottieValueCallback lottieValueCallback, Object obj) {
        Float fValueOf = Float.valueOf(100.0f);
        Float fValueOf2 = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        if (obj == LottieProperty.f13346a) {
            BaseKeyframeAnimation baseKeyframeAnimation = this.f;
            if (baseKeyframeAnimation == null) {
                this.f = new ValueCallbackKeyframeAnimation(lottieValueCallback, new PointF());
                return true;
            }
            baseKeyframeAnimation.j(lottieValueCallback);
            return true;
        }
        if (obj == LottieProperty.b) {
            BaseKeyframeAnimation baseKeyframeAnimation2 = this.g;
            if (baseKeyframeAnimation2 == null) {
                this.g = new ValueCallbackKeyframeAnimation(lottieValueCallback, new PointF());
                return true;
            }
            baseKeyframeAnimation2.j(lottieValueCallback);
            return true;
        }
        if (obj == LottieProperty.c) {
            BaseKeyframeAnimation baseKeyframeAnimation3 = this.g;
            if (baseKeyframeAnimation3 instanceof SplitDimensionPathKeyframeAnimation) {
                SplitDimensionPathKeyframeAnimation splitDimensionPathKeyframeAnimation = (SplitDimensionPathKeyframeAnimation) baseKeyframeAnimation3;
                LottieValueCallback lottieValueCallback2 = splitDimensionPathKeyframeAnimation.m;
                splitDimensionPathKeyframeAnimation.m = lottieValueCallback;
                return true;
            }
        }
        if (obj == LottieProperty.d) {
            BaseKeyframeAnimation baseKeyframeAnimation4 = this.g;
            if (baseKeyframeAnimation4 instanceof SplitDimensionPathKeyframeAnimation) {
                SplitDimensionPathKeyframeAnimation splitDimensionPathKeyframeAnimation2 = (SplitDimensionPathKeyframeAnimation) baseKeyframeAnimation4;
                LottieValueCallback lottieValueCallback3 = splitDimensionPathKeyframeAnimation2.n;
                splitDimensionPathKeyframeAnimation2.n = lottieValueCallback;
                return true;
            }
        }
        if (obj == LottieProperty.j) {
            BaseKeyframeAnimation baseKeyframeAnimation5 = this.h;
            if (baseKeyframeAnimation5 == null) {
                this.h = new ValueCallbackKeyframeAnimation(lottieValueCallback, new ScaleXY());
                return true;
            }
            baseKeyframeAnimation5.j(lottieValueCallback);
            return true;
        }
        if (obj == LottieProperty.k) {
            BaseKeyframeAnimation baseKeyframeAnimation6 = this.i;
            if (baseKeyframeAnimation6 == null) {
                this.i = new ValueCallbackKeyframeAnimation(lottieValueCallback, fValueOf2);
                return true;
            }
            baseKeyframeAnimation6.j(lottieValueCallback);
            return true;
        }
        if (obj == 3) {
            BaseKeyframeAnimation baseKeyframeAnimation7 = this.j;
            if (baseKeyframeAnimation7 == null) {
                this.j = new ValueCallbackKeyframeAnimation(lottieValueCallback, 100);
                return true;
            }
            baseKeyframeAnimation7.j(lottieValueCallback);
            return true;
        }
        if (obj == LottieProperty.x) {
            BaseKeyframeAnimation baseKeyframeAnimation8 = this.m;
            if (baseKeyframeAnimation8 == null) {
                this.m = new ValueCallbackKeyframeAnimation(lottieValueCallback, fValueOf);
                return true;
            }
            baseKeyframeAnimation8.j(lottieValueCallback);
            return true;
        }
        if (obj == LottieProperty.y) {
            BaseKeyframeAnimation baseKeyframeAnimation9 = this.n;
            if (baseKeyframeAnimation9 == null) {
                this.n = new ValueCallbackKeyframeAnimation(lottieValueCallback, fValueOf);
                return true;
            }
            baseKeyframeAnimation9.j(lottieValueCallback);
            return true;
        }
        if (obj == LottieProperty.l) {
            if (this.k == null) {
                this.k = new FloatKeyframeAnimation(Collections.singletonList(new Keyframe(fValueOf2)));
            }
            this.k.j(lottieValueCallback);
            return true;
        }
        if (obj != LottieProperty.m) {
            return false;
        }
        if (this.l == null) {
            this.l = new FloatKeyframeAnimation(Collections.singletonList(new Keyframe(fValueOf2)));
        }
        this.l.j(lottieValueCallback);
        return true;
    }

    public final void d() {
        for (int i = 0; i < 9; i++) {
            this.e[i] = 0.0f;
        }
    }

    public final Matrix e() {
        PointF pointF;
        ScaleXY scaleXY;
        PointF pointF2;
        Matrix matrix = this.f13374a;
        matrix.reset();
        BaseKeyframeAnimation baseKeyframeAnimation = this.g;
        if (baseKeyframeAnimation != null && (pointF2 = (PointF) baseKeyframeAnimation.e()) != null) {
            float f = pointF2.x;
            if (f != BitmapDescriptorFactory.HUE_RED || pointF2.y != BitmapDescriptorFactory.HUE_RED) {
                matrix.preTranslate(f, pointF2.y);
            }
        }
        if (!this.o) {
            BaseKeyframeAnimation baseKeyframeAnimation2 = this.i;
            if (baseKeyframeAnimation2 != null) {
                float fFloatValue = baseKeyframeAnimation2 instanceof ValueCallbackKeyframeAnimation ? ((Float) baseKeyframeAnimation2.e()).floatValue() : ((FloatKeyframeAnimation) baseKeyframeAnimation2).k();
                if (fFloatValue != BitmapDescriptorFactory.HUE_RED) {
                    matrix.preRotate(fFloatValue);
                }
            }
        } else if (baseKeyframeAnimation != null) {
            float f2 = baseKeyframeAnimation.d;
            PointF pointF3 = (PointF) baseKeyframeAnimation.e();
            float f3 = pointF3.x;
            float f4 = pointF3.y;
            baseKeyframeAnimation.i(1.0E-4f + f2);
            PointF pointF4 = (PointF) baseKeyframeAnimation.e();
            baseKeyframeAnimation.i(f2);
            matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f4, pointF4.x - f3)));
        }
        if (this.k != null) {
            float fCos = this.l == null ? 0.0f : (float) Math.cos(Math.toRadians((-r4.k()) + 90.0f));
            float fSin = this.l == null ? 1.0f : (float) Math.sin(Math.toRadians((-r6.k()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r1.k()));
            d();
            float[] fArr = this.e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f5 = -fSin;
            fArr[3] = f5;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.b;
            matrix2.setValues(fArr);
            d();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.c;
            matrix3.setValues(fArr);
            d();
            fArr[0] = fCos;
            fArr[1] = f5;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        BaseKeyframeAnimation baseKeyframeAnimation3 = this.h;
        if (baseKeyframeAnimation3 != null && (scaleXY = (ScaleXY) baseKeyframeAnimation3.e()) != null) {
            float f6 = scaleXY.f13484a;
            if (f6 != 1.0f || scaleXY.b != 1.0f) {
                matrix.preScale(f6, scaleXY.b);
            }
        }
        BaseKeyframeAnimation baseKeyframeAnimation4 = this.f;
        if (baseKeyframeAnimation4 != null && (pointF = (PointF) baseKeyframeAnimation4.e()) != null) {
            float f7 = pointF.x;
            if (f7 != BitmapDescriptorFactory.HUE_RED || pointF.y != BitmapDescriptorFactory.HUE_RED) {
                matrix.preTranslate(-f7, -pointF.y);
            }
        }
        return matrix;
    }

    public final Matrix f(float f) {
        BaseKeyframeAnimation baseKeyframeAnimation = this.g;
        PointF pointF = baseKeyframeAnimation == null ? null : (PointF) baseKeyframeAnimation.e();
        BaseKeyframeAnimation baseKeyframeAnimation2 = this.h;
        ScaleXY scaleXY = baseKeyframeAnimation2 == null ? null : (ScaleXY) baseKeyframeAnimation2.e();
        Matrix matrix = this.f13374a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (scaleXY != null) {
            double d = f;
            matrix.preScale((float) Math.pow(scaleXY.f13484a, d), (float) Math.pow(scaleXY.b, d));
        }
        BaseKeyframeAnimation baseKeyframeAnimation3 = this.i;
        if (baseKeyframeAnimation3 != null) {
            float fFloatValue = ((Float) baseKeyframeAnimation3.e()).floatValue();
            BaseKeyframeAnimation baseKeyframeAnimation4 = this.f;
            PointF pointF2 = baseKeyframeAnimation4 != null ? (PointF) baseKeyframeAnimation4.e() : null;
            float f2 = fFloatValue * f;
            float f3 = BitmapDescriptorFactory.HUE_RED;
            float f4 = pointF2 == null ? 0.0f : pointF2.x;
            if (pointF2 != null) {
                f3 = pointF2.y;
            }
            matrix.preRotate(f2, f4, f3);
        }
        return matrix;
    }
}
