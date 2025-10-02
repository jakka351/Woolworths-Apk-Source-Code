package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.PolystarContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* loaded from: classes4.dex */
public class PolystarShape implements ContentModel {

    /* renamed from: a, reason: collision with root package name */
    public final String f13412a;
    public final Type b;
    public final AnimatableFloatValue c;
    public final AnimatableValue d;
    public final AnimatableFloatValue e;
    public final AnimatableFloatValue f;
    public final AnimatableFloatValue g;
    public final AnimatableFloatValue h;
    public final AnimatableFloatValue i;
    public final boolean j;
    public final boolean k;

    public enum Type {
        STAR(1),
        /* JADX INFO: Fake field, exist only in values array */
        POLYGON(2);

        public final int d;

        Type(int i) {
            this.d = i;
        }
    }

    public PolystarShape(String str, Type type, AnimatableFloatValue animatableFloatValue, AnimatableValue animatableValue, AnimatableFloatValue animatableFloatValue2, AnimatableFloatValue animatableFloatValue3, AnimatableFloatValue animatableFloatValue4, AnimatableFloatValue animatableFloatValue5, AnimatableFloatValue animatableFloatValue6, boolean z, boolean z2) {
        this.f13412a = str;
        this.b = type;
        this.c = animatableFloatValue;
        this.d = animatableValue;
        this.e = animatableFloatValue2;
        this.f = animatableFloatValue3;
        this.g = animatableFloatValue4;
        this.h = animatableFloatValue5;
        this.i = animatableFloatValue6;
        this.j = z;
        this.k = z2;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content a(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new PolystarContent(lottieDrawable, baseLayer, this);
    }
}
