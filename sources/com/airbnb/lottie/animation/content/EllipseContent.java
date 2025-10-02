package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.PointKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.CircleShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class EllipseContent implements PathContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {
    public final String b;
    public final LottieDrawable c;
    public final PointKeyframeAnimation d;
    public final BaseKeyframeAnimation e;
    public final CircleShape f;
    public boolean h;

    /* renamed from: a, reason: collision with root package name */
    public final Path f13357a = new Path();
    public final CompoundTrimPathContent g = new CompoundTrimPathContent();

    public EllipseContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, CircleShape circleShape) {
        this.b = circleShape.f13405a;
        this.c = lottieDrawable;
        BaseKeyframeAnimation baseKeyframeAnimationG = circleShape.c.g();
        this.d = (PointKeyframeAnimation) baseKeyframeAnimationG;
        BaseKeyframeAnimation baseKeyframeAnimationG2 = circleShape.b.g();
        this.e = baseKeyframeAnimationG2;
        this.f = circleShape;
        baseLayer.c(baseKeyframeAnimationG);
        baseLayer.c(baseKeyframeAnimationG2);
        baseKeyframeAnimationG.a(this);
        baseKeyframeAnimationG2.a(this);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void b(LottieValueCallback lottieValueCallback, Object obj) {
        if (obj == LottieProperty.f) {
            this.d.j(lottieValueCallback);
        } else if (obj == LottieProperty.i) {
            this.e.j(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public final void e() {
        this.h = false;
        this.c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final void f(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            Content content = (Content) arrayList.get(i);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent = (TrimPathContent) content;
                if (trimPathContent.c == ShapeTrimPath.Type.d) {
                    this.g.f13355a.add(trimPathContent);
                    trimPathContent.b(this);
                }
            }
            i++;
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final String getName() {
        return this.b;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public final Path getPath() {
        boolean z = this.h;
        Path path = this.f13357a;
        if (z) {
            return path;
        }
        path.reset();
        CircleShape circleShape = this.f;
        if (circleShape.e) {
            this.h = true;
            return path;
        }
        PointF pointF = (PointF) this.d.e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = f2 * 0.55228f;
        path.reset();
        if (circleShape.d) {
            float f5 = -f2;
            path.moveTo(BitmapDescriptorFactory.HUE_RED, f5);
            float f6 = BitmapDescriptorFactory.HUE_RED - f3;
            float f7 = -f;
            float f8 = BitmapDescriptorFactory.HUE_RED - f4;
            path.cubicTo(f6, f5, f7, f8, f7, BitmapDescriptorFactory.HUE_RED);
            float f9 = f4 + BitmapDescriptorFactory.HUE_RED;
            path.cubicTo(f7, f9, f6, f2, BitmapDescriptorFactory.HUE_RED, f2);
            float f10 = f3 + BitmapDescriptorFactory.HUE_RED;
            path.cubicTo(f10, f2, f, f9, f, BitmapDescriptorFactory.HUE_RED);
            path.cubicTo(f, f8, f10, f5, BitmapDescriptorFactory.HUE_RED, f5);
        } else {
            float f11 = -f2;
            path.moveTo(BitmapDescriptorFactory.HUE_RED, f11);
            float f12 = f3 + BitmapDescriptorFactory.HUE_RED;
            float f13 = BitmapDescriptorFactory.HUE_RED - f4;
            path.cubicTo(f12, f11, f, f13, f, BitmapDescriptorFactory.HUE_RED);
            float f14 = f4 + BitmapDescriptorFactory.HUE_RED;
            path.cubicTo(f, f14, f12, f2, BitmapDescriptorFactory.HUE_RED, f2);
            float f15 = BitmapDescriptorFactory.HUE_RED - f3;
            float f16 = -f;
            path.cubicTo(f15, f2, f16, f14, f16, BitmapDescriptorFactory.HUE_RED);
            path.cubicTo(f16, f13, f15, f11, BitmapDescriptorFactory.HUE_RED, f11);
        }
        PointF pointF2 = (PointF) this.e.e();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.g.a(path);
        this.h = true;
        return path;
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void h(KeyPath keyPath, int i, ArrayList arrayList, KeyPath keyPath2) {
        MiscUtils.f(keyPath, i, arrayList, keyPath2, this);
    }
}
