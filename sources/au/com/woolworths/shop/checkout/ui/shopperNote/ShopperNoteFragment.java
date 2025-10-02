package au.com.woolworths.shop.checkout.ui.shopperNote;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.product.details.d;
import au.com.woolworths.shop.cart.ui.c;
import au.com.woolworths.shop.checkout.ui.bridge.CheckoutBridgeViewModel;
import au.com.woolworths.shop.checkout.ui.product.CheckoutProductViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.SharedFlowImpl;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/shopperNote/ShopperNoteFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ShopperNoteFragment extends Fragment {
    public final ViewModelLazy d;
    public final ViewModelLazy e;
    public final NavArgsLazy f;

    public ShopperNoteFragment() {
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.d = new ViewModelLazy(reflectionFactory.b(CheckoutProductViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.checkout.ui.shopperNote.ShopperNoteFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.checkout.ui.shopperNote.ShopperNoteFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.checkout.ui.shopperNote.ShopperNoteFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelCreationExtras();
            }
        });
        this.e = new ViewModelLazy(reflectionFactory.b(CheckoutBridgeViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.checkout.ui.shopperNote.ShopperNoteFragment$special$$inlined$activityViewModels$default$4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.checkout.ui.shopperNote.ShopperNoteFragment$special$$inlined$activityViewModels$default$6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.checkout.ui.shopperNote.ShopperNoteFragment$special$$inlined$activityViewModels$default$5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelCreationExtras();
            }
        });
        this.f = new NavArgsLazy(reflectionFactory.b(ShopperNoteFragmentArgs.class), new Function0<Bundle>() { // from class: au.com.woolworths.shop.checkout.ui.shopperNote.ShopperNoteFragment$special$$inlined$navArgs$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ShopperNoteFragment shopperNoteFragment = this.d;
                Bundle arguments = shopperNoteFragment.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                throw new IllegalStateException("Fragment " + shopperNoteFragment + " has null arguments");
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((CheckoutBridgeViewModel) this.e.getD()).p6(EmptyList.d);
        FragmentActivity activity = getActivity();
        Intrinsics.f(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ActionBar supportActionBar = ((AppCompatActivity) activity).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.k();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Intrinsics.h(inflater, "inflater");
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f1986a);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.shopperNote.ShopperNoteFragment$onCreateView$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final ShopperNoteFragment shopperNoteFragment = this.d;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(2108404552, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.shopperNote.ShopperNoteFragment$onCreateView$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            int iIntValue = ((Number) obj4).intValue();
                            ShopperNoteFragment shopperNoteFragment2 = shopperNoteFragment;
                            NavArgsLazy navArgsLazy = shopperNoteFragment2.f;
                            if ((iIntValue & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                SharedFlowImpl sharedFlowImpl = ((CheckoutProductViewModel) shopperNoteFragment2.d.getD()).l;
                                String str = ((ShopperNoteFragmentArgs) navArgsLazy.getD()).f10810a.d;
                                String str2 = ((ShopperNoteFragmentArgs) navArgsLazy.getD()).f10810a.e;
                                String str3 = ((ShopperNoteFragmentArgs) navArgsLazy.getD()).f10810a.f;
                                Integer num = ((ShopperNoteFragmentArgs) navArgsLazy.getD()).f10810a.g;
                                composer2.o(5004770);
                                boolean zI = composer2.I(shopperNoteFragment2);
                                Object objG = composer2.G();
                                Object obj5 = Composer.Companion.f1624a;
                                if (zI || objG == obj5) {
                                    objG = new c(shopperNoteFragment2, 10);
                                    composer2.A(objG);
                                }
                                Function0 function0 = (Function0) objG;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(shopperNoteFragment2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == obj5) {
                                    objG2 = new d(shopperNoteFragment2, 19);
                                    composer2.A(objG2);
                                }
                                composer2.l();
                                ShopperNoteScreenKt.a(sharedFlowImpl, str, str2, str3, num, function0, (Function1) objG2, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 1372294180));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        Window window;
        super.onDestroy();
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(32);
        }
        FragmentActivity activity2 = getActivity();
        Intrinsics.f(activity2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ActionBar supportActionBar = ((AppCompatActivity) activity2).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.C();
        }
    }
}
