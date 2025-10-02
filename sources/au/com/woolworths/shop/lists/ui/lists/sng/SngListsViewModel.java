package au.com.woolworths.shop.lists.ui.lists.sng;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/sng/SngListsViewModel;", "Landroidx/lifecycle/ViewModel;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SngListsViewModel extends ViewModel {
    public final AnalyticsManager e;
    public final MutableStateFlow f;
    public final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 g;
    public final Flow h;

    public SngListsViewModel(AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = analyticsManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(null);
        this.f = mutableStateFlowA;
        this.g = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(mutableStateFlowA);
        this.h = FlowKt.a(SharedFlowKt.b(0, 1, BufferOverflow.e, 1));
    }
}
