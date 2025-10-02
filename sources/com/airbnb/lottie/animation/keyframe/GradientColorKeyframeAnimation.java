package com.airbnb.lottie.animation.keyframe;

import YU.a;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.utils.GammaEvaluator;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes4.dex */
public class GradientColorKeyframeAnimation extends KeyframeAnimation<GradientColor> {
    public final GradientColor i;

    public GradientColorKeyframeAnimation(List list) {
        super(list);
        int iMax = 0;
        for (int i = 0; i < list.size(); i++) {
            GradientColor gradientColor = (GradientColor) ((Keyframe) list.get(i)).b;
            if (gradientColor != null) {
                iMax = Math.max(iMax, gradientColor.b.length);
            }
        }
        this.i = new GradientColor(new float[iMax], new int[iMax]);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final Object f(Keyframe keyframe, float f) {
        GradientColor gradientColor = (GradientColor) keyframe.b;
        GradientColor gradientColor2 = (GradientColor) keyframe.c;
        GradientColor gradientColor3 = this.i;
        int[] iArr = gradientColor3.b;
        float[] fArr = gradientColor3.f13406a;
        boolean zEquals = gradientColor.equals(gradientColor2);
        int[] iArr2 = gradientColor.b;
        if (zEquals) {
            gradientColor3.a(gradientColor);
            return gradientColor3;
        }
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            gradientColor3.a(gradientColor);
            return gradientColor3;
        }
        if (f >= 1.0f) {
            gradientColor3.a(gradientColor2);
            return gradientColor3;
        }
        int length = iArr2.length;
        int[] iArr3 = gradientColor2.b;
        if (length != iArr3.length) {
            StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
            sb.append(iArr2.length);
            sb.append(" vs ");
            throw new IllegalArgumentException(a.m(sb, iArr3.length, ")"));
        }
        for (int i = 0; i < iArr2.length; i++) {
            fArr[i] = MiscUtils.e(gradientColor.f13406a[i], gradientColor2.f13406a[i], f);
            iArr[i] = GammaEvaluator.c(f, iArr2[i], iArr3[i]);
        }
        for (int length2 = iArr2.length; length2 < fArr.length; length2++) {
            fArr[length2] = fArr[iArr2.length - 1];
            iArr[length2] = iArr[iArr2.length - 1];
        }
        return gradientColor3;
    }
}
