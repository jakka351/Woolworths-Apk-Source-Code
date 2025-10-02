package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.TrimPathContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* loaded from: classes4.dex */
public class ShapeTrimPath implements ContentModel {

    /* renamed from: a, reason: collision with root package name */
    public final Type f13422a;
    public final AnimatableFloatValue b;
    public final AnimatableFloatValue c;
    public final AnimatableFloatValue d;
    public final boolean e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        public static final Type d;
        public static final Type e;
        public static final /* synthetic */ Type[] f;

        static {
            Type type = new Type("SIMULTANEOUSLY", 0);
            d = type;
            Type type2 = new Type("INDIVIDUALLY", 1);
            e = type2;
            f = new Type[]{type, type2};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f.clone();
        }
    }

    public ShapeTrimPath(String str, Type type, AnimatableFloatValue animatableFloatValue, AnimatableFloatValue animatableFloatValue2, AnimatableFloatValue animatableFloatValue3, boolean z) {
        this.f13422a = type;
        this.b = animatableFloatValue;
        this.c = animatableFloatValue2;
        this.d = animatableFloatValue3;
        this.e = z;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content a(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new TrimPathContent(baseLayer, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.b + ", end: " + this.c + ", offset: " + this.d + "}";
    }
}
