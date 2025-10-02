package com.airbnb.lottie.animation.content;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.IntegerKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class BaseStrokeContent implements BaseKeyframeAnimation.AnimationListener, KeyPathElementContent, DrawingContent {
    public final LottieDrawable e;
    public final BaseLayer f;
    public final float[] h;
    public final LPaint i;
    public final FloatKeyframeAnimation j;
    public final IntegerKeyframeAnimation k;
    public final ArrayList l;
    public final FloatKeyframeAnimation m;
    public ValueCallbackKeyframeAnimation n;
    public BaseKeyframeAnimation o;
    public float p;
    public final DropShadowKeyframeAnimation q;

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f13353a = new PathMeasure();
    public final Path b = new Path();
    public final Path c = new Path();
    public final RectF d = new RectF();
    public final ArrayList g = new ArrayList();

    public static final class PathGroup {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f13354a = new ArrayList();
        public final TrimPathContent b;

        public PathGroup(TrimPathContent trimPathContent) {
            this.b = trimPathContent;
        }
    }

    public BaseStrokeContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, Paint.Cap cap, Paint.Join join, float f, AnimatableIntegerValue animatableIntegerValue, AnimatableFloatValue animatableFloatValue, ArrayList arrayList, AnimatableFloatValue animatableFloatValue2) {
        LPaint lPaint = new LPaint(1);
        this.i = lPaint;
        this.p = BitmapDescriptorFactory.HUE_RED;
        this.e = lottieDrawable;
        this.f = baseLayer;
        lPaint.setStyle(Paint.Style.STROKE);
        lPaint.setStrokeCap(cap);
        lPaint.setStrokeJoin(join);
        lPaint.setStrokeMiter(f);
        this.k = (IntegerKeyframeAnimation) animatableIntegerValue.g();
        this.j = animatableFloatValue.g();
        if (animatableFloatValue2 == null) {
            this.m = null;
        } else {
            this.m = animatableFloatValue2.g();
        }
        this.l = new ArrayList(arrayList.size());
        this.h = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.l.add(((AnimatableFloatValue) arrayList.get(i)).g());
        }
        baseLayer.c(this.k);
        baseLayer.c(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            baseLayer.c((BaseKeyframeAnimation) this.l.get(i2));
        }
        FloatKeyframeAnimation floatKeyframeAnimation = this.m;
        if (floatKeyframeAnimation != null) {
            baseLayer.c(floatKeyframeAnimation);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((BaseKeyframeAnimation) this.l.get(i3)).a(this);
        }
        FloatKeyframeAnimation floatKeyframeAnimation2 = this.m;
        if (floatKeyframeAnimation2 != null) {
            floatKeyframeAnimation2.a(this);
        }
        if (baseLayer.k() != null) {
            FloatKeyframeAnimation floatKeyframeAnimationG = baseLayer.k().f13404a.g();
            this.o = floatKeyframeAnimationG;
            floatKeyframeAnimationG.a(this);
            baseLayer.c(this.o);
        }
        if (baseLayer.l() != null) {
            this.q = new DropShadowKeyframeAnimation(this, baseLayer, baseLayer.l());
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public final void a(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.d;
                path.computeBounds(rectF2, false);
                float fK = this.j.k() / 2.0f;
                rectF2.set(rectF2.left - fK, rectF2.top - fK, rectF2.right + fK, rectF2.bottom + fK);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            PathGroup pathGroup = (PathGroup) arrayList.get(i);
            for (int i2 = 0; i2 < pathGroup.f13354a.size(); i2++) {
                path.addPath(((PathContent) pathGroup.f13354a.get(i2)).getPath(), matrix);
            }
            i++;
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void b(LottieValueCallback lottieValueCallback, Object obj) {
        PointF pointF = LottieProperty.f13346a;
        if (obj == 4) {
            this.k.j(lottieValueCallback);
            return;
        }
        if (obj == LottieProperty.n) {
            this.j.j(lottieValueCallback);
            return;
        }
        ColorFilter colorFilter = LottieProperty.F;
        BaseLayer baseLayer = this.f;
        if (obj == colorFilter) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.n;
            if (valueCallbackKeyframeAnimation != null) {
                baseLayer.o(valueCallbackKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.n = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.n = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.a(this);
            baseLayer.c(this.n);
            return;
        }
        if (obj == LottieProperty.e) {
            BaseKeyframeAnimation baseKeyframeAnimation = this.o;
            if (baseKeyframeAnimation != null) {
                baseKeyframeAnimation.j(lottieValueCallback);
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.o = valueCallbackKeyframeAnimation3;
            valueCallbackKeyframeAnimation3.a(this);
            baseLayer.c(this.o);
            return;
        }
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation = this.q;
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

    /* JADX WARN: Removed duplicated region for block: B:81:0x01fe  */
    @Override // com.airbnb.lottie.animation.content.DrawingContent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(android.graphics.Canvas r20, android.graphics.Matrix r21, int r22) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.content.BaseStrokeContent.d(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public final void e() {
        this.e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    @Override // com.airbnb.lottie.animation.content.Content
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.util.List r8, java.util.List r9) {
        /*
            r7 = this;
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        La:
            com.airbnb.lottie.model.content.ShapeTrimPath$Type r3 = com.airbnb.lottie.model.content.ShapeTrimPath.Type.e
            if (r0 < 0) goto L22
            java.lang.Object r4 = r8.get(r0)
            com.airbnb.lottie.animation.content.Content r4 = (com.airbnb.lottie.animation.content.Content) r4
            boolean r5 = r4 instanceof com.airbnb.lottie.animation.content.TrimPathContent
            if (r5 == 0) goto L1f
            com.airbnb.lottie.animation.content.TrimPathContent r4 = (com.airbnb.lottie.animation.content.TrimPathContent) r4
            com.airbnb.lottie.model.content.ShapeTrimPath$Type r5 = r4.c
            if (r5 != r3) goto L1f
            r2 = r4
        L1f:
            int r0 = r0 + (-1)
            goto La
        L22:
            if (r2 == 0) goto L27
            r2.b(r7)
        L27:
            int r8 = r9.size()
            int r8 = r8 + (-1)
        L2d:
            java.util.ArrayList r0 = r7.g
            if (r8 < 0) goto L66
            java.lang.Object r4 = r9.get(r8)
            com.airbnb.lottie.animation.content.Content r4 = (com.airbnb.lottie.animation.content.Content) r4
            boolean r5 = r4 instanceof com.airbnb.lottie.animation.content.TrimPathContent
            if (r5 == 0) goto L51
            r5 = r4
            com.airbnb.lottie.animation.content.TrimPathContent r5 = (com.airbnb.lottie.animation.content.TrimPathContent) r5
            com.airbnb.lottie.model.content.ShapeTrimPath$Type r6 = r5.c
            if (r6 != r3) goto L51
            if (r1 == 0) goto L47
            r0.add(r1)
        L47:
            com.airbnb.lottie.animation.content.BaseStrokeContent$PathGroup r0 = new com.airbnb.lottie.animation.content.BaseStrokeContent$PathGroup
            r0.<init>(r5)
            r5.b(r7)
            r1 = r0
            goto L63
        L51:
            boolean r0 = r4 instanceof com.airbnb.lottie.animation.content.PathContent
            if (r0 == 0) goto L63
            if (r1 != 0) goto L5c
            com.airbnb.lottie.animation.content.BaseStrokeContent$PathGroup r1 = new com.airbnb.lottie.animation.content.BaseStrokeContent$PathGroup
            r1.<init>(r2)
        L5c:
            java.util.ArrayList r0 = r1.f13354a
            com.airbnb.lottie.animation.content.PathContent r4 = (com.airbnb.lottie.animation.content.PathContent) r4
            r0.add(r4)
        L63:
            int r8 = r8 + (-1)
            goto L2d
        L66:
            if (r1 == 0) goto L6b
            r0.add(r1)
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.content.BaseStrokeContent.f(java.util.List, java.util.List):void");
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void h(KeyPath keyPath, int i, ArrayList arrayList, KeyPath keyPath2) {
        MiscUtils.f(keyPath, i, arrayList, keyPath2, this);
    }
}
