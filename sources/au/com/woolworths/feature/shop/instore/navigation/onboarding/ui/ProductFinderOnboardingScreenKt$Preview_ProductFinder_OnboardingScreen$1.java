package au.com.woolworths.feature.shop.instore.navigation.onboarding.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.ProductFinderOnboardingContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class ProductFinderOnboardingScreenKt$Preview_ProductFinder_OnboardingScreen$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/instore/navigation/onboarding/ui/ProductFinderOnboardingScreenKt$Preview_ProductFinder_OnboardingScreen$1$2", "Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingContract$EventSink;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.shop.instore.navigation.onboarding.ui.ProductFinderOnboardingScreenKt$Preview_ProductFinder_OnboardingScreen$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements ProductFinderOnboardingContract.EventSink {
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) != 2 || !composer.c()) {
            throw null;
        }
        composer.j();
        return Unit.f24250a;
    }
}
