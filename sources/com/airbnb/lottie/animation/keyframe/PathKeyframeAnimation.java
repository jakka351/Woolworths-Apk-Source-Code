package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class PathKeyframeAnimation extends KeyframeAnimation<PointF> {
    public final PointF i;
    public final float[] j;
    public final float[] k;
    public final PathMeasure l;
    public PathKeyframe m;

    public PathKeyframeAnimation(ArrayList arrayList) {
        super(arrayList);
        this.i = new PointF();
        this.j = new float[2];
        this.k = new float[2];
        this.l = new PathMeasure();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final Object f(Keyframe keyframe, float f) {
        float f2;
        PathKeyframe pathKeyframe = (PathKeyframe) keyframe;
        Path path = pathKeyframe.q;
        LottieValueCallback lottieValueCallback = this.e;
        if (lottieValueCallback == null || keyframe.h == null) {
            f2 = f;
        } else {
            f2 = f;
            PointF pointF = (PointF) lottieValueCallback.b(pathKeyframe.g, pathKeyframe.h.floatValue(), (PointF) pathKeyframe.b, (PointF) pathKeyframe.c, d(), f2, this.d);
            if (pointF != null) {
                return pointF;
            }
        }
        if (path == null) {
            return (PointF) keyframe.b;
        }
        PathKeyframe pathKeyframe2 = this.m;
        PathMeasure pathMeasure = this.l;
        if (pathKeyframe2 != pathKeyframe) {
            pathMeasure.setPath(path, false);
            this.m = pathKeyframe;
        }
        float length = pathMeasure.getLength();
        float f3 = f2 * length;
        float[] fArr = this.j;
        float[] fArr2 = this.k;
        pathMeasure.getPosTan(f3, fArr, fArr2);
        float f4 = fArr[0];
        float f5 = fArr[1];
        PointF pointF2 = this.i;
        pointF2.set(f4, f5);
        if (f3 < BitmapDescriptorFactory.HUE_RED) {
            pointF2.offset(fArr2[0] * f3, fArr2[1] * f3);
            return pointF2;
        }
        if (f3 > length) {
            float f6 = f3 - length;
            pointF2.offset(fArr2[0] * f6, fArr2[1] * f6);
        }
        return pointF2;
    }
}
