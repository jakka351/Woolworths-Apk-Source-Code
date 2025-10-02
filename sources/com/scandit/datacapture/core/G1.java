package com.scandit.datacapture.core;

import com.scandit.datacapture.core.ui.animation.DynamicAnimation;
import com.scandit.datacapture.core.ui.animation.SpringAnimation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class G1 implements DynamicAnimation.OnAnimationEndListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SpringAnimation f18319a;
    final /* synthetic */ Function0 b;

    public G1(SpringAnimation springAnimation, Function0 function0) {
        this.f18319a = springAnimation;
        this.b = function0;
    }

    @Override // com.scandit.datacapture.core.ui.animation.DynamicAnimation.OnAnimationEndListener
    public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        this.f18319a.removeEndListener(this);
        this.b.invoke();
    }
}
