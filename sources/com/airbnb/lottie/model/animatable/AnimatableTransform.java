package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.ModifierContent;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.layer.BaseLayer;

/* loaded from: classes4.dex */
public class AnimatableTransform implements ModifierContent, ContentModel {

    /* renamed from: a, reason: collision with root package name */
    public final AnimatablePathValue f13402a;
    public final AnimatableValue b;
    public final AnimatableScaleValue c;
    public final AnimatableFloatValue d;
    public final AnimatableIntegerValue e;
    public final AnimatableFloatValue f;
    public final AnimatableFloatValue g;
    public final AnimatableFloatValue h;
    public final AnimatableFloatValue i;
    public boolean j;

    public AnimatableTransform() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content a(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return null;
    }

    public AnimatableTransform(AnimatablePathValue animatablePathValue, AnimatableValue animatableValue, AnimatableScaleValue animatableScaleValue, AnimatableFloatValue animatableFloatValue, AnimatableIntegerValue animatableIntegerValue, AnimatableFloatValue animatableFloatValue2, AnimatableFloatValue animatableFloatValue3, AnimatableFloatValue animatableFloatValue4, AnimatableFloatValue animatableFloatValue5) {
        this.j = false;
        this.f13402a = animatablePathValue;
        this.b = animatableValue;
        this.c = animatableScaleValue;
        this.d = animatableFloatValue;
        this.e = animatableIntegerValue;
        this.h = animatableFloatValue2;
        this.i = animatableFloatValue3;
        this.f = animatableFloatValue4;
        this.g = animatableFloatValue5;
    }
}
