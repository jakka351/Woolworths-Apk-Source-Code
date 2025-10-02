package com.airbnb.lottie.model.content;

import android.graphics.Path;
import androidx.camera.core.impl.b;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.FillContent;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* loaded from: classes4.dex */
public class ShapeFill implements ContentModel {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13417a;
    public final Path.FillType b;
    public final String c;
    public final AnimatableColorValue d;
    public final AnimatableIntegerValue e;
    public final boolean f;

    public ShapeFill(String str, boolean z, Path.FillType fillType, AnimatableColorValue animatableColorValue, AnimatableIntegerValue animatableIntegerValue, boolean z2) {
        this.c = str;
        this.f13417a = z;
        this.b = fillType;
        this.d = animatableColorValue;
        this.e = animatableIntegerValue;
        this.f = z2;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content a(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new FillContent(lottieDrawable, baseLayer, this);
    }

    public final String toString() {
        return b.s(new StringBuilder("ShapeFill{color=, fillEnabled="), this.f13417a, '}');
    }
}
