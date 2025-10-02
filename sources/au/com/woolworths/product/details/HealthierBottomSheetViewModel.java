package au.com.woolworths.product.details;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.handlers.LinkHandler;
import au.com.woolworths.product.details.analytics.ProductDetailsActions;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/product/details/HealthierBottomSheetViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/android/onesite/handlers/LinkHandler;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HealthierBottomSheetViewModel extends ViewModel implements LinkHandler {
    public final AnalyticsManager e;
    public final FeatureToggleManager f;
    public final MutableLiveData g;
    public final MutableLiveData h;

    public HealthierBottomSheetViewModel(AnalyticsManager analyticsManager, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.e = analyticsManager;
        this.f = featureToggleManager;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.g = mutableLiveData;
        this.h = mutableLiveData;
    }

    @Override // au.com.woolworths.android.onesite.handlers.LinkHandler
    public final boolean U3(String url, String linkText) {
        Intrinsics.h(url, "url");
        Intrinsics.h(linkText, "linkText");
        boolean zC = this.f.c(ProductDetailsFeature.e);
        AnalyticsManager analyticsManager = this.e;
        if (zC) {
            if (!url.equals("https://www.woolworths.com.au/shop/discover/healthy-eating/healthier-options")) {
                return false;
            }
            analyticsManager.c(ProductDetailsActions.VisitOurWebsiteLink.e);
            return false;
        }
        ProductDetailsActions.VisitOurWebsiteLink visitOurWebsiteLink = ProductDetailsActions.VisitOurWebsiteLink.e;
        visitOurWebsiteLink.getClass();
        String lowerCase = ProductDetailsActions.VisitOurWebsiteLink.g.toLowerCase(Locale.ROOT);
        Intrinsics.g(lowerCase, "toLowerCase(...)");
        if (!linkText.equals(lowerCase)) {
            return false;
        }
        analyticsManager.c(visitOurWebsiteLink);
        return false;
    }
}
