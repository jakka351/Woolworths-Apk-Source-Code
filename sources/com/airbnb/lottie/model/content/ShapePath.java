package com.airbnb.lottie.model.content;

import YU.a;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.ShapeContent;
import com.airbnb.lottie.model.animatable.AnimatableShapeValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* loaded from: classes4.dex */
public class ShapePath implements ContentModel {

    /* renamed from: a, reason: collision with root package name */
    public final String f13419a;
    public final int b;
    public final AnimatableShapeValue c;
    public final boolean d;

    public ShapePath(String str, int i, AnimatableShapeValue animatableShapeValue, boolean z) {
        this.f13419a = str;
        this.b = i;
        this.c = animatableShapeValue;
        this.d = z;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content a(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new ShapeContent(lottieDrawable, baseLayer, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.f13419a);
        sb.append(", index=");
        return a.l(sb, this.b, '}');
    }
}
