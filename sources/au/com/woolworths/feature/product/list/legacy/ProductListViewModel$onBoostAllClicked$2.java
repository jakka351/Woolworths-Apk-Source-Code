package au.com.woolworths.feature.product.list.legacy;

import androidx.paging.PagedList;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.feature.product.list.legacy.ProductListContract;
import au.com.woolworths.feature.product.list.legacy.analytics.ProductListScreens;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.offers.ProductBoostInteractor;
import au.com.woolworths.product.offers.ProductBoostResult;
import au.com.woolworths.product.offers.TrackableBoostMetadata;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListViewModel$onBoostAllClicked$2", f = "ProductListViewModel.kt", l = {1466}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ProductListViewModel$onBoostAllClicked$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public ProductListViewModel p;
    public int q;
    public final /* synthetic */ ProductListViewModel r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListViewModel$onBoostAllClicked$2(ProductListViewModel productListViewModel, Continuation continuation) {
        super(2, continuation);
        this.r = productListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductListViewModel$onBoostAllClicked$2(this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductListViewModel$onBoostAllClicked$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        Object objB;
        ProductListViewModel productListViewModel;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            ProductListViewModel productListViewModel2 = this.r;
            Iterator it = CollectionsKt.A((PagedList) CollectionsKt.O(productListViewModel2.B.a()), ProductCard.class).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                RewardsOfferInfo rewardsOfferInfo = ((ProductCard) next).getRewardsOfferInfo();
                if ((rewardsOfferInfo != null ? rewardsOfferInfo.getN() : null) == RewardsOfferStatus.NOT_ACTIVATED) {
                    break;
                }
            }
            ProductCard productCard = (ProductCard) next;
            if (productCard != null) {
                ProductListViewModel.V6(productListViewModel2, productListViewModel2.F, 0, null, 0, false, null, productListViewModel2.u6(StatefulButtonState.e), null, null, null, null, null, null, null, null, null, 2096895);
                this.p = productListViewModel2;
                this.q = 1;
                objB = ProductBoostInteractor.b(productListViewModel2.k, CollectionsKt.Q(productCard), new TrackableBoostMetadata(ProductListScreens.e, null), null, null, this, 18);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                productListViewModel = productListViewModel2;
            }
            return Unit.f24250a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ProductListViewModel productListViewModel3 = this.p;
        ResultKt.b(obj);
        productListViewModel = productListViewModel3;
        objB = obj;
        ProductBoostResult productBoostResult = (ProductBoostResult) objB;
        TrackingMetadata trackingMetadataF = productBoostResult.getF9327a().b;
        if (productBoostResult instanceof ProductBoostResult.Success) {
            SharedFlowImpl sharedFlowImpl = productListViewModel.v;
            TrackingMetadata trackingMetadataX6 = productListViewModel.x6();
            if (trackingMetadataF == null) {
                trackingMetadataF = ProductAnalyticsExtKt.f(((ProductBoostResult.Success) productBoostResult).c);
            }
            trackingMetadataX6.a(trackingMetadataF);
            sharedFlowImpl.f(new ProductListContract.Actions.BoostAllSucceeded(trackingMetadataX6));
        } else {
            if (!(productBoostResult instanceof ProductBoostResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            ProductListViewModel.V6(productListViewModel, productListViewModel.F, 0, null, 0, false, null, productListViewModel.u6(StatefulButtonState.d), null, null, null, null, null, null, null, null, null, 2096895);
            SharedFlowImpl sharedFlowImpl2 = productListViewModel.v;
            TrackingMetadata trackingMetadataX62 = productListViewModel.x6();
            trackingMetadataX62.a(trackingMetadataF == null ? ProductAnalyticsExtKt.f(((ProductBoostResult.Failure) productBoostResult).d) : trackingMetadataF);
            sharedFlowImpl2.f(new ProductListContract.Actions.BoostAllFailed(trackingMetadataX62));
        }
        return Unit.f24250a;
    }
}
