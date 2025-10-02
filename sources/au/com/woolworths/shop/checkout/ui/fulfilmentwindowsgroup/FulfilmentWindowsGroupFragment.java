package au.com.woolworths.shop.checkout.ui.fulfilmentwindowsgroup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.shop.cart.ui.c;
import au.com.woolworths.shop.checkout.databinding.FragmentFulfilmentWindowsGroupBinding;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsViewModel;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/fulfilmentwindowsgroup/FulfilmentWindowsGroupFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class FulfilmentWindowsGroupFragment extends Hilt_FulfilmentWindowsGroupFragment {
    public AnalyticsManager i;
    public FragmentFulfilmentWindowsGroupBinding k;
    public final ViewModelLazy j = new ViewModelLazy(Reflection.f24268a.b(FulfilmentWindowsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.checkout.ui.fulfilmentwindowsgroup.FulfilmentWindowsGroupFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.checkout.ui.fulfilmentwindowsgroup.FulfilmentWindowsGroupFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.checkout.ui.fulfilmentwindowsgroup.FulfilmentWindowsGroupFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelCreationExtras();
        }
    });
    public final Lazy l = LazyKt.b(new c(this, 7));

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/fulfilmentwindowsgroup/FulfilmentWindowsGroupFragment$Companion;", "", "", "ARG_INDEX", "Ljava/lang/String;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new FulfilmentWindowsGroupFragment$observeData$1(this, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        int i = FragmentFulfilmentWindowsGroupBinding.z;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentFulfilmentWindowsGroupBinding fragmentFulfilmentWindowsGroupBinding = (FragmentFulfilmentWindowsGroupBinding) ViewDataBinding.q(inflater, R.layout.fragment_fulfilment_windows_group, viewGroup, false, null);
        this.k = fragmentFulfilmentWindowsGroupBinding;
        Intrinsics.e(fragmentFulfilmentWindowsGroupBinding);
        fragmentFulfilmentWindowsGroupBinding.y.setController((FulfilmentWindowsGroupEpoxyController) this.l.getD());
        FragmentFulfilmentWindowsGroupBinding fragmentFulfilmentWindowsGroupBinding2 = this.k;
        Intrinsics.e(fragmentFulfilmentWindowsGroupBinding2);
        View view = fragmentFulfilmentWindowsGroupBinding2.h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.k = null;
    }
}
