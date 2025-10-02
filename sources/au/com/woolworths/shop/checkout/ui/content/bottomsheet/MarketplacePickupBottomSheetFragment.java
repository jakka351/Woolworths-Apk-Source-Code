package au.com.woolworths.shop.checkout.ui.content.bottomsheet;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetViewModel;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/bottomsheet/MarketplacePickupBottomSheetFragment;", "Lau/com/woolworths/foundation/shop/bottomsheet/BaseBottomSheetFragment;", "<init>", "()V", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MarketplacePickupBottomSheetFragment extends Hilt_MarketplacePickupBottomSheetFragment {
    public final ViewModelLazy j;
    public final ResText k;
    public final NavArgsLazy l;

    public MarketplacePickupBottomSheetFragment() {
        final MarketplacePickupBottomSheetFragment$special$$inlined$viewModels$default$1 marketplacePickupBottomSheetFragment$special$$inlined$viewModels$default$1 = new MarketplacePickupBottomSheetFragment$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.shop.checkout.ui.content.bottomsheet.MarketplacePickupBottomSheetFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) marketplacePickupBottomSheetFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.j = new ViewModelLazy(reflectionFactory.b(MarketplacePickupBottomSheetViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.checkout.ui.content.bottomsheet.MarketplacePickupBottomSheetFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.checkout.ui.content.bottomsheet.MarketplacePickupBottomSheetFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.h.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.checkout.ui.content.bottomsheet.MarketplacePickupBottomSheetFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.b;
            }
        });
        this.k = new ResText(R.string.generic_bottom_sheet_title);
        this.l = new NavArgsLazy(reflectionFactory.b(MarketplacePickupBottomSheetFragmentArgs.class), new Function0<Bundle>() { // from class: au.com.woolworths.shop.checkout.ui.content.bottomsheet.MarketplacePickupBottomSheetFragment$special$$inlined$navArgs$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MarketplacePickupBottomSheetFragment marketplacePickupBottomSheetFragment = this.d;
                Bundle arguments = marketplacePickupBottomSheetFragment.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                throw new IllegalStateException("Fragment " + marketplacePickupBottomSheetFragment + " has null arguments");
            }
        });
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetFragment
    public final BottomSheetContent I1(Bundle bundle) {
        return ((MarketplacePickupBottomSheetFragmentArgs) this.l.getD()).b;
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetFragment
    /* renamed from: Q1, reason: from getter */
    public final ResText getK() {
        return this.k;
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetFragment
    public final BaseBottomSheetViewModel R1() {
        return (MarketplacePickupBottomSheetViewModel) this.j.getD();
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((MarketplacePickupBottomSheetViewModel) this.j.getD()).j = ((MarketplacePickupBottomSheetFragmentArgs) this.l.getD()).f10768a;
    }
}
