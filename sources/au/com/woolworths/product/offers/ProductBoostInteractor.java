package au.com.woolworths.product.offers;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/offers/ProductBoostInteractor;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ProductBoostInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final ProductBoostRepository f9325a;
    public final DispatcherProvider b;
    public final SharedFlowImpl c;
    public final SharedFlowImpl d;

    public ProductBoostInteractor(ProductBoostRepository productBoostRepository, DispatcherProvider dispatchers) {
        Intrinsics.h(dispatchers, "dispatchers");
        this.f9325a = productBoostRepository;
        this.b = dispatchers;
        BufferOverflow bufferOverflow = BufferOverflow.e;
        this.c = SharedFlowKt.b(0, 1, bufferOverflow, 1);
        this.d = SharedFlowKt.b(0, 1, bufferOverflow, 1);
    }

    public static /* synthetic */ Object b(ProductBoostInteractor productBoostInteractor, List list, TrackableBoostMetadata trackableBoostMetadata, Object obj, List list2, Continuation continuation, int i) {
        Continuation continuation2;
        List list3;
        boolean z = (i & 2) == 0;
        if ((i & 8) != 0) {
            obj = null;
        }
        if ((i & 16) != 0) {
            continuation2 = continuation;
            list3 = null;
        } else {
            continuation2 = continuation;
            list3 = list2;
        }
        return productBoostInteractor.a(list, z, trackableBoostMetadata, obj, list3, continuation2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List r12, boolean r13, au.com.woolworths.product.offers.TrackableBoostMetadata r14, java.lang.Object r15, java.util.List r16, kotlin.coroutines.Continuation r17) throws java.lang.Throwable {
        /*
            r11 = this;
            r0 = r17
            boolean r1 = r0 instanceof au.com.woolworths.product.offers.ProductBoostInteractor$boostProductOffers$1
            if (r1 == 0) goto L16
            r1 = r0
            au.com.woolworths.product.offers.ProductBoostInteractor$boostProductOffers$1 r1 = (au.com.woolworths.product.offers.ProductBoostInteractor$boostProductOffers$1) r1
            int r2 = r1.r
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.r = r2
        L14:
            r8 = r1
            goto L1c
        L16:
            au.com.woolworths.product.offers.ProductBoostInteractor$boostProductOffers$1 r1 = new au.com.woolworths.product.offers.ProductBoostInteractor$boostProductOffers$1
            r1.<init>(r11, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r8.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r8.r
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            kotlin.ResultKt.b(r0)
            goto L91
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L34:
            kotlin.ResultKt.b(r0)
            if (r16 != 0) goto L72
            r0 = r12
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L45:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L70
            java.lang.Object r3 = r0.next()
            au.com.woolworths.product.models.ProductCard r3 = (au.com.woolworths.product.models.ProductCard) r3
            au.com.woolworths.product.models.RewardsOfferInfo r4 = r3.getRewardsOfferInfo()
            r5 = 0
            if (r4 == 0) goto L5d
            au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus r4 = r4.getN()
            goto L5e
        L5d:
            r4 = r5
        L5e:
            au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus r7 = au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus.NOT_ACTIVATED
            if (r4 != r7) goto L6a
            au.com.woolworths.product.models.RewardsOfferInfo r3 = r3.getRewardsOfferInfo()
            java.lang.String r5 = r3.getD()
        L6a:
            if (r5 == 0) goto L45
            r1.add(r5)
            goto L45
        L70:
            r4 = r1
            goto L74
        L72:
            r4 = r16
        L74:
            r8.r = r2
            au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider r0 = r11.b
            r0.getClass()
            kotlinx.coroutines.scheduling.DefaultScheduler r0 = kotlinx.coroutines.Dispatchers.f24691a
            kotlinx.coroutines.scheduling.DefaultIoScheduler r10 = kotlinx.coroutines.scheduling.DefaultIoScheduler.f
            au.com.woolworths.product.offers.ProductBoostInteractor$getProductBoostResult$2 r0 = new au.com.woolworths.product.offers.ProductBoostInteractor$getProductBoostResult$2
            r7 = 0
            r6 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.f(r10, r0, r8)
            if (r0 != r9) goto L91
            return r9
        L91:
            au.com.woolworths.product.offers.ProductBoostResult r0 = (au.com.woolworths.product.offers.ProductBoostResult) r0
            kotlinx.coroutines.flow.SharedFlowImpl r1 = r11.d
            r1.f(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.product.offers.ProductBoostInteractor.a(java.util.List, boolean, au.com.woolworths.product.offers.TrackableBoostMetadata, java.lang.Object, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable c(java.util.List r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.product.offers.ProductBoostInteractor$boostTagProductOffers$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.product.offers.ProductBoostInteractor$boostTagProductOffers$1 r0 = (au.com.woolworths.product.offers.ProductBoostInteractor$boostTagProductOffers$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.product.offers.ProductBoostInteractor$boostTagProductOffers$1 r0 = new au.com.woolworths.product.offers.ProductBoostInteractor$boostTagProductOffers$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r6)
            r0.r = r3
            au.com.woolworths.product.offers.ProductBoostRepository r6 = r4.f9325a
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            au.com.woolworths.product.BoostOffersMutation$BoostTagProductOffers r6 = (au.com.woolworths.product.BoostOffersMutation.BoostTagProductOffers) r6
            java.util.List r5 = r6.getF9222a()
            if (r5 == 0) goto L6a
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.CollectionsKt.s(r5, r0)
            r6.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L56:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L6c
            java.lang.Object r0 = r5.next()
            au.com.woolworths.product.BoostOffersMutation$BoostOffer r0 = (au.com.woolworths.product.BoostOffersMutation.BoostOffer) r0
            au.com.woolworths.product.models.BoostOfferResponse r0 = au.com.woolworths.product.models.BoostOffersMutationBoostOfferExtKt.toUiModel(r0)
            r6.add(r0)
            goto L56
        L6a:
            kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.d
        L6c:
            r5 = r6
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L78:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L8e
            java.lang.Object r1 = r5.next()
            au.com.woolworths.product.models.BoostOfferResponse r1 = (au.com.woolworths.product.models.BoostOfferResponse) r1
            au.com.woolworths.product.models.RewardsOfferInfo r1 = r1.getInfo()
            if (r1 == 0) goto L78
            r0.add(r1)
            goto L78
        L8e:
            kotlinx.coroutines.flow.SharedFlowImpl r5 = r4.c
            r5.f(r0)
            java.io.Serializable r6 = (java.io.Serializable) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.product.offers.ProductBoostInteractor.c(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }
}
