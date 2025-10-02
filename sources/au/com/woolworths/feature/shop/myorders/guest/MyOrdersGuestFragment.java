package au.com.woolworths.feature.shop.myorders.guest;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shop.myorders.orders.OrdersViewModel;
import au.com.woolworths.feature.shop.myorders.orders.analytics.OrdersActions;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/guest/MyOrdersGuestFragment;", "Lau/com/woolworths/feature/shop/login/guest/ui/fragment/GuestLoginFragment;", "<init>", "()V", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MyOrdersGuestFragment extends Hilt_MyOrdersGuestFragment {
    public static final /* synthetic */ int r = 0;
    public AnalyticsManager p;
    public final ViewModelLazy q = new ViewModelLazy(Reflection.f24268a.b(OrdersViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.myorders.guest.MyOrdersGuestFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.myorders.guest.MyOrdersGuestFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.myorders.guest.MyOrdersGuestFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelCreationExtras();
        }
    });

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/guest/MyOrdersGuestFragment$Companion;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // au.com.woolworths.feature.shop.login.guest.ui.fragment.GuestLoginFragment
    public final void E1() {
        ((OrdersViewModel) this.q.getD()).p6();
    }

    @Override // au.com.woolworths.feature.shop.login.guest.ui.fragment.GuestLoginFragment
    public final void I1() {
        AnalyticsManager analyticsManager = this.p;
        if (analyticsManager != null) {
            analyticsManager.c(OrdersActions.f);
        } else {
            Intrinsics.p("analyticsManager");
            throw null;
        }
    }
}
