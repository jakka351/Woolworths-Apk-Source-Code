package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.RectangleShape;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class RectangleContent implements BaseKeyframeAnimation.AnimationListener, KeyPathElementContent, PathContent {
    public final String c;
    public final boolean d;
    public final LottieDrawable e;
    public final BaseKeyframeAnimation f;
    public final BaseKeyframeAnimation g;
    public final FloatKeyframeAnimation h;
    public boolean k;

    /* renamed from: a, reason: collision with root package name */
    public final Path f13364a = new Path();
    public final RectF b = new RectF();
    public final CompoundTrimPathContent i = new CompoundTrimPathContent();
    public BaseKeyframeAnimation j = null;

    public RectangleContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, RectangleShape rectangleShape) {
        this.c = rectangleShape.f13413a;
        this.d = rectangleShape.e;
        this.e = lottieDrawable;
        BaseKeyframeAnimation baseKeyframeAnimationG = rectangleShape.b.g();
        this.f = baseKeyframeAnimationG;
        BaseKeyframeAnimation baseKeyframeAnimationG2 = rectangleShape.c.g();
        this.g = baseKeyframeAnimationG2;
        FloatKeyframeAnimation floatKeyframeAnimationG = rectangleShape.d.g();
        this.h = floatKeyframeAnimationG;
        baseLayer.c(baseKeyframeAnimationG);
        baseLayer.c(baseKeyframeAnimationG2);
        baseLayer.c(floatKeyframeAnimationG);
        baseKeyframeAnimationG.a(this);
        baseKeyframeAnimationG2.a(this);
        floatKeyframeAnimationG.a(this);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void b(LottieValueCallback lottieValueCallback, Object obj) {
        if (obj == LottieProperty.g) {
            this.g.j(lottieValueCallback);
        } else if (obj == LottieProperty.i) {
            this.f.j(lottieValueCallback);
        } else if (obj == LottieProperty.h) {
            this.h.j(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public final void e() {
        this.k = false;
        this.e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    @Override // com.airbnb.lottie.animation.content.Content
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.util.List r5, java.util.List r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            r0 = r5
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            if (r6 >= r1) goto L35
            java.lang.Object r0 = r0.get(r6)
            com.airbnb.lottie.animation.content.Content r0 = (com.airbnb.lottie.animation.content.Content) r0
            boolean r1 = r0 instanceof com.airbnb.lottie.animation.content.TrimPathContent
            if (r1 == 0) goto L28
            r1 = r0
            com.airbnb.lottie.animation.content.TrimPathContent r1 = (com.airbnb.lottie.animation.content.TrimPathContent) r1
            com.airbnb.lottie.model.content.ShapeTrimPath$Type r2 = r1.c
            com.airbnb.lottie.model.content.ShapeTrimPath$Type r3 = com.airbnb.lottie.model.content.ShapeTrimPath.Type.d
            if (r2 != r3) goto L28
            com.airbnb.lottie.animation.content.CompoundTrimPathContent r0 = r4.i
            java.util.ArrayList r0 = r0.f13355a
            r0.add(r1)
            r1.b(r4)
            goto L32
        L28:
            boolean r1 = r0 instanceof com.airbnb.lottie.animation.content.RoundedCornersContent
            if (r1 == 0) goto L32
            com.airbnb.lottie.animation.content.RoundedCornersContent r0 = (com.airbnb.lottie.animation.content.RoundedCornersContent) r0
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation r0 = r0.b
            r4.j = r0
        L32:
            int r6 = r6 + 1
            goto L1
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.content.RectangleContent.f(java.util.List, java.util.List):void");
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final String getName() {
        return this.c;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public final Path getPath() {
        float f;
        BaseKeyframeAnimation baseKeyframeAnimation;
        boolean z = this.k;
        Path path = this.f13364a;
        if (z) {
            return path;
        }
        path.reset();
        if (this.d) {
            this.k = true;
            return path;
        }
        PointF pointF = (PointF) this.g.e();
        float f2 = pointF.x / 2.0f;
        float f3 = pointF.y / 2.0f;
        FloatKeyframeAnimation floatKeyframeAnimation = this.h;
        float fK = floatKeyframeAnimation == null ? 0.0f : floatKeyframeAnimation.k();
        if (fK == BitmapDescriptorFactory.HUE_RED && (baseKeyframeAnimation = this.j) != null) {
            fK = Math.min(((Float) baseKeyframeAnimation.e()).floatValue(), Math.min(f2, f3));
        }
        float fMin = Math.min(f2, f3);
        if (fK > fMin) {
            fK = fMin;
        }
        PointF pointF2 = (PointF) this.f.e();
        path.moveTo(pointF2.x + f2, (pointF2.y - f3) + fK);
        path.lineTo(pointF2.x + f2, (pointF2.y + f3) - fK);
        RectF rectF = this.b;
        if (fK > BitmapDescriptorFactory.HUE_RED) {
            float f4 = pointF2.x + f2;
            float f5 = fK * 2.0f;
            f = 2.0f;
            float f6 = pointF2.y + f3;
            rectF.set(f4 - f5, f6 - f5, f4, f6);
            path.arcTo(rectF, BitmapDescriptorFactory.HUE_RED, 90.0f, false);
        } else {
            f = 2.0f;
        }
        path.lineTo((pointF2.x - f2) + fK, pointF2.y + f3);
        if (fK > BitmapDescriptorFactory.HUE_RED) {
            float f7 = pointF2.x - f2;
            float f8 = pointF2.y + f3;
            float f9 = fK * f;
            rectF.set(f7, f8 - f9, f9 + f7, f8);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f2, (pointF2.y - f3) + fK);
        if (fK > BitmapDescriptorFactory.HUE_RED) {
            float f10 = pointF2.x - f2;
            float f11 = pointF2.y - f3;
            float f12 = fK * f;
            rectF.set(f10, f11, f10 + f12, f12 + f11);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f2) - fK, pointF2.y - f3);
        if (fK > BitmapDescriptorFactory.HUE_RED) {
            float f13 = pointF2.x + f2;
            float f14 = fK * f;
            float f15 = pointF2.y - f3;
            rectF.set(f13 - f14, f15, f13, f14 + f15);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.i.a(path);
        this.k = true;
        return path;
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void h(KeyPath keyPath, int i, ArrayList arrayList, KeyPath keyPath2) {
        MiscUtils.f(keyPath, i, arrayList, keyPath2, this);
    }
}
