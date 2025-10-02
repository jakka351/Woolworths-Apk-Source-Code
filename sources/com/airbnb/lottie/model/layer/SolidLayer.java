package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.value.LottieValueCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes4.dex */
public class SolidLayer extends BaseLayer {
    public final RectF D;
    public final LPaint E;
    public final float[] F;
    public final Path G;
    public final Layer H;
    public ValueCallbackKeyframeAnimation I;
    public ValueCallbackKeyframeAnimation J;

    public SolidLayer(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.D = new RectF();
        LPaint lPaint = new LPaint();
        this.E = lPaint;
        this.F = new float[8];
        this.G = new Path();
        this.H = layer;
        lPaint.setAlpha(0);
        lPaint.setStyle(Paint.Style.FILL);
        lPaint.setColor(layer.l);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public final void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        Layer layer = this.H;
        float f = layer.j;
        float f2 = layer.k;
        RectF rectF2 = this.D;
        rectF2.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f2);
        this.n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public final void b(LottieValueCallback lottieValueCallback, Object obj) {
        super.b(lottieValueCallback, obj);
        if (obj == LottieProperty.F) {
            if (lottieValueCallback == null) {
                this.I = null;
                return;
            } else {
                this.I = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
                return;
            }
        }
        if (obj == 1) {
            if (lottieValueCallback != null) {
                this.J = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
                return;
            }
            this.J = null;
            this.E.setColor(this.H.l);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public final void j(Canvas canvas, Matrix matrix, int i) {
        Layer layer = this.H;
        int iAlpha = Color.alpha(layer.l);
        if (iAlpha == 0) {
            return;
        }
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.J;
        Integer num = valueCallbackKeyframeAnimation == null ? null : (Integer) valueCallbackKeyframeAnimation.e();
        LPaint lPaint = this.E;
        if (num != null) {
            lPaint.setColor(num.intValue());
        } else {
            lPaint.setColor(layer.l);
        }
        int iIntValue = (int) ((((iAlpha / 255.0f) * (this.w.j == null ? 100 : ((Integer) r2.e()).intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        lPaint.setAlpha(iIntValue);
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = this.I;
        if (valueCallbackKeyframeAnimation2 != null) {
            lPaint.setColorFilter((ColorFilter) valueCallbackKeyframeAnimation2.e());
        }
        if (iIntValue > 0) {
            float[] fArr = this.F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = layer.j;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = layer.k;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            Path path = this.G;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, lPaint);
        }
    }
}
