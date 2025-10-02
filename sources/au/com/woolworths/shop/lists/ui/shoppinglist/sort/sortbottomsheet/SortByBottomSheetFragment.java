package au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.core.view.KeyEventDispatcher;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.shop.lists.data.prefs.SortBy;
import au.com.woolworths.shop.lists.ui.ListDetailsAnalyticsParams;
import au.com.woolworths.shop.lists.ui.shoppinglist.analytics.ShoppingListDetailsActions;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet.SortByBottomSheetContract;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet.SortByBottomSheetFragment;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/sortbottomsheet/SortByBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "BottomSheetHost", "Companion", "Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/sortbottomsheet/SortByBottomSheetContract$ViewState;", "viewState", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SortByBottomSheetFragment extends Hilt_SortByBottomSheetFragment {
    public final Lazy i;
    public final ViewModelLazy j;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/sortbottomsheet/SortByBottomSheetFragment$BottomSheetHost;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface BottomSheetHost {
        void Q1(SortBy sortBy);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/sortbottomsheet/SortByBottomSheetFragment$Companion;", "", "", "TAG", "Ljava/lang/String;", "EXTRA_IS_WATCHLIST", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public SortByBottomSheetFragment() {
        final int i = 0;
        this.i = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet.a
            public final /* synthetic */ SortByBottomSheetFragment e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KeyEventDispatcher.Component activity = this.e.getActivity();
                        Intrinsics.f(activity, "null cannot be cast to non-null type au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet.SortByBottomSheetFragment.BottomSheetHost");
                        return (SortByBottomSheetFragment.BottomSheetHost) activity;
                    default:
                        return this.e.requireActivity().getDefaultViewModelProviderFactory();
                }
            }
        });
        final int i2 = 1;
        Function0 function0 = new Function0(this) { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet.a
            public final /* synthetic */ SortByBottomSheetFragment e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KeyEventDispatcher.Component activity = this.e.getActivity();
                        Intrinsics.f(activity, "null cannot be cast to non-null type au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet.SortByBottomSheetFragment.BottomSheetHost");
                        return (SortByBottomSheetFragment.BottomSheetHost) activity;
                    default:
                        return this.e.requireActivity().getDefaultViewModelProviderFactory();
                }
            }
        };
        final SortByBottomSheetFragment$special$$inlined$viewModels$default$1 sortByBottomSheetFragment$special$$inlined$viewModels$default$1 = new SortByBottomSheetFragment$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet.SortByBottomSheetFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) sortByBottomSheetFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.j = new ViewModelLazy(Reflection.f24268a.b(SortByBottomSheetViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet.SortByBottomSheetFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getD();
            }
        }, function0, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet.SortByBottomSheetFragment$special$$inlined$viewModels$default$4
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
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        ViewModelLazy viewModelLazy = this.j;
        SortByBottomSheetViewModel sortByBottomSheetViewModel = (SortByBottomSheetViewModel) viewModelLazy.getD();
        Bundle arguments = getArguments();
        Boolean boolValueOf = arguments != null ? Boolean.valueOf(arguments.getBoolean("EXTRA_IS_WATCHLIST")) : null;
        if (boolValueOf == null) {
            throw new IllegalArgumentException(("EXTRA_IS_WATCHLIST cannot be null: " + getArguments()).toString());
        }
        sortByBottomSheetViewModel.i = boolValueOf.booleanValue();
        SortByBottomSheetViewModel sortByBottomSheetViewModel2 = (SortByBottomSheetViewModel) viewModelLazy.getD();
        sortByBottomSheetViewModel2.f.c(new ShoppingListDetailsActions.ListSortingBottomsheet((ListDetailsAnalyticsParams) sortByBottomSheetViewModel2.j.getD()));
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.f1985a);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet.SortByBottomSheetFragment$setContent$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final SortByBottomSheetFragment sortByBottomSheetFragment = this.d;
                    final MutableState mutableStateA = FlowExtKt.a(((SortByBottomSheetViewModel) sortByBottomSheetFragment.j.getD()).h, composer);
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(1540834002, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet.SortByBottomSheetFragment$setContent$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                SortByBottomSheetContract.ViewState viewState = (SortByBottomSheetContract.ViewState) mutableStateA.getD();
                                composer2.o(5004770);
                                SortByBottomSheetFragment sortByBottomSheetFragment2 = sortByBottomSheetFragment;
                                boolean zI = composer2.I(sortByBottomSheetFragment2);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new SortByBottomSheetFragment$setContent$1$1$1$1(1, sortByBottomSheetFragment2, SortByBottomSheetFragment.class, "onSelected", "onSelected(Lau/com/woolworths/shop/lists/data/prefs/SortBy;)V", 0);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                SortByBottomSheetScreenKt.a(viewState, (Function1) ((KFunction) objG), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 984829466));
        return composeView;
    }
}
