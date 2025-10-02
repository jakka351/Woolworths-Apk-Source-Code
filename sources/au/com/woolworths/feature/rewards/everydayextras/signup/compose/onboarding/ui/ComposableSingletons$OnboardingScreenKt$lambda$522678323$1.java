package au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import au.com.woolworths.rewards.base.confetti.RewardsConfettiKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.ComposableSingletons$OnboardingScreenKt$lambda$-522678323$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$OnboardingScreenKt$lambda$522678323$1 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$OnboardingScreenKt$lambda$522678323$1 d = new ComposableSingletons$OnboardingScreenKt$lambda$522678323$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
        ((Number) obj3).intValue();
        Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
        RewardsConfettiKt.a(0, 3, (Composer) obj2, null, null);
        return Unit.f24250a;
    }
}
