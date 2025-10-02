package com.airbnb.lottie.animation.content;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ColorKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.IntegerKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.content.ShapeFill;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class FillContent implements DrawingContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {

    /* renamed from: a, reason: collision with root package name */
    public final Path f13358a;
    public final LPaint b;
    public final BaseLayer c;
    public final String d;
    public final boolean e;
    public final ArrayList f;
    public final ColorKeyframeAnimation g;
    public final IntegerKeyframeAnimation h;
    public ValueCallbackKeyframeAnimation i;
    public final LottieDrawable j;
    public BaseKeyframeAnimation k;
    public float l;
    public final DropShadowKeyframeAnimation m;

    public FillContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, ShapeFill shapeFill) {
        Path path = new Path();
        this.f13358a = path;
        this.b = new LPaint(1);
        this.f = new ArrayList();
        this.c = baseLayer;
        String str = shapeFill.c;
        AnimatableIntegerValue animatableIntegerValue = shapeFill.e;
        AnimatableColorValue animatableColorValue = shapeFill.d;
        this.d = str;
        this.e = shapeFill.f;
        this.j = lottieDrawable;
        if (baseLayer.k() != null) {
            FloatKeyframeAnimation floatKeyframeAnimationG = baseLayer.k().f13404a.g();
            this.k = floatKeyframeAnimationG;
            floatKeyframeAnimationG.a(this);
            baseLayer.c(this.k);
        }
        if (baseLayer.l() != null) {
            this.m = new DropShadowKeyframeAnimation(this, baseLayer, baseLayer.l());
        }
        if (animatableColorValue == null) {
            this.g = null;
            this.h = null;
            return;
        }
        path.setFillType(shapeFill.b);
        BaseKeyframeAnimation baseKeyframeAnimationG = animatableColorValue.g();
        this.g = (ColorKeyframeAnimation) baseKeyframeAnimationG;
        baseKeyframeAnimationG.a(this);
        baseLayer.c(baseKeyframeAnimationG);
        BaseKeyframeAnimation baseKeyframeAnimationG2 = animatableIntegerValue.g();
        this.h = (IntegerKeyframeAnimation) baseKeyframeAnimationG2;
        baseKeyframeAnimationG2.a(this);
        baseLayer.c(baseKeyframeAnimationG2);
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public final void a(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f13358a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((PathContent) arrayList.get(i)).getPath(), matrix);
                i++;
            }
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void b(LottieValueCallback lottieValueCallback, Object obj) {
        PointF pointF = LottieProperty.f13346a;
        if (obj == 1) {
            this.g.j(lottieValueCallback);
            return;
        }
        if (obj == 4) {
            this.h.j(lottieValueCallback);
            return;
        }
        ColorFilter colorFilter = LottieProperty.F;
        BaseLayer baseLayer = this.c;
        if (obj == colorFilter) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.i;
            if (valueCallbackKeyframeAnimation != null) {
                baseLayer.o(valueCallbackKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.i = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.i = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.a(this);
            baseLayer.c(this.i);
            return;
        }
        if (obj == LottieProperty.e) {
            BaseKeyframeAnimation baseKeyframeAnimation = this.k;
            if (baseKeyframeAnimation != null) {
                baseKeyframeAnimation.j(lottieValueCallback);
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.k = valueCallbackKeyframeAnimation3;
            valueCallbackKeyframeAnimation3.a(this);
            baseLayer.c(this.k);
            return;
        }
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation = this.m;
        if (obj == 5 && dropShadowKeyframeAnimation != null) {
            dropShadowKeyframeAnimation.c.j(lottieValueCallback);
            return;
        }
        if (obj == LottieProperty.B && dropShadowKeyframeAnimation != null) {
            dropShadowKeyframeAnimation.b(lottieValueCallback);
            return;
        }
        if (obj == LottieProperty.C && dropShadowKeyframeAnimation != null) {
            dropShadowKeyframeAnimation.e.j(lottieValueCallback);
            return;
        }
        if (obj == LottieProperty.D && dropShadowKeyframeAnimation != null) {
            dropShadowKeyframeAnimation.f.j(lottieValueCallback);
        } else {
            if (obj != LottieProperty.E || dropShadowKeyframeAnimation == null) {
                return;
            }
            dropShadowKeyframeAnimation.g.j(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public final void d(Canvas canvas, Matrix matrix, int i) {
        BlurMaskFilter blurMaskFilter;
        if (this.e) {
            return;
        }
        int iK = this.g.k();
        float f = i / 255.0f;
        int iIntValue = (int) (((((Integer) this.h.e()).intValue() * f) / 100.0f) * 255.0f);
        PointF pointF = MiscUtils.f13479a;
        int i2 = 0;
        int iMax = (iK & 16777215) | (Math.max(0, Math.min(255, iIntValue)) << 24);
        LPaint lPaint = this.b;
        lPaint.setColor(iMax);
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.i;
        if (valueCallbackKeyframeAnimation != null) {
            lPaint.setColorFilter((ColorFilter) valueCallbackKeyframeAnimation.e());
        }
        BaseKeyframeAnimation baseKeyframeAnimation = this.k;
        if (baseKeyframeAnimation != null) {
            float fFloatValue = ((Float) baseKeyframeAnimation.e()).floatValue();
            if (fFloatValue == BitmapDescriptorFactory.HUE_RED) {
                lPaint.setMaskFilter(null);
            } else if (fFloatValue != this.l) {
                BaseLayer baseLayer = this.c;
                if (baseLayer.A == fFloatValue) {
                    blurMaskFilter = baseLayer.B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    baseLayer.B = blurMaskFilter2;
                    baseLayer.A = fFloatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                lPaint.setMaskFilter(blurMaskFilter);
            }
            this.l = fFloatValue;
        }
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation = this.m;
        if (dropShadowKeyframeAnimation != null) {
            ThreadLocal threadLocal = Utils.f13480a;
            dropShadowKeyframeAnimation.a(lPaint, matrix, (int) (((f * iIntValue) / 255.0f) * 255.0f));
        }
        Path path = this.f13358a;
        path.reset();
        while (true) {
            ArrayList arrayList = this.f;
            if (i2 >= arrayList.size()) {
                canvas.drawPath(path, lPaint);
                return;
            } else {
                path.addPath(((PathContent) arrayList.get(i2)).getPath(), matrix);
                i2++;
            }
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public final void e() {
        this.j.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final void f(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            Content content = (Content) list2.get(i);
            if (content instanceof PathContent) {
                this.f.add((PathContent) content);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final String getName() {
        return this.d;
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void h(KeyPath keyPath, int i, ArrayList arrayList, KeyPath keyPath2) {
        MiscUtils.f(keyPath, i, arrayList, keyPath2, this);
    }
}
