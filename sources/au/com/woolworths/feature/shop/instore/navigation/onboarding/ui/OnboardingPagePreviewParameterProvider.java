package au.com.woolworths.feature.shop.instore.navigation.onboarding.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.data.ProductFinderOnboardingItem;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.domain.ProductFinderOnboardingInteractorImpl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ui/OnboardingPagePreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ui/OnboardingPagePreviewData;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OnboardingPagePreviewParameterProvider implements PreviewParameterProvider<OnboardingPagePreviewData> {
    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        OnboardingPagePreviewParameterProvider$values$onboardingInteractor$1 onboardingPagePreviewParameterProvider$values$onboardingInteractor$1 = new OnboardingPagePreviewParameterProvider$values$onboardingInteractor$1();
        ProductFinderOnboardingInteractorImpl productFinderOnboardingInteractorImpl = new ProductFinderOnboardingInteractorImpl();
        productFinderOnboardingInteractorImpl.f7424a = onboardingPagePreviewParameterProvider$values$onboardingInteractor$1;
        List listA = productFinderOnboardingInteractorImpl.a();
        List list = listA;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            ProductFinderOnboardingItem productFinderOnboardingItem = (ProductFinderOnboardingItem) obj;
            boolean z = true;
            if (i != listA.size() - 1) {
                z = false;
            }
            arrayList.add(new OnboardingPagePreviewData(productFinderOnboardingItem, z, i, listA.size()));
            i = i2;
        }
        return CollectionsKt.n(arrayList);
    }
}
