package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.RepeaterContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.layer.BaseLayer;

/* loaded from: classes4.dex */
public class Repeater implements ContentModel {

    /* renamed from: a, reason: collision with root package name */
    public final String f13414a;
    public final AnimatableFloatValue b;
    public final AnimatableFloatValue c;
    public final AnimatableTransform d;
    public final boolean e;

    public Repeater(String str, AnimatableFloatValue animatableFloatValue, AnimatableFloatValue animatableFloatValue2, AnimatableTransform animatableTransform, boolean z) {
        this.f13414a = str;
        this.b = animatableFloatValue;
        this.c = animatableFloatValue2;
        this.d = animatableTransform;
        this.e = z;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content a(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new RepeaterContent(lottieDrawable, baseLayer, this);
    }
}
