package au.com.woolworths.feature.shop.imagegallery;

import androidx.databinding.ObservableField;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/imagegallery/ProductImageGalleryViewModel;", "Landroidx/lifecycle/ViewModel;", "image-gallery_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductImageGalleryViewModel extends ViewModel {
    public final FeatureToggleManager e;
    public final AnalyticsManager f;
    public final ObservableField g;

    public ProductImageGalleryViewModel(AnalyticsManager analyticsManager, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = featureToggleManager;
        this.f = analyticsManager;
        this.g = new ObservableField();
    }
}
