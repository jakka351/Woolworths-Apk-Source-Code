package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class AnimatableFloatValue extends BaseAnimatableValue<Float, Float> {
    public AnimatableFloatValue(ArrayList arrayList) {
        super(arrayList);
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final FloatKeyframeAnimation g() {
        return new FloatKeyframeAnimation(this.f13403a);
    }

    @Override // com.airbnb.lottie.model.animatable.BaseAnimatableValue, com.airbnb.lottie.model.animatable.AnimatableValue
    public final List h() {
        return this.f13403a;
    }
}
