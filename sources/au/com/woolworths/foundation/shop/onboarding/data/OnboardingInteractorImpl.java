package au.com.woolworths.foundation.shop.onboarding.data;

import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/onboarding/data/OnboardingInteractorImpl;", "Lau/com/woolworths/foundation/shop/onboarding/data/OnboardingInteractor;", "onboarding-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OnboardingInteractorImpl implements OnboardingInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final OnboardingRepository f8864a;

    public OnboardingInteractorImpl(OnboardingRepository onboardingRepository) {
        this.f8864a = onboardingRepository;
    }

    public final void a() {
        a.v(this.f8864a.f8865a, "app_tour_key", true);
    }
}
