package au.com.woolworths.feature.shop.bundles.ui;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.paging.compose.LazyPagingItems;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLink;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.feature.shop.bundles.BundlesUiEffect;
import au.com.woolworths.feature.shop.bundles.BundlesViewModel;
import au.com.woolworths.feature.shop.bundles.analytics.BundlesScreen;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.bundles.ui.BundlesScreenKt$BundlesScreen$3$1", f = "BundlesScreen.kt", l = {90}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BundlesScreenKt$BundlesScreen$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ BundlesViewModel q;
    public final /* synthetic */ Context r;
    public final /* synthetic */ Function1 s;
    public final /* synthetic */ Function1 t;
    public final /* synthetic */ LazyPagingItems u;
    public final /* synthetic */ MutableState v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundlesScreenKt$BundlesScreen$3$1(BundlesViewModel bundlesViewModel, Context context, Function1 function1, Function1 function12, LazyPagingItems lazyPagingItems, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.q = bundlesViewModel;
        this.r = context;
        this.s = function1;
        this.t = function12;
        this.u = lazyPagingItems;
        this.v = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BundlesScreenKt$BundlesScreen$3$1(this.q, this.r, this.s, this.t, this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BundlesScreenKt$BundlesScreen$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flow = this.q.p;
            final LazyPagingItems lazyPagingItems = this.u;
            final MutableState mutableState = this.v;
            final Context context = this.r;
            final Function1 function1 = this.s;
            final Function1 function12 = this.t;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.bundles.ui.BundlesScreenKt$BundlesScreen$3$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    BundlesUiEffect bundlesUiEffect = (BundlesUiEffect) obj2;
                    boolean z = bundlesUiEffect instanceof BundlesUiEffect.OpenCartScreen;
                    Context context2 = context;
                    if (z) {
                        context2.startActivity(ActivityNavigatorKt.a(Activities.Cart.f4454a, ApplicationType.e));
                    } else if (bundlesUiEffect instanceof BundlesUiEffect.OpenBundlesAddToCartBottomSheet) {
                        function1.invoke(((BundlesUiEffect.OpenBundlesAddToCartBottomSheet) bundlesUiEffect).f6713a);
                    } else if (bundlesUiEffect instanceof BundlesUiEffect.OpenProductDetailsActivity) {
                        function12.invoke(((BundlesUiEffect.OpenProductDetailsActivity) bundlesUiEffect).f6715a);
                    } else {
                        boolean z2 = bundlesUiEffect instanceof BundlesUiEffect.OpenSortBottomSheetModal;
                        MutableState mutableState2 = mutableState;
                        if (z2) {
                            mutableState2.setValue(Boolean.TRUE);
                        } else if (bundlesUiEffect instanceof BundlesUiEffect.CloseSortBottomSheetModal) {
                            mutableState2.setValue(Boolean.FALSE);
                        } else if (bundlesUiEffect instanceof BundlesUiEffect.LaunchDeepLink) {
                            context2.startActivity(ShopAppDeepLink.a(BundlesScreen.d, ((BundlesUiEffect.LaunchDeepLink) bundlesUiEffect).f6712a));
                        } else {
                            if (!(bundlesUiEffect instanceof BundlesUiEffect.RetryPaginationClick)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            lazyPagingItems.e();
                        }
                    }
                    return Unit.f24250a;
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
