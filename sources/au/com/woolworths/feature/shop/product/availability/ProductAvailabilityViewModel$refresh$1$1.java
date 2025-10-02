package au.com.woolworths.feature.shop.product.availability;

import au.com.woolworths.analytics.supers.instorecheckavailability.InstoreCheckAvailabilityAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.product.availability.ProductAvailabilityUiState;
import au.com.woolworths.feature.shop.product.availability.domain.StoreProductAvailabilityListData;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.product.availability.ProductAvailabilityViewModel$refresh$1$1", f = "ProductAvailabilityViewModel.kt", l = {81}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ProductAvailabilityViewModel$refresh$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public ProductAvailabilityViewModel p;
    public ProductCard q;
    public Store r;
    public int s;
    public final /* synthetic */ ProductAvailabilityViewModel t;
    public final /* synthetic */ ProductCard u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductAvailabilityViewModel$refresh$1$1(ProductAvailabilityViewModel productAvailabilityViewModel, ProductCard productCard, Continuation continuation) {
        super(2, continuation);
        this.t = productAvailabilityViewModel;
        this.u = productCard;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductAvailabilityViewModel$refresh$1$1(this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductAvailabilityViewModel$refresh$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        ProductCard productCard;
        Store store;
        ProductAvailabilityViewModel productAvailabilityViewModel = this.t;
        AnalyticsManager analyticsManager = productAvailabilityViewModel.g;
        MutableStateFlow mutableStateFlow = productAvailabilityViewModel.h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.s;
        try {
        } catch (NoConnectivityException unused) {
            mutableStateFlow.setValue(new ProductAvailabilityUiState.Error(FullPageMessage.Error.ConnectionError.f8915a));
            analyticsManager.g(InstoreCheckAvailabilityAnalytics.ErrorScreen.Action.e);
        } catch (ServerErrorException unused2) {
            mutableStateFlow.setValue(new ProductAvailabilityUiState.Error(FullPageMessage.Error.ServerError.f8916a));
            analyticsManager.g(InstoreCheckAvailabilityAnalytics.ErrorScreen.Action.d);
        }
        if (i == 0) {
            ResultKt.b(obj);
            Store storeH = productAvailabilityViewModel.f.h();
            if (storeH != null) {
                productCard = this.u;
                ProductAvailabilityInteractor productAvailabilityInteractor = productAvailabilityViewModel.e;
                String str = storeH.d;
                String productId = productCard.getProductId();
                this.p = productAvailabilityViewModel;
                this.q = productCard;
                this.r = storeH;
                this.s = 1;
                Object objA = productAvailabilityInteractor.f7984a.a(str, productId, this);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                store = storeH;
                obj = objA;
            }
            return Unit.f24250a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Store store2 = this.r;
        ProductCard productCard2 = this.q;
        ProductAvailabilityViewModel productAvailabilityViewModel2 = this.p;
        ResultKt.b(obj);
        store = store2;
        productAvailabilityViewModel = productAvailabilityViewModel2;
        productCard = productCard2;
        productAvailabilityViewModel.h.setValue(new ProductAvailabilityUiState.Content(store.f, productCard, ((StoreProductAvailabilityListData) obj).f7996a));
        productAvailabilityViewModel.g.i(InstoreCheckAvailabilityAnalytics.CheckStockScreen.d, ProductAnalyticsExtKt.h(productCard, null, null, 7));
        return Unit.f24250a;
    }
}
