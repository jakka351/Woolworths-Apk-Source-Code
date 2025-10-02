package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ColorKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.value.LottieValueCallback;

/* loaded from: classes4.dex */
public class StrokeContent extends BaseStrokeContent {
    public final BaseLayer r;
    public final String s;
    public final boolean t;
    public final ColorKeyframeAnimation u;
    public ValueCallbackKeyframeAnimation v;

    /* JADX WARN: Illegal instructions before constructor call */
    public StrokeContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, ShapeStroke shapeStroke) {
        int iOrdinal = shapeStroke.g.ordinal();
        Paint.Cap cap = iOrdinal != 0 ? iOrdinal != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iOrdinal2 = shapeStroke.h.ordinal();
        super(lottieDrawable, baseLayer, cap, iOrdinal2 != 0 ? iOrdinal2 != 1 ? iOrdinal2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, shapeStroke.i, shapeStroke.e, shapeStroke.f, shapeStroke.c, shapeStroke.b);
        this.r = baseLayer;
        this.s = shapeStroke.f13420a;
        this.t = shapeStroke.j;
        BaseKeyframeAnimation baseKeyframeAnimationG = shapeStroke.d.g();
        this.u = (ColorKeyframeAnimation) baseKeyframeAnimationG;
        baseKeyframeAnimationG.a(this);
        baseLayer.c(baseKeyframeAnimationG);
    }

    @Override // com.airbnb.lottie.animation.content.BaseStrokeContent, com.airbnb.lottie.model.KeyPathElement
    public final void b(LottieValueCallback lottieValueCallback, Object obj) {
        super.b(lottieValueCallback, obj);
        PointF pointF = LottieProperty.f13346a;
        ColorKeyframeAnimation colorKeyframeAnimation = this.u;
        if (obj == 2) {
            colorKeyframeAnimation.j(lottieValueCallback);
            return;
        }
        if (obj == LottieProperty.F) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.v;
            BaseLayer baseLayer = this.r;
            if (valueCallbackKeyframeAnimation != null) {
                baseLayer.o(valueCallbackKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.v = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.v = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.a(this);
            baseLayer.c(colorKeyframeAnimation);
        }
    }

    @Override // com.airbnb.lottie.animation.content.BaseStrokeContent, com.airbnb.lottie.animation.content.DrawingContent
    public final void d(Canvas canvas, Matrix matrix, int i) {
        if (this.t) {
            return;
        }
        int iK = this.u.k();
        LPaint lPaint = this.i;
        lPaint.setColor(iK);
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.v;
        if (valueCallbackKeyframeAnimation != null) {
            lPaint.setColorFilter((ColorFilter) valueCallbackKeyframeAnimation.e());
        }
        super.d(canvas, matrix, i);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final String getName() {
        return this.s;
    }
}
