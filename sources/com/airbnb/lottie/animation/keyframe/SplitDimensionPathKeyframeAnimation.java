package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes4.dex */
public class SplitDimensionPathKeyframeAnimation extends BaseKeyframeAnimation<PointF, PointF> {
    public final PointF i;
    public final PointF j;
    public final FloatKeyframeAnimation k;
    public final FloatKeyframeAnimation l;
    public LottieValueCallback m;
    public LottieValueCallback n;

    public SplitDimensionPathKeyframeAnimation(FloatKeyframeAnimation floatKeyframeAnimation, FloatKeyframeAnimation floatKeyframeAnimation2) {
        super(Collections.EMPTY_LIST);
        this.i = new PointF();
        this.j = new PointF();
        this.k = floatKeyframeAnimation;
        this.l = floatKeyframeAnimation2;
        i(this.d);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final Object e() {
        return k();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final /* bridge */ /* synthetic */ Object f(Keyframe keyframe, float f) {
        return k();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final void i(float f) {
        FloatKeyframeAnimation floatKeyframeAnimation = this.k;
        floatKeyframeAnimation.i(f);
        FloatKeyframeAnimation floatKeyframeAnimation2 = this.l;
        floatKeyframeAnimation2.i(f);
        this.i.set(((Float) floatKeyframeAnimation.e()).floatValue(), ((Float) floatKeyframeAnimation2.e()).floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f13369a;
            if (i >= arrayList.size()) {
                return;
            }
            ((BaseKeyframeAnimation.AnimationListener) arrayList.get(i)).e();
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.PointF k() {
        /*
            r12 = this;
            com.airbnb.lottie.value.LottieValueCallback r0 = r12.m
            r1 = 0
            if (r0 == 0) goto L39
            com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation r0 = r12.k
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$KeyframesWrapper r2 = r0.c
            com.airbnb.lottie.value.Keyframe r2 = r2.a()
            if (r2 == 0) goto L39
            java.lang.Float r3 = r2.h
            com.airbnb.lottie.value.LottieValueCallback r4 = r12.m
            float r5 = r2.g
            if (r3 != 0) goto L19
            r6 = r5
            goto L1e
        L19:
            float r3 = r3.floatValue()
            r6 = r3
        L1e:
            java.lang.Object r3 = r2.b
            r7 = r3
            java.lang.Float r7 = (java.lang.Float) r7
            java.lang.Object r2 = r2.c
            r8 = r2
            java.lang.Float r8 = (java.lang.Float) r8
            float r9 = r0.c()
            float r10 = r0.d()
            float r11 = r0.d
            java.lang.Object r0 = r4.b(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Float r0 = (java.lang.Float) r0
            goto L3a
        L39:
            r0 = r1
        L3a:
            com.airbnb.lottie.value.LottieValueCallback r2 = r12.n
            if (r2 == 0) goto L71
            com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation r2 = r12.l
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$KeyframesWrapper r3 = r2.c
            com.airbnb.lottie.value.Keyframe r3 = r3.a()
            if (r3 == 0) goto L71
            java.lang.Float r1 = r3.h
            com.airbnb.lottie.value.LottieValueCallback r4 = r12.n
            float r5 = r3.g
            if (r1 != 0) goto L52
            r6 = r5
            goto L57
        L52:
            float r1 = r1.floatValue()
            r6 = r1
        L57:
            java.lang.Object r1 = r3.b
            r7 = r1
            java.lang.Float r7 = (java.lang.Float) r7
            java.lang.Object r1 = r3.c
            r8 = r1
            java.lang.Float r8 = (java.lang.Float) r8
            float r9 = r2.c()
            float r10 = r2.d()
            float r11 = r2.d
            java.lang.Object r1 = r4.b(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Float r1 = (java.lang.Float) r1
        L71:
            r2 = 0
            android.graphics.PointF r3 = r12.i
            android.graphics.PointF r4 = r12.j
            if (r0 != 0) goto L7e
            float r0 = r3.x
            r4.set(r0, r2)
            goto L85
        L7e:
            float r0 = r0.floatValue()
            r4.set(r0, r2)
        L85:
            if (r1 != 0) goto L8f
            float r0 = r4.x
            float r1 = r3.y
            r4.set(r0, r1)
            return r4
        L8f:
            float r0 = r4.x
            float r1 = r1.floatValue()
            r4.set(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.keyframe.SplitDimensionPathKeyframeAnimation.k():android.graphics.PointF");
    }
}
