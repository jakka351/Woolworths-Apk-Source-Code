package com.scandit.datacapture.core;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.core.ui.animation.DynamicAnimation;
import com.scandit.datacapture.core.ui.animation.SpringAnimation;
import com.scandit.datacapture.core.ui.animation.SpringForce;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class A1 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ I1 f18294a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A1(I1 i1) {
        super(0);
        this.f18294a = i1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SpringAnimation springAnimation = new SpringAnimation(this.f18294a.b(), DynamicAnimation.ALPHA);
        SpringForce springForce = new SpringForce();
        springForce.setDampingRatio(1.0f);
        springForce.setStiffness(200.0f);
        springAnimation.setSpring(springForce);
        springAnimation.setStartValue(BitmapDescriptorFactory.HUE_RED);
        return springAnimation;
    }
}
