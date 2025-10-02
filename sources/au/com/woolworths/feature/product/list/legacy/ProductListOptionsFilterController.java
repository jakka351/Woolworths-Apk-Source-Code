package au.com.woolworths.feature.product.list.legacy;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.product.list.legacy.analytics.ProductListOptionsFiltersActions;
import au.com.woolworths.feature.product.list.legacy.data.FilterInsetBannerData;
import au.com.woolworths.feature.product.list.legacy.ui.ChildFilterItem;
import au.com.woolworths.feature.product.list.legacy.ui.FilterInsetBannerClickListener;
import au.com.woolworths.feature.product.list.legacy.ui.FilterMenuItem;
import au.com.woolworths.feature.product.list.legacy.ui.FilterOptionsClickListener;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.TypedEpoxyController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListOptionsFilterController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "", "Lau/com/woolworths/feature/product/list/legacy/ui/ChildFilterItem;", "clickListener", "Lau/com/woolworths/feature/product/list/legacy/ui/FilterOptionsClickListener;", "insetBannerClickListener", "Lau/com/woolworths/feature/product/list/legacy/ui/FilterInsetBannerClickListener;", "analyticsManager", "Lau/com/woolworths/android/onesite/analytics/AnalyticsManager;", "<init>", "(Lau/com/woolworths/feature/product/list/legacy/ui/FilterOptionsClickListener;Lau/com/woolworths/feature/product/list/legacy/ui/FilterInsetBannerClickListener;Lau/com/woolworths/android/onesite/analytics/AnalyticsManager;)V", "getClickListener", "()Lau/com/woolworths/feature/product/list/legacy/ui/FilterOptionsClickListener;", "getInsetBannerClickListener", "()Lau/com/woolworths/feature/product/list/legacy/ui/FilterInsetBannerClickListener;", "getAnalyticsManager", "()Lau/com/woolworths/android/onesite/analytics/AnalyticsManager;", "buildModels", "", "data", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListOptionsFilterController extends TypedEpoxyController<List<? extends ChildFilterItem>> {
    public static final int $stable = 8;

    @NotNull
    private final AnalyticsManager analyticsManager;

    @NotNull
    private final FilterOptionsClickListener clickListener;

    @NotNull
    private final FilterInsetBannerClickListener insetBannerClickListener;

    public ProductListOptionsFilterController(@NotNull FilterOptionsClickListener clickListener, @NotNull FilterInsetBannerClickListener insetBannerClickListener, @NotNull AnalyticsManager analyticsManager) {
        Intrinsics.h(clickListener, "clickListener");
        Intrinsics.h(insetBannerClickListener, "insetBannerClickListener");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.clickListener = clickListener;
        this.insetBannerClickListener = insetBannerClickListener;
        this.analyticsManager = analyticsManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$3$lambda$2$lambda$1(ChildFilterItem childFilterItem, ProductListOptionsFilterController productListOptionsFilterController, ItemProductListOptionsInsetBannerLegacyBindingModel_ itemProductListOptionsInsetBannerLegacyBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        productListOptionsFilterController.analyticsManager.j(ProductListOptionsFiltersActions.f, TrackingMetadata.Companion.a(TrackableValue.v0, ((FilterInsetBannerData) childFilterItem).i));
    }

    @NotNull
    public final AnalyticsManager getAnalyticsManager() {
        return this.analyticsManager;
    }

    @NotNull
    public final FilterOptionsClickListener getClickListener() {
        return this.clickListener;
    }

    @NotNull
    public final FilterInsetBannerClickListener getInsetBannerClickListener() {
        return this.insetBannerClickListener;
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(@NotNull List<? extends ChildFilterItem> data) {
        Intrinsics.h(data, "data");
        for (ChildFilterItem childFilterItem : data) {
            if (childFilterItem instanceof FilterMenuItem) {
                ItemProductListOptionsChildFilterLegacyBindingModel_ itemProductListOptionsChildFilterLegacyBindingModel_ = new ItemProductListOptionsChildFilterLegacyBindingModel_();
                FilterMenuItem filterMenuItem = (FilterMenuItem) childFilterItem;
                itemProductListOptionsChildFilterLegacyBindingModel_.M(filterMenuItem.k);
                itemProductListOptionsChildFilterLegacyBindingModel_.t();
                itemProductListOptionsChildFilterLegacyBindingModel_.n = filterMenuItem;
                FilterOptionsClickListener filterOptionsClickListener = this.clickListener;
                itemProductListOptionsChildFilterLegacyBindingModel_.t();
                itemProductListOptionsChildFilterLegacyBindingModel_.o = filterOptionsClickListener;
                add(itemProductListOptionsChildFilterLegacyBindingModel_);
            } else if (childFilterItem instanceof FilterInsetBannerData) {
                ItemProductListOptionsInsetBannerLegacyBindingModel_ itemProductListOptionsInsetBannerLegacyBindingModel_ = new ItemProductListOptionsInsetBannerLegacyBindingModel_();
                FilterInsetBannerData filterInsetBannerData = (FilterInsetBannerData) childFilterItem;
                itemProductListOptionsInsetBannerLegacyBindingModel_.M(String.valueOf(filterInsetBannerData.hashCode()));
                itemProductListOptionsInsetBannerLegacyBindingModel_.t();
                itemProductListOptionsInsetBannerLegacyBindingModel_.o = filterInsetBannerData;
                FilterInsetBannerClickListener filterInsetBannerClickListener = this.insetBannerClickListener;
                itemProductListOptionsInsetBannerLegacyBindingModel_.t();
                itemProductListOptionsInsetBannerLegacyBindingModel_.p = filterInsetBannerClickListener;
                v vVar = new v(filterInsetBannerData, this, 1);
                itemProductListOptionsInsetBannerLegacyBindingModel_.t();
                itemProductListOptionsInsetBannerLegacyBindingModel_.n = vVar;
                add(itemProductListOptionsInsetBannerLegacyBindingModel_);
            }
        }
    }
}
