package com.airbnb.lottie.animation.content;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class TrimPathContent implements Content, BaseKeyframeAnimation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13368a;
    public final ArrayList b = new ArrayList();
    public final ShapeTrimPath.Type c;
    public final FloatKeyframeAnimation d;
    public final FloatKeyframeAnimation e;
    public final FloatKeyframeAnimation f;

    public TrimPathContent(BaseLayer baseLayer, ShapeTrimPath shapeTrimPath) {
        this.f13368a = shapeTrimPath.e;
        this.c = shapeTrimPath.f13422a;
        FloatKeyframeAnimation floatKeyframeAnimationG = shapeTrimPath.b.g();
        this.d = floatKeyframeAnimationG;
        FloatKeyframeAnimation floatKeyframeAnimationG2 = shapeTrimPath.c.g();
        this.e = floatKeyframeAnimationG2;
        FloatKeyframeAnimation floatKeyframeAnimationG3 = shapeTrimPath.d.g();
        this.f = floatKeyframeAnimationG3;
        baseLayer.c(floatKeyframeAnimationG);
        baseLayer.c(floatKeyframeAnimationG2);
        baseLayer.c(floatKeyframeAnimationG3);
        floatKeyframeAnimationG.a(this);
        floatKeyframeAnimationG2.a(this);
        floatKeyframeAnimationG3.a(this);
    }

    public final void b(BaseKeyframeAnimation.AnimationListener animationListener) {
        this.b.add(animationListener);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            ((BaseKeyframeAnimation.AnimationListener) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final void f(List list, List list2) {
    }
}
