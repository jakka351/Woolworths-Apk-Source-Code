package au.com.woolworths.feature.product.list.v2.ui;

import android.app.Activity;
import android.content.Context;
import androidx.activity.OnBackPressedDispatcher;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLink;
import au.com.woolworths.android.onesite.deeplink.SupportedLinksHelperKt;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.feature.product.list.v2.ProductListUiEffect;
import au.com.woolworths.feature.product.list.v2.ProductListViewModel;
import au.com.woolworths.feature.product.list.v2.analytics.ProductListAnalyticsScreen;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.v2.ui.ProductListScreenKt$ProductListScreen$1$1", f = "ProductListScreen.kt", l = {58}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ProductListScreenKt$ProductListScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ProductListViewModel q;
    public final /* synthetic */ OnBackPressedDispatcher r;
    public final /* synthetic */ Context s;
    public final /* synthetic */ Function2 t;
    public final /* synthetic */ Activity u;
    public final /* synthetic */ ShopAppNavigator v;
    public final /* synthetic */ SnackbarHostState w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListScreenKt$ProductListScreen$1$1(ProductListViewModel productListViewModel, OnBackPressedDispatcher onBackPressedDispatcher, Context context, Function2 function2, Activity activity, ShopAppNavigator shopAppNavigator, SnackbarHostState snackbarHostState, Continuation continuation) {
        super(2, continuation);
        this.q = productListViewModel;
        this.r = onBackPressedDispatcher;
        this.s = context;
        this.t = function2;
        this.u = activity;
        this.v = shopAppNavigator;
        this.w = snackbarHostState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductListScreenKt$ProductListScreen$1$1(this.q, this.r, this.s, this.t, this.u, this.v, this.w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductListScreenKt$ProductListScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flow = this.q.s;
            final ShopAppNavigator shopAppNavigator = this.v;
            final SnackbarHostState snackbarHostState = this.w;
            final OnBackPressedDispatcher onBackPressedDispatcher = this.r;
            final Context context = this.s;
            final Function2 function2 = this.t;
            final Activity activity = this.u;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.product.list.v2.ui.ProductListScreenKt$ProductListScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) throws NumberFormatException {
                    ProductListUiEffect productListUiEffect = (ProductListUiEffect) obj2;
                    boolean z = productListUiEffect instanceof ProductListUiEffect.OnNavigateBackClick;
                    Unit unit = Unit.f24250a;
                    if (z) {
                        OnBackPressedDispatcher onBackPressedDispatcher2 = onBackPressedDispatcher;
                        if (onBackPressedDispatcher2 != null) {
                            onBackPressedDispatcher2.d();
                            return unit;
                        }
                    } else {
                        boolean zC = Intrinsics.c(productListUiEffect, ProductListUiEffect.LaunchCartScreen.f5500a);
                        Context context2 = context;
                        if (zC) {
                            context2.startActivity(ActivityNavigatorKt.a(Activities.Cart.f4454a, ApplicationType.e));
                            return unit;
                        }
                        if (productListUiEffect instanceof ProductListUiEffect.LaunchProductSearch) {
                            ProductListUiEffect.LaunchProductSearch launchProductSearch = (ProductListUiEffect.LaunchProductSearch) productListUiEffect;
                            function2.invoke(launchProductSearch.f5505a, launchProductSearch.b);
                            return unit;
                        }
                        if (Intrinsics.c(productListUiEffect, ProductListUiEffect.LaunchProductsTab.f5506a)) {
                            Intrinsics.f(context2, "null cannot be cast to non-null type android.app.Activity");
                            Activities.MainActivity.Tab tab = Activities.MainActivity.Tab.f;
                            Activities.MainActivity.f4487a.d((Activity) context2, tab);
                            return unit;
                        }
                        boolean z2 = productListUiEffect instanceof ProductListUiEffect.LaunchDeeplink;
                        Activity activity2 = activity;
                        if (z2) {
                            String str = ((ProductListUiEffect.LaunchDeeplink) productListUiEffect).f5501a;
                            if (SupportedLinksHelperKt.a(str)) {
                                activity2.startActivity(ShopAppDeepLink.a(ProductListAnalyticsScreen.d, str));
                                return unit;
                            }
                        } else if (!(productListUiEffect instanceof ProductListUiEffect.OpenOliveChat)) {
                            boolean z3 = productListUiEffect instanceof ProductListUiEffect.LaunchInstoreMap;
                            ShopAppNavigator shopAppNavigator2 = shopAppNavigator;
                            if (z3) {
                                shopAppNavigator2.c(((ProductListUiEffect.LaunchInstoreMap) productListUiEffect).f5502a);
                                return unit;
                            }
                            if (productListUiEffect instanceof ProductListUiEffect.LaunchProductDetails) {
                                shopAppNavigator2.d(((ProductListUiEffect.LaunchProductDetails) productListUiEffect).f5504a.getProductId());
                                return unit;
                            }
                            if (Intrinsics.c(productListUiEffect, ProductListUiEffect.LaunchWatchlistGuestOnboardingScreen.f5507a)) {
                                activity2.startActivity(Activities.ShopListGuestOnboardingActivity.f4532a.b(Activities.ShopListGuestOnboardingActivity.ListFeature.d));
                                return unit;
                            }
                            if (!(productListUiEffect instanceof ProductListUiEffect.DisplaySnackbarForWatchlist)) {
                                if (!(productListUiEffect instanceof ProductListUiEffect.LaunchProductAvailability)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                activity2.startActivity(Activities.ProductAvailabilityActivity.f4502a.b(((ProductListUiEffect.LaunchProductAvailability) productListUiEffect).f5503a));
                                return unit;
                            }
                            ProductListUiEffect.DisplaySnackbarForWatchlist displaySnackbarForWatchlist = (ProductListUiEffect.DisplaySnackbarForWatchlist) productListUiEffect;
                            Object objB = ProductListScreenKt.b(snackbarHostState, displaySnackbarForWatchlist.d, displaySnackbarForWatchlist.f5499a, displaySnackbarForWatchlist.b.getText(activity2).toString(), displaySnackbarForWatchlist.c, new au.com.woolworths.design.core.ui.component.experimental.chip.e(context2, 10), continuation);
                            if (objB == CoroutineSingletons.d) {
                                return objB;
                            }
                        }
                    }
                    return unit;
                }
            };
            this.p = 1;
            if (flow.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
