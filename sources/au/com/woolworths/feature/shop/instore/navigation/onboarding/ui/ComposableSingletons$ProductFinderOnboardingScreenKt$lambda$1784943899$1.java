package au.com.woolworths.feature.shop.instore.navigation.onboarding.ui;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$ProductFinderOnboardingScreenKt$lambda$1784943899$1 implements Function3<RowScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductFinderOnboardingScreenKt$lambda$1784943899$1 d = new ComposableSingletons$ProductFinderOnboardingScreenKt$lambda$1784943899$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RowScope TopNavBar = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(TopNavBar, "$this$TopNavBar");
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer.n(TopNavBar) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && composer.c()) {
            composer.j();
        } else {
            ProductFinderOnboardingScreenKt.c(TopNavBar, composer, iIntValue & 14);
        }
        return Unit.f24250a;
    }
}
