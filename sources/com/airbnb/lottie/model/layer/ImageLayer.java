package com.airbnb.lottie.model.layer;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class ImageLayer extends BaseLayer {
    public final LPaint D;
    public final Rect E;
    public final Rect F;
    public final LottieImageAsset G;
    public ValueCallbackKeyframeAnimation H;
    public ValueCallbackKeyframeAnimation I;
    public final DropShadowKeyframeAnimation J;

    public ImageLayer(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.D = new LPaint(3);
        this.E = new Rect();
        this.F = new Rect();
        String str = layer.g;
        LottieComposition lottieComposition = lottieDrawable.d;
        this.G = lottieComposition == null ? null : (LottieImageAsset) ((HashMap) lottieComposition.c()).get(str);
        DropShadowEffect dropShadowEffect = this.p.x;
        if (dropShadowEffect != null) {
            this.J = new DropShadowKeyframeAnimation(this, this, dropShadowEffect);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public final void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        if (this.G != null) {
            float fC = Utils.c();
            rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, r3.f13345a * fC, r3.b * fC);
            this.n.mapRect(rectF);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public final void b(LottieValueCallback lottieValueCallback, Object obj) {
        super.b(lottieValueCallback, obj);
        if (obj == LottieProperty.F) {
            if (lottieValueCallback == null) {
                this.H = null;
                return;
            } else {
                this.H = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
                return;
            }
        }
        if (obj == LottieProperty.I) {
            if (lottieValueCallback == null) {
                this.I = null;
            } else {
                this.I = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0134  */
    @Override // com.airbnb.lottie.model.layer.BaseLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.ImageLayer.j(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
