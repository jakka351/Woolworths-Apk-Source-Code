package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.RectangleContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* loaded from: classes4.dex */
public class RectangleShape implements ContentModel {

    /* renamed from: a, reason: collision with root package name */
    public final String f13413a;
    public final AnimatableValue b;
    public final AnimatableValue c;
    public final AnimatableFloatValue d;
    public final boolean e;

    public RectangleShape(String str, AnimatableValue animatableValue, AnimatablePointValue animatablePointValue, AnimatableFloatValue animatableFloatValue, boolean z) {
        this.f13413a = str;
        this.b = animatableValue;
        this.c = animatablePointValue;
        this.d = animatableFloatValue;
        this.e = z;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content a(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new RectangleContent(lottieDrawable, baseLayer, this);
    }

    public final String toString() {
        return "RectangleShape{position=" + this.b + ", size=" + this.c + '}';
    }
}
