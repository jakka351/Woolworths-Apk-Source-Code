package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes4.dex */
public class PathKeyframe extends Keyframe<PointF> {
    public Path q;
    public final Keyframe r;

    public PathKeyframe(LottieComposition lottieComposition, Keyframe keyframe) {
        super(lottieComposition, (PointF) keyframe.b, (PointF) keyframe.c, keyframe.d, keyframe.e, keyframe.f, keyframe.g, keyframe.h);
        this.r = keyframe;
        d();
    }

    public final void d() {
        Object obj;
        Object obj2 = this.c;
        Object obj3 = this.b;
        boolean z = (obj2 == null || obj3 == null || !((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) ? false : true;
        if (obj3 == null || (obj = this.c) == null || z) {
            return;
        }
        PointF pointF = (PointF) obj3;
        PointF pointF2 = (PointF) obj;
        Keyframe keyframe = this.r;
        PointF pointF3 = keyframe.o;
        PointF pointF4 = keyframe.p;
        ThreadLocal threadLocal = Utils.f13480a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == BitmapDescriptorFactory.HUE_RED && pointF4.length() == BitmapDescriptorFactory.HUE_RED)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f = pointF3.x + pointF.x;
            float f2 = pointF.y + pointF3.y;
            float f3 = pointF2.x;
            float f4 = f3 + pointF4.x;
            float f5 = pointF2.y;
            path.cubicTo(f, f2, f4, f5 + pointF4.y, f3, f5);
        }
        this.q = path;
    }
}
