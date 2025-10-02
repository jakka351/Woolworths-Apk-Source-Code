package com.airbnb.lottie.animation.content;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.GradientColorKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.IntegerKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.PointKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.model.content.GradientFill;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class GradientFillContent implements DrawingContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {

    /* renamed from: a, reason: collision with root package name */
    public final String f13359a;
    public final boolean b;
    public final BaseLayer c;
    public final LongSparseArray d = new LongSparseArray((Object) null);
    public final LongSparseArray e = new LongSparseArray((Object) null);
    public final Path f;
    public final LPaint g;
    public final RectF h;
    public final ArrayList i;
    public final GradientType j;
    public final GradientColorKeyframeAnimation k;
    public final IntegerKeyframeAnimation l;
    public final PointKeyframeAnimation m;
    public final PointKeyframeAnimation n;
    public ValueCallbackKeyframeAnimation o;
    public ValueCallbackKeyframeAnimation p;
    public final LottieDrawable q;
    public final int r;
    public BaseKeyframeAnimation s;
    public float t;
    public final DropShadowKeyframeAnimation u;

    public GradientFillContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer, GradientFill gradientFill) {
        Path path = new Path();
        this.f = path;
        this.g = new LPaint(1);
        this.h = new RectF();
        this.i = new ArrayList();
        this.t = BitmapDescriptorFactory.HUE_RED;
        this.c = baseLayer;
        this.f13359a = gradientFill.g;
        this.b = gradientFill.h;
        this.q = lottieDrawable;
        this.j = gradientFill.f13407a;
        path.setFillType(gradientFill.b);
        this.r = (int) (lottieComposition.b() / 32.0f);
        BaseKeyframeAnimation baseKeyframeAnimationG = gradientFill.c.g();
        this.k = (GradientColorKeyframeAnimation) baseKeyframeAnimationG;
        baseKeyframeAnimationG.a(this);
        baseLayer.c(baseKeyframeAnimationG);
        BaseKeyframeAnimation baseKeyframeAnimationG2 = gradientFill.d.g();
        this.l = (IntegerKeyframeAnimation) baseKeyframeAnimationG2;
        baseKeyframeAnimationG2.a(this);
        baseLayer.c(baseKeyframeAnimationG2);
        BaseKeyframeAnimation baseKeyframeAnimationG3 = gradientFill.e.g();
        this.m = (PointKeyframeAnimation) baseKeyframeAnimationG3;
        baseKeyframeAnimationG3.a(this);
        baseLayer.c(baseKeyframeAnimationG3);
        BaseKeyframeAnimation baseKeyframeAnimationG4 = gradientFill.f.g();
        this.n = (PointKeyframeAnimation) baseKeyframeAnimationG4;
        baseKeyframeAnimationG4.a(this);
        baseLayer.c(baseKeyframeAnimationG4);
        if (baseLayer.k() != null) {
            FloatKeyframeAnimation floatKeyframeAnimationG = baseLayer.k().f13404a.g();
            this.s = floatKeyframeAnimationG;
            floatKeyframeAnimationG.a(this);
            baseLayer.c(this.s);
        }
        if (baseLayer.l() != null) {
            this.u = new DropShadowKeyframeAnimation(this, baseLayer, baseLayer.l());
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public final void a(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
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
        if (obj == 4) {
            this.l.j(lottieValueCallback);
            return;
        }
        ColorFilter colorFilter = LottieProperty.F;
        BaseLayer baseLayer = this.c;
        if (obj == colorFilter) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.o;
            if (valueCallbackKeyframeAnimation != null) {
                baseLayer.o(valueCallbackKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.o = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.o = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.a(this);
            baseLayer.c(this.o);
            return;
        }
        if (obj == LottieProperty.G) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = this.p;
            if (valueCallbackKeyframeAnimation3 != null) {
                baseLayer.o(valueCallbackKeyframeAnimation3);
            }
            if (lottieValueCallback == null) {
                this.p = null;
                return;
            }
            this.d.a();
            this.e.a();
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation4 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.p = valueCallbackKeyframeAnimation4;
            valueCallbackKeyframeAnimation4.a(this);
            baseLayer.c(this.p);
            return;
        }
        if (obj == LottieProperty.e) {
            BaseKeyframeAnimation baseKeyframeAnimation = this.s;
            if (baseKeyframeAnimation != null) {
                baseKeyframeAnimation.j(lottieValueCallback);
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation5 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.s = valueCallbackKeyframeAnimation5;
            valueCallbackKeyframeAnimation5.a(this);
            baseLayer.c(this.s);
            return;
        }
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation = this.u;
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

    public final int[] c(int[] iArr) {
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.p;
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

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public final void d(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        Shader radialGradient;
        if (this.b) {
            return;
        }
        Path path = this.f;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i2 >= arrayList.size()) {
                break;
            }
            path.addPath(((PathContent) arrayList.get(i2)).getPath(), matrix);
            i2++;
        }
        path.computeBounds(this.h, false);
        GradientType gradientType = this.j;
        GradientType gradientType2 = GradientType.d;
        GradientColorKeyframeAnimation gradientColorKeyframeAnimation = this.k;
        PointKeyframeAnimation pointKeyframeAnimation = this.n;
        PointKeyframeAnimation pointKeyframeAnimation2 = this.m;
        if (gradientType == gradientType2) {
            long jI = i();
            LongSparseArray longSparseArray = this.d;
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
            LongSparseArray longSparseArray2 = this.e;
            shader = (RadialGradient) longSparseArray2.c(jI2);
            if (shader == null) {
                PointF pointF3 = (PointF) pointKeyframeAnimation2.e();
                PointF pointF4 = (PointF) pointKeyframeAnimation.e();
                GradientColor gradientColor2 = (GradientColor) gradientColorKeyframeAnimation.e();
                int[] iArrC = c(gradientColor2.b);
                float[] fArr = gradientColor2.f13406a;
                float f = pointF3.x;
                float f2 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f, pointF4.y - f2);
                if (fHypot <= BitmapDescriptorFactory.HUE_RED) {
                    fHypot = 0.001f;
                }
                radialGradient = new RadialGradient(f, f2, fHypot, iArrC, fArr, Shader.TileMode.CLAMP);
                longSparseArray2.h(jI2, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        LPaint lPaint = this.g;
        lPaint.setShader(shader);
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.o;
        if (valueCallbackKeyframeAnimation != null) {
            lPaint.setColorFilter((ColorFilter) valueCallbackKeyframeAnimation.e());
        }
        BaseKeyframeAnimation baseKeyframeAnimation = this.s;
        if (baseKeyframeAnimation != null) {
            float fFloatValue = ((Float) baseKeyframeAnimation.e()).floatValue();
            if (fFloatValue == BitmapDescriptorFactory.HUE_RED) {
                lPaint.setMaskFilter(null);
            } else if (fFloatValue != this.t) {
                lPaint.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.t = fFloatValue;
        }
        float f3 = i / 255.0f;
        int iIntValue = (int) (((((Integer) this.l.e()).intValue() * f3) / 100.0f) * 255.0f);
        PointF pointF5 = MiscUtils.f13479a;
        lPaint.setAlpha(Math.max(0, Math.min(255, iIntValue)));
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation = this.u;
        if (dropShadowKeyframeAnimation != null) {
            ThreadLocal threadLocal = Utils.f13480a;
            dropShadowKeyframeAnimation.a(lPaint, matrix, (int) (((f3 * iIntValue) / 255.0f) * 255.0f));
        }
        canvas.drawPath(path, lPaint);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public final void e() {
        this.q.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final void f(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            Content content = (Content) list2.get(i);
            if (content instanceof PathContent) {
                this.i.add((PathContent) content);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final String getName() {
        return this.f13359a;
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void h(KeyPath keyPath, int i, ArrayList arrayList, KeyPath keyPath2) {
        MiscUtils.f(keyPath, i, arrayList, keyPath2, this);
    }

    public final int i() {
        float f = this.m.d;
        float f2 = this.r;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.n.d * f2);
        int iRound3 = Math.round(this.k.d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
