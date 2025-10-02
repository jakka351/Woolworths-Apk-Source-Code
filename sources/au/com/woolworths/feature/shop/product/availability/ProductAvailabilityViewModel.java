package au.com.woolworths.feature.shop.product.availability;

import androidx.compose.runtime.Stable;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shop.product.availability.ProductAvailabilityUiState;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.product.models.ProductCard;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Stable
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/product/availability/ProductAvailabilityViewModel;", "Landroidx/lifecycle/ViewModel;", "product-availability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductAvailabilityViewModel extends ViewModel {
    public final ProductAvailabilityInteractor e;
    public final CollectionModeInteractor f;
    public final AnalyticsManager g;
    public final MutableStateFlow h;
    public final StateFlow i;
    public final SharedFlowImpl j;
    public final SharedFlow k;
    public ProductCard l;

    public ProductAvailabilityViewModel(ProductAvailabilityInteractor productAvailabilityInteractor, CollectionModeInteractor collectionModeInteractor, AnalyticsManager analyticsManager) {
        Intrinsics.h(productAvailabilityInteractor, "productAvailabilityInteractor");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = productAvailabilityInteractor;
        this.f = collectionModeInteractor;
        this.g = analyticsManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(ProductAvailabilityUiState.Loading.f7991a);
        this.h = mutableStateFlowA;
        this.i = FlowKt.b(mutableStateFlowA);
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.j = sharedFlowImplB;
        this.k = FlowKt.a(sharedFlowImplB);
    }

    public final void p6() {
        ProductCard productCard = this.l;
        if (productCard != null) {
            this.h.setValue(ProductAvailabilityUiState.Loading.f7991a);
            BuildersKt.c(ViewModelKt.a(this), null, null, new ProductAvailabilityViewModel$refresh$1$1(this, productCard, null), 3);
        }
    }
}
