package com.scandit.datacapture.core;

import com.scandit.datacapture.core.ui.animation.DynamicAnimation;
import com.scandit.datacapture.core.ui.animation.SpringAnimation;
import com.scandit.datacapture.core.ui.animation.SpringForce;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class H1 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ I1 f18323a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H1(I1 i1) {
        super(0);
        this.f18323a = i1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SpringAnimation springAnimation = new SpringAnimation(this.f18323a.b(), DynamicAnimation.Y);
        I1 i1 = this.f18323a;
        SpringForce springForce = new SpringForce();
        springForce.setDampingRatio(1.0f);
        springForce.setStiffness(200.0f);
        springAnimation.setSpring(springForce);
        springAnimation.setStartValue(I1.a(i1));
        return springAnimation;
    }
}
