package au.com.woolworths.shop.cart.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import au.com.woolworths.shop.cart.ui.cart.CartViewModel;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/cart/ui/CartSectionOptionsBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CartSectionOptionsBottomSheet extends Hilt_CartSectionOptionsBottomSheet {
    public final ViewModelLazy i;
    public final NavArgsLazy j;
    public final Lazy k;

    public CartSectionOptionsBottomSheet() {
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.i = new ViewModelLazy(reflectionFactory.b(CartViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.cart.ui.CartSectionOptionsBottomSheet$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.cart.ui.CartSectionOptionsBottomSheet$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.cart.ui.CartSectionOptionsBottomSheet$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelCreationExtras();
            }
        });
        this.j = new NavArgsLazy(reflectionFactory.b(CartSectionOptionsBottomSheetArgs.class), new Function0<Bundle>() { // from class: au.com.woolworths.shop.cart.ui.CartSectionOptionsBottomSheet$special$$inlined$navArgs$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CartSectionOptionsBottomSheet cartSectionOptionsBottomSheet = this.d;
                Bundle arguments = cartSectionOptionsBottomSheet.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                throw new IllegalStateException("Fragment " + cartSectionOptionsBottomSheet + " has null arguments");
            }
        });
        this.k = LazyKt.b(new c(this, 0));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.cart_section_options_bottom_sheet, viewGroup, false);
        Intrinsics.f(viewInflate, "null cannot be cast to non-null type com.airbnb.epoxy.EpoxyRecyclerView");
        ((EpoxyRecyclerView) viewInflate).setController((CartSectionOptionsEpoxyController) this.k.getD());
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.h(view, "view");
        super.onViewCreated(view, bundle);
        CartSectionOptionsEpoxyController cartSectionOptionsEpoxyController = (CartSectionOptionsEpoxyController) this.k.getD();
        NavArgsLazy navArgsLazy = this.j;
        cartSectionOptionsEpoxyController.setData(((CartSectionOptionsBottomSheetArgs) navArgsLazy.getD()).f10454a, Boolean.valueOf(((CartSectionOptionsBottomSheetArgs) navArgsLazy.getD()).b));
    }
}
