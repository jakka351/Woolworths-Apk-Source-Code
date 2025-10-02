package au.com.woolworths.feature.shop.instore.navigation.onboarding.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.data.ProductFinderOnboardingItem;
import au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderRepository;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/onboarding/domain/ProductFinderOnboardingInteractorImpl;", "Lau/com/woolworths/feature/shop/instore/navigation/onboarding/domain/ProductFinderOnboardingInteractor;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductFinderOnboardingInteractorImpl implements ProductFinderOnboardingInteractor {

    /* renamed from: a, reason: collision with root package name */
    public ProductFinderRepository f7424a;

    public final List a() {
        return CollectionsKt.R(new ProductFinderOnboardingItem(R.string.onboarding_page1_title, R.string.onboarding_page1_body, R.drawable.onboarding1), new ProductFinderOnboardingItem(R.string.onboarding_page2_title, R.string.onboarding_page2_body, R.drawable.onboarding2), new ProductFinderOnboardingItem(R.string.onboarding_page3_title, R.string.onboarding_page3_body, R.drawable.onboarding3));
    }
}
