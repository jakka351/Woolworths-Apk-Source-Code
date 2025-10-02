package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.ContentGroup;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class ShapeGroup implements ContentModel {

    /* renamed from: a, reason: collision with root package name */
    public final String f13418a;
    public final List b;
    public final boolean c;

    public ShapeGroup(String str, boolean z, List list) {
        this.f13418a = str;
        this.b = list;
        this.c = z;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content a(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new ContentGroup(lottieDrawable, baseLayer, this, lottieComposition);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f13418a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
