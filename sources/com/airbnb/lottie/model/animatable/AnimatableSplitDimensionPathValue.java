package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.SplitDimensionPathKeyframeAnimation;
import java.util.List;

/* loaded from: classes4.dex */
public class AnimatableSplitDimensionPathValue implements AnimatableValue<PointF, PointF> {

    /* renamed from: a, reason: collision with root package name */
    public final AnimatableFloatValue f13398a;
    public final AnimatableFloatValue b;

    public AnimatableSplitDimensionPathValue(AnimatableFloatValue animatableFloatValue, AnimatableFloatValue animatableFloatValue2) {
        this.f13398a = animatableFloatValue;
        this.b = animatableFloatValue2;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public final boolean f() {
        return this.f13398a.f() && this.b.f();
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public final BaseKeyframeAnimation g() {
        return new SplitDimensionPathKeyframeAnimation(this.f13398a.g(), this.b.g());
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public final List h() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
