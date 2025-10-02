package au.com.woolworths.shop.lists.ui.details.ui;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.core.graphics.Insets;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.transition.Slide;
import androidx.transition.TransitionManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.shop.cart.ui.c;
import au.com.woolworths.shop.lists.databinding.ViewListDetailsBinding;
import au.com.woolworths.shop.lists.ui.details.ui.ListDetailsContract;
import au.com.woolworths.shop.lists.ui.details.ui.compose.ListDetailsViewContentKt;
import au.com.woolworths.shop.lists.ui.details.ui.compose.ListDetailsViewOverviewKt;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListDetailsUiModel;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001;B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010+\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R!\u0010:\u001a\u0002048@X\u0080\u0084\u0002¢\u0006\u0012\n\u0004\b5\u0010\u0018\u0012\u0004\b8\u00109\u001a\u0004\b6\u00107¨\u0006<"}, d2 = {"Lau/com/woolworths/shop/lists/ui/details/ui/ListDetailsView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lau/com/woolworths/shop/lists/ui/details/ui/ListDetailsContract$ViewState;", "", "setViewVisibility", "(Lau/com/woolworths/shop/lists/ui/details/ui/ListDetailsContract$ViewState;)V", "Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "f", "Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "getFeatureToggleManager", "()Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "setFeatureToggleManager", "(Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;)V", "featureToggleManager", "Lau/com/woolworths/shop/lists/ui/details/ui/ListDetailsViewModel;", "g", "Lkotlin/Lazy;", "getViewModel", "()Lau/com/woolworths/shop/lists/ui/details/ui/ListDetailsViewModel;", "viewModel", "", "i", "Ljava/lang/String;", "getListId", "()Ljava/lang/String;", "setListId", "(Ljava/lang/String;)V", "listId", "Lau/com/woolworths/shop/lists/ui/details/ui/ListDetailsViewListener;", "j", "Lau/com/woolworths/shop/lists/ui/details/ui/ListDetailsViewListener;", "getHostViewListener", "()Lau/com/woolworths/shop/lists/ui/details/ui/ListDetailsViewListener;", "setHostViewListener", "(Lau/com/woolworths/shop/lists/ui/details/ui/ListDetailsViewListener;)V", "hostViewListener", "", "n", "Z", "getCanShowSnackbar$shop_lists_release", "()Z", "setCanShowSnackbar$shop_lists_release", "(Z)V", "canShowSnackbar", "Landroidx/appcompat/app/AppCompatActivity;", "o", "getActivity$shop_lists_release", "()Landroidx/appcompat/app/AppCompatActivity;", "getActivity$shop_lists_release$annotations", "()V", "activity", "Companion", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ListDetailsView extends Hilt_ListDetailsView {
    public static final /* synthetic */ int p = 0;

    /* renamed from: f, reason: from kotlin metadata */
    public FeatureToggleManager featureToggleManager;
    public final ViewModelLazy g;
    public final ViewListDetailsBinding h;

    /* renamed from: i, reason: from kotlin metadata */
    public String listId;

    /* renamed from: j, reason: from kotlin metadata */
    public ListDetailsViewListener hostViewListener;
    public BottomSheetBehavior k;
    public ListDetailsBottomSheetCallback l;
    public final a m;

    /* renamed from: n, reason: from kotlin metadata */
    public boolean canShowSnackbar;

    /* renamed from: o, reason: from kotlin metadata */
    public final Lazy activity;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/lists/ui/details/ui/ListDetailsView$Companion;", "", "", "VIEW_SLIDE_SHOW_DURATION_MILLIS", "J", "VIEW_SLIDE_HIDE_DURATION_MILLIS", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ListDetailsView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.h(context, "context");
    }

    public static void a(ListDetailsView listDetailsView, ListDetailsContract.ViewState viewState) {
        Intrinsics.e(viewState);
        listDetailsView.setViewVisibility(viewState);
    }

    public static /* synthetic */ void getActivity$shop_lists_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ListDetailsViewModel getViewModel() {
        return (ListDetailsViewModel) this.g.getD();
    }

    private final void setViewVisibility(ListDetailsContract.ViewState viewState) {
        boolean z = viewState.c;
        boolean z2 = viewState.b;
        if (z) {
            return;
        }
        if ((getVisibility() == 0) == z2) {
            return;
        }
        ViewParent parent = getParent();
        Intrinsics.f(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) parent;
        long j = z2 ? 1000L : 300L;
        Slide slide = new Slide();
        slide.K = Slide.S;
        slide.W(80);
        slide.f = j;
        slide.i.add(this);
        TransitionManager.a(viewGroup, slide);
        setVisibility(z2 ? 0 : 8);
    }

    public final void c(boolean z) {
        if (z) {
            setVisibility(8);
        }
        ListDetailsViewModel viewModel = getViewModel();
        ListDetailsViewModel.s6(viewModel, viewModel.m, null, false, z, BitmapDescriptorFactory.HUE_RED, 11);
    }

    public final void d(ShoppingListDetailsUiModel listDetailsUiModel) {
        Intrinsics.h(listDetailsUiModel, "listDetailsUiModel");
        getViewModel().t6(listDetailsUiModel);
    }

    @NotNull
    public final AppCompatActivity getActivity$shop_lists_release() {
        return (AppCompatActivity) this.activity.getD();
    }

    /* renamed from: getCanShowSnackbar$shop_lists_release, reason: from getter */
    public final boolean getCanShowSnackbar() {
        return this.canShowSnackbar;
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

    @Nullable
    public final ListDetailsViewListener getHostViewListener() {
        return this.hostViewListener;
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

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewListDetailsBinding viewListDetailsBinding = this.h;
        ComposeView composeView = viewListDetailsBinding.y;
        ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed disposeOnViewTreeLifecycleDestroyed = ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f1986a;
        composeView.setViewCompositionStrategy(disposeOnViewTreeLifecycleDestroyed);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.details.ui.ListDetailsView$setViewContent$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final ListDetailsView listDetailsView = this.d;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(1545656890, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.details.ui.ListDetailsView$setViewContent$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                ListDetailsView listDetailsView2 = listDetailsView;
                                ListDetailsContract.ViewState viewState = (ListDetailsContract.ViewState) LiveDataAdapterKt.a(listDetailsView2.getViewModel().n, composer2).getD();
                                if (viewState != null) {
                                    Modifier modifierE = SizeKt.e(Modifier.Companion.d, 1.0f);
                                    composer2.o(5004770);
                                    boolean zI = composer2.I(listDetailsView2);
                                    Object objG = composer2.G();
                                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                    if (zI || objG == composer$Companion$Empty$1) {
                                        objG = new b(listDetailsView2, 1);
                                        composer2.A(objG);
                                    }
                                    composer2.l();
                                    Modifier modifierA = OnGloballyPositionedModifierKt.a(modifierE, (Function1) objG);
                                    ListDetailsViewModel viewModel = listDetailsView2.getViewModel();
                                    composer2.o(5004770);
                                    boolean zI2 = composer2.I(viewModel);
                                    Object objG2 = composer2.G();
                                    if (zI2 || objG2 == composer$Companion$Empty$1) {
                                        ListDetailsView$setViewContent$1$1$1$2$1 listDetailsView$setViewContent$1$1$1$2$1 = new ListDetailsView$setViewContent$1$1$1$2$1(0, viewModel, ListDetailsViewModel.class, "onToggleBottomSheet", "onToggleBottomSheet$shop_lists_release()V", 0);
                                        composer2.A(listDetailsView$setViewContent$1$1$1$2$1);
                                        objG2 = listDetailsView$setViewContent$1$1$1$2$1;
                                    }
                                    composer2.l();
                                    ListDetailsViewOverviewKt.a(viewState, modifierA, (Function0) ((KFunction) objG2), composer2, 0);
                                }
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 989652354));
        ComposeView composeView2 = viewListDetailsBinding.z;
        composeView2.setViewCompositionStrategy(disposeOnViewTreeLifecycleDestroyed);
        composeView2.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.details.ui.ListDetailsView$setViewContent$2$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final ListDetailsView listDetailsView = this.d;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(-1499040015, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.details.ui.ListDetailsView$setViewContent$2$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                ListDetailsContract.ViewState viewState = (ListDetailsContract.ViewState) LiveDataAdapterKt.a(listDetailsView.getViewModel().n, composer2).getD();
                                if (viewState != null) {
                                    ListDetailsViewContentKt.a(viewState, SizeKt.e(Modifier.Companion.d, 1.0f), composer2, 48);
                                }
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 1051512889));
        ComposeView overviewLayout = viewListDetailsBinding.y;
        Intrinsics.g(overviewLayout, "overviewLayout");
        ViewCompat.A(overviewLayout, new AccessibilityDelegateCompat() { // from class: au.com.woolworths.shop.lists.ui.details.ui.ListDetailsView$initialiseBottomSheetAccessibilityHints$a11yDelegate$1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final void d(View host, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                Intrinsics.h(host, "host");
                this.f2466a.onInitializeAccessibilityNodeInfo(host, accessibilityNodeInfoCompat.f2508a);
                ListDetailsView listDetailsView = this.d;
                BottomSheetBehavior bottomSheetBehavior = listDetailsView.k;
                if (bottomSheetBehavior != null) {
                    accessibilityNodeInfoCompat.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, listDetailsView.getContext().getString(bottomSheetBehavior.O == 3 ? R.string.shop_lists_list_details_collapse_action_description : R.string.shop_lists_list_details_expand_action_description)));
                } else {
                    Intrinsics.p("bottomSheetBehavior");
                    throw null;
                }
            }
        });
        Object parent = viewListDetailsBinding.h.getParent();
        Intrinsics.f(parent, "null cannot be cast to non-null type android.view.View");
        this.k = BottomSheetBehavior.F((View) parent);
        ListDetailsBottomSheetCallback listDetailsBottomSheetCallback = new ListDetailsBottomSheetCallback(new ListDetailsView$initialiseBottomSheetBehaviour$1(1, getViewModel(), ListDetailsViewModel.class, "onChevronRotationChange", "onChevronRotationChange(F)V", 0));
        this.l = listDetailsBottomSheetCallback;
        BottomSheetBehavior bottomSheetBehavior = this.k;
        if (bottomSheetBehavior == null) {
            Intrinsics.p("bottomSheetBehavior");
            throw null;
        }
        bottomSheetBehavior.y(listDetailsBottomSheetCallback);
        getViewTreeObserver().addOnGlobalLayoutListener(this.m);
        LifecycleOwner lifecycleOwnerA = ViewTreeLifecycleOwner.a(this);
        if (lifecycleOwnerA != null) {
            getViewModel().n.f(lifecycleOwnerA, new ListDetailsView$sam$androidx_lifecycle_Observer$0(new b(this, 0)));
            BuildersKt.c(LifecycleOwnerKt.a(lifecycleOwnerA), null, null, new ListDetailsView$onAttachedToWindow$2$2(this, lifecycleOwnerA, null), 3);
            BuildersKt.c(LifecycleOwnerKt.a(lifecycleOwnerA), null, null, new ListDetailsView$onAttachedToWindow$2$3(this, lifecycleOwnerA, null), 3);
            ListDetailsViewModel viewModel = getViewModel();
            String listId = getListId();
            viewModel.getClass();
            Intrinsics.h(listId, "listId");
            if (viewModel.i.a()) {
                BuildersKt.c(ViewModelKt.a(viewModel), null, null, new ListDetailsViewModel$setListId$1(viewModel, listId, null), 3);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BottomSheetBehavior bottomSheetBehavior = this.k;
        if (bottomSheetBehavior == null) {
            Intrinsics.p("bottomSheetBehavior");
            throw null;
        }
        ListDetailsBottomSheetCallback listDetailsBottomSheetCallback = this.l;
        if (listDetailsBottomSheetCallback == null) {
            Intrinsics.p("bottomSheetCallback");
            throw null;
        }
        bottomSheetBehavior.a0.remove(listDetailsBottomSheetCallback);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.m);
    }

    public final void setCanShowSnackbar$shop_lists_release(boolean z) {
        this.canShowSnackbar = z;
    }

    public final void setFeatureToggleManager(@NotNull FeatureToggleManager featureToggleManager) {
        Intrinsics.h(featureToggleManager, "<set-?>");
        this.featureToggleManager = featureToggleManager;
    }

    public final void setHostViewListener(@Nullable ListDetailsViewListener listDetailsViewListener) {
        this.hostViewListener = listDetailsViewListener;
    }

    public final void setListId(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.listId = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ListDetailsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r7v6, types: [au.com.woolworths.shop.lists.ui.details.ui.a] */
    @JvmOverloads
    public ListDetailsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        if (!isInEditMode() && !this.e) {
            this.e = true;
            ((ListDetailsView_GeneratedInjector) t3()).c(this);
        }
        c cVar = new c(this, 14);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.shop.lists.ui.details.ui.ListDetailsView$special$$inlined$viewModels$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelStoreOwner viewModelStoreOwnerA = ViewTreeViewModelStoreOwner.a(this.d);
                if (viewModelStoreOwnerA != null) {
                    return viewModelStoreOwnerA;
                }
                throw new IllegalArgumentException("View needs to be attached to an activity or fragment first");
            }
        });
        this.g = new ViewModelLazy(Reflection.f24268a.b(ListDetailsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.lists.ui.details.ui.ListDetailsView$special$$inlined$viewModels$default$2
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getViewModelStore();
            }
        }, cVar, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.lists.ui.details.ui.ListDetailsView$special$$inlined$viewModels$default$3
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.b;
            }
        });
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i2 = ViewListDetailsBinding.A;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        ViewListDetailsBinding viewListDetailsBinding = (ViewListDetailsBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.view_list_details, this, true, null);
        Intrinsics.g(viewListDetailsBinding, "inflate(...)");
        this.h = viewListDetailsBinding;
        this.m = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: au.com.woolworths.shop.lists.ui.details.ui.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                int height;
                ListDetailsView listDetailsView = this.d;
                BottomSheetBehavior bottomSheetBehavior = listDetailsView.k;
                ViewListDetailsBinding viewListDetailsBinding2 = listDetailsView.h;
                if (bottomSheetBehavior == null) {
                    Intrinsics.p("bottomSheetBehavior");
                    throw null;
                }
                if (Build.VERSION.SDK_INT >= 35) {
                    WindowInsetsCompat windowInsetsCompatN = ViewCompat.n(viewListDetailsBinding2.y);
                    Insets insetsE = windowInsetsCompatN != null ? windowInsetsCompatN.e(2) : null;
                    height = viewListDetailsBinding2.y.getHeight() + (insetsE != null ? insetsE.d : 0);
                } else {
                    height = viewListDetailsBinding2.y.getHeight();
                }
                bottomSheetBehavior.N(height);
            }
        };
        this.canShowSnackbar = true;
        this.activity = LazyKt.b(new au.com.woolworths.feature.product.list.legacy.ui.a(context, 8));
    }

    public /* synthetic */ ListDetailsView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
