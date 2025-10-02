package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.GradientColorKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.PointKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.model.content.GradientStroke;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.value.LottieValueCallback;

/* loaded from: classes4.dex */
public class GradientStrokeContent extends BaseStrokeContent {
    public final PointKeyframeAnimation A;
    public ValueCallbackKeyframeAnimation B;
    public final String r;
    public final boolean s;
    public final LongSparseArray t;
    public final LongSparseArray u;
    public final RectF v;
    public final GradientType w;
    public final int x;
    public final GradientColorKeyframeAnimation y;
    public final PointKeyframeAnimation z;

    /* JADX WARN: Illegal instructions before constructor call */
    public GradientStrokeContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, GradientStroke gradientStroke) {
        Paint.Join join;
        Paint.Join join2;
        int iOrdinal = gradientStroke.h.ordinal();
        Paint.Cap cap = iOrdinal != 0 ? iOrdinal != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iOrdinal2 = gradientStroke.i.ordinal();
        if (iOrdinal2 == 0) {
            join = Paint.Join.MITER;
        } else if (iOrdinal2 == 1) {
            join = Paint.Join.ROUND;
        } else {
            if (iOrdinal2 != 2) {
                join2 = null;
                super(lottieDrawable, baseLayer, cap, join2, gradientStroke.j, gradientStroke.d, gradientStroke.g, gradientStroke.k, gradientStroke.l);
                this.t = new LongSparseArray((Object) null);
                this.u = new LongSparseArray((Object) null);
                this.v = new RectF();
                this.r = gradientStroke.f13408a;
                this.w = gradientStroke.b;
                this.s = gradientStroke.m;
                this.x = (int) (lottieDrawable.d.b() / 32.0f);
                BaseKeyframeAnimation baseKeyframeAnimationG = gradientStroke.c.g();
                this.y = (GradientColorKeyframeAnimation) baseKeyframeAnimationG;
                baseKeyframeAnimationG.a(this);
                baseLayer.c(baseKeyframeAnimationG);
                BaseKeyframeAnimation baseKeyframeAnimationG2 = gradientStroke.e.g();
                this.z = (PointKeyframeAnimation) baseKeyframeAnimationG2;
                baseKeyframeAnimationG2.a(this);
                baseLayer.c(baseKeyframeAnimationG2);
                BaseKeyframeAnimation baseKeyframeAnimationG3 = gradientStroke.f.g();
                this.A = (PointKeyframeAnimation) baseKeyframeAnimationG3;
                baseKeyframeAnimationG3.a(this);
                baseLayer.c(baseKeyframeAnimationG3);
            }
            join = Paint.Join.BEVEL;
        }
        join2 = join;
        super(lottieDrawable, baseLayer, cap, join2, gradientStroke.j, gradientStroke.d, gradientStroke.g, gradientStroke.k, gradientStroke.l);
        this.t = new LongSparseArray((Object) null);
        this.u = new LongSparseArray((Object) null);
        this.v = new RectF();
        this.r = gradientStroke.f13408a;
        this.w = gradientStroke.b;
        this.s = gradientStroke.m;
        this.x = (int) (lottieDrawable.d.b() / 32.0f);
        BaseKeyframeAnimation baseKeyframeAnimationG4 = gradientStroke.c.g();
        this.y = (GradientColorKeyframeAnimation) baseKeyframeAnimationG4;
        baseKeyframeAnimationG4.a(this);
        baseLayer.c(baseKeyframeAnimationG4);
        BaseKeyframeAnimation baseKeyframeAnimationG22 = gradientStroke.e.g();
        this.z = (PointKeyframeAnimation) baseKeyframeAnimationG22;
        baseKeyframeAnimationG22.a(this);
        baseLayer.c(baseKeyframeAnimationG22);
        BaseKeyframeAnimation baseKeyframeAnimationG32 = gradientStroke.f.g();
        this.A = (PointKeyframeAnimation) baseKeyframeAnimationG32;
        baseKeyframeAnimationG32.a(this);
        baseLayer.c(baseKeyframeAnimationG32);
    }

    @Override // com.airbnb.lottie.animation.content.BaseStrokeContent, com.airbnb.lottie.model.KeyPathElement
    public final void b(LottieValueCallback lottieValueCallback, Object obj) {
        super.b(lottieValueCallback, obj);
        if (obj == LottieProperty.G) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.B;
            BaseLayer baseLayer = this.f;
            if (valueCallbackKeyframeAnimation != null) {
                baseLayer.o(valueCallbackKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.B = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.B = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.a(this);
            baseLayer.c(this.B);
        }
    }

    public final int[] c(int[] iArr) {
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.B;
        if (valueCallbackKeyframeAnimation != null) {
            Integer[] numArr = (Integer[]) valueCallbackKeyframeAnimation.e();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // com.airbnb.lottie.animation.content.BaseStrokeContent, com.airbnb.lottie.animation.content.DrawingContent
    public final void d(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        Shader radialGradient;
        if (this.s) {
            return;
        }
        a(this.v, matrix, false);
        GradientType gradientType = this.w;
        GradientType gradientType2 = GradientType.d;
        GradientColorKeyframeAnimation gradientColorKeyframeAnimation = this.y;
        PointKeyframeAnimation pointKeyframeAnimation = this.A;
        PointKeyframeAnimation pointKeyframeAnimation2 = this.z;
        if (gradientType == gradientType2) {
            long jI = i();
            LongSparseArray longSparseArray = this.t;
            shader = (LinearGradient) longSparseArray.c(jI);
            if (shader == null) {
                PointF pointF = (PointF) pointKeyframeAnimation2.e();
                PointF pointF2 = (PointF) pointKeyframeAnimation.e();
                GradientColor gradientColor = (GradientColor) gradientColorKeyframeAnimation.e();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, c(gradientColor.b), gradientColor.f13406a, Shader.TileMode.CLAMP);
                longSparseArray.h(jI, radialGradient);
                shader = radialGradient;
            }
        } else {
            long jI2 = i();
            LongSparseArray longSparseArray2 = this.u;
            shader = (RadialGradient) longSparseArray2.c(jI2);
            if (shader == null) {
                PointF pointF3 = (PointF) pointKeyframeAnimation2.e();
                PointF pointF4 = (PointF) pointKeyframeAnimation.e();
                GradientColor gradientColor2 = (GradientColor) gradientColorKeyframeAnimation.e();
                int[] iArrC = c(gradientColor2.b);
                float[] fArr = gradientColor2.f13406a;
                radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), iArrC, fArr, Shader.TileMode.CLAMP);
                longSparseArray2.h(jI2, radialGradient);
                shader = radialGradient;
            }
        }
        this.i.setShader(shader);
        super.d(canvas, matrix, i);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final String getName() {
        return this.r;
    }

    public final int i() {
        float f = this.z.d;
        float f2 = this.x;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.A.d * f2);
        int iRound3 = Math.round(this.y.d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
