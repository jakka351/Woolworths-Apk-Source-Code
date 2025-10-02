package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.EllipseContent;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* loaded from: classes4.dex */
public class CircleShape implements ContentModel {

    /* renamed from: a, reason: collision with root package name */
    public final String f13405a;
    public final AnimatableValue b;
    public final AnimatablePointValue c;
    public final boolean d;
    public final boolean e;

    public CircleShape(String str, AnimatableValue animatableValue, AnimatablePointValue animatablePointValue, boolean z, boolean z2) {
        this.f13405a = str;
        this.b = animatableValue;
        this.c = animatablePointValue;
        this.d = z;
        this.e = z2;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content a(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new EllipseContent(lottieDrawable, baseLayer, this);
    }
}
