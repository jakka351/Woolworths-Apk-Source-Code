package au.com.woolworths.shop.lists.ui.lists.menu;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.core.os.BundleKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetContract;
import au.com.woolworths.shop.lists.ui.utils.MenuItemClickListener;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/menu/ListsBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lau/com/woolworths/shop/lists/ui/utils/MenuItemClickListener;", "<init>", "()V", "ListMenuDialogListener", "Companion", "Lau/com/woolworths/shop/lists/ui/lists/menu/ListsBottomSheetContract$ViewState;", "viewState", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ListsBottomSheetFragment extends Hilt_ListsBottomSheetFragment implements MenuItemClickListener {
    public final ViewModelLazy i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/menu/ListsBottomSheetFragment$Companion;", "", "", "TAG", "Ljava/lang/String;", "EXTRA_LIST_ID", "EXTRA_FOR_DETAILS", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static ListsBottomSheetFragment a(ShoppingList list, boolean z) {
            Intrinsics.h(list, "list");
            ListsBottomSheetFragment listsBottomSheetFragment = new ListsBottomSheetFragment();
            listsBottomSheetFragment.setCancelable(true);
            listsBottomSheetFragment.setArguments(BundleKt.a(new Pair("list_id", list.getId()), new Pair("for_details", Boolean.valueOf(z))));
            return listsBottomSheetFragment;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/menu/ListsBottomSheetFragment$ListMenuDialogListener;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ListMenuDialogListener {
        void O1(ShoppingList shoppingList, ListAction listAction);
    }

    public ListsBottomSheetFragment() {
        final ListsBottomSheetFragment$special$$inlined$viewModels$default$1 listsBottomSheetFragment$special$$inlined$viewModels$default$1 = new ListsBottomSheetFragment$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) listsBottomSheetFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.i = new ViewModelLazy(Reflection.f24268a.b(ListsBottomSheetViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetFragment$special$$inlined$viewModels$default$5
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
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetFragment$special$$inlined$viewModels$default$4
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

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundleRequireArguments = requireArguments();
        String string = bundleRequireArguments.getString("list_id");
        if (string == null) {
            throw new IllegalStateException("listId has to be provided");
        }
        boolean z = bundleRequireArguments.getBoolean("for_details");
        ListsBottomSheetViewModel listsBottomSheetViewModel = (ListsBottomSheetViewModel) this.i.getD();
        listsBottomSheetViewModel.h.setValue(new ListsBottomSheetContract.ViewState(listsBottomSheetViewModel.q6(null, z, true)));
        BuildersKt.c(ViewModelKt.a(listsBottomSheetViewModel), null, null, new ListsBottomSheetViewModel$fetchShoppingListWithItems$1(listsBottomSheetViewModel, string, z, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.f1985a);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetFragment$setContent$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final ListsBottomSheetFragment listsBottomSheetFragment = this.d;
                    final MutableState mutableStateA = SnapshotStateKt.a(((ListsBottomSheetViewModel) listsBottomSheetFragment.i.getD()).i, composer);
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(1859683814, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetFragment$setContent$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                ListsBottomSheetContract.ViewState viewState = (ListsBottomSheetContract.ViewState) mutableStateA.getD();
                                composer2.o(5004770);
                                ListsBottomSheetFragment listsBottomSheetFragment2 = listsBottomSheetFragment;
                                boolean zI = composer2.I(listsBottomSheetFragment2);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new ListsBottomSheetFragment$setContent$1$1$1$1(1, listsBottomSheetFragment2, ListsBottomSheetFragment.class, "onMenuItemClicked", "onMenuItemClicked(Lau/com/woolworths/shop/lists/ui/lists/menu/ListAction;)V", 0);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                ListsBottomSheetScreenKt.a(viewState, (Function1) ((KFunction) objG), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 448502174));
        return composeView;
    }
}
