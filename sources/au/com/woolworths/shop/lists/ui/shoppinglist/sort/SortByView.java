package au.com.woolworths.shop.lists.ui.shoppinglist.sort;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
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
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.extensions.DialogFragmentExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.shop.lists.data.prefs.ShoppingListsRepository;
import au.com.woolworths.shop.lists.data.prefs.SortBy;
import au.com.woolworths.shop.lists.data.prefs.SortDirection;
import au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository;
import au.com.woolworths.shop.lists.ui.ListDetailsAnalyticsParams;
import au.com.woolworths.shop.lists.ui.magicmatch.ui.OnboardingBottomSheetKt;
import au.com.woolworths.shop.lists.ui.shoppinglist.analytics.SortByViewActions;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewContract;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet.SortByBottomSheetFragment;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.ui.InfoDialogKt;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.ui.SortByViewScreenKt;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.ui.TwoButtonDialogKt;
import au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.SnapAListBottomSheetFragment;
import au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.SnapAListBottomSheetType;
import au.com.woolworths.shop.lists.ui.utils.ListsUtils;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006;²\u0006\f\u0010:\u001a\u0002098\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/compose/ui/platform/ComposeView;", "", "setContent", "(Landroidx/compose/ui/platform/ComposeView;)V", "Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "f", "Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "getFeatureToggleManager", "()Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "setFeatureToggleManager", "(Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;)V", "featureToggleManager", "Lau/com/woolworths/shop/lists/ui/utils/ListsUtils;", "g", "Lau/com/woolworths/shop/lists/ui/utils/ListsUtils;", "getListsUtils", "()Lau/com/woolworths/shop/lists/ui/utils/ListsUtils;", "setListsUtils", "(Lau/com/woolworths/shop/lists/ui/utils/ListsUtils;)V", "listsUtils", "Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewModel;", "h", "Lkotlin/Lazy;", "getViewModel", "()Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewModel;", "viewModel", "Landroidx/appcompat/app/AppCompatActivity;", "i", "getActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "activity", "", "j", "Ljava/lang/String;", "getListId", "()Ljava/lang/String;", "setListId", "(Ljava/lang/String;)V", "listId", "Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewListener;", "k", "Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewListener;", "getSortByViewListener", "()Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewListener;", "setSortByViewListener", "(Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewListener;)V", "sortByViewListener", "Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewContract$ViewState;", "viewState", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SortByView extends Hilt_SortByView {
    public static final /* synthetic */ int l = 0;

    /* renamed from: f, reason: from kotlin metadata */
    public FeatureToggleManager featureToggleManager;

    /* renamed from: g, reason: from kotlin metadata */
    public ListsUtils listsUtils;
    public final ViewModelLazy h;

    /* renamed from: i, reason: from kotlin metadata */
    public final Lazy activity;

    /* renamed from: j, reason: from kotlin metadata */
    public String listId;

    /* renamed from: k, reason: from kotlin metadata */
    public SortByViewListener sortByViewListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SortByView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.h(context, "context");
    }

    public static void a(SortByView sortByView) {
        sortByView.getViewModel().getClass();
        SortByViewModel.x = true;
    }

    public static void b(SortByView sortByView) {
        SortByViewModel viewModel = sortByView.getViewModel();
        viewModel.getClass();
        BuildersKt.c(ViewModelKt.a(viewModel), null, null, new SortByViewModel$magicMatchOnboardingPrimaryCtaClick$1(viewModel, null), 3);
        viewModel.q6().h0();
    }

    public static void c(SortByView sortByView) {
        SortByViewModel viewModel = sortByView.getViewModel();
        viewModel.i.j(new SortByViewActions.ListDialogChangeModeClick((ListDetailsAnalyticsParams) viewModel.p.getD()), TrackingMetadata.Companion.a(TrackableValue.o0, "Change Mode"));
        ListsUtils.c(sortByView.getListsUtils(), sortByView.getActivity(), null, 14);
    }

    public static void d(SortByView sortByView) {
        SortByViewModel viewModel = sortByView.getViewModel();
        viewModel.getClass();
        BuildersKt.c(ViewModelKt.a(viewModel), null, null, new SortByViewModel$magicMatchOnboardingTertiaryCtaClick$1(viewModel, null), 3);
    }

    public static void e(SortByView sortByView) {
        SortByViewModel viewModel = sortByView.getViewModel();
        viewModel.getClass();
        BuildersKt.c(ViewModelKt.a(viewModel), null, null, new SortByViewModel$launchMagicMatchScreen$1(viewModel, null), 3);
        viewModel.q6().h0();
    }

    public static final void g(SortByView sortByView, SortByViewContract.Actions actions) {
        if (actions instanceof SortByViewContract.Actions.ShowSortByAisleWarning) {
            SortByViewContract.Actions.ShowSortByAisleWarning showSortByAisleWarning = (SortByViewContract.Actions.ShowSortByAisleWarning) actions;
            TwoButtonDialogKt.b(sortByView.getActivity(), showSortByAisleWarning.f12441a, showSortByAisleWarning.b, showSortByAisleWarning.c, showSortByAisleWarning.d, new a(sortByView, 0));
            return;
        }
        if (actions instanceof SortByViewContract.Actions.ShowDialog) {
            SortByViewContract.Actions.ShowDialog showDialog = (SortByViewContract.Actions.ShowDialog) actions;
            InfoDialogKt.b(sortByView.getActivity(), showDialog.f12438a, showDialog.b);
            return;
        }
        if (actions instanceof SortByViewContract.Actions.ShowSortBySelectionDialog) {
            FragmentManager supportFragmentManager = sortByView.getActivity().getSupportFragmentManager();
            boolean z = sortByView.getViewModel().o;
            if (supportFragmentManager != null) {
                SortByBottomSheetFragment sortByBottomSheetFragment = new SortByBottomSheetFragment();
                Bundle bundle = new Bundle();
                bundle.putBoolean("EXTRA_IS_WATCHLIST", z);
                sortByBottomSheetFragment.setArguments(bundle);
                DialogFragmentExtKt.a(sortByBottomSheetFragment, supportFragmentManager, "SelectSortByBottomSheetFragment");
                return;
            }
            return;
        }
        if (actions instanceof SortByViewContract.Actions.ShowSnapAListBottomSheet) {
            SnapAListBottomSheetFragment.Companion.a(sortByView.getActivity().getSupportFragmentManager(), new SnapAListBottomSheetFragment.Extras(SnapAListBottomSheetType.d));
            return;
        }
        if (actions instanceof SortByViewContract.Actions.LaunchSnapAListGuestOnboardingScreen) {
            sortByView.getActivity().startActivity(Activities.ShopListGuestOnboardingActivity.f4532a.b(Activities.ShopListGuestOnboardingActivity.ListFeature.e));
            return;
        }
        if (actions instanceof SortByViewContract.Actions.LaunchMagicMatchOnboardingScreen) {
            OnboardingBottomSheetKt.c(sortByView.getActivity(), new a(sortByView, 3), new a(sortByView, 4), new a(sortByView, 5));
        } else {
            if (!(actions instanceof SortByViewContract.Actions.ShowMaxItemsDialog)) {
                sortByView.getClass();
                throw new NoWhenBranchMatchedException();
            }
            SortByViewContract.Actions.ShowMaxItemsDialog showMaxItemsDialog = (SortByViewContract.Actions.ShowMaxItemsDialog) actions;
            TwoButtonDialogKt.b(sortByView.getActivity(), showMaxItemsDialog.f12439a, showMaxItemsDialog.b, showMaxItemsDialog.c, showMaxItemsDialog.d, new a(sortByView, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SortByViewModel getViewModel() {
        return (SortByViewModel) this.h.getD();
    }

    private final void setContent(ComposeView composeView) {
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.f1985a);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByView.setContent.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final SortByView sortByView = SortByView.this;
                    final MutableState mutableStateA = FlowExtKt.a(sortByView.getViewModel().q, composer);
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(797277362, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByView.setContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer$Companion$Empty$1 composer$Companion$Empty$1;
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                SortByViewContract.ViewState viewState = (SortByViewContract.ViewState) mutableStateA.getD();
                                SortByView sortByView2 = sortByView;
                                boolean z = ((Boolean) sortByView2.getViewModel().t.getD()).booleanValue() && !sortByView2.getViewModel().o;
                                boolean zBooleanValue = ((Boolean) sortByView2.getViewModel().u.getD()).booleanValue();
                                SortByViewModel viewModel = sortByView2.getViewModel();
                                composer2.o(5004770);
                                boolean zI = composer2.I(viewModel);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$12) {
                                    composer$Companion$Empty$1 = composer$Companion$Empty$12;
                                    SortByView$setContent$1$1$1$1 sortByView$setContent$1$1$1$1 = new SortByView$setContent$1$1$1$1(0, viewModel, SortByViewModel.class, "onChangeSortBy", "onChangeSortBy()V", 0);
                                    composer2.A(sortByView$setContent$1$1$1$1);
                                    objG = sortByView$setContent$1$1$1$1;
                                } else {
                                    composer$Companion$Empty$1 = composer$Companion$Empty$12;
                                }
                                composer2.l();
                                Function0 function0 = (Function0) ((KFunction) objG);
                                SortByViewModel viewModel2 = sortByView2.getViewModel();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(viewModel2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    SortByView$setContent$1$1$2$1 sortByView$setContent$1$1$2$1 = new SortByView$setContent$1$1$2$1(0, viewModel2, SortByViewModel.class, "onChangeSortDirection", "onChangeSortDirection()V", 0);
                                    composer2.A(sortByView$setContent$1$1$2$1);
                                    objG2 = sortByView$setContent$1$1$2$1;
                                }
                                composer2.l();
                                Function0 function02 = (Function0) ((KFunction) objG2);
                                SortByViewModel viewModel3 = sortByView2.getViewModel();
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(viewModel3);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == composer$Companion$Empty$1) {
                                    objG3 = new SortByView$setContent$1$1$3$1(0, viewModel3, SortByViewModel.class, "onCameraClick", "onCameraClick()V", 0);
                                    composer2.A(objG3);
                                }
                                composer2.l();
                                Function0 function03 = (Function0) ((KFunction) objG3);
                                SortByViewModel viewModel4 = sortByView2.getViewModel();
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(viewModel4);
                                Object objG4 = composer2.G();
                                if (zI4 || objG4 == composer$Companion$Empty$1) {
                                    SortByView$setContent$1$1$4$1 sortByView$setContent$1$1$4$1 = new SortByView$setContent$1$1$4$1(0, viewModel4, SortByViewModel.class, "onWandIconClick", "onWandIconClick()V", 0);
                                    composer2.A(sortByView$setContent$1$1$4$1);
                                    objG4 = sortByView$setContent$1$1$4$1;
                                }
                                composer2.l();
                                SortByViewScreenKt.f(viewState, z, zBooleanValue, function0, function02, function03, (Function0) ((KFunction) objG4), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -395409926));
    }

    @NotNull
    public final AppCompatActivity getActivity() {
        return (AppCompatActivity) this.activity.getD();
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
    public final SortByViewListener getSortByViewListener() {
        SortByViewListener sortByViewListener = this.sortByViewListener;
        if (sortByViewListener != null) {
            return sortByViewListener;
        }
        Intrinsics.p("sortByViewListener");
        throw null;
    }

    public final void h(SortBy sortBy) {
        Intrinsics.h(sortBy, "sortBy");
        SortByViewModel viewModel = getViewModel();
        ShoppingListsRepository shoppingListsRepository = viewModel.g;
        ListsInMemoryRepository listsInMemoryRepository = viewModel.f;
        ListsUtils listsUtils = viewModel.j;
        if (sortBy == listsUtils.d()) {
            return;
        }
        if (!listsInMemoryRepository.g() && sortBy == SortBy.h) {
            viewModel.i.c(new SortByViewActions.ChangeShoppingModeDialogImpression((ListDetailsAnalyticsParams) viewModel.p.getD()));
            viewModel.n.f(new SortByViewContract.Actions.ShowSortByAisleWarning(new ResText(R.string.shop_lists_aisle_warning_title), new ResText(R.string.shop_lists_aisle_warning_message), new ResText(R.string.shop_lists_button_cancel), new ResText(R.string.shop_lists_change_mode_button)));
            return;
        }
        shoppingListsRepository.a(listsInMemoryRepository.b(), sortBy);
        MutableStateFlow mutableStateFlow = viewModel.m;
        String str = ((SortByViewContract.ViewState) mutableStateFlow.getValue()).f12443a;
        int i = ((SortByViewContract.ViewState) mutableStateFlow.getValue()).b;
        int i2 = ((SortByViewContract.ViewState) mutableStateFlow.getValue()).c;
        SortByViewContract.ViewState viewState = (SortByViewContract.ViewState) mutableStateFlow.getValue();
        SortBy sortByD = listsUtils.d();
        viewState.getClass();
        mutableStateFlow.f(new SortByViewContract.ViewState(str, i, i2, sortByD));
        if (sortBy == SortBy.g) {
            shoppingListsRepository.b(listsInMemoryRepository.b(), SortDirection.e);
        }
        viewModel.q6().o1();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LifecycleOwner lifecycleOwnerA = ViewTreeLifecycleOwner.a(this);
        if (lifecycleOwnerA != null) {
            BuildersKt.c(LifecycleOwnerKt.a(lifecycleOwnerA), null, null, new SortByView$onAttachedToWindow$1$1(this, lifecycleOwnerA, null), 3);
        }
        SortByViewModel viewModel = getViewModel();
        String listId = getListId();
        SortByViewListener hostViewListener = getSortByViewListener();
        viewModel.getClass();
        Intrinsics.h(listId, "listId");
        Intrinsics.h(hostViewListener, "hostViewListener");
        viewModel.s = hostViewListener;
        BuildersKt.c(ViewModelKt.a(viewModel), null, null, new SortByViewModel$initialise$1(viewModel, listId, null), 3);
        ComposeView composeView = new ComposeView(getActivity(), null, 6, 0);
        setContent(composeView);
        addView(composeView);
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

    public final void setSortByViewListener(@NotNull SortByViewListener sortByViewListener) {
        Intrinsics.h(sortByViewListener, "<set-?>");
        this.sortByViewListener = sortByViewListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SortByView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SortByView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        if (!isInEditMode() && !this.e) {
            this.e = true;
            ((SortByView_GeneratedInjector) t3()).b(this);
        }
        a aVar = new a(this, 2);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByView$special$$inlined$viewModels$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelStoreOwner viewModelStoreOwnerA = ViewTreeViewModelStoreOwner.a(this.d);
                if (viewModelStoreOwnerA != null) {
                    return viewModelStoreOwnerA;
                }
                throw new IllegalArgumentException("View needs to be attached to an activity or fragment first");
            }
        });
        this.h = new ViewModelLazy(Reflection.f24268a.b(SortByViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByView$special$$inlined$viewModels$default$2
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getViewModelStore();
            }
        }, aVar, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByView$special$$inlined$viewModels$default$3
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.b;
            }
        });
        this.activity = LazyKt.b(new au.com.woolworths.feature.product.list.legacy.ui.a(context, 9));
    }

    public /* synthetic */ SortByView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
