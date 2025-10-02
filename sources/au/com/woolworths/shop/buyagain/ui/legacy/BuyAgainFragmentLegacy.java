package au.com.woolworths.shop.buyagain.ui.legacy;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentKt;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.ToolbarOnDestinationChangedListener;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.buyagain.BuyAgainAnalytics;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.customviews.itemdividers.DefaultDividerItemDecoration;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.offers.ProductBoostContract;
import au.com.woolworths.product.offers.ProductBoostResultViewModel;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment;
import au.com.woolworths.shop.addtolist.models.AddToListProductParameters;
import au.com.woolworths.shop.addtolist.models.ListChangeEvent;
import au.com.woolworths.shop.addtolist.models.ListChangeEventKt;
import au.com.woolworths.shop.buyagain.analytics.ScreenExtKt;
import au.com.woolworths.shop.buyagain.analytics.ScreenExtKt$toScreen$1;
import au.com.woolworths.shop.buyagain.databinding.FragmentBuyAgainBinding;
import au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainContractLegacy;
import au.com.woolworths.shop.buyagain.ui.legacy.quantityselector.BuyAgainQuantitySelectorFragment;
import au.com.woolworths.shop.cart.ui.CartBadgeActionView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.snackbar.Snackbar;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainFragmentLegacy;", "Landroidx/fragment/app/Fragment;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetFragment$BottomSheetHost;", "Lau/com/woolworths/shop/buyagain/ui/legacy/quantityselector/BuyAgainQuantitySelectorFragment$BottomSheetHost;", "<init>", "()V", "Companion", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BuyAgainFragmentLegacy extends Hilt_BuyAgainFragmentLegacy implements AddToListBottomSheetFragment.BottomSheetHost, BuyAgainQuantitySelectorFragment.BottomSheetHost {
    public FragmentBuyAgainBinding i;
    public FeatureToggleManager j;
    public InstoreNavigationInteractor k;
    public ShopAppNavigator l;
    public final ViewModelLazy m;
    public final ViewModelLazy n;
    public final Lazy o;
    public final Lazy p;
    public final ActivityResultLauncher q;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainFragmentLegacy$Companion;", "", "", "ADDED_TO_CART_SNACKBAR_DURATION_MS", "J", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainFragmentLegacy$onCreate$1", f = "BuyAgainFragmentLegacy.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainFragmentLegacy$onCreate$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainFragmentLegacy$onCreate$1$1", f = "BuyAgainFragmentLegacy.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainFragmentLegacy$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        final class C02351 extends SuspendLambda implements Function2<BuyAgainContractLegacy.Actions, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ BuyAgainFragmentLegacy q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02351(BuyAgainFragmentLegacy buyAgainFragmentLegacy, Continuation continuation) {
                super(2, continuation);
                this.q = buyAgainFragmentLegacy;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C02351 c02351 = new C02351(this.q, continuation);
                c02351.p = obj;
                return c02351;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
                C02351 c02351 = (C02351) create((BuyAgainContractLegacy.Actions) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                c02351.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                BuyAgainContractLegacy.Actions actions = (BuyAgainContractLegacy.Actions) this.p;
                boolean z = actions instanceof BuyAgainContractLegacy.Actions.GoToProducts;
                BuyAgainFragmentLegacy buyAgainFragmentLegacy = this.q;
                if (z) {
                    FragmentActivity fragmentActivityRequireActivity = buyAgainFragmentLegacy.requireActivity();
                    Intrinsics.g(fragmentActivityRequireActivity, "requireActivity(...)");
                    Activities.MainActivity.f4487a.d(fragmentActivityRequireActivity, Activities.MainActivity.Tab.f);
                } else if (actions instanceof BuyAgainContractLegacy.Actions.OpenAddToList) {
                    Map map = ((BuyAgainContractLegacy.Actions.OpenAddToList) actions).f10283a;
                    String quantityString = buyAgainFragmentLegacy.getResources().getQuantityString(R.plurals.buy_again_add_to_list_title, map.size(), Integer.valueOf(map.size()));
                    FragmentManager childFragmentManager = buyAgainFragmentLegacy.getChildFragmentManager();
                    Object obj2 = BuyAgainAnalytics.BuyAgain.d;
                    ScreenExtKt$toScreen$1 screenExtKt$toScreen$1A = ScreenExtKt.a();
                    ArrayList arrayList = new ArrayList(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        arrayList.add(new AddToListProductParameters((ProductCard) entry.getKey(), (String) null, (Float) entry.getValue(), false, 26));
                    }
                    AddToListBottomSheetFragment.Companion.a(childFragmentManager, quantityString, screenExtKt$toScreen$1A, arrayList, null, null, false, null, null, 944);
                } else if (actions instanceof BuyAgainContractLegacy.Actions.OpenLogin) {
                    buyAgainFragmentLegacy.q.a(ActivityNavigatorKt.a(Activities.LogIn.f4485a, ApplicationType.e), null);
                } else if (actions instanceof BuyAgainContractLegacy.Actions.OpenQuantitySelector) {
                    BuyAgainContractLegacy.Actions.OpenQuantitySelector openQuantitySelector = (BuyAgainContractLegacy.Actions.OpenQuantitySelector) actions;
                    BuyAgainQuantitySelectorFragment.Companion.a(buyAgainFragmentLegacy.getChildFragmentManager(), openQuantitySelector.f10285a, openQuantitySelector.b);
                } else if (Intrinsics.c(actions, BuyAgainContractLegacy.Actions.OpenSearch.f10286a)) {
                    buyAgainFragmentLegacy.startActivity(Activities.Search.f4526a.b(new Activities.Search.Extras.BuyAgain(null)));
                } else if (actions instanceof BuyAgainContractLegacy.Actions.ShowAddToCartMessage) {
                    Resources resources = buyAgainFragmentLegacy.getResources();
                    int i = ((BuyAgainContractLegacy.Actions.ShowAddToCartMessage) actions).f10287a;
                    String quantityString2 = resources.getQuantityString(R.plurals.buy_again_snackbar_products_added_to_cart, i, Integer.valueOf(i));
                    Intrinsics.g(quantityString2, "getQuantityString(...)");
                    FragmentBuyAgainBinding fragmentBuyAgainBinding = buyAgainFragmentLegacy.i;
                    if (fragmentBuyAgainBinding == null) {
                        Intrinsics.p("binding");
                        throw null;
                    }
                    Snackbar.j(null, fragmentBuyAgainBinding.B, quantityString2, 0).l();
                } else if (actions instanceof BuyAgainContractLegacy.Actions.ShowFailMessage) {
                    BuyAgainContractLegacy.Actions.ShowFailMessage showFailMessage = (BuyAgainContractLegacy.Actions.ShowFailMessage) actions;
                    FragmentBuyAgainBinding fragmentBuyAgainBinding2 = buyAgainFragmentLegacy.i;
                    if (fragmentBuyAgainBinding2 == null) {
                        Intrinsics.p("binding");
                        throw null;
                    }
                    Snackbar.i(fragmentBuyAgainBinding2.B, showFailMessage.f10288a.d, 0).l();
                } else {
                    if (!(actions instanceof BuyAgainContractLegacy.Actions.LaunchInStoreMap)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ShopAppNavigator shopAppNavigator = buyAgainFragmentLegacy.l;
                    if (shopAppNavigator == null) {
                        Intrinsics.p("shopAppNavigator");
                        throw null;
                    }
                    shopAppNavigator.c(((BuyAgainContractLegacy.Actions.LaunchInStoreMap) actions).f10282a);
                }
                return Unit.f24250a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/product/offers/ProductBoostContract$Action;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainFragmentLegacy$onCreate$1$2", f = "BuyAgainFragmentLegacy.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainFragmentLegacy$onCreate$1$2, reason: invalid class name */
        final class AnonymousClass2 extends SuspendLambda implements Function2<ProductBoostContract.Action, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ BuyAgainFragmentLegacy q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(BuyAgainFragmentLegacy buyAgainFragmentLegacy, Continuation continuation) {
                super(2, continuation);
                this.q = buyAgainFragmentLegacy;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.q, continuation);
                anonymousClass2.p = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((ProductBoostContract.Action) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                anonymousClass2.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                final ProductBoostContract.Action action = (ProductBoostContract.Action) this.p;
                final BuyAgainFragmentLegacy buyAgainFragmentLegacy = this.q;
                FragmentBuyAgainBinding fragmentBuyAgainBinding = buyAgainFragmentLegacy.i;
                if (fragmentBuyAgainBinding == null) {
                    Intrinsics.p("binding");
                    throw null;
                }
                View view = fragmentBuyAgainBinding.h;
                Intrinsics.g(view, "getRoot(...)");
                view.postDelayed(new Runnable() { // from class: au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainFragmentLegacy$handleActions$$inlined$postDelayed$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        final ProductBoostContract.Action action2 = action;
                        boolean z = action2 instanceof ProductBoostContract.Action.ShowSnackbar;
                        final BuyAgainFragmentLegacy buyAgainFragmentLegacy2 = buyAgainFragmentLegacy;
                        if (z) {
                            FragmentBuyAgainBinding fragmentBuyAgainBinding2 = buyAgainFragmentLegacy2.i;
                            if (fragmentBuyAgainBinding2 != null) {
                                Snackbar.j(null, fragmentBuyAgainBinding2.h, ((ProductBoostContract.Action.ShowSnackbar) action2).b, 0).l();
                                return;
                            } else {
                                Intrinsics.p("binding");
                                throw null;
                            }
                        }
                        if (!(action2 instanceof ProductBoostContract.Action.ShowRetrySnackbar)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        FragmentBuyAgainBinding fragmentBuyAgainBinding3 = buyAgainFragmentLegacy2.i;
                        if (fragmentBuyAgainBinding3 == null) {
                            Intrinsics.p("binding");
                            throw null;
                        }
                        Snackbar snackbarJ = Snackbar.j(null, fragmentBuyAgainBinding3.h, ((ProductBoostContract.Action.ShowRetrySnackbar) action2).b, 0);
                        snackbarJ.k("Retry", new View.OnClickListener() { // from class: au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainFragmentLegacy$handleActions$1$1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                Callback.g(view2);
                                try {
                                    ProductBoostResultViewModel productBoostResultViewModel = (ProductBoostResultViewModel) buyAgainFragmentLegacy2.n.getD();
                                    ProductBoostContract.Action action3 = action2;
                                    productBoostResultViewModel.p6(((ProductBoostContract.Action.ShowRetrySnackbar) action3).d, null, ((ProductBoostContract.Action.ShowRetrySnackbar) action3).b, ((ProductBoostContract.Action.ShowRetrySnackbar) action3).c);
                                } finally {
                                    Callback.h();
                                }
                            }
                        });
                        snackbarJ.l();
                    }
                }, 4000L);
                return Unit.f24250a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainContractLegacy$ViewState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainFragmentLegacy$onCreate$1$3", f = "BuyAgainFragmentLegacy.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainFragmentLegacy$onCreate$1$3, reason: invalid class name */
        final class AnonymousClass3 extends SuspendLambda implements Function2<BuyAgainContractLegacy.ViewState, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ BuyAgainFragmentLegacy q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(BuyAgainFragmentLegacy buyAgainFragmentLegacy, Continuation continuation) {
                super(2, continuation);
                this.q = buyAgainFragmentLegacy;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.q, continuation);
                anonymousClass3.p = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass3 anonymousClass3 = (AnonymousClass3) create((BuyAgainContractLegacy.ViewState) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                anonymousClass3.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                BuyAgainContractLegacy.ViewState viewState = (BuyAgainContractLegacy.ViewState) this.p;
                Lazy lazy = this.q.p;
                ((BuyAgainProductListController) lazy.getD()).submitList(viewState.b);
                ((BuyAgainProductListController) lazy.getD()).setSelectedProductQuantityMap(viewState.e);
                ((BuyAgainProductListController) lazy.getD()).setLoading(viewState.f10291a);
                return Unit.f24250a;
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = BuyAgainFragmentLegacy.this.new AnonymousClass1(continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.p;
            BuyAgainFragmentLegacy buyAgainFragmentLegacy = BuyAgainFragmentLegacy.this;
            Flow flow = buyAgainFragmentLegacy.Q1().k;
            Lifecycle d = buyAgainFragmentLegacy.getD();
            Intrinsics.g(d, "<get-lifecycle>(...)");
            Lifecycle.State state = Lifecycle.State.h;
            FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new C02351(buyAgainFragmentLegacy, null), FlowExtKt.a(flow, d, state)), coroutineScope);
            SharedFlowImpl sharedFlowImpl = ((ProductBoostResultViewModel) buyAgainFragmentLegacy.n.getD()).g;
            Lifecycle d2 = buyAgainFragmentLegacy.getD();
            Intrinsics.g(d2, "<get-lifecycle>(...)");
            FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass2(buyAgainFragmentLegacy, null), FlowExtKt.a(sharedFlowImpl, d2, state)), coroutineScope);
            StateFlow stateFlow = buyAgainFragmentLegacy.Q1().m;
            Lifecycle d3 = buyAgainFragmentLegacy.getD();
            Intrinsics.g(d3, "<get-lifecycle>(...)");
            FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass3(buyAgainFragmentLegacy, null), FlowExtKt.a(stateFlow, d3, state)), coroutineScope);
            return Unit.f24250a;
        }
    }

    public BuyAgainFragmentLegacy() {
        final BuyAgainFragmentLegacy$special$$inlined$viewModels$default$1 buyAgainFragmentLegacy$special$$inlined$viewModels$default$1 = new BuyAgainFragmentLegacy$special$$inlined$viewModels$default$1(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.e;
        final Lazy lazyA = LazyKt.a(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainFragmentLegacy$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) buyAgainFragmentLegacy$special$$inlined$viewModels$default$1.invoke();
            }
        });
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.m = new ViewModelLazy(reflectionFactory.b(BuyAgainViewModelLegacy.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainFragmentLegacy$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainFragmentLegacy$special$$inlined$viewModels$default$5
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
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainFragmentLegacy$special$$inlined$viewModels$default$4
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
        final BuyAgainFragmentLegacy$special$$inlined$viewModels$default$6 buyAgainFragmentLegacy$special$$inlined$viewModels$default$6 = new BuyAgainFragmentLegacy$special$$inlined$viewModels$default$6(this);
        final Lazy lazyA2 = LazyKt.a(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainFragmentLegacy$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) buyAgainFragmentLegacy$special$$inlined$viewModels$default$6.invoke();
            }
        });
        this.n = new ViewModelLazy(reflectionFactory.b(ProductBoostResultViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainFragmentLegacy$special$$inlined$viewModels$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA2.getD()).getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainFragmentLegacy$special$$inlined$viewModels$default$10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA2.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.h.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainFragmentLegacy$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA2.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.b;
            }
        });
        this.o = LazyKt.b(new a(this, 0));
        this.p = LazyKt.b(new a(this, 1));
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: au.com.woolworths.shop.buyagain.ui.legacy.b
            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                ActivityResult result = (ActivityResult) obj;
                Intrinsics.h(result, "result");
                int i = result.d;
                BuyAgainFragmentLegacy buyAgainFragmentLegacy = this.d;
                if (i != -1) {
                    buyAgainFragmentLegacy.requireActivity().finish();
                } else {
                    BuyAgainViewModelLegacy buyAgainViewModelLegacyQ1 = buyAgainFragmentLegacy.Q1();
                    BuildersKt.c(ViewModelKt.a(buyAgainViewModelLegacyQ1), null, null, new BuyAgainViewModelLegacy$loadScreen$1(buyAgainViewModelLegacyQ1, null), 3);
                }
            }
        });
        Intrinsics.g(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.q = activityResultLauncherRegisterForActivityResult;
    }

    public static boolean I1(BuyAgainFragmentLegacy buyAgainFragmentLegacy, MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.search) {
            return super.onOptionsItemSelected(menuItem);
        }
        BuyAgainViewModelLegacy buyAgainViewModelLegacyQ1 = buyAgainFragmentLegacy.Q1();
        buyAgainViewModelLegacyQ1.h.g(BuyAgainAnalytics.BuyAgain.Action.o);
        buyAgainViewModelLegacyQ1.j.k(BuyAgainContractLegacy.Actions.OpenSearch.f10286a);
        return true;
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final CoroutineScope A2() {
        return ViewModelKt.a(Q1());
    }

    @Override // au.com.woolworths.shop.buyagain.ui.legacy.quantityselector.BuyAgainQuantitySelectorFragment.BottomSheetHost
    public final void B0(ProductCard product, float f) {
        Intrinsics.h(product, "product");
        BuyAgainViewModelLegacy buyAgainViewModelLegacyQ1 = Q1();
        MutableStateFlow mutableStateFlow = buyAgainViewModelLegacyQ1.l;
        LinkedHashMap linkedHashMapS = MapsKt.s(((BuyAgainContractLegacy.ViewState) mutableStateFlow.getValue()).e);
        linkedHashMapS.put(product, Float.valueOf(f));
        buyAgainViewModelLegacyQ1.h.i(BuyAgainAnalytics.BuyAgain.Action.s, ProductAnalyticsExtKt.g(linkedHashMapS));
        BuyAgainViewModelLegacy.r6(buyAgainViewModelLegacyQ1, mutableStateFlow, false, null, null, null, null, linkedHashMapS, false, null, 223);
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final void E2(ListChangeEvent listChangeEvent) {
        if (listChangeEvent instanceof ListChangeEvent.AddToListSuccessEvent) {
            ListChangeEvent.AddToListSuccessEvent addToListSuccessEvent = (ListChangeEvent.AddToListSuccessEvent) listChangeEvent;
            Context contextRequireContext = requireContext();
            Intrinsics.g(contextRequireContext, "requireContext(...)");
            FragmentBuyAgainBinding fragmentBuyAgainBinding = this.i;
            if (fragmentBuyAgainBinding == null) {
                Intrinsics.p("binding");
                throw null;
            }
            EpoxyRecyclerView productList = fragmentBuyAgainBinding.B;
            Intrinsics.g(productList, "productList");
            ListChangeEventKt.a(addToListSuccessEvent, contextRequireContext, productList, false, 28);
            BuyAgainViewModelLegacy buyAgainViewModelLegacyQ1 = Q1();
            List productsAdded = addToListSuccessEvent.h;
            Intrinsics.h(productsAdded, "productsAdded");
            BuyAgainViewModelLegacy.r6(buyAgainViewModelLegacyQ1, buyAgainViewModelLegacyQ1.l, false, null, null, null, null, EmptyMap.d, false, null, 223);
            TrackingMetadata trackingMetadataF = ProductAnalyticsExtKt.f(productsAdded);
            trackingMetadataF.b(TrackableValue.o0, "saved " + productsAdded.size() + " in my shopping list");
            buyAgainViewModelLegacyQ1.h.i(BuyAgainAnalytics.BuyAgain.Action.h, trackingMetadataF);
        }
    }

    public final BuyAgainViewModelLegacy Q1() {
        return (BuyAgainViewModelLegacy) this.m.getD();
    }

    @Override // au.com.woolworths.shop.buyagain.ui.legacy.quantityselector.BuyAgainQuantitySelectorFragment.BottomSheetHost
    public final void h(ProductCard product) {
        Intrinsics.h(product, "product");
        BuyAgainViewModelLegacy buyAgainViewModelLegacyQ1 = Q1();
        MutableStateFlow mutableStateFlow = buyAgainViewModelLegacyQ1.l;
        LinkedHashMap linkedHashMapS = MapsKt.s(((BuyAgainContractLegacy.ViewState) mutableStateFlow.getValue()).e);
        linkedHashMapS.remove(product);
        BuyAgainViewModelLegacy.r6(buyAgainViewModelLegacyQ1, mutableStateFlow, false, null, null, null, null, linkedHashMapS, false, null, 223);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass1(null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        FragmentBuyAgainBinding fragmentBuyAgainBinding = (FragmentBuyAgainBinding) DataBindingUtil.c(inflater, R.layout.fragment_buy_again, viewGroup, false, null);
        this.i = fragmentBuyAgainBinding;
        if (fragmentBuyAgainBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        View view = fragmentBuyAgainBinding.h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.h(view, "view");
        super.onViewCreated(view, bundle);
        FragmentBuyAgainBinding fragmentBuyAgainBinding = this.i;
        if (fragmentBuyAgainBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        fragmentBuyAgainBinding.D(getViewLifecycleOwner());
        fragmentBuyAgainBinding.L(Q1());
        Toolbar toolbar = fragmentBuyAgainBinding.C;
        Intrinsics.e(toolbar);
        NavController navController = FragmentKt.a(this);
        AppBarConfiguration.Builder builder = new AppBarConfiguration.Builder();
        BuyAgainFragmentLegacy$inlined$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 buyAgainFragmentLegacy$inlined$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 = new BuyAgainFragmentLegacy$inlined$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0();
        builder.b = buyAgainFragmentLegacy$inlined$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0;
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration(builder.f3520a, buyAgainFragmentLegacy$inlined$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0);
        Intrinsics.h(navController, "navController");
        navController.a(new ToolbarOnDestinationChangedListener(toolbar, appBarConfiguration));
        toolbar.setNavigationOnClickListener(new androidx.navigation.ui.a(0, navController, appBarConfiguration));
        toolbar.n(R.menu.menu_cart_and_search);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: au.com.woolworths.shop.buyagain.ui.legacy.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BuyAgainFragmentLegacy buyAgainFragmentLegacy = this.d;
                Callback.g(view2);
                try {
                    buyAgainFragmentLegacy.requireActivity().onBackPressed();
                } finally {
                    Callback.h();
                }
            }
        });
        toolbar.setOnMenuItemClickListener(new d(this));
        MenuItem menuItemFindItem = toolbar.getMenu().findItem(R.id.cart_item);
        menuItemFindItem.setVisible(((BuyAgainContractLegacy.ViewState) Q1().m.getValue()).f);
        View actionView = menuItemFindItem.getActionView();
        CartBadgeActionView cartBadgeActionView = actionView instanceof CartBadgeActionView ? (CartBadgeActionView) actionView : null;
        if (cartBadgeActionView != null) {
            Object obj = BuyAgainAnalytics.BuyAgain.d;
            cartBadgeActionView.setAnalyticsScreen(ScreenExtKt.a());
        }
        EpoxyRecyclerView epoxyRecyclerView = fragmentBuyAgainBinding.B;
        Intrinsics.e(epoxyRecyclerView);
        ViewExtKt.a(epoxyRecyclerView);
        epoxyRecyclerView.setController((BuyAgainProductListController) this.p.getD());
        epoxyRecyclerView.setLayoutManager((BuyAgainLayoutManager) this.o.getD());
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.g(fragmentActivityRequireActivity, "requireActivity(...)");
        epoxyRecyclerView.i(new DefaultDividerItemDecoration(fragmentActivityRequireActivity));
    }
}
