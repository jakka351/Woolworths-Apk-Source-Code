package au.com.woolworths.shop.lists.ui.watchlist.toggle;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.extensions.DialogFragmentExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.product.list.legacy.ui.a;
import au.com.woolworths.shop.cart.ui.c;
import au.com.woolworths.shop.lists.ui.utils.ListsUtils;
import au.com.woolworths.shop.lists.ui.watchlist.bottomsheet.WatchlistBottomSheetFragment;
import au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewContract;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0017\u00105\u001a\b\u0012\u0004\u0012\u000202018F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00068²\u0006\f\u00107\u001a\u0002068\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/watchlist/toggle/WatchlistToggleView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/compose/ui/platform/ComposeView;", "", "setContent", "(Landroidx/compose/ui/platform/ComposeView;)V", "Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "f", "Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "getFeatureToggleManager", "()Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "setFeatureToggleManager", "(Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;)V", "featureToggleManager", "Lau/com/woolworths/shop/lists/ui/utils/ListsUtils;", "g", "Lau/com/woolworths/shop/lists/ui/utils/ListsUtils;", "getListsUtils", "()Lau/com/woolworths/shop/lists/ui/utils/ListsUtils;", "setListsUtils", "(Lau/com/woolworths/shop/lists/ui/utils/ListsUtils;)V", "listsUtils", "Lau/com/woolworths/shop/lists/ui/watchlist/toggle/WatchlistToggleViewModel;", "h", "Lkotlin/Lazy;", "getViewModel", "()Lau/com/woolworths/shop/lists/ui/watchlist/toggle/WatchlistToggleViewModel;", "viewModel", "Landroidx/appcompat/app/AppCompatActivity;", "i", "getActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "activity", "", "j", "Ljava/lang/String;", "getListId", "()Ljava/lang/String;", "setListId", "(Ljava/lang/String;)V", "listId", "Lkotlinx/coroutines/flow/Flow;", "Lau/com/woolworths/android/onesite/models/text/ResText;", "getSnackbarFlow", "()Lkotlinx/coroutines/flow/Flow;", "snackbarFlow", "Lau/com/woolworths/shop/lists/ui/watchlist/toggle/WatchlistToggleViewContract$ViewState;", "viewState", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class WatchlistToggleView extends Hilt_WatchlistToggleView {
    public static final /* synthetic */ int k = 0;

    /* renamed from: f, reason: from kotlin metadata */
    public FeatureToggleManager featureToggleManager;

    /* renamed from: g, reason: from kotlin metadata */
    public ListsUtils listsUtils;
    public final ViewModelLazy h;

    /* renamed from: i, reason: from kotlin metadata */
    public final Lazy activity;

    /* renamed from: j, reason: from kotlin metadata */
    public String listId;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WatchlistToggleView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.h(context, "context");
    }

    public static ViewModelProvider.Factory a(WatchlistToggleView watchlistToggleView) {
        return watchlistToggleView.getActivity().getDefaultViewModelProviderFactory();
    }

    public static final void c(WatchlistToggleView watchlistToggleView, WatchlistToggleViewContract.Actions actions) {
        if (!(actions instanceof WatchlistToggleViewContract.Actions.ShowBottomSheet)) {
            watchlistToggleView.getClass();
            throw new NoWhenBranchMatchedException();
        }
        FragmentManager supportFragmentManager = watchlistToggleView.getActivity().getSupportFragmentManager();
        Intrinsics.g(supportFragmentManager, "getSupportFragmentManager(...)");
        DialogFragmentExtKt.a(new WatchlistBottomSheetFragment(), supportFragmentManager, "WatchlistBottomSheetFragment");
    }

    private final AppCompatActivity getActivity() {
        return (AppCompatActivity) this.activity.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WatchlistToggleViewModel getViewModel() {
        return (WatchlistToggleViewModel) this.h.getD();
    }

    private final void setContent(ComposeView composeView) {
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.f1985a);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleView.setContent.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final WatchlistToggleView watchlistToggleView = WatchlistToggleView.this;
                    final MutableState mutableStateA = FlowExtKt.a(watchlistToggleView.getViewModel().p, composer);
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(91478259, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleView.setContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                WatchlistToggleViewContract.ViewState viewState = (WatchlistToggleViewContract.ViewState) mutableStateA.getD();
                                WatchlistToggleViewModel viewModel = watchlistToggleView.getViewModel();
                                composer2.o(5004770);
                                boolean zI = composer2.I(viewModel);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new WatchlistToggleView$setContent$1$1$1$1(1, viewModel, WatchlistToggleViewModel.class, "onToggleClick", "onToggleClick$shop_lists_release(Z)V", 0);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                WatchlistToggleViewScreenKt.a(viewState, (Function1) ((KFunction) objG), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -208967985));
    }

    public final void d() {
        WatchlistToggleViewModel viewModel = getViewModel();
        viewModel.getClass();
        BuildersKt.c(ViewModelKt.a(viewModel), null, null, new WatchlistToggleViewModel$checkForPermissionsAndToggles$1(viewModel, null), 3);
    }

    public final Object e(Continuation continuation) {
        return getViewModel().q6((ContinuationImpl) continuation);
    }

    @NotNull
    public final FeatureToggleManager getFeatureToggleManager() {
        FeatureToggleManager featureToggleManager = this.featureToggleManager;
        if (featureToggleManager != null) {
            return featureToggleManager;
        }
        Intrinsics.p("featureToggleManager");
        throw null;
    }

    @NotNull
    public final String getListId() {
        String str = this.listId;
        if (str != null) {
            return str;
        }
        Intrinsics.p("listId");
        throw null;
    }

    @NotNull
    public final ListsUtils getListsUtils() {
        ListsUtils listsUtils = this.listsUtils;
        if (listsUtils != null) {
            return listsUtils;
        }
        Intrinsics.p("listsUtils");
        throw null;
    }

    @NotNull
    public final Flow<ResText> getSnackbarFlow() {
        return getViewModel().q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LifecycleOwner lifecycleOwnerA = ViewTreeLifecycleOwner.a(this);
        if (lifecycleOwnerA != null) {
            BuildersKt.c(LifecycleOwnerKt.a(lifecycleOwnerA), null, null, new WatchlistToggleView$onAttachedToWindow$1$1(this, lifecycleOwnerA, null), 3);
        }
        WatchlistToggleViewModel viewModel = getViewModel();
        String listId = getListId();
        viewModel.getClass();
        Intrinsics.h(listId, "listId");
        BuildersKt.c(ViewModelKt.a(viewModel), null, null, new WatchlistToggleViewModel$initialise$1(viewModel, listId, null), 3);
        BuildersKt.c(ViewModelKt.a(viewModel), null, null, new WatchlistToggleViewModel$initialise$2(viewModel, null), 3);
        if (!viewModel.g.c() && viewModel.j.c(BaseShopAppFeature.v)) {
            BuildersKt.c(ViewModelKt.a(viewModel), null, null, new WatchlistToggleViewModel$initialise$3(viewModel, null), 3);
        }
        ComposeView composeView = new ComposeView(getActivity(), null, 6, 0);
        setContent(composeView);
        addView(composeView);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i) {
        Intrinsics.h(changedView, "changedView");
        super.onVisibilityChanged(changedView, i);
        if (i == 0) {
            d();
        }
    }

    public final void setFeatureToggleManager(@NotNull FeatureToggleManager featureToggleManager) {
        Intrinsics.h(featureToggleManager, "<set-?>");
        this.featureToggleManager = featureToggleManager;
    }

    public final void setListId(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.listId = str;
    }

    public final void setListsUtils(@NotNull ListsUtils listsUtils) {
        Intrinsics.h(listsUtils, "<set-?>");
        this.listsUtils = listsUtils;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WatchlistToggleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.h(context, "context");
    }

    public /* synthetic */ WatchlistToggleView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WatchlistToggleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        if (!isInEditMode() && !this.e) {
            this.e = true;
            ((WatchlistToggleView_GeneratedInjector) t3()).f(this);
        }
        c cVar = new c(this, 26);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleView$special$$inlined$viewModels$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelStoreOwner viewModelStoreOwnerA = ViewTreeViewModelStoreOwner.a(this.d);
                if (viewModelStoreOwnerA != null) {
                    return viewModelStoreOwnerA;
                }
                throw new IllegalArgumentException("View needs to be attached to an activity or fragment first");
            }
        });
        this.h = new ViewModelLazy(Reflection.f24268a.b(WatchlistToggleViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleView$special$$inlined$viewModels$default$2
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getViewModelStore();
            }
        }, cVar, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleView$special$$inlined$viewModels$default$3
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.b;
            }
        });
        this.activity = LazyKt.b(new a(context, 14));
    }
}
