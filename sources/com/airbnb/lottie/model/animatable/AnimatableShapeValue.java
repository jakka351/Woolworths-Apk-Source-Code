package com.airbnb.lottie.model.animatable;

import android.graphics.Path;
import com.airbnb.lottie.animation.keyframe.ShapeKeyframeAnimation;
import com.airbnb.lottie.model.content.ShapeData;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class AnimatableShapeValue extends BaseAnimatableValue<ShapeData, Path> {
    public AnimatableShapeValue(ArrayList arrayList) {
        super(arrayList);
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ShapeKeyframeAnimation g() {
        return new ShapeKeyframeAnimation(this.f13403a);
    }

    @Override // com.airbnb.lottie.model.animatable.BaseAnimatableValue, com.airbnb.lottie.model.animatable.AnimatableValue
    public final List h() {
        return this.f13403a;
    }
}
