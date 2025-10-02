package au.com.woolworths.shop.checkout.ui.bridge;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.shop.checkout.domain.model.ProgressId;
import au.com.woolworths.shop.checkout.ui.bridge.CheckoutBridgeContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/bridge/CheckoutBridgeViewModel;", "Landroidx/lifecycle/ViewModel;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutBridgeViewModel extends ViewModel {
    public final AnalyticsManager e;
    public final MutableStateFlow f;
    public final StateFlow g;
    public final SharedFlowImpl h;
    public final SharedFlowImpl i;
    public ProgressId j;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10677a;

        static {
            int[] iArr = new int[ProgressId.values().length];
            try {
                ProgressId progressId = ProgressId.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ProgressId progressId2 = ProgressId.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ProgressId progressId3 = ProgressId.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ProgressId progressId4 = ProgressId.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ProgressId progressId5 = ProgressId.d;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ProgressId progressId6 = ProgressId.d;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f10677a = iArr;
        }
    }

    public CheckoutBridgeViewModel(AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = analyticsManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new CheckoutBridgeContract.ViewState(EmptyList.d));
        this.f = mutableStateFlowA;
        this.g = FlowKt.b(mutableStateFlowA);
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.h = sharedFlowImplB;
        this.i = sharedFlowImplB;
    }

    public final void p6(List list) {
        MutableStateFlow mutableStateFlow;
        Object value;
        do {
            mutableStateFlow = this.f;
            value = mutableStateFlow.getValue();
            ((CheckoutBridgeContract.ViewState) value).getClass();
        } while (!mutableStateFlow.d(value, new CheckoutBridgeContract.ViewState(list)));
    }
}
