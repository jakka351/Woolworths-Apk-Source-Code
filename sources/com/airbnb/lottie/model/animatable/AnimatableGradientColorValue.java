package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.GradientColorKeyframeAnimation;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.value.Keyframe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class AnimatableGradientColorValue extends BaseAnimatableValue<GradientColor, GradientColor> {
    public AnimatableGradientColorValue(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            Keyframe keyframe = (Keyframe) arrayList.get(i);
            GradientColor gradientColor = (GradientColor) keyframe.b;
            GradientColor gradientColor2 = (GradientColor) keyframe.c;
            if (gradientColor != null && gradientColor2 != null) {
                float[] fArr = gradientColor.f13406a;
                int length = fArr.length;
                float[] fArr2 = gradientColor2.f13406a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f = Float.NaN;
                    int i2 = 0;
                    for (int i3 = 0; i3 < length2; i3++) {
                        float f2 = fArr3[i3];
                        if (f2 != f) {
                            fArr3[i2] = f2;
                            i2++;
                            f = fArr3[i3];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i2);
                    keyframe = new Keyframe(gradientColor.b(fArrCopyOfRange), gradientColor2.b(fArrCopyOfRange));
                }
            }
            arrayList.set(i, keyframe);
        }
        super(arrayList);
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public final BaseKeyframeAnimation g() {
        return new GradientColorKeyframeAnimation(this.f13403a);
    }

    @Override // com.airbnb.lottie.model.animatable.BaseAnimatableValue, com.airbnb.lottie.model.animatable.AnimatableValue
    public final List h() {
        return this.f13403a;
    }
}
