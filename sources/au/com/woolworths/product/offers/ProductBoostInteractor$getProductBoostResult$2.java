package au.com.woolworths.product.offers;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.BoostOfferResponse;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.offers.ProductBoostFailureCause;
import au.com.woolworths.product.offers.ProductBoostResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/product/offers/ProductBoostResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.product.offers.ProductBoostInteractor$getProductBoostResult$2", f = "ProductBoostInteractor.kt", l = {113}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ProductBoostInteractor$getProductBoostResult$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ProductBoostResult>, Object> {
    public ArrayList p;
    public int q;
    public final /* synthetic */ List r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ TrackableBoostMetadata t;
    public final /* synthetic */ List u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ ProductBoostInteractor w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductBoostInteractor$getProductBoostResult$2(List list, boolean z, TrackableBoostMetadata trackableBoostMetadata, List list2, Object obj, ProductBoostInteractor productBoostInteractor, Continuation continuation) {
        super(2, continuation);
        this.r = list;
        this.s = z;
        this.t = trackableBoostMetadata;
        this.u = list2;
        this.v = obj;
        this.w = productBoostInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductBoostInteractor$getProductBoostResult$2(this.r, this.s, this.t, this.u, this.v, this.w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductBoostInteractor$getProductBoostResult$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        List list;
        ArrayList<ProductCard> arrayList;
        Object next;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        boolean z = this.s;
        Object obj2 = this.v;
        List list2 = this.r;
        TrackableBoostMetadata trackableBoostMetadata = this.t;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                boolean zIsEmpty = list2.isEmpty();
                EmptyList emptyList = EmptyList.d;
                if (zIsEmpty) {
                    Intrinsics.h(trackableBoostMetadata, "trackableBoostMetadata");
                    return new ProductBoostResult.Success(emptyList, z, trackableBoostMetadata, null);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list2.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    list = this.u;
                    if (!zHasNext) {
                        break;
                    }
                    Object next2 = it.next();
                    List list3 = list;
                    RewardsOfferInfo rewardsOfferInfo = ((ProductCard) next2).getRewardsOfferInfo();
                    if (CollectionsKt.t(list3, rewardsOfferInfo != null ? rewardsOfferInfo.getD() : null)) {
                        arrayList2.add(next2);
                    }
                }
                if (list.isEmpty()) {
                    Intrinsics.h(trackableBoostMetadata, "trackableBoostMetadata");
                    return new ProductBoostResult.Success(emptyList, z, trackableBoostMetadata, obj2);
                }
                ProductBoostInteractor productBoostInteractor = this.w;
                this.p = arrayList2;
                this.q = 1;
                obj = productBoostInteractor.c(list, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                arrayList = arrayList2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                arrayList = this.p;
                ResultKt.b(obj);
            }
            List list4 = (List) obj;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList, 10));
            for (ProductCard productCard : arrayList) {
                Iterator it2 = list4.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    String offerId = ((BoostOfferResponse) next).getOfferId();
                    RewardsOfferInfo rewardsOfferInfo2 = productCard.getRewardsOfferInfo();
                    if (Intrinsics.c(offerId, rewardsOfferInfo2 != null ? rewardsOfferInfo2.getD() : null)) {
                        break;
                    }
                }
                BoostOfferResponse boostOfferResponse = (BoostOfferResponse) next;
                arrayList3.add(ProductAnalyticsExtKt.j(productCard, boostOfferResponse != null ? boostOfferResponse.getInfo() : null));
            }
            return new ProductBoostResult.Success(arrayList3, z, trackableBoostMetadata, obj2);
        } catch (NoConnectivityException e) {
            Timber.f27013a.f(e);
            return new ProductBoostResult.Failure(ProductBoostFailureCause.NoConnectivity.f9323a, list2, trackableBoostMetadata, obj2);
        } catch (ServerErrorException e2) {
            Bark.Companion companion = Bark.f8483a;
            Bark.Barker.c(new ReportOwner(ReportOwner.Squad.d), e2, null, 12);
            return new ProductBoostResult.Failure(ProductBoostFailureCause.ServerError.f9324a, list2, trackableBoostMetadata, obj2);
        }
    }
}
