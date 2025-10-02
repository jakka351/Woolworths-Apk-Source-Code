package au.com.woolworths.feature.shop.marketplace.ui.categories;

import android.content.Intent;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.feature.shop.marketplace.ui.categories.MarketplaceCategoriesContract;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.marketplace.ui.categories.MarketplaceCategoriesFragment$observeActions$1", f = "MarketplaceCategoriesFragment.kt", l = {106}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MarketplaceCategoriesFragment$observeActions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ MarketplaceCategoriesFragment q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.shop.marketplace.ui.categories.MarketplaceCategoriesFragment$observeActions$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<MarketplaceCategoriesContract.Action, Continuation<? super Unit>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            MarketplaceCategoriesContract.Action action = (MarketplaceCategoriesContract.Action) obj;
            MarketplaceCategoriesFragment marketplaceCategoriesFragment = (MarketplaceCategoriesFragment) this.d;
            marketplaceCategoriesFragment.getClass();
            if (action instanceof MarketplaceCategoriesContract.Action.LaunchProductList) {
                MarketplaceCategoriesContract.Action.LaunchProductList launchProductList = (MarketplaceCategoriesContract.Action.LaunchProductList) action;
                String str = launchProductList.f7481a;
                String str2 = launchProductList.b;
                String str3 = launchProductList.c;
                String str4 = launchProductList.d;
                String str5 = launchProductList.e;
                Intent intentA = ActivityNavigatorKt.a(Activities.ProductList.f4505a, ApplicationType.e);
                intentA.putExtra("EXTRA_PRODUCT_LIST_INFO", new Activities.ProductList.Extras(new Activities.ProductList.ExtrasPageData(str2, null), new Activities.ProductList.ExtrasByFacet(str, str2, str3, str4, str5), (Activities.ProductList.ExtrasConfig) null, 12));
                marketplaceCategoriesFragment.startActivity(intentA);
            } else {
                if (!(action instanceof MarketplaceCategoriesContract.Action.LaunchProductSubCategory)) {
                    throw new NoWhenBranchMatchedException();
                }
                MarketplaceCategoriesContract.Action.LaunchProductSubCategory launchProductSubCategory = (MarketplaceCategoriesContract.Action.LaunchProductSubCategory) action;
                Intent intentPutExtra = ActivityNavigatorKt.a(Activities.ProductSubCategory.f4507a, ApplicationType.e).putExtra("EXTRA_PRODUCT_SUB_CATEGORY_INFO", new Activities.ProductSubCategory.Extras(launchProductSubCategory.b, launchProductSubCategory.f7482a, launchProductSubCategory.c));
                Intrinsics.g(intentPutExtra, "putExtra(...)");
                marketplaceCategoriesFragment.startActivity(intentPutExtra);
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketplaceCategoriesFragment$observeActions$1(MarketplaceCategoriesFragment marketplaceCategoriesFragment, Continuation continuation) {
        super(2, continuation);
        this.q = marketplaceCategoriesFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MarketplaceCategoriesFragment$observeActions$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MarketplaceCategoriesFragment$observeActions$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            MarketplaceCategoriesFragment marketplaceCategoriesFragment = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, marketplaceCategoriesFragment, MarketplaceCategoriesFragment.class, "handleAction", "handleAction(Lau/com/woolworths/feature/shop/marketplace/ui/categories/MarketplaceCategoriesContract$Action;)V", 4), FlowExtKt.a(marketplaceCategoriesFragment.I1().i, marketplaceCategoriesFragment.getViewLifecycleOwner().getD(), Lifecycle.State.h));
            this.p = 1;
            if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
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
