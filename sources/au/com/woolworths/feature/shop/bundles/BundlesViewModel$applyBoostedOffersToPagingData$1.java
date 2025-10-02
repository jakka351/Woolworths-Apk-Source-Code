package au.com.woolworths.feature.shop.bundles;

import au.com.woolworths.feature.shop.bundles.data.Bundle;
import au.com.woolworths.feature.shop.bundles.data.BundleProductCard;
import au.com.woolworths.feature.shop.bundles.data.BundlesDataKt;
import au.com.woolworths.foundation.rewards.offers.model.BasicRewardsOfferStatusData;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.ProductCard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "bundleItem"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.bundles.BundlesViewModel$applyBoostedOffersToPagingData$1", f = "BundlesViewModel.kt", l = {}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class BundlesViewModel$applyBoostedOffersToPagingData$1 extends SuspendLambda implements Function2<Object, Continuation<? super Object>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ BundlesViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundlesViewModel$applyBoostedOffersToPagingData$1(BundlesViewModel bundlesViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = bundlesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BundlesViewModel$applyBoostedOffersToPagingData$1 bundlesViewModel$applyBoostedOffersToPagingData$1 = new BundlesViewModel$applyBoostedOffersToPagingData$1(this.q, continuation);
        bundlesViewModel$applyBoostedOffersToPagingData$1.p = obj;
        return bundlesViewModel$applyBoostedOffersToPagingData$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BundlesViewModel$applyBoostedOffersToPagingData$1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        Object obj2 = this.p;
        if (!(obj2 instanceof Bundle)) {
            return obj2;
        }
        Bundle bundle = (Bundle) obj2;
        ArrayList arrayListA = BundlesDataKt.a(bundle.b);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(arrayListA, 10));
        Iterator it = arrayListA.iterator();
        while (true) {
            BasicRewardsOfferStatusData basicRewardsOfferStatusDataC = null;
            if (!it.hasNext()) {
                return Bundle.a(bundle, arrayList, null, 61);
            }
            BundleProductCard bundleProductCard = (BundleProductCard) it.next();
            ProductCard productCard = bundleProductCard.f6758a;
            List list = this.q.y;
            if (list != null) {
                basicRewardsOfferStatusDataC = ProductAnalyticsExtKt.c(productCard, list);
            }
            arrayList.add(new BundleProductCard(ProductAnalyticsExtKt.j(productCard, basicRewardsOfferStatusDataC), bundleProductCard.b));
        }
    }
}
