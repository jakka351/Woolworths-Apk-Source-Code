package au.com.woolworths.feature.shop.instore.navigation.onboarding.ui;

import au.com.woolworths.feature.shop.instore.navigation.onboarding.ProductFinderOnboardingContract;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.ProductFinderOnboardingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProductFinderOnboardingViewModel e;

    public /* synthetic */ b(ProductFinderOnboardingViewModel productFinderOnboardingViewModel, int i) {
        this.d = i;
        this.e = productFinderOnboardingViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.q6(ProductFinderOnboardingContract.OnboardingEvent.OnBackButtonClick.f7416a);
                break;
            default:
                this.e.q6(ProductFinderOnboardingContract.OnboardingEvent.OnActionButtonClick.f7415a);
                break;
        }
        return Unit.f24250a;
    }
}
