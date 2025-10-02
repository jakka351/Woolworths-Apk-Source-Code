package au.com.woolworths.feature.shop.instore.navigation.productfinder;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.android.onesite.extensions.ActivityExtKt;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderContract;
import au.com.woolworths.geolocation.location.LocationsKt;
import java.util.List;
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
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderActivity$observeActions$1", f = "ProductFinderActivity.kt", l = {121}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ProductFinderActivity$observeActions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ProductFinderActivity q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderActivity$observeActions$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<ProductFinderContract.Action, Continuation<? super Unit>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ProductFinderContract.Action action = (ProductFinderContract.Action) obj;
            ProductFinderActivity productFinderActivity = (ProductFinderActivity) this.d;
            int i = ProductFinderActivity.C;
            productFinderActivity.getClass();
            if (Intrinsics.c(action, ProductFinderContract.Action.Back.f7428a)) {
                productFinderActivity.getF().d();
            } else if (Intrinsics.c(action, ProductFinderContract.Action.LaunchSearch.f7431a)) {
                productFinderActivity.startActivity(Activities.Search.f4526a.b(new Activities.Search.Extras.ProductFinder(null)));
            } else {
                boolean z = action instanceof ProductFinderContract.Action.LaunchSearchResult;
                Activities.ComposeProductListLegacy composeProductListLegacy = Activities.ComposeProductListLegacy.f4460a;
                if (z) {
                    String str = ((ProductFinderContract.Action.LaunchSearchResult) action).f7432a;
                    productFinderActivity.startActivity(composeProductListLegacy.b(new Activities.ProductList.Extras(new Activities.ProductList.ExtrasPageData(str, null), new Activities.ProductList.ExtrasBySearch(str, (List) null, (String) null, Activities.ProductList.ProductListType.w, 14), (Activities.ProductList.ExtrasConfig) null, 12)));
                } else if (Intrinsics.c(action, ProductFinderContract.Action.GoToSettings.f7429a)) {
                    ActivityExtKt.b(productFinderActivity);
                } else if (Intrinsics.c(action, ProductFinderContract.Action.ShowPermissionsDialog.f7434a)) {
                    LocationsKt.e(productFinderActivity);
                } else if (Intrinsics.c(action, ProductFinderContract.Action.TurnOnDeviceLocation.f7435a)) {
                    LocationsKt.a(productFinderActivity, productFinderActivity);
                } else if (Intrinsics.c(action, ProductFinderContract.Action.LaunchOlive.f7430a)) {
                    productFinderActivity.startActivity(composeProductListLegacy.c(Activities.ProductList.ProductListType.J));
                } else {
                    if (!(action instanceof ProductFinderContract.Action.LaunchStoreDetails)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    productFinderActivity.startActivity(Activities.StoreDetailsLegacy.c(((ProductFinderContract.Action.LaunchStoreDetails) action).f7433a));
                }
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductFinderActivity$observeActions$1(ProductFinderActivity productFinderActivity, Continuation continuation) {
        super(2, continuation);
        this.q = productFinderActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductFinderActivity$observeActions$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductFinderActivity$observeActions$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = ProductFinderActivity.C;
            ProductFinderActivity productFinderActivity = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, productFinderActivity, ProductFinderActivity.class, "handleAction", "handleAction(Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderContract$Action;)V", 4), FlowExtKt.a(productFinderActivity.O4().m, productFinderActivity.getD(), Lifecycle.State.h));
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
