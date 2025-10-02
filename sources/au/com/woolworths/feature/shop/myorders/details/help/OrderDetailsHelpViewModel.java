package au.com.woolworths.feature.shop.myorders.details.help;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.feature.shop.myorders.details.help.OrderDetailsHelpContract;
import au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpItemType;
import dagger.assisted.AssistedFactory;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/help/OrderDetailsHelpViewModel;", "Landroidx/lifecycle/ViewModel;", "Factory", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrderDetailsHelpViewModel extends ViewModel {
    public final Screen e;
    public final AnalyticsManager f;
    public final MutableStateFlow g;
    public final StateFlow h;
    public final SharedFlowImpl i;
    public final SharedFlow j;

    @AssistedFactory
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/help/OrderDetailsHelpViewModel$Factory;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        OrderDetailsHelpViewModel a(Screen screen);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7726a;

        static {
            int[] iArr = new int[OrderHelpItemType.values().length];
            try {
                iArr[OrderHelpItemType.CHAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderHelpItemType.FAQ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7726a = iArr;
        }
    }

    public OrderDetailsHelpViewModel(Screen screen, AnalyticsManager analyticsManager) {
        Intrinsics.h(screen, "screen");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = screen;
        this.f = analyticsManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(OrderDetailsHelpContract.ViewState.Loading.f7725a);
        this.g = mutableStateFlowA;
        this.h = FlowKt.b(mutableStateFlowA);
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.i = sharedFlowImplB;
        this.j = FlowKt.a(sharedFlowImplB);
    }
}
