package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.content.Repeater;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public class RepeaterContent implements DrawingContent, PathContent, GreedyContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f13365a = new Matrix();
    public final Path b = new Path();
    public final LottieDrawable c;
    public final BaseLayer d;
    public final String e;
    public final boolean f;
    public final FloatKeyframeAnimation g;
    public final FloatKeyframeAnimation h;
    public final TransformKeyframeAnimation i;
    public ContentGroup j;

    public RepeaterContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, Repeater repeater) {
        this.c = lottieDrawable;
        this.d = baseLayer;
        this.e = repeater.f13414a;
        this.f = repeater.e;
        FloatKeyframeAnimation floatKeyframeAnimationG = repeater.b.g();
        this.g = floatKeyframeAnimationG;
        baseLayer.c(floatKeyframeAnimationG);
        floatKeyframeAnimationG.a(this);
        FloatKeyframeAnimation floatKeyframeAnimationG2 = repeater.c.g();
        this.h = floatKeyframeAnimationG2;
        baseLayer.c(floatKeyframeAnimationG2);
        floatKeyframeAnimationG2.a(this);
        AnimatableTransform animatableTransform = repeater.d;
        animatableTransform.getClass();
        TransformKeyframeAnimation transformKeyframeAnimation = new TransformKeyframeAnimation(animatableTransform);
        this.i = transformKeyframeAnimation;
        transformKeyframeAnimation.a(baseLayer);
        transformKeyframeAnimation.b(this);
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public final void a(RectF rectF, Matrix matrix, boolean z) {
        this.j.a(rectF, matrix, z);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void b(LottieValueCallback lottieValueCallback, Object obj) {
        if (this.i.c(lottieValueCallback, obj)) {
            return;
        }
        if (obj == LottieProperty.p) {
            this.g.j(lottieValueCallback);
        } else if (obj == LottieProperty.q) {
            this.h.j(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.content.GreedyContent
    public final void c(ListIterator listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((Content) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new ContentGroup(this.c, this.d, "Repeater", this.f, arrayList, null);
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public final void d(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = ((Float) this.g.e()).floatValue();
        float fFloatValue2 = ((Float) this.h.e()).floatValue();
        TransformKeyframeAnimation transformKeyframeAnimation = this.i;
        float fFloatValue3 = ((Float) transformKeyframeAnimation.m.e()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) transformKeyframeAnimation.n.e()).floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            Matrix matrix2 = this.f13365a;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(transformKeyframeAnimation.f(f + fFloatValue2));
            this.j.d(canvas, matrix2, (int) (MiscUtils.e(fFloatValue3, fFloatValue4, f / fFloatValue) * i));
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public final void e() {
        this.c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final void f(List list, List list2) {
        this.j.f(list, list2);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final String getName() {
        return this.e;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public final Path getPath() {
        Path path = this.j.getPath();
        Path path2 = this.b;
        path2.reset();
        float fFloatValue = ((Float) this.g.e()).floatValue();
        float fFloatValue2 = ((Float) this.h.e()).floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            Matrix matrixF = this.i.f(i + fFloatValue2);
            Matrix matrix = this.f13365a;
            matrix.set(matrixF);
            path2.addPath(path, matrix);
        }
        return path2;
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void h(KeyPath keyPath, int i, ArrayList arrayList, KeyPath keyPath2) {
        MiscUtils.f(keyPath, i, arrayList, keyPath2, this);
        for (int i2 = 0; i2 < this.j.h.size(); i2++) {
            Content content = (Content) this.j.h.get(i2);
            if (content instanceof KeyPathElementContent) {
                MiscUtils.f(keyPath, i, arrayList, keyPath2, (KeyPathElementContent) content);
            }
        }
    }
}
