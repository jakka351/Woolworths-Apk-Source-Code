package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.animation.keyframe.TextKeyframeAnimation;
import com.airbnb.lottie.model.DocumentData;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class AnimatableTextFrame extends BaseAnimatableValue<DocumentData, DocumentData> {
    public AnimatableTextFrame(ArrayList arrayList) {
        super(arrayList);
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final TextKeyframeAnimation g() {
        return new TextKeyframeAnimation(this.f13403a);
    }

    @Override // com.airbnb.lottie.model.animatable.BaseAnimatableValue, com.airbnb.lottie.model.animatable.AnimatableValue
    public final List h() {
        return this.f13403a;
    }
}
